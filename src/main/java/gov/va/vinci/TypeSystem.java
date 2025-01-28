package gov.va.vinci;

import gov.va.vinci.leo.annotationpattern.ae.AnnotationPatternAnnotator;
import gov.va.vinci.leo.context.ae.ContextAnnotator;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.descriptors.TypeDescriptionBuilder;
import gov.va.vinci.leo.merger.ae.MergeAnnotator;
import gov.va.vinci.leo.regex.ae.RegexAnnotator;
import gov.va.vinci.leo.whitespace.ae.WhitespaceTokenizer;
import gov.va.vinci.leo.sentence.ae.AnchoredSentenceAnnotator;
import gov.va.vinci.leo.sentence.ae.SentenceAnnotator;
import gov.va.vinci.leo.types.TypeLibrarian;
import gov.va.vinci.leo.window.ae.WindowAnnotator;
//import opennlp.tools.tokenize.WhitespaceTokenizer;

import java.io.File;

public class TypeSystem {

    //TYPE_SIMPLE_CONCEPT_TERM
    private static String TYPE_SIMPLE_CONCEPT_TERM = "gov.va.vinci.types.Simple_Concept";
    private static String TYPE_BIOMARKER_ANCHOR_TERM = "gov.va.vinci.types.Biomarker_Anchor";
    private static String TYPE_HGVS_REFERENCE = "gov.va.vinci.types.HGVS_Reference";
    private static String TYPE_HGVS_DNA = "gov.va.vinci.types.HGVS_DNA";
    private static String TYPE_HGVS_PROTEIN = "gov.va.vinci.types.HGVS_Protein";
    private static String TYPE_VARIANT_PHRASE_TERM = "gov.va.vinci.types.Variant_Phrase_Term";
    private static String TYPE_VARIANT_TYPE_TERM = "gov.va.vinci.types.Variant_Type_Term";
    private static String TYPE_EXPRESSION_TERM = "gov.va.vinci.types.Expression_Term";
    private static String TYPE_EXPRESSION_VALUE = "gov.va.vinci.types.Expression_Value";
    private static String TYPE_TEST_TERM = "gov.va.vinci.types.Test_Term";
    private static String TYPE_TEST_METHOD_TERM = "gov.va.vinci.types.Test_Method_Term";
    private static String TYPE_LAB_TERM = "gov.va.vinci.types.Lab_Term";
    private static String TYPE_EXCLUSION_TERM = "gov.va.vinci.types.Exclusion_Term";
    private static String TYPE_SIMPLE_MODIFIER_TERM = "gov.va.vinci.types.Modifier_Term";
    private static String TYPE_MODIFIER_LEFT_TERM = "gov.va.vinci.types.Modifier_Left_Concept";
    private static String TYPE_SIMPLE_MIDDLE_TERM = "gov.va.vinci.types.Middle_Term";



    //Pattern Types
    private static String TYPE_SIMPLE_PATTERN = "gov.va.vinci.types.Simple_Pattern";
    private static String TYPE_ANCHOR_PATTERN = "gov.va.vinci.types.Anchor_Pattern";
    private static String TYPE_TEST_PATTERN = "gov.va.vinci.types.Test_Pattern";
    private static String TYPE_BIOMARKER_PATTERN = "gov.va.vinci.types.Biomarker_Pattern";
    private static String TYPE_VARIANT_PATTERN = "gov.va.vinci.types.Variant_Pattern";
    private static String TYPE_VARIANT_MAPPING_PATTERN = "gov.va.vinci.types.Variant_Mapping_Pattern";
    private static String TYPE_EXPRESSION_PATTERN = "gov.va.vinci.types.Expression_Pattern";

    //Section Types
    private static String TYPE_SECTION_HEADER = "gov.va.vinci.types.SectionHeader";
    private static String TYPE_SECTION = "gov.va.vinci.types.Section";


    //Window and Context
    private static String TYPE_EXCLUDE_WINDOW = "gov.va.vinci.types.Exclude_Window";
    private static String TYPE_SECTION_WINDOW = "gov.va.vinci.types.Section_Window";
    private static String TYPE_INPUT_WINDOW = "gov.va.vinci.types.Input_Window";
    private static String TYPE_CONTEXT = "gov.va.vinci.leo.context.types.TermContext";


    public static void main(String[] args) {
        try {
            LeoTypeSystemDescription types = new LeoTypeSystemDescription();
            types.addTypeSystemDescription(getLeoTypeSystemDescription());

            File srcDir = new File("generated-types/src");
            srcDir.mkdirs();

            File classesDir = new File("generated-types/classes");
            classesDir.mkdirs();

            types.jCasGen(srcDir.getCanonicalPath(), classesDir.getCanonicalPath());

            File resDir = new File("generated-types/resources/types");
            resDir.mkdirs();

            types.toXML(resDir.getCanonicalPath() + "/TypeSystem.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LeoTypeSystemDescription getLeoTypeSystemDescription() {
        LeoTypeSystemDescription types = new LeoTypeSystemDescription();
        /** Leo Bones **/
        types.addType(TypeLibrarian.getCSITypeSystemDescription());
        types.addTypeSystemDescription(new WindowAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new RegexAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new AnnotationPatternAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new AnchoredSentenceAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new SentenceAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new ContextAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new MergeAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new WhitespaceTokenizer().getLeoTypeSystemDescription());


        types.addTypeSystemDescription(getSpecificTypeSystemDescription());


        return types;
    }

    public static LeoTypeSystemDescription getSpecificTypeSystemDescription() {
        LeoTypeSystemDescription types = new LeoTypeSystemDescription();

        try {
            //Simple Concept Extraction
            types.addType(TYPE_BIOMARKER_ANCHOR_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_HGVS_REFERENCE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_MODIFIER_LEFT_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_HGVS_DNA, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_HGVS_PROTEIN, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_VARIANT_PHRASE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_VARIANT_TYPE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXPRESSION_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXPRESSION_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_SIMPLE_CONCEPT_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXCLUSION_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_SIMPLE_MODIFIER_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_SIMPLE_MIDDLE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_TEST_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_TEST_METHOD_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_LAB_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_SECTION_HEADER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_SECTION_WINDOW, "", PARENT_CLASS.TYPE_WINDOW.type);


            types.addType(TypeDescriptionBuilder.create(TYPE_ANCHOR_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                            .addFeature("Anchor_Type", "", "uima.cas.String")
                            .addFeature("Anchor_Term", "", "uima.cas.String")
                            .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_EXPRESSION_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Expression_Term", "", "uima.cas.String")
                    .addFeature("Expression_Value", "", "uima.cas.String")
                    .getTypeDescription());

            types.addType(TypeDescriptionBuilder.create(TYPE_VARIANT_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Anchor_Type", "", "uima.cas.String")
                    .addFeature("Anchor_Term", "", "uima.cas.String")
                    .addFeature("Reference", "", "uima.cas.String")
                    .addFeature("Description", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_VARIANT_MAPPING_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Anchor_Type", "", "uima.cas.String")
                    .addFeature("Anchor_Term", "", "uima.cas.String")
                    .addFeature("Gene_Name", "", "uima.cas.String")
                    .addFeature("HGVS_DNA", "", "uima.cas.String")
                    .addFeature("HGVS_Protein", "", "uima.cas.String")
                    .addFeature("Gene_Reference", "", "uima.cas.String")
                    .addFeature("Reference", "", "uima.cas.String")
                    .addFeature("Description", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_TEST_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Test_Type", "", "uima.cas.String")
                    .addFeature("Test_Name", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_BIOMARKER_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Anchor_Type", "", "uima.cas.String")
                    .addFeature("Anchor_Term", "", "uima.cas.String")
                    .addFeature("Modifier_Type", "", "uima.cas.String")
                    .addFeature("Modifier_Term", "", "uima.cas.String")
                    .addFeature("Gene_Name", "", "uima.cas.String")
                    .addFeature("HGVS_DNA", "", "uima.cas.String")
                    .addFeature("HGVS_Protein", "", "uima.cas.String")
                    .addFeature("Gene_Reference", "", "uima.cas.String")
                    .addFeature("Lab_Name", "", "uima.cas.String")
                    .addFeature("Test_Type", "", "uima.cas.String")
                    .addFeature("Variant_Type", "", "uima.cas.String")
                    .addFeature("Expression_Value", "", "uima.cas.String")
                    .addFeature("Modifier_in_Window", "", "uima.cas.String")
                    .addFeature("Section", "", "uima.cas.String")
                    .addFeature("Section_Header", "", "uima.cas.String")
                    .addFeature("Context_Experiencer", "", "uima.cas.String")
                    .addFeature("Context_Temporality", "", "uima.cas.String")
                    .addFeature("Context_Negation", "", "uima.cas.String")
                    .addFeature("Pattern_Text", "", "uima.cas.String")
                    .addFeature("Anchored_Sentence", "", "uima.cas.String")
                    .getTypeDescription());

            types.addType(TypeDescriptionBuilder.create(TYPE_SIMPLE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Anchor_Type", "", "uima.cas.String")
                    .addFeature("Anchor_Term", "", "uima.cas.String")
                    .addFeature("Modifier_Type", "", "uima.cas.String")
                    .addFeature("Modifier_Term", "", "uima.cas.String")
                    .addFeature("Modifier_in_Window", "", "uima.cas.String")
                    .addFeature("Pattern_Text", "", "uima.cas.String")
                    .addFeature("Anchored_Sentence", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_SECTION, "Section Type", "uima.tcas.Annotation")
                    .addFeature("SectionHeader", "Anchor annotation around which the section was created", "uima.tcas.Annotation")
                    .addFeature("SectionHeaderText", "text of the header", "uima.cas.String")
                    .addFeature("Term", "text of the header", "uima.cas.String")
                    .addFeature("Snippet", "text", "uima.cas.String")
                    .getTypeDescription());
            //types.addType(TYPE_SIMPLE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type);
            //types.addType(TypeDescriptionBuilder.create(TYPE_ECIG_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
            //         .addFeature("Feature", "", "uima.cas.String")
            //     .getTypeDescription());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }



    public enum PARENT_CLASS {
        TYPE_WINDOW("gov.va.vinci.leo.window.types.Window"),
        TYPE_REGEX("gov.va.vinci.leo.regex.types.RegularExpressionType"),
        TYPE_PATTERN("gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType"),
        CONTEXT("gov.va.vinci.leo.context.types.Context"),
        LINK("gov.va.vinci.leo.conceptlink.types.Link");

        public String type;

        private PARENT_CLASS(String type) {

            this.type = type;
        }

        public String getType() {

            return this.type;
        }

    }

}
