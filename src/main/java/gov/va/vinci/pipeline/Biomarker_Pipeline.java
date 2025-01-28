package gov.va.vinci.pipeline;

/*
*
* Simple Pipeline to output a sentence and snippet around simple regexes
* for intital concept extraction, identification, and expansion
*
 */

import gov.va.vinci.TypeSystem;
import gov.va.vinci.ae.BiomarkerLogic;
import gov.va.vinci.ae.RegexBasedSectionizer;
import gov.va.vinci.leo.annotationpattern.ae.AnnotationPatternAnnotator;
import gov.va.vinci.leo.context.ae.ContextAnnotator;
import gov.va.vinci.leo.descriptors.LeoAEDescriptor;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.filter.ae.FilterAnnotator;
import gov.va.vinci.leo.merger.ae.MergeAnnotator;
import gov.va.vinci.leo.regex.ae.RegexAnnotator;
import gov.va.vinci.leo.sentence.ae.AnchoredSentenceAnnotator;
import java.util.ArrayList;
import java.util.HashMap;


public class Biomarker_Pipeline extends BasePipeline {


    private String TYPE_CONCEPT_TERM = "gov.va.vinci.types.Biomarker_Anchor";
    private String TYPE_MODIFIER_TERM = "gov.va.vinci.types.Modifier_Term";
    private String TYPE_MIDDLE_TERM = "gov.va.vinci.types.Middle_Term";
    private String TYPE_HGVS_DNA = "gov.va.vinci.types.HGVS_DNA";
    private String TYPE_HGVS_PROTEIN = "gov.va.vinci.types.HGVS_Protein";
    private String TYPE_TEST_TERM = "gov.va.vinci.types.Test_Term";
    private String TYPE_LAB_TERM = "gov.va.vinci.types.Lab_Term";
    private String TYPE_EXPRESSION_VALUE = "gov.va.vinci.types.Expression_Value";
    private String TYPE_BIOMARKER_PATTERN = "gov.va.vinci.types.Biomarker_Pattern";
    private String TYPE_VARIANT_PATTERN = "gov.va.vinci.types.Variant_Pattern";
    private String TYPE_EXPRESSION_PATTERN = "gov.va.vinci.types.Expression_Pattern";
    private String TYPE_VARIANT_TYPE_TERM = "gov.va.vinci.types.Variant_Type_Term";
    private String TYPE_EXCLUSION_TERM = "gov.va.vinci.types.Exclusion_Term";
    private static String TYPE_SECTION_HEADER = "gov.va.vinci.types.SectionHeader";
    private static String TYPE_SECTION = "gov.va.vinci.types.Section";
    //Resource Files
    private String RESOURCE_PATH = "src/main/java/resources/";
    private String RESOURCE_CONCEPT = "anchor_terms.groovy";
    private String RESOURCE_MODIFIER = "modifier_terms.groovy";
    private String RESOURCE_ATTRIBUTE = "attribute_terms.groovy";
    private String RESOURCE_TEST = "test_terms.groovy";
    private String RESOURCE_EXCLUSION = "exclusion_terms.groovy";
    private String RESOURCE_PATTERN = "biomarker_pattern.pattern";
    private String RESOURCE_EXPRESSION_PATTERN = "expression_pattern.pattern";
    private String RESOURCE_VARIANT_PATTERN = "variant_pattern.pattern";
    private String RESOURCE_CONTEXT = "contextRules.txt";
    private String TYPE_WINDOW_FEATURE = "Anchor";
    private String SENTENCE_TYPE = "gov.va.vinci.leo.sentence.types.AnchoredSentence";
    private String TYPE_CONTEXT = "gov.va.vinci.leo.context.types.TermContext";
    private String RESOURCE_SECTION_HEADER = "sectionHeaders.groovy";



    /**
     * Constructors
     *
     * @throws Exception
     */


    public Biomarker_Pipeline(HashMap args) throws Exception {
    /* List for holding our annotators. This list, and the order of the list created the annotator pipeline. */
        ArrayList<LeoAEDescriptor> annotators = new ArrayList<LeoAEDescriptor>();


        //1. Anchor Term Regex annotation
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_CONCEPT)
                .setName("Concept Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_TEST)
                .setName("Concept Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //2. Merge  overlapped terms

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_CONCEPT_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_TEST_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_LAB_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        //3 Sentence annotation
        annotators.add(new AnchoredSentenceAnnotator()
                .setSpanSize(100)
                .setAnchorFeature(TYPE_WINDOW_FEATURE)
                .setInputTypes(TYPE_CONCEPT_TERM, TYPE_TEST_TERM, TYPE_LAB_TERM)
                .setOutputType(SENTENCE_TYPE)
                .setName("TermSentenceAnnotator")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //Apply Context to the sentence
        /*
        annotators.add(new ContextAnnotator()
                .setConceptFeatureName(TYPE_WINDOW_FEATURE)
                .setResourceFile(RESOURCE_PATH + RESOURCE_CONTEXT)
                .setInputTypes(new String[]{SENTENCE_TYPE})
                .setOutputType(TYPE_CONTEXT)
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));


        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_CONTEXT})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
                */

        //2. Section Regex annotation
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_SECTION_HEADER)
                .setName("SectionHeader Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new FilterAnnotator()
                .setTypesToKeep(new String[]{TYPE_SECTION_HEADER})
                .setRemoveOverlapping(true)
                .setName("OverlapFilter")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new RegexBasedSectionizer()
                .setName("SectionAnnotator")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_SECTION})
                .setFeaturesToMatch(new String[]{"SectionHeaderText"})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //4 Concept Attribute and modifier annotation
        //Annotate Modifiers only when part of the AnchoredSentence
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_ATTRIBUTE) //Simple Terms
                .setInputTypes(SENTENCE_TYPE)
                .setName("Attribute Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_MODIFIER) //Simple Terms
                .setInputTypes(SENTENCE_TYPE)
                .setName("Modifier Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_EXCLUSION) //Simple Terms
                .setInputTypes(SENTENCE_TYPE)
                .setName("Exlusion Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_MODIFIER_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_EXCLUSION_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_MODIFIER_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_MIDDLE_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_VARIANT_TYPE_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_HGVS_DNA})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_HGVS_PROTEIN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_EXPRESSION_VALUE})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //Delete anchor terms overlapped by common exlusions e.g. walk -> Alk
        annotators.add(new FilterAnnotator()
                .setTypesToKeep(new String[]{TYPE_EXCLUSION_TERM})
                .setTypesToDelete(new String[]{TYPE_CONCEPT_TERM})
                .setRemoveOverlapping(true)
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //filter annotator for expression values overlapped by Gene names
        annotators.add(new FilterAnnotator()
                .setTypesToKeep(new String[]{TYPE_CONCEPT_TERM})
                .setTypesToDelete(new String[]{TYPE_EXPRESSION_VALUE})
                .setRemoveOverlapping(true)
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //added 2023-12-18
        annotators.add(new FilterAnnotator()
                .setTypesToKeep(new String[]{TYPE_LAB_TERM})
                .setTypesToDelete(new String[]{TYPE_TEST_TERM})
                .setRemoveOverlapping(true)
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //added 2024-01-02  Complete negation should override other modifiers found in a window
        // but now with a germline, gets overriden by "germline" as a test_type
        annotators.add(new FilterAnnotator()
                .setTypesToKeep(new String[]{TYPE_TEST_TERM})
                .setTypesToDelete(new String[]{TYPE_MODIFIER_TERM})
                .setRemoveOverlapping(true)
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

/*
        annotators.add(new RegexAnnotator()
                .setInputTypes(SENTENCE_TYPE)
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_MODIFIER) //Simple Modifier
                .setName("Concept Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

 */

        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_EXPRESSION_PATTERN)
                .setOutputType(TYPE_EXPRESSION_PATTERN)
                .getLeoAEDescriptor().setName("Expression Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_EXPRESSION_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_VARIANT_PATTERN)
                .setOutputType(TYPE_VARIANT_PATTERN)
                .getLeoAEDescriptor().setName("Concept Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_VARIANT_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_PATTERN)
                .setOutputType(TYPE_BIOMARKER_PATTERN)
                .getLeoAEDescriptor().setName("Concept Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_BIOMARKER_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));





        annotators.add(new BiomarkerLogic()
                .setName("Biomarker Logic Annotator")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));


        this.pipeline = new LeoAEDescriptor(annotators);
        this.pipeline.setTypeSystemDescription(getLeoTypeSystemDescription());
    }


    protected LeoTypeSystemDescription defineTypeSystem() throws Exception {
        LeoTypeSystemDescription description = TypeSystem.getLeoTypeSystemDescription();
        return description;
    }
}
