

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
public class Test_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Test_Pattern.class);
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
  protected Test_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Test_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Test_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Test_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Test_Type

  /** getter for Test_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTest_Type() {
    if (Test_Pattern_Type.featOkTst && ((Test_Pattern_Type)jcasType).casFeat_Test_Type == null)
      jcasType.jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Test_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Test_Pattern_Type)jcasType).casFeatCode_Test_Type);}
    
  /** setter for Test_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTest_Type(String v) {
    if (Test_Pattern_Type.featOkTst && ((Test_Pattern_Type)jcasType).casFeat_Test_Type == null)
      jcasType.jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Test_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Test_Pattern_Type)jcasType).casFeatCode_Test_Type, v);}    
   
    
  //*--------------*
  //* Feature: Test_Name

  /** getter for Test_Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTest_Name() {
    if (Test_Pattern_Type.featOkTst && ((Test_Pattern_Type)jcasType).casFeat_Test_Name == null)
      jcasType.jcas.throwFeatMissing("Test_Name", "gov.va.vinci.types.Test_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Test_Pattern_Type)jcasType).casFeatCode_Test_Name);}
    
  /** setter for Test_Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTest_Name(String v) {
    if (Test_Pattern_Type.featOkTst && ((Test_Pattern_Type)jcasType).casFeat_Test_Name == null)
      jcasType.jcas.throwFeatMissing("Test_Name", "gov.va.vinci.types.Test_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Test_Pattern_Type)jcasType).casFeatCode_Test_Name, v);}    
  }

    