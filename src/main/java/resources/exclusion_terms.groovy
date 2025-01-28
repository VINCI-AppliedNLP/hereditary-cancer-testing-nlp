package resources

import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
name = "Simple Concept Terms"

configuration {
    /* All configuration for this annotator. */
    defaults {
        /* Global for all configrations below if a property specified here is not overridden in a section below. */

        outputType = RegularExpressionType.class.canonicalName
        case_sensitive = false
        matchedPatternFeatureName = "pattern"
        concept_feature_name = "concept"
        groupFeatureName = "group"
    }



    "Anchor Exclusion_Terms" {
        expressions = [
                //alk
                'walk',
                'ALKALINE',
                'ALK PHO',
                'ALK-PHO',
                'ALKPHO',
                'ALK\\s*phos',
                'ALK\\s*\\d\\d\\d?\\s*H',
                'ALK PH\\.',
                'ALKP',
                //AR
                'arkansas',
                //EGFR - glomular filtration
                'eGFR\\s*=\\s*mL/min',
                'CREATININE\\s*EGFR',
                'eGFR\\s*results\\s*>\\d\\d',
                'eGFR\\s*results\\s*must\\s*be\\s*>/= \\d\\d',
                'eGFR\\s*>\\s*\\d\\d?',
                //'\\s*\\d\\d\\d?',
                'eGFR\\s*=\\d\\d\\d?',
                'eGFR\\s*\\d\\dml',
                'eGFR\\s*calculated:\\s*\\d\\d',
                'eGFR\\s*plasma',
                'eGFR\\s*filtration',
                //pole
                '(superior|lower|upper)\\s*pole',
                'pole\\s*of\\s*the',
                //boilerplate
                'Prostate cancer \\(CaP\\) has several known risk factors, the most\\s*important being increasing age, ethnicity, genetic factors \\(positive family\\s*history, Lynch syndrome, BRCA1 and BRCA 2\\)',
                'myriad\\s*of',
                'TOT acp',
                'RETIC',
                //kits
                'meter\\s*kit',
                'kit creek',
                'Narcan kit',
                'GLUCOMETER KIT',
                'CATHERIZATION KIT',
                'ONPRO KIT',
                'INJ 1 KIT',
                'METER KIT',
               'NEILMED REGULAR KIT',
                'SPRAY 1 KIT',
                'DIABETIC SUPPLY KIT',
                'NALOXONE RESCUE KIT',
                'pros-10',
                'ACP\\s*therapy',
                'represented\\s*by',
                'inferior\\s*pole'
        ]
        concept_feature_value = "Exclusion_terms"
        outputType = "gov.va.vinci.types.Exclusion_Term"
    }


}






