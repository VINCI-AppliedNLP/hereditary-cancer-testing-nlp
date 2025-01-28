
/* First created by JCasGen Thu Aug 15 08:32:44 CDT 2024 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Thu Aug 15 08:32:44 CDT 2024
 * @generated */
public class Expression_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Expression_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Expression_Pattern");
 
  /** @generated */
  final Feature casFeat_Expression_Term;
  /** @generated */
  final int     casFeatCode_Expression_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExpression_Term(int addr) {
        if (featOkTst && casFeat_Expression_Term == null)
      jcas.throwFeatMissing("Expression_Term", "gov.va.vinci.types.Expression_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Expression_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExpression_Term(int addr, String v) {
        if (featOkTst && casFeat_Expression_Term == null)
      jcas.throwFeatMissing("Expression_Term", "gov.va.vinci.types.Expression_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Expression_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Expression_Value;
  /** @generated */
  final int     casFeatCode_Expression_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExpression_Value(int addr) {
        if (featOkTst && casFeat_Expression_Value == null)
      jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Expression_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Expression_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExpression_Value(int addr, String v) {
        if (featOkTst && casFeat_Expression_Value == null)
      jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Expression_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Expression_Value, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Expression_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Expression_Term = jcas.getRequiredFeatureDE(casType, "Expression_Term", "uima.cas.String", featOkTst);
    casFeatCode_Expression_Term  = (null == casFeat_Expression_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Expression_Term).getCode();

 
    casFeat_Expression_Value = jcas.getRequiredFeatureDE(casType, "Expression_Value", "uima.cas.String", featOkTst);
    casFeatCode_Expression_Value  = (null == casFeat_Expression_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Expression_Value).getCode();

  }
}



    