package resources

import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
name = "Biomarker Anchor Terms"

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

/*
    "declined" {
        expressions = [
                // Germline testing: declined.

                'declined',
                '(patient|pt|vet|veteran)\\d*declined',
                //The Veteran was offered and chose NOT to pursue germline genetic testing.
                'chose NOT to pursue',
                'was offered and declined',
                'did not want to pursue',
                'testing deferred',
                'testing declined',
                'refused',
                'which\\s*s?he\\s*declined'

        ]
        concept_feature_value = "declined"
        outputType =     "gov.va.vinci.types.Biomarker_Anchor"
    }
*/

/*
    "Nonspecific Term" {
        expressions = [
               'mutation'
        ]
        concept_feature_value = "GeneName:NonSpecific"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

 */

    "MSI Term" {
        expressions = [
                'Microsatellite status',
                'Microsatellite status - MS-Stable',
                'MS-?Stable',

        ]
        concept_feature_value = "Microsatellite"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "Tumor_Burden" {
        expressions = [
                'Tumor Mutational Burden',
                'Muts/Mb'
        ]
        concept_feature_value = "Tumor_Burden"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "clonal_trisomy_12" {
        expressions = [
                'trisomy\\s*12',
                'clonal\\s*trisomy\\s*12'
        ]
        concept_feature_value = "trisomy_12"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    //If it only has one lexical variant we put it in the "HRR Variant" group, otherwise it has it's own grouping to normalize the representation

    "HRR_variant Term" {
        expressions = [
                '\\bHRR\\b',
                'homologous recombination repair',
                '\\bATM\\b',
                'ATMx1',
                'ATM \\(Exon 8\\)',
                '11q22\\s*\\(ATM\\)',
                '11q22\\.3\\(ATMx1\\)',
                //Complete Sally addition
                'ATM Y2334fs 4 CTNNB1 D32V',
                'ataxia(-\\s*)telangiectasia',
                'BRIP1',
                'BARD1',
                'CDK12',
                'FANCL',
                'PALB2',
                'PPP2R2A',
                'RAD51B',
                'RAD51C',
                'RAD51D',
                'RAD51L',
                //HRR not on original study list
                '\\bATR\\b',
                'DSS1',
                'RPA1',
                'NBSI',
                'FANCD2',
                'FANCA',


        ]
        concept_feature_value = "GeneName:HRR_variant"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "BRCA_Term" {
        expressions = [
                //non-specific BRCA anchors
                'BRCA',
                'germline BRCA mutated',
                'gBRCAm',
                'germline BRCA mutated\\s*\\(gBRCAm\\)',
                'BRCA\\s*1/2',
                'breast cancer gene',
                'BRCA1\\s*or\\s*BRCA2',
                'BRCA\\s*single\\s*site',



        ]
        concept_feature_value = "GeneName_HRR:BRCA"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "BRCA1_Term" {
        expressions = [
                'BRCA1',
                'BRCA 1',
                //only allowing up to two spaces here, may change to no newline
                'BRCA  1',
                'BRCA-1',
                'BRCA1SEQ',
                'BRCA1DEL',


        ]
        concept_feature_value = "GeneName_HRR:BRCA1"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "BRCA2 Term" {
        expressions = [
                'BRCA2SEQ',
                'BRCA2DEL',
                'BRCA2',
                'BRCA 2',
                //only allowing up to two spaces here, may change to no newline
                'BRCA  2',
                'BRCA-2',

        ]
        concept_feature_value = "GeneName_HRR:BRCA2"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }


    "CHEK Term" {
        expressions = [
                'Cyclin(_\\s*)dependent kinase',
                'CHEK1',
                'CHEK2',
                'Checkpoint kinase',

        ]
        concept_feature_value = "GeneName_HRR:CHEK"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "RAD54 Term" {
        expressions = [
                'RAD54',

        ]
        concept_feature_value = "GeneName_HRR:RAD54"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }
    "Sept9 Term" {
        expressions = [
                'Sept9',
                'Septin\\s*9',

        ]
        concept_feature_value = "GeneName_HRR:Sept9"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "JAK2 Term" {
        expressions = [
    'JAK2',
    'JAK2\\s*exon\\s*12',
    'JAK2\\s*V617F',
    'Janus\\s*kinase\\s*2',

    ]
    concept_feature_value = "GeneName_HRR:JAK2"
    outputType = "gov.va.vinci.types.Biomarker_Anchor"
}


    "WRN Term" {
        expressions = [
                //WERNER syndrome
                'WRN'


        ]
        concept_feature_value = "GeneName_HRR:WRN"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }


    "BRAF Term" {
        expressions = [
                'BRAF',
                'BRAF1',
                'B-RAF1',
                'RAFB1',
                'proto-oncogene\\s*b-raf',
                'proto oncogene\\s*b-?raf',
                'B-RAF',
                //V600E on its own shouldn't flag BRAF, but may occur on its own
                'V600E',
                'BRAF V600E'
        ]
        concept_feature_value = "GeneName:BRAF"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "KRAS Term" {
        expressions = [
                'KRAS',
                'KiRAS',
                'Ki-RAS',
                'K-RAS',
                'K-RAS2',
                'KRAS2',
                'K\\s*RAS',
                'G12X',
                'G13X',
                'G61X'
        ]
        concept_feature_value = "GeneName:KRAS"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "ALK Term" {
        expressions = [
                '\\bALK',
                'ALK-1',
                'ALK1',
                'EML4-ALK',
                'TGF-ALK',
                'KIF5B-ALK',
                'ALK\\s*2p23\\s*rearrangement',
                'EML-4',
                'EML4',
                'EML\\s*4',
                'CD246',
        ]
        concept_feature_value = "GeneName:ALK"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }
    "PDL1_Term" {
        expressions = [
                'PDL-1',
                'Programmed death-ligand 1',
                'PDL1',
                'PDL 1',
                'PD-L1',
                'PD-L1\\s*22C3',
                'PD-L1\\s*22C3\\s*FDA\\s*\\(KETRUDA\\)',
                'PD-L1\\s*22C3\\s*FDA\\s*\\(KEYTRUDA\\)',
                'PD-L1\\s*28-8\\s*FDA\\s*\\(OPDIVO\\)?'
        ]
        concept_feature_value = "GeneName:PDL1"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }
    "ROS1_Term" {
        expressions = [
                'ROS1',
                'ROS\\s*1',
                //'ROS',  // TODO Far too much noise, not sure if it even effects recall much
                'ROS-1',
                'ROS1',
                'c-ros1',
                'cros1',
                'MCF3',  //TODO get clinical input here (taken from may2017.archive.ensemble.org)
                'CD74-ROS1',
                'EZR-ROS1',
                'ROS1',
                'SLC34A2-ROS1',
                'SDC4-ROS1',
                'ROS-1\\s*\\(6q22\\)\\s*rearrangement',
                'ROS-1\\s*6q22\\s*rearrangement'
        ]
        concept_feature_value = "GeneName:ROS1"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "TP53_Terms" {
        expressions = [
                'r283c',
                'TP53',
                'r151c',
                'r244c',
                'r124c',
                'P53',
                'TP53\\s*E51fs*72'
        ]
        concept_feature_value = "GeneName:TP53"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }


/*
A place for genes known to be on prostate hereditary panels that will overlap with the
initial HRR panels
 */
    "Hereditary_panel" {
        expressions = [
                //These are all genes that have been identified in the same panels as other hereditary genes of interest
                // keeping in their own category here for possible search of missing relevant genes
                '\\bAPC\\b',
                'AXIN2',
                'BMPR1A',
                'CDH1',
                'CDK4',
                //
                'EPCAM',
                'HOXB13',
                'NBN',
                'STK11',
                'NF1',
                'PMS',
                //Invitae Prosate Cancer Panel (Not already in our HRR group)
                'CDKN2A',
                'CDKN2A\\s*\\(p14ARF\\)',
                'CDKN2A\\s*\\(p16INK4a\\)',
                'CTNNA1',
                'DICER1',
                'GEN1',
                'GREM1',
                //too frequently erroneus for specimen kit etc, not relevant for MPCa study. removed
                //' KIT ',
                'MEN1',
                'MSH3',
                'PDGFRA',
                'POLD1',
                ' POLE ',
                'RAD50',
                'SDHB',
                'SDHD',
                'SMAD4',
                'SMARCA4',
                'TSC1',
                'TSC2',
                'VHL',
                'HBN',
                'FF1',
                'DTK11',


        ]
        concept_feature_value = "GeneName:Hereditary_panel"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }




    "other_variant Term" {
        expressions = [

                'AKT1',
                'ERBB2',
                'MEK1',
                'PIK3CA',
                '\\bAR\\b',
                '\\bRET\\b',
                'RET\\s*gene',
                'MUTYH',
                'PMS2',
                'MSH6',
                'MSH2',
                'MLH1',
                '\\bERG\\b',
                'PTEN',
                'TMPRSS2',
                'SDHC',
                'SDHA',
                'SPOP',
                'RAF1',
                'SALL4',
                'ETV4',
                'ETV5',
                'AXIN1',
                'ETV1',
                'NDRG1',
                'NCOR2',
                'HNRNPA2B1',
                'SLC45A3',
                'SLC45A2',
                'ELK4',
                'FOXA1',
                'HERPUD1',
                'MSH6',
                //Gene and variant
                'MSH6 R732',
                'NTHL1',
                'CCNE1',
                //Additional from Sally Review
                //online germline panels
                'RAD51C',
                'RAD 51C',
                'RUNX1',
                'W1692fs',
                'ACP',
                //Moved to HRR
                //
                //'BLM',
                'CDK12Y742 ',
                'CDKN1b',
                'CF1',
                'DNM32A',
                'DNMT3A',
                'ERCC2',
                'FANCM',
                'G6PD',
                'GALNT12',
                'HAX1',
                'HOX13',
                'HRAS',
                'IDH2',
                'JAK1',
                ' KEL ',
                'KMTZA',
               // 'MET',
               // 'MLL',
                //'MSH',
                ' MYC ',
                'NF2',
                'NOTCH1',
                'PARD6B',
                'PARK2',
                'PDGFRB',
                'PIKC3A',
                'PMS1',
                'POLE PTEN and RET',
                'PTCH1',
                'R171Q',
                'RAD54L',
                'RADS1D',
                'RB1',
                'SMARCE1',
                'STK',
                'SUFU',
                'T86S',
                'TERT\\b',
                'WT1',
                'MAP2K2',
                // Genes initially included, but removed during development of HRR cohort given the frequent FP cases
                // 'MET',
                // 'MLL',
                //'MSH',
                //Some melanoma additions 2024/08/13
                'BAP1',
                'IP3R3',
                'TERF2IP'

        ]
        concept_feature_value = "GeneName:OtherVariant"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "Relevant_title_results" {
        expressions = [
                //These are the notes and cases that should by themselves indicate receipt of a note
                'GENETIC RESULTS LETTER',
                'GENETIC TEST RESULT NOTE',
                'VA-CREP Genetic Testing Note',
                'GENETIC LAB RESULT',
                'Alerted to results (fo|of) germline testing:'
        ]
        concept_feature_value = "Relevant_title_results"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "Relevant_title_pathway" {
        expressions = [
                //These are the notes and cases that should by themselves indicate receipt of a note
                'National Oncology Metastatic Prostate Molecular Testing Pathway'
        ]
        concept_feature_value = "Relevant_title_pathway"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }

    "her2" {
        expressions = [
                //for hereditary system including her2 negative/positive cases as complete anchor so those don't conflict with BRCA status
                'her(-|\\s*)2\\s*(negative|positive)',
                'her2\\s*(negative|positive)'
        ]
        concept_feature_value = "Her2"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }



    "Lab_Accession_numbers" {
        expressions = [
                'PG\\s*ID',
                'PG\\s*ID:\\s*\\d\\d\\d',
                'PG\\s*ID:\\s*\\d\\d\\d-\\d\\d\\d?-\\d\\d\\d?',
                'PG\\s*ID:\\s*\\d\\d\\d\\s*\\d\\d\\d?\\s*\\d\\d\\d?',
                'RQ:?\\d\\d\\d\\d\\d\\d\\d?\\d?\\d?'
        ]
        concept_feature_value = "Lab_Accession_numbers"
        outputType = "gov.va.vinci.types.Biomarker_Anchor"
    }


}






