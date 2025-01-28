
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
public class Simple_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Simple_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Simple_Pattern");
 
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
      jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchor_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_Type(int addr, String v) {
        if (featOkTst && casFeat_Anchor_Type == null)
      jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Simple_Pattern");
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
      jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchor_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_Term(int addr, String v) {
        if (featOkTst && casFeat_Anchor_Term == null)
      jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Simple_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchor_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier_Type;
  /** @generated */
  final int     casFeatCode_Modifier_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier_Type(int addr) {
        if (featOkTst && casFeat_Modifier_Type == null)
      jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_Type(int addr, String v) {
        if (featOkTst && casFeat_Modifier_Type == null)
      jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Simple_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier_Term;
  /** @generated */
  final int     casFeatCode_Modifier_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier_Term(int addr) {
        if (featOkTst && casFeat_Modifier_Term == null)
      jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_Term(int addr, String v) {
        if (featOkTst && casFeat_Modifier_Term == null)
      jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Simple_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier_in_Window;
  /** @generated */
  final int     casFeatCode_Modifier_in_Window;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier_in_Window(int addr) {
        if (featOkTst && casFeat_Modifier_in_Window == null)
      jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_in_Window);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_in_Window(int addr, String v) {
        if (featOkTst && casFeat_Modifier_in_Window == null)
      jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Simple_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_in_Window, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pattern_Text;
  /** @generated */
  final int     casFeatCode_Pattern_Text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPattern_Text(int addr) {
        if (featOkTst && casFeat_Pattern_Text == null)
      jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pattern_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPattern_Text(int addr, String v) {
        if (featOkTst && casFeat_Pattern_Text == null)
      jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Simple_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Pattern_Text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Anchored_Sentence;
  /** @generated */
  final int     casFeatCode_Anchored_Sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnchored_Sentence(int addr) {
        if (featOkTst && casFeat_Anchored_Sentence == null)
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Simple_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchored_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchored_Sentence(int addr, String v) {
        if (featOkTst && casFeat_Anchored_Sentence == null)
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Simple_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchored_Sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Simple_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Anchor_Type = jcas.getRequiredFeatureDE(casType, "Anchor_Type", "uima.cas.String", featOkTst);
    casFeatCode_Anchor_Type  = (null == casFeat_Anchor_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchor_Type).getCode();

 
    casFeat_Anchor_Term = jcas.getRequiredFeatureDE(casType, "Anchor_Term", "uima.cas.String", featOkTst);
    casFeatCode_Anchor_Term  = (null == casFeat_Anchor_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchor_Term).getCode();

 
    casFeat_Modifier_Type = jcas.getRequiredFeatureDE(casType, "Modifier_Type", "uima.cas.String", featOkTst);
    casFeatCode_Modifier_Type  = (null == casFeat_Modifier_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier_Type).getCode();

 
    casFeat_Modifier_Term = jcas.getRequiredFeatureDE(casType, "Modifier_Term", "uima.cas.String", featOkTst);
    casFeatCode_Modifier_Term  = (null == casFeat_Modifier_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier_Term).getCode();

 
    casFeat_Modifier_in_Window = jcas.getRequiredFeatureDE(casType, "Modifier_in_Window", "uima.cas.String", featOkTst);
    casFeatCode_Modifier_in_Window  = (null == casFeat_Modifier_in_Window) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier_in_Window).getCode();

 
    casFeat_Pattern_Text = jcas.getRequiredFeatureDE(casType, "Pattern_Text", "uima.cas.String", featOkTst);
    casFeatCode_Pattern_Text  = (null == casFeat_Pattern_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pattern_Text).getCode();

 
    casFeat_Anchored_Sentence = jcas.getRequiredFeatureDE(casType, "Anchored_Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Anchored_Sentence  = (null == casFeat_Anchored_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchored_Sentence).getCode();

  }
}



    