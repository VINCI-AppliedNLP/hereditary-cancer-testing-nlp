
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
public class Variant_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Variant_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Variant_Pattern");
 
  /** @generated */
  final Feature casFeat_Anchor_Type;
  /** @generated */
  final int     casFeatCode_Anchor_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnchor_Type(int addr) {
        if (featOkTst && casFeat_Anchor_Type == null)
      jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Variant_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchor_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_Type(int addr, String v) {
        if (featOkTst && casFeat_Anchor_Type == null)
      jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Variant_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchor_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Anchor_Term;
  /** @generated */
  final int     casFeatCode_Anchor_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnchor_Term(int addr) {
        if (featOkTst && casFeat_Anchor_Term == null)
      jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Variant_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchor_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_Term(int addr, String v) {
        if (featOkTst && casFeat_Anchor_Term == null)
      jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Variant_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchor_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Reference;
  /** @generated */
  final int     casFeatCode_Reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReference(int addr) {
        if (featOkTst && casFeat_Reference == null)
      jcas.throwFeatMissing("Reference", "gov.va.vinci.types.Variant_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, String v) {
        if (featOkTst && casFeat_Reference == null)
      jcas.throwFeatMissing("Reference", "gov.va.vinci.types.Variant_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Description;
  /** @generated */
  final int     casFeatCode_Description;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDescription(int addr) {
        if (featOkTst && casFeat_Description == null)
      jcas.throwFeatMissing("Description", "gov.va.vinci.types.Variant_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_Description == null)
      jcas.throwFeatMissing("Description", "gov.va.vinci.types.Variant_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Description, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Variant_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Anchor_Type = jcas.getRequiredFeatureDE(casType, "Anchor_Type", "uima.cas.String", featOkTst);
    casFeatCode_Anchor_Type  = (null == casFeat_Anchor_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchor_Type).getCode();

 
    casFeat_Anchor_Term = jcas.getRequiredFeatureDE(casType, "Anchor_Term", "uima.cas.String", featOkTst);
    casFeatCode_Anchor_Term  = (null == casFeat_Anchor_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchor_Term).getCode();

 
    casFeat_Reference = jcas.getRequiredFeatureDE(casType, "Reference", "uima.cas.String", featOkTst);
    casFeatCode_Reference  = (null == casFeat_Reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Reference).getCode();

 
    casFeat_Description = jcas.getRequiredFeatureDE(casType, "Description", "uima.cas.String", featOkTst);
    casFeatCode_Description  = (null == casFeat_Description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Description).getCode();

  }
}



    