
/* First created by JCasGen Thu Aug 15 08:32:45 CDT 2024 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Thu Aug 15 08:32:45 CDT 2024
 * @generated */
public class Test_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Test_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Test_Pattern");
 
  /** @generated */
  final Feature casFeat_Test_Type;
  /** @generated */
  final int     casFeatCode_Test_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTest_Type(int addr) {
        if (featOkTst && casFeat_Test_Type == null)
      jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Test_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Test_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTest_Type(int addr, String v) {
        if (featOkTst && casFeat_Test_Type == null)
      jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Test_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Test_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Test_Name;
  /** @generated */
  final int     casFeatCode_Test_Name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTest_Name(int addr) {
        if (featOkTst && casFeat_Test_Name == null)
      jcas.throwFeatMissing("Test_Name", "gov.va.vinci.types.Test_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Test_Name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTest_Name(int addr, String v) {
        if (featOkTst && casFeat_Test_Name == null)
      jcas.throwFeatMissing("Test_Name", "gov.va.vinci.types.Test_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Test_Name, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Test_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Test_Type = jcas.getRequiredFeatureDE(casType, "Test_Type", "uima.cas.String", featOkTst);
    casFeatCode_Test_Type  = (null == casFeat_Test_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Test_Type).getCode();

 
    casFeat_Test_Name = jcas.getRequiredFeatureDE(casType, "Test_Name", "uima.cas.String", featOkTst);
    casFeatCode_Test_Name  = (null == casFeat_Test_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Test_Name).getCode();

  }
}



    