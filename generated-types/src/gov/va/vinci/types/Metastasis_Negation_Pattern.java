

/* First created by JCasGen Tue Oct 01 11:50:59 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;


/** 
 * Updated by JCasGen Tue Oct 01 11:50:59 CDT 2019
 * XML source: C:/Users/VHASLC~2/AppData/Local/Temp/3/leoTypeDescription_e73d5758-ec44-4a48-8b9b-782b00eb5b514754142410301839700.xml
 * @generated */
public class Metastasis_Negation_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Metastasis_Negation_Pattern.class);
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
  protected Metastasis_Negation_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Metastasis_Negation_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Metastasis_Negation_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Metastasis_Negation_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Modifier

  /** getter for Modifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModifier() {
    if (Metastasis_Negation_Pattern_Type.featOkTst && ((Metastasis_Negation_Pattern_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Metastasis_Negation_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metastasis_Negation_Pattern_Type)jcasType).casFeatCode_Modifier);}
    
  /** setter for Modifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier(String v) {
    if (Metastasis_Negation_Pattern_Type.featOkTst && ((Metastasis_Negation_Pattern_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Metastasis_Negation_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metastasis_Negation_Pattern_Type)jcasType).casFeatCode_Modifier, v);}    
  }

    