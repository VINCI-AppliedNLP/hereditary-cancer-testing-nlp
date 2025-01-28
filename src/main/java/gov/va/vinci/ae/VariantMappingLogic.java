package gov.va.vinci.ae;

import gov.va.vinci.leo.AnnotationLibrarian;
import gov.va.vinci.leo.ae.LeoBaseAnnotator;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.sentence.types.AnchoredSentence;
import gov.va.vinci.types.*;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.ArrayList;

//import gov.va.vinci.leo.context.types.TermContext;

public class VariantMappingLogic extends LeoBaseAnnotator {

    /*@Override
    public void initialize(UimaContext context) throws ResourceInitializationException {
        super.initialize(context);
    }
*/
    @Override
    public void annotate(JCas aJCas) throws AnalysisEngineProcessException {
        FSIterator<Annotation> patternit = this.getAnnotationListForType(aJCas, Variant_Mapping_Pattern.class.getCanonicalName());
        while (patternit.hasNext()) try {
            Variant_Mapping_Pattern current_pattern = (Variant_Mapping_Pattern) patternit.next();
            if (current_pattern != null) {
                ArrayList<Annotation> AnchorList = new ArrayList<Annotation>();
                ArrayList<Annotation> dnaList = new ArrayList<Annotation>();
                ArrayList<Annotation> proteinList = new ArrayList<Annotation>();
                ArrayList<Annotation> ReferenceList = new ArrayList<Annotation>();
                ArrayList<Annotation> sectionList = new ArrayList<Annotation>();



                //ArrayList<AnnotationPatternType> LPMList = new ArrayList<AnnotationPatternType>();

                //Respiration concepts
                AnchorList.addAll(AnnotationLibrarian.getAllOverlappingAnnotationsOfType(current_pattern, Biomarker_Anchor.type, false));

                dnaList.addAll(AnnotationLibrarian.getAllOverlappingAnnotationsOfType(current_pattern, HGVS_DNA.type, false));
                proteinList.addAll(AnnotationLibrarian.getAllOverlappingAnnotationsOfType(current_pattern, HGVS_Protein.type, false));
                ReferenceList.addAll(AnnotationLibrarian.getAllOverlappingAnnotationsOfType(current_pattern, HGVS_Reference.type, false));
                sectionList.addAll(AnnotationLibrarian.getAllOverlappingAnnotationsOfType(current_pattern, Section.type, false));



                //Get complete extraction
               // current_pattern.setPattern_Text(current_pattern.getCoveredText());

                //Set the gene name to the anchor concept if identified, otherwise set the test name
                if (AnchorList.size() > 0) {
                    Annotation anchor = AnchorList.get(0);
                    current_pattern.setAnchor_Type(((Biomarker_Anchor) anchor).getConcept());
                    current_pattern.setAnchor_Term((anchor).getCoveredText());
                }
                /*
                Modifier Logic, if the anchor type is already complete negation set that to negated,
                otherwise use overlapping cases first, then cases in the window

                Modifier Set if found in the initial pattern, otherwise set if found within the anchored sentence
                 */
                /*
                if (current_pattern.getAnchor_Type() == "Complete_Negation"){
                    current_pattern.setModifier_Type("Negated");
                }

                 */

/*
                if (sectionList.size() > 0) {
                    Annotation sec = sectionList.get(0);
                    current_pattern.setSection(((Section) sec).getSectionHeaderText());
                    //Option - Potentially delete instances found in certain sections of a document
                    // if( ((Section) sec).getSectionHeaderText().equalsIgnoreCase("Medications")){
                    // todelete.add(current_cont);
                    //}

                }

 */
                if (dnaList.size() > 0) {
                    Annotation description = dnaList.get(0);
                    current_pattern.setHGVS_DNA(((HGVS_DNA) description).getCoveredText());

                }
                if (proteinList.size() > 0) {
                    Annotation protein = proteinList.get(0);
                    current_pattern.setHGVS_Protein(((HGVS_Protein) protein).getCoveredText());
                }
                if (ReferenceList.size() > 0) {
                    Annotation reference = ReferenceList.get(0);
                    current_pattern.setGene_Reference(((HGVS_Reference) reference).getCoveredText());
                    //current_pattern.setModifier_Term((modifier).getCoveredText());
                }


                //Test names set and identified with pattern first then with sentence window if found
                /*
                if (current_pattern.getAnchor_Type() == "hereditary_lab_name") {
                    current_pattern.setTest_Type("hereditary_lab_name");
                }

                 */
                /*
                else if (SentenceList.size() > 0) { // if there is no value in the pattern, look in the sentence
                    Annotation sent = SentenceList.get(0);
                    // use an array list to get the value closest to the anchor term
                    ArrayList<Annotation> bList = (ArrayList<Annotation>) AnnotationLibrarian.getAllCoveredAnnotationsOfType(sent, Test_Term.type, false);

                    //if len(closest_r_dates) > 0: v = first element in bList (index0)
                    //Use the value found to the right first if it exists, else use the value to the left
                    if (bList.size() > 0)  {
                        Annotation btesttype = bList.get(0);
                        current_pattern.setTest_Type(((Test_Term) btesttype).getConcept());


                    }


                }


                 */


                }




 }   catch (CASException e) {
            logger.error(e.getStackTrace());

            //

        }
        //Sections to potentially Remove
       /* for(Annotation a:todelete){
            a.removeFromIndexes();
        } */

    }
    @Override
    public LeoTypeSystemDescription getLeoTypeSystemDescription() {
        return new LeoTypeSystemDescription();
    }
}
