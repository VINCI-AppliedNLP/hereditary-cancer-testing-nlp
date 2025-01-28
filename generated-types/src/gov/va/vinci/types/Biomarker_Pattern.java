

/* First created by JCasGen Thu Aug 15 08:32:44 CDT 2024 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;


/** 
 * Updated by JCasGen Thu Aug 15 08:32:44 CDT 2024
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/7/leoTypeDescription_68c12e44-c2f6-4267-a57d-d466e52631a69104470216225071351.xml
 * @generated */
public class Biomarker_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Biomarker_Pattern.class);
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
  protected Biomarker_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Biomarker_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Biomarker_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Biomarker_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Anchor_Type

  /** getter for Anchor_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchor_Type() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Anchor_Type == null)
      jcasType.jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Anchor_Type);}
    
  /** setter for Anchor_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_Type(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Anchor_Type == null)
      jcasType.jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Anchor_Type, v);}    
   
    
  //*--------------*
  //* Feature: Anchor_Term

  /** getter for Anchor_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchor_Term() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Anchor_Term == null)
      jcasType.jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Anchor_Term);}
    
  /** setter for Anchor_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_Term(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Anchor_Term == null)
      jcasType.jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Anchor_Term, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_Type

  /** getter for Modifier_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier_Type() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Modifier_Type == null)
      jcasType.jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Modifier_Type);}
    
  /** setter for Modifier_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_Type(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Modifier_Type == null)
      jcasType.jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Modifier_Type, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_Term

  /** getter for Modifier_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier_Term() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Modifier_Term == null)
      jcasType.jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Modifier_Term);}
    
  /** setter for Modifier_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_Term(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Modifier_Term == null)
      jcasType.jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Modifier_Term, v);}    
   
    
  //*--------------*
  //* Feature: Gene_Name

  /** getter for Gene_Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGene_Name() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Gene_Name == null)
      jcasType.jcas.throwFeatMissing("Gene_Name", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Gene_Name);}
    
  /** setter for Gene_Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGene_Name(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Gene_Name == null)
      jcasType.jcas.throwFeatMissing("Gene_Name", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Gene_Name, v);}    
   
    
  //*--------------*
  //* Feature: HGVS_DNA

  /** getter for HGVS_DNA - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHGVS_DNA() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_HGVS_DNA == null)
      jcasType.jcas.throwFeatMissing("HGVS_DNA", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_HGVS_DNA);}
    
  /** setter for HGVS_DNA - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHGVS_DNA(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_HGVS_DNA == null)
      jcasType.jcas.throwFeatMissing("HGVS_DNA", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_HGVS_DNA, v);}    
   
    
  //*--------------*
  //* Feature: HGVS_Protein

  /** getter for HGVS_Protein - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHGVS_Protein() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_HGVS_Protein == null)
      jcasType.jcas.throwFeatMissing("HGVS_Protein", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_HGVS_Protein);}
    
  /** setter for HGVS_Protein - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHGVS_Protein(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_HGVS_Protein == null)
      jcasType.jcas.throwFeatMissing("HGVS_Protein", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_HGVS_Protein, v);}    
   
    
  //*--------------*
  //* Feature: Gene_Reference

  /** getter for Gene_Reference - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGene_Reference() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Gene_Reference == null)
      jcasType.jcas.throwFeatMissing("Gene_Reference", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Gene_Reference);}
    
  /** setter for Gene_Reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGene_Reference(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Gene_Reference == null)
      jcasType.jcas.throwFeatMissing("Gene_Reference", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Gene_Reference, v);}    
   
    
  //*--------------*
  //* Feature: Lab_Name

  /** getter for Lab_Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLab_Name() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Lab_Name == null)
      jcasType.jcas.throwFeatMissing("Lab_Name", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Lab_Name);}
    
  /** setter for Lab_Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLab_Name(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Lab_Name == null)
      jcasType.jcas.throwFeatMissing("Lab_Name", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Lab_Name, v);}    
   
    
  //*--------------*
  //* Feature: Test_Type

  /** getter for Test_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTest_Type() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Test_Type == null)
      jcasType.jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Test_Type);}
    
  /** setter for Test_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTest_Type(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Test_Type == null)
      jcasType.jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Test_Type, v);}    
   
    
  //*--------------*
  //* Feature: Variant_Type

  /** getter for Variant_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVariant_Type() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Variant_Type == null)
      jcasType.jcas.throwFeatMissing("Variant_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Variant_Type);}
    
  /** setter for Variant_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVariant_Type(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Variant_Type == null)
      jcasType.jcas.throwFeatMissing("Variant_Type", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Variant_Type, v);}    
   
    
  //*--------------*
  //* Feature: Expression_Value

  /** getter for Expression_Value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExpression_Value() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Expression_Value == null)
      jcasType.jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Expression_Value);}
    
  /** setter for Expression_Value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExpression_Value(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Expression_Value == null)
      jcasType.jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Expression_Value, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_in_Window

  /** getter for Modifier_in_Window - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier_in_Window() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Modifier_in_Window == null)
      jcasType.jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Modifier_in_Window);}
    
  /** setter for Modifier_in_Window - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_in_Window(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Modifier_in_Window == null)
      jcasType.jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Modifier_in_Window, v);}    
   
    
  //*--------------*
  //* Feature: Section

  /** getter for Section - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSection() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Section == null)
      jcasType.jcas.throwFeatMissing("Section", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Section);}
    
  /** setter for Section - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSection(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Section == null)
      jcasType.jcas.throwFeatMissing("Section", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Section, v);}    
   
    
  //*--------------*
  //* Feature: Section_Header

  /** getter for Section_Header - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSection_Header() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Section_Header == null)
      jcasType.jcas.throwFeatMissing("Section_Header", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Section_Header);}
    
  /** setter for Section_Header - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSection_Header(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Section_Header == null)
      jcasType.jcas.throwFeatMissing("Section_Header", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Section_Header, v);}    
   
    
  //*--------------*
  //* Feature: Context_Experiencer

  /** getter for Context_Experiencer - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContext_Experiencer() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Context_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Context_Experiencer", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Context_Experiencer);}
    
  /** setter for Context_Experiencer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext_Experiencer(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Context_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Context_Experiencer", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Context_Experiencer, v);}    
   
    
  //*--------------*
  //* Feature: Context_Temporality

  /** getter for Context_Temporality - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContext_Temporality() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Context_Temporality == null)
      jcasType.jcas.throwFeatMissing("Context_Temporality", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Context_Temporality);}
    
  /** setter for Context_Temporality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext_Temporality(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Context_Temporality == null)
      jcasType.jcas.throwFeatMissing("Context_Temporality", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Context_Temporality, v);}    
   
    
  //*--------------*
  //* Feature: Context_Negation

  /** getter for Context_Negation - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContext_Negation() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Context_Negation == null)
      jcasType.jcas.throwFeatMissing("Context_Negation", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Context_Negation);}
    
  /** setter for Context_Negation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext_Negation(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Context_Negation == null)
      jcasType.jcas.throwFeatMissing("Context_Negation", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Context_Negation, v);}    
   
    
  //*--------------*
  //* Feature: Pattern_Text

  /** getter for Pattern_Text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPattern_Text() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Pattern_Text == null)
      jcasType.jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Pattern_Text);}
    
  /** setter for Pattern_Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPattern_Text(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Pattern_Text == null)
      jcasType.jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Pattern_Text, v);}    
   
    
  //*--------------*
  //* Feature: Anchored_Sentence

  /** getter for Anchored_Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchored_Sentence() {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Biomarker_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence);}
    
  /** setter for Anchored_Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchored_Sentence(String v) {
    if (Biomarker_Pattern_Type.featOkTst && ((Biomarker_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Biomarker_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Biomarker_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence, v);}    
  }

    