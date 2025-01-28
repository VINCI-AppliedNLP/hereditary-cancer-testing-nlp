
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
public class Biomarker_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Biomarker_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Biomarker_Pattern");
 
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
      jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchor_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_Type(int addr, String v) {
        if (featOkTst && casFeat_Anchor_Type == null)
      jcas.throwFeatMissing("Anchor_Type", "gov.va.vinci.types.Biomarker_Pattern");
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
      jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchor_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_Term(int addr, String v) {
        if (featOkTst && casFeat_Anchor_Term == null)
      jcas.throwFeatMissing("Anchor_Term", "gov.va.vinci.types.Biomarker_Pattern");
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
      jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_Type(int addr, String v) {
        if (featOkTst && casFeat_Modifier_Type == null)
      jcas.throwFeatMissing("Modifier_Type", "gov.va.vinci.types.Biomarker_Pattern");
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
      jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_Term(int addr, String v) {
        if (featOkTst && casFeat_Modifier_Term == null)
      jcas.throwFeatMissing("Modifier_Term", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Gene_Name;
  /** @generated */
  final int     casFeatCode_Gene_Name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGene_Name(int addr) {
        if (featOkTst && casFeat_Gene_Name == null)
      jcas.throwFeatMissing("Gene_Name", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Gene_Name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGene_Name(int addr, String v) {
        if (featOkTst && casFeat_Gene_Name == null)
      jcas.throwFeatMissing("Gene_Name", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Gene_Name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_HGVS_DNA;
  /** @generated */
  final int     casFeatCode_HGVS_DNA;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHGVS_DNA(int addr) {
        if (featOkTst && casFeat_HGVS_DNA == null)
      jcas.throwFeatMissing("HGVS_DNA", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_HGVS_DNA);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHGVS_DNA(int addr, String v) {
        if (featOkTst && casFeat_HGVS_DNA == null)
      jcas.throwFeatMissing("HGVS_DNA", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_HGVS_DNA, v);}
    
  
 
  /** @generated */
  final Feature casFeat_HGVS_Protein;
  /** @generated */
  final int     casFeatCode_HGVS_Protein;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHGVS_Protein(int addr) {
        if (featOkTst && casFeat_HGVS_Protein == null)
      jcas.throwFeatMissing("HGVS_Protein", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_HGVS_Protein);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHGVS_Protein(int addr, String v) {
        if (featOkTst && casFeat_HGVS_Protein == null)
      jcas.throwFeatMissing("HGVS_Protein", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_HGVS_Protein, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Gene_Reference;
  /** @generated */
  final int     casFeatCode_Gene_Reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGene_Reference(int addr) {
        if (featOkTst && casFeat_Gene_Reference == null)
      jcas.throwFeatMissing("Gene_Reference", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Gene_Reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGene_Reference(int addr, String v) {
        if (featOkTst && casFeat_Gene_Reference == null)
      jcas.throwFeatMissing("Gene_Reference", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Gene_Reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Lab_Name;
  /** @generated */
  final int     casFeatCode_Lab_Name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLab_Name(int addr) {
        if (featOkTst && casFeat_Lab_Name == null)
      jcas.throwFeatMissing("Lab_Name", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Lab_Name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLab_Name(int addr, String v) {
        if (featOkTst && casFeat_Lab_Name == null)
      jcas.throwFeatMissing("Lab_Name", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Lab_Name, v);}
    
  
 
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
      jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Test_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTest_Type(int addr, String v) {
        if (featOkTst && casFeat_Test_Type == null)
      jcas.throwFeatMissing("Test_Type", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Test_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Variant_Type;
  /** @generated */
  final int     casFeatCode_Variant_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVariant_Type(int addr) {
        if (featOkTst && casFeat_Variant_Type == null)
      jcas.throwFeatMissing("Variant_Type", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Variant_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVariant_Type(int addr, String v) {
        if (featOkTst && casFeat_Variant_Type == null)
      jcas.throwFeatMissing("Variant_Type", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Variant_Type, v);}
    
  
 
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
      jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Expression_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExpression_Value(int addr, String v) {
        if (featOkTst && casFeat_Expression_Value == null)
      jcas.throwFeatMissing("Expression_Value", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Expression_Value, v);}
    
  
 
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
      jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_in_Window);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_in_Window(int addr, String v) {
        if (featOkTst && casFeat_Modifier_in_Window == null)
      jcas.throwFeatMissing("Modifier_in_Window", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_in_Window, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Section;
  /** @generated */
  final int     casFeatCode_Section;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSection(int addr) {
        if (featOkTst && casFeat_Section == null)
      jcas.throwFeatMissing("Section", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Section);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSection(int addr, String v) {
        if (featOkTst && casFeat_Section == null)
      jcas.throwFeatMissing("Section", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Section, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Section_Header;
  /** @generated */
  final int     casFeatCode_Section_Header;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSection_Header(int addr) {
        if (featOkTst && casFeat_Section_Header == null)
      jcas.throwFeatMissing("Section_Header", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Section_Header);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSection_Header(int addr, String v) {
        if (featOkTst && casFeat_Section_Header == null)
      jcas.throwFeatMissing("Section_Header", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Section_Header, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Context_Experiencer;
  /** @generated */
  final int     casFeatCode_Context_Experiencer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContext_Experiencer(int addr) {
        if (featOkTst && casFeat_Context_Experiencer == null)
      jcas.throwFeatMissing("Context_Experiencer", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Context_Experiencer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContext_Experiencer(int addr, String v) {
        if (featOkTst && casFeat_Context_Experiencer == null)
      jcas.throwFeatMissing("Context_Experiencer", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Context_Experiencer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Context_Temporality;
  /** @generated */
  final int     casFeatCode_Context_Temporality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContext_Temporality(int addr) {
        if (featOkTst && casFeat_Context_Temporality == null)
      jcas.throwFeatMissing("Context_Temporality", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Context_Temporality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContext_Temporality(int addr, String v) {
        if (featOkTst && casFeat_Context_Temporality == null)
      jcas.throwFeatMissing("Context_Temporality", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Context_Temporality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Context_Negation;
  /** @generated */
  final int     casFeatCode_Context_Negation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContext_Negation(int addr) {
        if (featOkTst && casFeat_Context_Negation == null)
      jcas.throwFeatMissing("Context_Negation", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Context_Negation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContext_Negation(int addr, String v) {
        if (featOkTst && casFeat_Context_Negation == null)
      jcas.throwFeatMissing("Context_Negation", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Context_Negation, v);}
    
  
 
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
      jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pattern_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPattern_Text(int addr, String v) {
        if (featOkTst && casFeat_Pattern_Text == null)
      jcas.throwFeatMissing("Pattern_Text", "gov.va.vinci.types.Biomarker_Pattern");
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
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Biomarker_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchored_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchored_Sentence(int addr, String v) {
        if (featOkTst && casFeat_Anchored_Sentence == null)
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Biomarker_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchored_Sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Biomarker_Pattern_Type(JCas jcas, Type casType) {
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

 
    casFeat_Gene_Name = jcas.getRequiredFeatureDE(casType, "Gene_Name", "uima.cas.String", featOkTst);
    casFeatCode_Gene_Name  = (null == casFeat_Gene_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Gene_Name).getCode();

 
    casFeat_HGVS_DNA = jcas.getRequiredFeatureDE(casType, "HGVS_DNA", "uima.cas.String", featOkTst);
    casFeatCode_HGVS_DNA  = (null == casFeat_HGVS_DNA) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_HGVS_DNA).getCode();

 
    casFeat_HGVS_Protein = jcas.getRequiredFeatureDE(casType, "HGVS_Protein", "uima.cas.String", featOkTst);
    casFeatCode_HGVS_Protein  = (null == casFeat_HGVS_Protein) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_HGVS_Protein).getCode();

 
    casFeat_Gene_Reference = jcas.getRequiredFeatureDE(casType, "Gene_Reference", "uima.cas.String", featOkTst);
    casFeatCode_Gene_Reference  = (null == casFeat_Gene_Reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Gene_Reference).getCode();

 
    casFeat_Lab_Name = jcas.getRequiredFeatureDE(casType, "Lab_Name", "uima.cas.String", featOkTst);
    casFeatCode_Lab_Name  = (null == casFeat_Lab_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Lab_Name).getCode();

 
    casFeat_Test_Type = jcas.getRequiredFeatureDE(casType, "Test_Type", "uima.cas.String", featOkTst);
    casFeatCode_Test_Type  = (null == casFeat_Test_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Test_Type).getCode();

 
    casFeat_Variant_Type = jcas.getRequiredFeatureDE(casType, "Variant_Type", "uima.cas.String", featOkTst);
    casFeatCode_Variant_Type  = (null == casFeat_Variant_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Variant_Type).getCode();

 
    casFeat_Expression_Value = jcas.getRequiredFeatureDE(casType, "Expression_Value", "uima.cas.String", featOkTst);
    casFeatCode_Expression_Value  = (null == casFeat_Expression_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Expression_Value).getCode();

 
    casFeat_Modifier_in_Window = jcas.getRequiredFeatureDE(casType, "Modifier_in_Window", "uima.cas.String", featOkTst);
    casFeatCode_Modifier_in_Window  = (null == casFeat_Modifier_in_Window) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier_in_Window).getCode();

 
    casFeat_Section = jcas.getRequiredFeatureDE(casType, "Section", "uima.cas.String", featOkTst);
    casFeatCode_Section  = (null == casFeat_Section) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Section).getCode();

 
    casFeat_Section_Header = jcas.getRequiredFeatureDE(casType, "Section_Header", "uima.cas.String", featOkTst);
    casFeatCode_Section_Header  = (null == casFeat_Section_Header) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Section_Header).getCode();

 
    casFeat_Context_Experiencer = jcas.getRequiredFeatureDE(casType, "Context_Experiencer", "uima.cas.String", featOkTst);
    casFeatCode_Context_Experiencer  = (null == casFeat_Context_Experiencer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Context_Experiencer).getCode();

 
    casFeat_Context_Temporality = jcas.getRequiredFeatureDE(casType, "Context_Temporality", "uima.cas.String", featOkTst);
    casFeatCode_Context_Temporality  = (null == casFeat_Context_Temporality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Context_Temporality).getCode();

 
    casFeat_Context_Negation = jcas.getRequiredFeatureDE(casType, "Context_Negation", "uima.cas.String", featOkTst);
    casFeatCode_Context_Negation  = (null == casFeat_Context_Negation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Context_Negation).getCode();

 
    casFeat_Pattern_Text = jcas.getRequiredFeatureDE(casType, "Pattern_Text", "uima.cas.String", featOkTst);
    casFeatCode_Pattern_Text  = (null == casFeat_Pattern_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pattern_Text).getCode();

 
    casFeat_Anchored_Sentence = jcas.getRequiredFeatureDE(casType, "Anchored_Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Anchored_Sentence  = (null == casFeat_Anchored_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchored_Sentence).getCode();

  }
}



    