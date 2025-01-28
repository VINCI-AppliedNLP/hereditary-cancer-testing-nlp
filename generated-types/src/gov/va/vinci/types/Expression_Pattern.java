

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
public class Expression_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Expression_Pattern.class);
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
  protected Expression_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Expression_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Expression_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Expression_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Expression_Term

  /** getter for Expression_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExpression_Term() {
    if (Expression_Pattern_Type.featOkTst && ((Expression_Pattern_Type)jcasType).casFeat_Expression_Term == null)
      jcasType.jcas.throwFeatMissing("Expression_Term", "gov.va.vinci.types.Expression_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Expression_Pattern_Type)jcasType).casFeatCode_Expression_Term);}
    
  /** setter for Expression_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExpression_Term(String v) {
    if (Expression_Pattern_Type.featOkTst && ((Expression_Pattern_Type)jcasType).casFeat_Expression_Term == null)
      jcasType.jcas.throwFeatMissing("Expression_Term", "gov.va.vinci.types.Expression_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Expression_Pattern_Type)jcasType).casFeatCode_Expression_Term, v);}    
   
    
  //*--------------*
  //* Feature: Expression_Value

  /** getter for Expression_Value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExpression_Value() {
    if (Expression_Pattern_Type.featOkTst && ((Expression_Pattern_Type)jcasType).casFeat_Expression_Value == null)
      jcasType.jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Expression_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Expression_Pattern_Type)jcasType).casFeatCode_Expression_Value);}
    
  /** setter for Expression_Value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExpression_Value(String v) {
    if (Expression_Pattern_Type.featOkTst && ((Expression_Pattern_Type)jcasType).casFeat_Expression_Value == null)
      jcasType.jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Expression_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Expression_Pattern_Type)jcasType).casFeatCode_Expression_Value, v);}    
  }

    