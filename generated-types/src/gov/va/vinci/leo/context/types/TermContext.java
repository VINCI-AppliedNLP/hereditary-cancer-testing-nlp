

/* First created by JCasGen Tue Oct 01 11:50:58 CDT 2019 */
package gov.va.vinci.leo.context.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Oct 01 11:50:58 CDT 2019
 * XML source: C:/Users/VHASLC~2/AppData/Local/Temp/3/leoTypeDescription_e73d5758-ec44-4a48-8b9b-782b00eb5b514754142410301839700.xml
 * @generated */
public class TermContext extends Context {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TermContext.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TermContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TermContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TermContext(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TermContext(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Concept

  /** getter for Concept - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConcept() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Concept);}
    
  /** setter for Concept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcept(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Concept, v);}    
   
    
  //*--------------*
  //* Feature: Metastatic_Term

  /** getter for Metastatic_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMetastatic_Term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Metastatic_Term == null)
      jcasType.jcas.throwFeatMissing("Metastatic_Term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Metastatic_Term);}
    
  /** setter for Metastatic_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMetastatic_Term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Metastatic_Term == null)
      jcasType.jcas.throwFeatMissing("Metastatic_Term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Metastatic_Term, v);}    
   
    
  //*--------------*
  //* Feature: Experiencer

  /** getter for Experiencer - gets text of the experiencer
   * @generated
   * @return value of the feature 
   */
  public String getExperiencer() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Experiencer);}
    
  /** setter for Experiencer - sets text of the experiencer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperiencer(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Experiencer, v);}    
   
    
  //*--------------*
  //* Feature: Negation

  /** getter for Negation - gets text of the negation
   * @generated
   * @return value of the feature 
   */
  public String getNegation() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Negation);}
    
  /** setter for Negation - sets text of the negation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegation(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Negation, v);}    
   
    
  //*--------------*
  //* Feature: Temporality

  /** getter for Temporality - gets text of the temporality
   * @generated
   * @return value of the feature 
   */
  public String getTemporality() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Temporality);}
    
  /** setter for Temporality - sets text of the temporality 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporality(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Temporality, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_term

  /** getter for Modifier_term - gets text of the diagnosis term
   * @generated
   * @return value of the feature 
   */
  public String getModifier_term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier_term == null)
      jcasType.jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier_term);}
    
  /** setter for Modifier_term - sets text of the diagnosis term 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier_term == null)
      jcasType.jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier_term, v);}    
   
    
  //*--------------*
  //* Feature: Modifier

  /** getter for Modifier - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getModifier() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier);}
    
  /** setter for Modifier - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier, v);}    
   
    
  //*--------------*
  //* Feature: Anatomy

  /** getter for Anatomy - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getAnatomy() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Anatomy == null)
      jcasType.jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Anatomy);}
    
  /** setter for Anatomy - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnatomy(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Anatomy == null)
      jcasType.jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Anatomy, v);}    
   
    
  //*--------------*
  //* Feature: NLP_Diagnosis

  /** getter for NLP_Diagnosis - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public int getNLP_Diagnosis() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_NLP_Diagnosis == null)
      jcasType.jcas.throwFeatMissing("NLP_Diagnosis", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_NLP_Diagnosis);}
    
  /** setter for NLP_Diagnosis - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNLP_Diagnosis(int v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_NLP_Diagnosis == null)
      jcasType.jcas.throwFeatMissing("NLP_Diagnosis", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_NLP_Diagnosis, v);}    
  }

    