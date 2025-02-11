package resources

import gov.va.vinci.leo.regex.types.RegularExpressionType

/* This set of rules are meant for the components and attributes related to extracted genes, but do not act as anchores. 


*/
name = "Biomarker Attribute Terms"

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


    "Variant_Phrase_Term" {
        expressions = [
                //Terms that complete a variant phrase
                // i.e the BRCA Mutation was identified
                'mutation',
                'oncogenic\\s*(mutation|variant)',
                'mutatant',
                'mut\\b',
                'variant',
                //Possibly needs to double/act as a modifier as well
                '-mutated',
                'alterations?',

        ]
        concept_feature_value = "Variant_Phrase_Term"
        outputType = "gov.va.vinci.types.Variant_Phrase_Term"
    }



    //Functional consequences
    /*
    ShortVariant:missense
    ShortVariant:missense
        framshift
        nonsynonymous
        snps, endels

    CNV:gain
    CNV:loss
    CNV:deletion
        gain
        loss
        deletion
        amplification

    REARRANGEMENT:NonDescript
    REARRANGEMENT:Inversion

    RNA expression
     */
    "Variant_zygosity" {
        expressions = [

                'Heterozygous',

        ]
        concept_feature_value = "zygosity"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }
    "Variant_Type_Missense" {
        expressions = [

                'Missense',

        ]
        concept_feature_value = "ShortVariant:missense"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }
    "Variant_Type_Frameshift" {
        expressions = [

                'Frameshift',

        ]
        concept_feature_value = "ShortVariant:Frameshift"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }
    "Variant_Type_gain" {
        expressions = [

                'gain',

        ]
        concept_feature_value = "CNV:gain"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }
    "Variant_Type_fusion" {
        expressions = [

                'fusion',

        ]
        concept_feature_value = "fusion"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }



    "Variant_Type_Insertion" {
        expressions = [

                'Insertions?',
                'Ins',

        ]
        concept_feature_value = "CNV:Insertion"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }
    "Variant_Type_amplification" {
        expressions = [

                'amplification',
                'amp',

        ]
        concept_feature_value = "CNV:amplification"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }

    "Variant_Type_REARRANGEMENT" {
        expressions = [

                'REARRANGEMENT',
                'inversion',

        ]
        concept_feature_value = "Rearrangement"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }

    "Variant_Type_mismatch" {
        expressions = [

                'mismatch',
                'mismatch\\s*repair',

        ]
        concept_feature_value = "mismatch"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }

    "Variant_Type_Nonsense" {
        expressions = [

                'Nonsense',

        ]
        concept_feature_value = "Nonsense"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }

    "Variant_Type_Deletion" {
        expressions = [

                'Deletion',
                'Deletions',
                'Del',
                'loss'

        ]
        concept_feature_value = "Deletion"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }
    "Variant_Type_substitution" {
        expressions = [

                'substitutions?',
                'subs?',

        ]
        concept_feature_value = "substitution"
        outputType = "gov.va.vinci.types.Variant_Type_Term"
    }


    "hgvs_Reference" {
        expressions = [
                // Gene_transcript
                //Accession Number: NC_000023
                //Version Number:.10
                //Genomic nucleotide
                'NC_\\d{1,8}\\.\\d\\d?',
                'NG_\\d{1,8}\\.\\d\\d?',
                //LRG
                'LRG_\\d{1,8}\\.\\d\\d?',
                //transcript nucleotide
                'NM_\\d{1,8}\\.\\d\\d?',
                'NR_\\d{1,8}\\.\\d\\d?',
                //Protein
                'NP_\\d{1,8}\\.\\d\\d?',

        ]
        concept_feature_value = "hgvs_reference"
        outputType = "gov.va.vinci.types.HGVS_Reference"
    }


    "hgvs_dna" {
        expressions = [

                //TODO c/g into DNA, p into protein keep as separate columns
                //substitutions
                //1000C>T
                '((c|g)\\.)?\\d\\d\\d\\d?\\d?(g|a|t|c)>(g|a|t|c)',
                //Insertions
                //1029_1030insA
                '((c|g)\\.)?\\d\\d\\d\\d?\\d?_\\d\\d\\d?\\d?\\d?ins(g|a|t|c){1,30}',
                //Deletions
                '((c|g)\\.)?\\d\\d\\d\\d?\\d?_\\d\\d\\d?\\d?\\d?del(g|a|t|c){1,30}',
                //Deletion/insertion
                '((c|g)\\.)?\\d\\d\\d\\d?\\d?_\\d\\d\\d?\\d?\\d?delens(g|a|t|c){1,30}',
                //1312delG
                '((c|g)\\.)?\\d\\d\\d\\d?\\d?(ins|del)(g|a|t|c){1,30}',
                '((c|g)\\.)?\\d\\d\\d\\d?\\d?(dup)',

        ]
        concept_feature_value = "hgvs_dna"
        outputType = "gov.va.vinci.types.HGVS_DNA"
    }

    "hgvs_protein" {
        expressions = [
                //Protein effect
                //'\\w\\d\\d\\d\\d\\w'
                //substitutions
                //1000C>T
                //p.Val600Glu
                'p\\.\\w{1,3}\\d{1,4}\\w{1,3}',
                '(p\\.)?\\d\\d\\d\\d?\\d?(g|a|t|c)>(g|a|t|c)',
                //Insertions
                //1029_1030insA
                '(p\\.)?\\d\\d\\d\\d?\\d?_\\d\\d\\d?\\d?\\d?ins(g|a|t|c){1,30}',
                //Deletions
                '(p\\.)?\\d\\d\\d\\d?\\d?_\\d\\d\\d?\\d?\\d?del(g|a|t|c){1,30}',
                //Deletion/insertion
                '(p\\.)?\\d\\d\\d\\d?\\d?_\\d\\d\\d?\\d?\\d?delens(g|a|t|c){1,30}',
                //1312delG
                '(p\\.)?\\d\\d\\d\\d?\\d?(ins|del)(g|a|t|c){1,30}',
                //Protein effect

        ]
        concept_feature_value = "hgvs_protein"
        outputType = "gov.va.vinci.types.HGVS_Protein"
    }


    "other_descriptions" {
        expressions = [
                //dbsnp: rs128627255
                'rs\\d{3,12}',
                //OMIM: OMIM300377:0073
                'OMIM\\d{1,8}:\\d{3,12}',
                //LOVD: DMD_000073
                'DMD_\\d{3,12}',
                //ClinVar
                'RCV\\d{3,12}'
        ]
        concept_feature_value = "other_variant_descriptions"
        outputType = "gov.va.vinci.types.HGVS_Reference"
    }


    "Middle Terms" {
        expressions = [

                'was\\s*',
                'are\\s*',
                '=\\s*',
                'of\\s*',
                'is\\s*',
                ':\\s*',
                '\\*\\s*', // **** Detected ****
                'were\\s*',
                'both\\s*',
                'and\\s*',
                '&\\s*',
                'all\\s*',
                'found\\s*',
                'for\\s*',
                'for\\s*the\\s*',
                'both\\s*',
                'all\\s*',
                '-\\s*',
                ',\\s*',
                '\\/\\s*',
                'result\\s*',
                'result:\\s*',
                'status\\s*',
                'was\\s*',
                'studies\\s*',
                'reported\\s*',
                'analysis\\s*',
                'testing\\s*',
                'prevelance\\s*',
                'results?'

        ]
        concept_feature_value = "Middle_term"
        outputType = "gov.va.vinci.types.Middle_Term"
    }
}






