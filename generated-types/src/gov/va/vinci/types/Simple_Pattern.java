

/* First created by JCasGen Thu Aug 15 08:32:45 CDT 2024 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;


/** 
 * Updated by JCasGen Thu Aug 15 08:32:45 CDT 2024
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/7/leoTypeDescription_68c12e44-c2f6-4267-a57d-d466e52631a69104470216225071351.xml
 * @generated */
public class Simple_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Simple_Pattern.class);
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
  protected Simple_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Simple_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Simple_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Simple_Pattern(JCas jcas, int begin, int end) {
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
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Anchor_Type == null)
      jcasType.jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Anchor_Type);}
    
  /** setter for Anchor_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_Type(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Anchor_Type == null)
      jcasType.jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Anchor_Type, v);}    
   
    
  //*--------------*
  //* Feature: Anchor_Term

  /** getter for Anchor_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchor_Term() {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Anchor_Term == null)
      jcasType.jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Anchor_Term);}
    
  /** setter for Anchor_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_Term(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Anchor_Term == null)
      jcasType.jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Anchor_Term, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_Type

  /** getter for Modifier_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier_Type() {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Modifier_Type == null)
      jcasType.jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Modifier_Type);}
    
  /** setter for Modifier_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_Type(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Modifier_Type == null)
      jcasType.jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Modifier_Type, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_Term

  /** getter for Modifier_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier_Term() {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Modifier_Term == null)
      jcasType.jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Modifier_Term);}
    
  /** setter for Modifier_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_Term(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Modifier_Term == null)
      jcasType.jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Modifier_Term, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_in_Window

  /** getter for Modifier_in_Window - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier_in_Window() {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Modifier_in_Window == null)
      jcasType.jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Modifier_in_Window);}
    
  /** setter for Modifier_in_Window - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_in_Window(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Modifier_in_Window == null)
      jcasType.jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Modifier_in_Window, v);}    
   
    
  //*--------------*
  //* Feature: Pattern_Text

  /** getter for Pattern_Text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPattern_Text() {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Pattern_Text == null)
      jcasType.jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Pattern_Text);}
    
  /** setter for Pattern_Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPattern_Text(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Pattern_Text == null)
      jcasType.jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Pattern_Text, v);}    
   
    
  //*--------------*
  //* Feature: Anchored_Sentence

  /** getter for Anchored_Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchored_Sentence() {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Simple_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence);}
    
  /** setter for Anchored_Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchored_Sentence(String v) {
    if (Simple_Pattern_Type.featOkTst && ((Simple_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Simple_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Simple_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence, v);}    
  }

    