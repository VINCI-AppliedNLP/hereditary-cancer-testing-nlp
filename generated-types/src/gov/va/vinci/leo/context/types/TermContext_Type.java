
/* First created by JCasGen Tue Oct 01 11:50:58 CDT 2019 */
package gov.va.vinci.leo.context.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Oct 01 11:50:58 CDT 2019
 * @generated */
public class TermContext_Type extends Context_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TermContext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.leo.context.types.TermContext");
 
  /** @generated */
  final Feature casFeat_Concept;
  /** @generated */
  final int     casFeatCode_Concept;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConcept(int addr) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Concept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConcept(int addr, String v) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Concept, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Metastatic_Term;
  /** @generated */
  final int     casFeatCode_Metastatic_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMetastatic_Term(int addr) {
        if (featOkTst && casFeat_Metastatic_Term == null)
      jcas.throwFeatMissing("Metastatic_Term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Metastatic_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMetastatic_Term(int addr, String v) {
        if (featOkTst && casFeat_Metastatic_Term == null)
      jcas.throwFeatMissing("Metastatic_Term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Metastatic_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Experiencer;
  /** @generated */
  final int     casFeatCode_Experiencer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExperiencer(int addr) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Experiencer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExperiencer(int addr, String v) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Experiencer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Negation;
  /** @generated */
  final int     casFeatCode_Negation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegation(int addr) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Negation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegation(int addr, String v) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Negation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Temporality;
  /** @generated */
  final int     casFeatCode_Temporality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTemporality(int addr) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Temporality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTemporality(int addr, String v) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Temporality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier_term;
  /** @generated */
  final int     casFeatCode_Modifier_term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier_term(int addr) {
        if (featOkTst && casFeat_Modifier_term == null)
      jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_term(int addr, String v) {
        if (featOkTst && casFeat_Modifier_term == null)
      jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier;
  /** @generated */
  final int     casFeatCode_Modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier(int addr) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier(int addr, String v) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Anatomy;
  /** @generated */
  final int     casFeatCode_Anatomy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnatomy(int addr) {
        if (featOkTst && casFeat_Anatomy == null)
      jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anatomy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnatomy(int addr, String v) {
        if (featOkTst && casFeat_Anatomy == null)
      jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anatomy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NLP_Diagnosis;
  /** @generated */
  final int     casFeatCode_NLP_Diagnosis;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNLP_Diagnosis(int addr) {
        if (featOkTst && casFeat_NLP_Diagnosis == null)
      jcas.throwFeatMissing("NLP_Diagnosis", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getIntValue(addr, casFeatCode_NLP_Diagnosis);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNLP_Diagnosis(int addr, int v) {
        if (featOkTst && casFeat_NLP_Diagnosis == null)
      jcas.throwFeatMissing("NLP_Diagnosis", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setIntValue(addr, casFeatCode_NLP_Diagnosis, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TermContext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Concept = jcas.getRequiredFeatureDE(casType, "Concept", "uima.cas.String", featOkTst);
    casFeatCode_Concept  = (null == casFeat_Concept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Concept).getCode();

 
    casFeat_Metastatic_Term = jcas.getRequiredFeatureDE(casType, "Metastatic_Term", "uima.cas.String", featOkTst);
    casFeatCode_Metastatic_Term  = (null == casFeat_Metastatic_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Metastatic_Term).getCode();

 
    casFeat_Experiencer = jcas.getRequiredFeatureDE(casType, "Experiencer", "uima.cas.String", featOkTst);
    casFeatCode_Experiencer  = (null == casFeat_Experiencer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Experiencer).getCode();

 
    casFeat_Negation = jcas.getRequiredFeatureDE(casType, "Negation", "uima.cas.String", featOkTst);
    casFeatCode_Negation  = (null == casFeat_Negation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Negation).getCode();

 
    casFeat_Temporality = jcas.getRequiredFeatureDE(casType, "Temporality", "uima.cas.String", featOkTst);
    casFeatCode_Temporality  = (null == casFeat_Temporality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Temporality).getCode();

 
    casFeat_Modifier_term = jcas.getRequiredFeatureDE(casType, "Modifier_term", "uima.cas.String", featOkTst);
    casFeatCode_Modifier_term  = (null == casFeat_Modifier_term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier_term).getCode();

 
    casFeat_Modifier = jcas.getRequiredFeatureDE(casType, "Modifier", "uima.cas.String", featOkTst);
    casFeatCode_Modifier  = (null == casFeat_Modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier).getCode();

 
    casFeat_Anatomy = jcas.getRequiredFeatureDE(casType, "Anatomy", "uima.cas.String", featOkTst);
    casFeatCode_Anatomy  = (null == casFeat_Anatomy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anatomy).getCode();

 
    casFeat_NLP_Diagnosis = jcas.getRequiredFeatureDE(casType, "NLP_Diagnosis", "uima.cas.Integer", featOkTst);
    casFeatCode_NLP_Diagnosis  = (null == casFeat_NLP_Diagnosis) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NLP_Diagnosis).getCode();

  }
}



    