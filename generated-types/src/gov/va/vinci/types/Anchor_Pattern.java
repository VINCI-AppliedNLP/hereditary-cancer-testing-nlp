

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
public class Anchor_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Anchor_Pattern.class);
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
  protected Anchor_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Anchor_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Anchor_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Anchor_Pattern(JCas jcas, int begin, int end) {
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
    if (Anchor_Pattern_Type.featOkTst && ((Anchor_Pattern_Type)jcasType).casFeat_Anchor_Type == null)
      jcasType.jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Anchor_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Anchor_Pattern_Type)jcasType).casFeatCode_Anchor_Type);}
    
  /** setter for Anchor_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_Type(String v) {
    if (Anchor_Pattern_Type.featOkTst && ((Anchor_Pattern_Type)jcasType).casFeat_Anchor_Type == null)
      jcasType.jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Anchor_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Anchor_Pattern_Type)jcasType).casFeatCode_Anchor_Type, v);}    
   
    
  //*--------------*
  //* Feature: Anchor_Term

  /** getter for Anchor_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchor_Term() {
    if (Anchor_Pattern_Type.featOkTst && ((Anchor_Pattern_Type)jcasType).casFeat_Anchor_Term == null)
      jcasType.jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Anchor_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Anchor_Pattern_Type)jcasType).casFeatCode_Anchor_Term);}
    
  /** setter for Anchor_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_Term(String v) {
    if (Anchor_Pattern_Type.featOkTst && ((Anchor_Pattern_Type)jcasType).casFeat_Anchor_Term == null)
      jcasType.jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Anchor_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Anchor_Pattern_Type)jcasType).casFeatCode_Anchor_Term, v);}    
  }

    