package resources

import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
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



/*
This file contains Three primary annotation Types:
1. Testing Method (IHC, FISH, NGS, ETC)
2. Performing Lab: Common Lab names associated with Hereditary and Somatic Testing
3. Test Name:  Common Names for Hereditary Tests
 */

    "TestTypeFISH" {
        expressions = [

                //HER2, FISH - - HER2 by FISH
                '(by\\s*|,\\s*|with\\s*|using\\s*)F?ISH',
                '(by\\s*|,\\s*|with\\s*|using\\s*)?in\\s*situ\\s*Hybridization',

        ]
        concept_feature_value = "FISH"
        outputType = "gov.va.vinci.types.Test_Term"
    }

    "TestType_IHC" {
        expressions = [

                //HER2, FISH - - HER2 by FISH
                '(by\\s*|,\\s*|with\\s*|using\\s*)?IHC',
                '(by\\s*|,\\s*|with\\s*|using\\s*)?Immunohistochemistry',
                '(by\\s*|,\\s*|with\\s*|using\\s*)?Immunohistochemistry\\s*\\(IHC\\)',
                '\\((by\\s*|,\\s*|with\\s*|using\\s*)?Immunohistochemistry\\)',

        ]
        concept_feature_value = "IHC"
        outputType = "gov.va.vinci.types.Test_Term"
    }

    "TestType_NGS" {
        expressions = [


                ' NGS',
                'NGS panel:',
                'next generation sequencing',



        ]
        concept_feature_value = "NGS"
        outputType = "gov.va.vinci.types.Test_Term"
    }
    "ctDNA" {
        expressions = [

                //circulating Tumor DNA
                'ctDNA testing',


        ]
        concept_feature_value = "ctDNA"
        outputType = "gov.va.vinci.types.Test_Term"
    }





    "tempus" {
        expressions = [

                //NOt CLIA approved to report germeline, but will report the likelihood
                'tempus',

        ]
        concept_feature_value = "tempus"
        outputType = "gov.va.vinci.types.Test_Term"
    }


    "buckle_swab" {
        expressions = [

                //any buckle swab will be hereditary testing
                'BUCCAL\\s*swab',
                'BUCCAL\\s*swab\\s*ngs',
                'BUCCAL\\s*kit',
                'saliva\\s*kit',
                'buckle swab',
                'saliva specimen kit',
                'saliva testing kit',
                'genetic testing kit',
                'saliva collection kit',
                'saliva sample collection kit',
                'the\\s*kit', //non-specific




        ]
        concept_feature_value = "specimen_kit"
        outputType = "gov.va.vinci.types.Test_Term"
    }

    "lab_name_not_specific" {
        expressions = [

                //Lab Names that do hereditary testing, but by themselves
            'MSKCC',  //likely tumor
            'myriad', //not always hereditary and as such does (tumor specimen or prolaris then it's not hereditary)
            'myriad',// in proximty BRCA will be hereditary (also the same for most any gene name) However this is not in the logic currently
            'myriad\\s*genetics', //Myriad by itslef does not specify one way or another, myriad cdx and myriad myrisk are hereditary
            //These cases won't flag germline on their own; usually found as indications for olaparib
            '(hereditary|germline)\\s*or(somatic|tumor)',
            '(somatic|tumor)\\s*or\\s*(hereditary|germline)',


        ]
        concept_feature_value = "lab_name_not_specific"
        outputType = "gov.va.vinci.types.Test_Term"
    }






    "hereditary_test_names" {
        expressions = [


                'Invitae multi-cancer gene panel',
                'Invitae\\s*Prostate\\s*Cancer\\s*Panel',
                'Invetae germline prostate',
                'Invitae \\d\\d gene Multi-Cancer Panel',
                'Invitae\\s*Multi-Cancer Panel',
                'Invitae\\s*germline:?',
                'Invitae prostate cancer panel RQ1729839',
                'germline prostate panel',
                'Germline muts testing\\(Invitae\\)',
                'Germline\\s*mutation\\s*testing\\(Invitae\\)',
                'Germline\\s*testing\\s*at\\s*Invitae',
                'Germline muts testing',
                'Germline mutation testing',
                'GERMLINE\\s*GENETIC\\s*testing',
                'Invitae\\s*\\d\\d\\s*gene panel',
                'Multi-cancer panel at Invitae that included\\s*\\d\\d\\s*genes',
                'Multi-cancer panel at Invitae',
                //
                '\\d\\d\\s*Disease\\s*relevant\\s*genes',
                '\\d\\d\\s*genes\\s*tested',
                //Original
                '47\\s*genes',
                'BRCA\\s*germline\\s*testing',
                'check\\s*liquid\\s*biopsy',
                'Common\\s*Hereditary\\s*Cancer\\s*Panel',
                'Custom\\s*Cancer\\s*Panel\\s*Genes\\s*(67)\\s*Analyzed',
                'prostate\\s*ca\\s*Germline\\s*testing',
                'Germline\\s*testing',
                'Invitae\\s*Germline',
                'Invitae\\s*Germline\\s*testing',
                'Invitae\\s*prostate\\s*panel',
                "Invitae\\'s\\s*Common\\s*Hereditary\\s*Cancers?\\s*Panel",
                'Invitae\\s*Common\\s*Hereditary\\s*Cancer\\s*Panel',
                'Prostate\\s*Cancer\\s*Cancer\\s*Panel',
                'PROSTATE\\s*CANCER\\s*PANEL',
                //This may require a modifier to count
                'Germline mutational testing',
                'Prostate\\s*germline\\s*genetic\\s*testing',
                'germline\\s*genetic\\s*testing',
                '\\d\\d-gene germline testing',
                'germline sequencing',
                // Custom Panels
                'custom\\s*gene\\s*panel',
                'Invitae custom gene\\s*panel',
                'Cancer Panel',
                //AMBRY
                'RenalNext',
                'PancNext',
                'COLONEXT',
                'COLONEXT NGS genetic panel',
                'CancerNext',
                'CustomNext-Cancer',
                'ProstateNext',
                'Prostate\\s*Next',
                //Additional Test names from NLM GTR
               //Baylor Names:
                'Hereditary Colorectal/Gastrointestinal Cancer Panel',
                'Hereditary Endocrine Cancer Panel',
                'Hereditary High Risk Breast Cancer Panel',
                'Hereditary Leukemia/Lymphoma Panel',
                'Hereditary Melanoma Panel',
                'Hereditary Pancreatic Cancer Panel',
                'Hereditary Prostate Cancer Panel',
                'Hereditary Renal Cancer Panel',
                'High Risk Hereditary Colorectal Cancer Panel',
                //Fulgent:
                'Colorectal Cancer Comprehensive Panel',
                'Endometrial Cancer Comprehensive Panel',
                'Endometrial Cancer Focus Panel',
                'Full Comprehensive Cancer Panel',
                'Gastric Cancer Comprehensive Panel',
                'Melanoma Comprehensive Panel',
                'Ovarian Cancer Comprehensive Panel',
                'Ovarian Cancer Focus Panel',
                'Pancreatic Cancer Comprehensive Panel',
                'Prostate Cancer Comprehensive Panel',
                'Prostate Cancer Focus Panel',
                'Renal / Urinary Cancer Comprehensive Panel',
                'Thyroid Cancer Comprehensive Panel',
                //GeneDx:
                'Breast Cancer Management Panel',
                'Breast/Gyn Cancer Panel',
                'Common Cancer Management Panel',
                'Comprehensive Common Cancer Panel',
                'Hereditary Prostate Cancer Panel',
                'OncoGeneDx Custom Panel',
                //Myriad:
                'myRisk Hereditary Cancer',
                'Targeted testing - BRCA2 gene mutation',
                'Peripheral whole blood for germline\\s*\\(WBC\\)',
                //Non specific
                //18 gene hereditary prostate cancer panel
                '\\d\\d\\s*gene\\s*hereditary\\s*prostate\\s*cancer\\s*panel',
                'Comprehensive\\s*cancer\\s*panel\\s*at\\s*Prevention\\s*Genetics\\s*\\(\\d\\d\\d? genes\\)',
                'Comprehensive\\s*cancer\\s*panel\\s*at\\s*Prevention\\s*Genetics',
                'Comprehensive\\s*cancer\\s*panel',
                //LabCore Added 2024-01-31
                'BRCAssure\\s*Comprehensive\\s*Test',
                'BRCAssure',
                //
                '\\d\\d\\s*gene\\s*panel\\s*for\\s*hereditary\\s*cancers',
                'myriad\\s*myrisk', //
                'myriad\\s*cdx', //


        ]
        concept_feature_value = "hereditary_test_name"
        outputType = "gov.va.vinci.types.Test_Term"
    }


    "hereditary_non_specific" {
        expressions = [


               //'germline',
               'germline\\s*test',
               'germline\\s*testing',



        ]
        concept_feature_value = "hereditary_non_specific"
        outputType = "gov.va.vinci.types.Test_Term"
    }



    "hereditary_lab_name" {
        expressions = [

                //Lab Name Hereditary

                'BreastNext',//all of these NEXT names are test names for hereditary tests from Ambry
                //ambry and subsequent 'next' tests.
                'ambry',
                'ambry\\s*genetics',
                //'BreastNext\\s*cancer\\s*gene\\s*panel'
                //Test name
                // 'Tempus', //own category
                // Will likely need to put some specific logic here
                // '\\bcolor\\b',
                '\\bcolor genom',
                'COLOR GENOMICS TESTING',
                'Color\\s*Genomics\\s*saliva\\s*testing',
                'fulgent',
                'geneDx', //almost always hereditary
                'invitae', //
                'prevention\\s*genetics',
                'preventiongenetics',
                'PreventionGenetics',
                'Prevention Genetics cancer panel\\s*\\(#5471\\)',
                'Prevention Genetics cancer panel',
                'PREVENTION GENETICS, PROSTATE PG BLOOD KIT',
                //Added 2023-11-08
                //'TRIWEST', //third party processor
                //'GEISINGER\\s*WYOMING\\s*VALLEY', //look into/why did it come up
                'UAB\\s*Genetics',
                'U\\s*of\\s*SOUTHERN\\s*CA\\s*\\s*LAB',
                'BCM\\s*\\s*MGL\\s*labs', //Baylor
                'GOLDKORN', //Lab at USC
                'ONCOSEQ',
                'MiOncoseq',//Michigan  //Is this study specific?
                'oncoplex',
                'oncoplex sequencing',
                'Oncoplex blood test for germline\\s*and tumor mutations',
                'Oncoplex blood test',
                'OncoPlex Diagnostics', //Tumor and Germline
                'PrecisionSelect',
                //Sally Review:
                'Signature\\s*Genomics\\s*Lab',
                'UAB\\s*Genetics',
                'Genomic\\s*Medicine',
                'Jackson\\s*INTEGRATED\\s*GENETICS',
                'Genetic\\s*Associates\\s*Inc.',
                'Immunogenetics\\s*Laboratory',
                'Precision\\s*Oncology',
                'Good\\s*Samaritan',
                'GeneTrails',//oregon health sciences
                'Atrium\\s*Health',
                //Continues updates 2023-12-07
                'Integrated Oncology for\\s*Germline testing',
                'germline sequencing study',
                'germline genetics testing',
                'Germline\\s*CGP\\s*testing',
                'University\\s*of\\s*Washington\\s*Germline',
                'exosomeDx',
                'BreastNext',
                'BreastNext\\s*cancer\\s*gene\\s*panel',



        ]
        concept_feature_value = "hereditary_lab_name"
        outputType = "gov.va.vinci.types.Lab_Term"
    }

/*
    "gene_expression" {
        expressions = [

                //gene expression  - Not hereditary
                'prolaris',
                'Oncotype',
                'Oncotypedx',
                'confirmMDx',
                'exodx',
                'selectmdx', //Urine
                'selectdx',
                'exosomeDx'

        ]
        concept_feature_value = "gene_expression"
        outputType = "gov.va.vinci.types.Test_Term"
    }
    */



    "hereditary_study" {
        expressions = [

                //cases where an incidental study was identified in the training data, may want to seperate moving forward
                //Studies - Not likely to be included in any provisioned work, but still identified in their notes
                'MVP\\s*Project',
                'Magnitude\\s*study',
                'MI-ONCOSeq',
                'TRITON-?3',
                'TRITON(-|\\s*)3(\\s*clinical\\s*trial)?',
                'Identification of DNA repair deficient prostate cancer\\s*through\\s*germline\\s*screening',
                'A Phase 2 Study of Docetaxel and Carboplatin for Treatment of Patients\\s*with Metastatic, Castration Resistant Prostate Cancer and Germline or Somatic\\s*DNA Repair Deficiency\\s*\\(POPCAP1\\)',
                'VA Specific Personalized High-throughput Sequesncing:\\s*MI-ONCOSEQ \\(Michigan Oncology Sequencing Center\\)',
                'study titled:\\s*Identification of DNA Repair Deficient Prostate Cancer Through\\s*Germline\\s*Screening'
                //Somatic only?
                //'PROFOUND STUDY'
                //'COBRA\\s*study'
                //'TOPARP-A'
                //'TOPARP-B'
                //'TRITON-?2'
                //'GALAHAD'


        ]
        concept_feature_value = "hereditary_study"
        outputType = "gov.va.vinci.types.Test_Term"
    }


    "Tumor_test_and_lab_names" {
        expressions = [


                'Foundation One Companion Diagnostics\\s*\\(CDx\\)',
                'Companion\\s*Diagnostics?\\s*\\(CDx\\)',
                'FMI\\s*testing',
                'FMI',
                'FoundationOne',
                'Foundation\\s*One',
                'Foundation one on prostate',
                'Foundation one testing',
                'Foundation Medicine testing',
                'foundation 1',
                'foundation\\s*NGS',
                'foundation Next generation',
                'Foundation Medicine',
                'FoundationMedicine',
                'FOne CDx NGS',
                'FOne CDx',
                'foundation testing',
                'FoundationOne CDx next generation sequencing \\(NGS\\)',
                'FOUNDATIONONE CDx Next Generation Sequencing',
                'FOUNDATIONONE CDx',
                'FoundationOnerCDx',
                'FOUNDATION MEDICINE SEQUENCING PANEL',
                'FoundationOne Liquid testing', //blood test but still tumor
                'Foundation One Liquid testing', //blood test but still tumor
                'FoundationOne Liquid CDx',
                'Foundation One Liquid CDx',
                'Foundation One Liquid',
                'FoundationOne Liquid CDx Liquid',
                'Foundation Medicine, Inc',
                'FoundationOne tumor testing',
                'Foundation One testing',
                'biopsy specimen F1',
                'PGDX',
                '\\(NGS\\)\\s*PGDX',
                'PGDX\\s*assay',
                'PGDX22179',
                'PGDX19880T',
                'PGDX\\s*CancerSelect',
                'PGDX CancerSelect NGS',
                'PGDX CANCERSELECT REPORT\\s*\\(PGDX19880T\\)',
                'Personalis',
                'NGS, MMR/PDL1 on tumor tissue',
                'MMR/PDL1 on tumor tissue',
                'Oncotypedx',
                'Oncotype', //Test name (oncotype breast, oncotype prostate) , gene expression, labname previously genomic health, now called exact sciences
                'oncotype\\s*DX',
                'oncotype\\s*DX\\s*test',
                'confirmMDx',
                'exodx', //testname
                'selectmdx',//testname urine lab name is mdx health
                'prolaris', //Testname, specimen is tumor, lab name myriad - but not a hereditary test
                'Guardant',
                'Guardant\\s*Health',
                'NEOTYPE', //NeoGenomics, tumor specimen
               // 'ACCUPATH', //questlab
                'NGS:\\s*Completed on\\s*biopsy',
                //Liquid biopsy and NGS set as tumor
                'liquid\\s*ngs',
                'liquid\\s*CDx',
                'liquid biopsy for ngs',
                'foundation liquid',
                'foundation liquid biopsy',
                'ngs liquid biopsy',
                'liquid somatic testing',
                'liquid bx for ngs',
                'Next Generation Sequencing for advanced solid tumors',
                'ngs\\s*for\\s*(advanced\\s*)solid\\s*tumors',
                'tissue-based\\s*NGS\\s*somatic\\s*testing',
                'tissue(-|\\s*)based\\s*NGS',
                //previously set as test_term type "gene_expression", set to hereditary_lab_name here
                'prolaris',
                'Oncotype',
                'Oncotypedx',
                'confirmMDx',
                'exodx',
                'selectmdx', //Urine
                'selectdx',
                //Added 2024-02-22
                'Tumor\\s*NGS',
                //Pathway note
                'Tumor\\s*Genomic\\s*Testing'



        ]
        concept_feature_value = "tumor_test_and_lab"
        outputType = "gov.va.vinci.types.Test_Term"
    }


/* These didn't really result in anything and slowed the system down a lot. Keeping for possible future iterations or discussions
    "CLIA_Numbers" {
        expressions = [



    '01D2016114',
    '05D0643352',
    '05D0644251',
    '05D0981414',
    '05D1018272',
    '05D1052995',
    '05D1102604',
    '05D2040778',
    '05D2043189',
    '06D0513583',
    '06D2084040',
    '07D2101517',
    '09D0212161',
    '10D2119613',
    '11D2066426',
    '17D2097343',
    '21D0692357',
    '21D0969951',
    '22D2154474',
    '23D2059943',
    '24D0404292',
    '31D0652945',
    '31D2026917',
    '31D2026917',
    '31D2053667',
    '31D2123554',
    '33D2109963',
    '34D0655205',
    '36D0656094',
    '36D0656333',
    '36D1001860',
    '36D2162956',
    '38D2059762',
    '39D0673863',
    '39D2085645',
    '44D2062928',
    '45D0660090',
    '45D1021782',
    '46D0523979',
    '52D2065132',


        ]
        concept_feature_value = "CLIA_Numbers"
        outputType = "gov.va.vinci.types.Lab_Term"
    }

*/

    "Complete_Negation" {
        expressions = [
                // TODO redundant for now; these are also copied as modifiers on their own.
                //  May create new type in logic specific to these phrases.
                //  Or I could probably fix this in the logic i.e. case then when test type = complete negation set modifier to negated

                'NO\\s*CLINICALLY SIGNIFICANT VARIANTS IDENTIFIED',
                'Results:\\s*Negative',
                'Clinical Summary:\\s*No reportable genetic variants were\\s*identified by this analysis',
                'Results:\\s*NEgative For Pathogenic Variants',
                'No reportable genetic variants were\\s*identified',
                'did not identify any pathogenic\\s*variants',
                'NO VARIANT DETECTED',
                'NO REPORTABLE ALTERATIONS',
                'No clinically significant variants or variants of uncertain significance were identified',
                'No pathogenic variants were identified',
                'NO REPORTABLE ALTERATIONS WITH COMPANION DIAGNOSTIC',
                'no mutations were detected',
                'Genetic testing revealed no mutations in\\s*\\d\\d?\\s*genes tested',
                'no mutations in \\d\\d? genes tested',
                'Germline testing negative through SLC GMS',
                'Germline mutational testing for DNA repair mutations was NEGATIVE',
                '\\d\\d-gene germline testing with no detect?able variants',
                'Your results are NEGATIVE, meaning no\\s*harmful mutations were found',
                'Germline testing\\s*was obtained and showed no germline mutations',
                '\\d\\d?\\s*Disease relevant genes with no reportable alterations',
                //This one includes the labe name as "color testing" is not used on it's own
                'GERMLINE:\\s*Color\\s*testing\\s*(is\\s*|was\\s*)?negative',
                //May only want to consider this in the context of other cues
                'Testing revealed no positive results',
                'Genetics:\\s*no germline mutations',
                'no germline mutations',
                'No\\s*patholog(ic|enic)\\s*germline\\s*(variants?|mutations?)\\s*(seen|detected|identified)',
                'Germline testing\\s*negative for mutations',
                'Germline testing:\\s*negative for mutations',
                'Germline testing:\\s*negative',
                'Germline testing:\\s*negat',
                'Genetics:testing-negative for hereditary predisposition',
                'Genetics:\\s*negative for hereditary predisposition',
                '\\s*Genetics:\\s*germline\\s*negative',
                '        Germline - negative',
                'Genetics:\\s*germline\\s*(w/|with)\\s*no\\s*actionable\\s*mutations',
                'Your\\s*test resuts are NEGATIVE for currently known harmful changes',
                'Germline testing demonstrated no mutations',
                'no pathogenic mutations were detected on germline invitae testing',
                'no pathogenic mutations were detected on germline',
                'Genetic\\s*analysis\\s*\\(sequencing and large rearrangement analysis\\)\\s*of\\s*the\\s*following\\s*genes\\s*was\\s*NEGATIVE',
                'Genetic\\s*analysis\\s*of\\s*the\\s*following\\s*genes\\s*was\\s*NEGATIVE',
                'negative\\s*for\\s*hereditary\\s*predisposition\\s*in\\s*the\\s*gene\\s*panel',
                'No\\s*reportable\\s*genomic\\s*alterations\\s*were\\s*detected',
                //LabChem specific additions identified
                'NEGATIVE:\\s*NO\\s*CLINICALLY\\s*SIGNIFICANT\\s*VARIANTS\\s*IDENTIFIED',
                'Interpretation\\s*Summary\\s*NO\\s*PATHOGENIC\\s*MUTATION\\s*DETECTED',
                'NO\\s*CLINICALLY\\s*SIGNIFICANT\\s*VARIANTS\\s*IDENTIFIED',
                'NO\\s*CLINICALLY\\s*SIGNIFICANT\\s*VARIANTS\\s*DETECTED',
                'No\\s*pathogenic\\s*or\\s*variants\\s*of\\s*uncertain\\s*clinical\\s*significance',
                'MUTATION\\s*NOT\\s*DETECTED\\s*SEE\\s*VISTA\\s*IMAGING',
                'No\\s*pathogenic\\s*variants\\s*were\\s*identified',
                'No\\s*pathogenic\\s*mutations,\\s*variants\\s*of\\s*unknown\\s*significance,\\s*or\\s*gross\\s*deletions\\s*or\\s*duplications\\s*were\\s*detected',
                'Result: negative for currently known pathogenic/likely pathogenic variants'


        ]
        concept_feature_value = "Complete_Negation"
        outputType = "gov.va.vinci.types.Test_Term"
    }


    "Labchem_results_elsewhere" {
        //These concepts primarily function when the system is applied to the Labchem domain and there are no actual result,
        // only an indication that the results are found elsewhere
        expressions = [
    'SEE SCANNED LAB REPORT IN VISTA IMAGING',
    'See scanned report in Vista Imaging',
    'See Vista Imaging for Result',
    'See VistA imaging for results',
    'RESULT SCANNED BY MEDICAL RECORDS, SEE CPRS',
    'SEE FULL REPORT SCANNED TO VISTA IMAGING',
    'Complete report scanned into Vista Imaging',
    'See Vista Imaging, REFERENCE LAB DESCRIPTION,for complete report',
    'SEE SCANNED RESULTS IN MEDICAL RECORDS',
    'SEE VISTA IMAGING',
    'See VISTA Imaging \\(Tools in CPRS\\) for scanned outside lab repor',
    //'Test Performed: Stanford Lab, 3375 Hillview Ave, Palo Alto CA 94304 ',
    'SEE VISTA IMAGING FOR RESULTS',
    'SEE SCANNED RESULTS TO VISTA IMAGING',
    'See notes for full results scanned into Vista Imaging',
    'See rpt in Imaging',
    'See Result in VISTA Imaging',
    'RESULT SCANNED TO MEDICAL RECORD',
    'RESULTS AVAILABLE AT CPRS',
    'See report in Vista Imaging titled External Lab Report',
    'See Report in Imaging',
    'FOR COMPLETE DETAILED REPORT,\\s*PLEASE\\s*SEE\\s*VISTA\\s*IMAGING',
    'RESULT\\s*AVAILABLE\\s*IN\\s*CPRS',
    'RESULT\\s*SCANNED\\s*IN\\s*VISTA\\s*IMAGING',
    'See\\s*CPRS\\s*imaging\\s*for\\s*scanned\\s*document' ,
    'See\\s*report\\s*in\\s*Vista\\s*Imaging'
        ]
    concept_feature_value = "results_found_elsewhere"
    outputType = "gov.va.vinci.types.Test_Term"
}
    /*
      NO CLINICALLY SIGNIFICANT VARIANTS IDENTIFIED

	Results: Negative

	Clinical Summary:  No reportable genetic variants were   identified by this analysis


	Results: NEgative For Pathogenic Variants

     */

}






