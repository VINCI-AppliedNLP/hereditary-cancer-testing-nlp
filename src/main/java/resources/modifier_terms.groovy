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

    "Expression_term" {
        expressions = [
                'expressed',
                'expressed\\s*at',
                'at'
        ]
        concept_feature_value = "Expression_Term"
        outputType =     "gov.va.vinci.types.Expression_Term"
    }
    "Expression_Value" {
        expressions = [
                '\\d\\d?(%|percent)'
        ]
        concept_feature_value = "Expression_Value"
        outputType =     "gov.va.vinci.types.Expression_Value"
    }

    "Value_Negated" {
        expressions = [

                'negated',
                'neg',
                '(is\\s*)?not\\s*det(e|a)cted',
                'none\\s*det(e|a)cted',
                '(is\\s*)?NEGATIVE',
                '(is\\s*)?negtaive',
                '(is\\s*)?negative for',
                'no\\s*evidence',
                'no\\s*definitive\\s*evidence',
                '(does\\s*not|doesn\'t)\\s*have\\s*evidence\\s*of',
                '(does\\s*not|doesn\'t)have\\s*evidence',
                'No\\s*mutations\\s*were',
                'No\\s*mutations\\s*were\\s*detected',
                'No\\s*other\\s*mutations\\s*were',
                'No\\s*other\\s*mutations\\s*were\\s*detected',
                'no\\s*targetable\\s*mutations',
                'NO\\s*MUTATIONS\\s*DETECTED',
                'no detect?able variants',
                'negative',
                'no\\s*mutation',
                'unmutated',
                //requires space otherwise pickes up veteran
                '\\s*-\\s*ve ',
                'NON-AMPLIFIED',
                'NON\\s*detected',
                'not demonstrate',
                'failed to detect',
                'failed\\s*to\\s*reveal',
                'did\\s*not\\s*have',
                'without identifiable',
                'not\\s*identified',
                'fails\\s*to\\s*detect',
                'did\\s*not\\s*reveal',
                'did\\s*not\\s*show',
                'wild\\s*type',
                'wild-type',
                'wildtype',
                'wild',
                //' wt',
                //'wt ',
                'non-mutated',
                'resulted as no mutated',
                'no mutated',
                // '\\(\\s*\\-\\s*\\)'
                'obtained and showed no\\s*germline mutations',
                //No germline mutation on Invitae.
                'No germline mutation on',
                'No germline mutation',
                'no\\s*pathogenic',
                //Germline testing did not identify any variants.
                'did not identify any variants',
                'there\\s*was\\s*no\\s*mutations\\s*identified',
                'This\\s*mutation\\s*was\\s*not\\s*found\\s*in the',
                'mutation\\s*was\\s*not\\s*found',
                'no\\s*positive\\s*results?',
                'he does not have germline\\s*mutation',
                'showed\\s*no\\s*mutations',
                'no\\s*abnormality in',
                //Consider an annotation type for cases that should have the window applied to it.  For now removing "normal" from germline logic
                //'NORMAL',
                'no\\s*deleterious\\s*mutations',
                'No\\s*genetic\\s*changes\\s*were\\s*found(\\s*in)?',
                'No\\s*actionable\\s*mutations\\s*on',
                'found\\s*no\\s*deleterious\\s*mutations',
                'did\\s*not\\s*demonstrate\\s*actionable\\s*mutations',
                'no\\s*pathogenic\\s*variants',
                'no\\s*pathogenic\\s*variants?\\s*detected',
                'no\\s*known\\s*pathogenic\\s*variants',
                'did\\s*not\\s*reveal\\s*any\\s*targets',
                'did\\s*not\\s*reveal\\s*any\\s*mutations',
                'not\\s*detect\\s*any\\s*mutations?',
                'not\\s*detect\\s*gene-level\\s*changes',
                //labchem additions
                'NO\\s*PATHOGENIC MUTATION DETECTED',
                'No\\s*Pathogenic\\s*Variants?\\s*detected',
                'No\\s*Pathogenic\\s*Variants?\\s*in',
                'No\\s*mutations?\\s*detected',
                'Pathogenic\\s*Mutation\\(s\\):\\s*None\\s*Detected\\s*Variant\\(s\\)\\s*of\\s*Unknown\\s*Significance:\\s*None',
                'Pathogenic\\s*Mutation\\(s\\):\\s*None\\s*Detected',
                'Variant\\(s\\)\\s*of\\s*Unknown\\s*Significance:\\d*None',
                'NO\\s*CLINICALLY\\s8SIGNIFICANT\\s*VARIANTS?\\s*DETECTED',
                'DOES\\s*NOT\\s*CARRY\\s*THE',
                'DELETION\\(S\\)/DUPLICATION\\(S\\):\\s*NONE\\s*DETECTED',
                'NO\\s*CLINICALLY\\s*SIGNIFICANT\\s*VARIANTS\\s*DETECTED',
                'No\\s*pathogenic\\s*mutations\\s*detected\\s*(in\\s*)?(the\\s*)?',
                'no\\s*pathogenic\\s*varients',
                'without\\s*actionable\\s*(mutation|variant)'

        ]
        concept_feature_value = "Negated"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }


    "Value_Negated_wt" {
        expressions = [

                //needed to create wt as it's own negation type, too greedy when filtering
                //documents, but won't work with boundary regexes when working with patterns
                'wt',


        ]
        concept_feature_value = "Negated_wt"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }

    "unknown_significance" {
        expressions = [


                'unknown\\s*clinical\\s*significance',
                'unknown\\s*significance',
                'uncertain\\s*significance',
                'variants?\\s*of\\s*uncertain\\s*significance',
                'Two variants of uncertain significance were identified',
                'variant\\s*of\\s*uncertain\\s*significance\\s*\\(VUS\\)',
                'VUS',
                'VUS\\s*in(\\s*the)',
                'VUS\\s*(was\\s*)?(identified|detected)',
                'VUS\\s*(was\\s*)?(identified|detected)\\s*in(\\s*the)',
                'variant of uncertain significance was detected in',
                'variant of uncertain significance was detected',
                'variant\\s*of\\s*uncertain\\s*significance\\s*identified',
                'variant\\s*of\\s*uncertain\\s*significance(is|was)\\s*(identified|detected)',
                'varient of uncertain significant identified\\s*in',
                'varient of uncertain significant identified',
                'varient of uncertain significance',
                'varient\\s*of\\s*uncertain\\s*significance\\s*(was\\s*)?(identified|detected)'



        ]
        concept_feature_value = "VUS"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }



    "Value_Affirmed" {
        expressions = [

                'detected',
                'positive',
                //requires space
                ' present',
                'identified',
                'evidence\\s*(of|for)',
                'shows?',
                'showed',
                'shows?\\s*mutations?(in\\s*)?',
                'showing',
                'with\\s*result\\s*showing',
                'harbouring',
                'driven lungcancer',
                'driven cancer',
                'driven',  //EGFR driven cancer
                'high\\s*polysomy',
                '\\(\\s*\\+\\s*\\)',
                'sensitive',
                'noted', //Possibly, look into here
                'notable for gene',
                'ABNROMAL', //Added 07-29-2019
                'had a clinically significant pathogenic mutation',
                'found to harbor',
                //Pt is a known BRCA germline mutation carrier.
                'germline mutation carrier',
                // with a reported germline BRCA2 mutation
               // 'with a reported germline', //in Germline_detected
                'with a reported',
                '(pt|patient|vet|he|she)\\s*is a known',
                'mutation\\+',
                'abnormality in',
                'abnormality found(\\s*in)?',
                'POSITIVE\\s*for\\s*a\\s*pathogenic',
                'expressed',
                //at least one clinically significant variant was detected
                'clinically\\s*significant\\s*variant\\s*was\\s*detected',
                'Pathogenic\\s*variant\\s*(was\\s*)?identified\\s*(in\\s*)',
                'POSITIVE FOR DELETERIOUS MUTATION'
               // 'IHC\\s*=\\s*Expressed',
               // '=\\s*Expressed'

        ]
        concept_feature_value = "Detected"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }
    "value_affirmed_dx" {
        expressions = [

                //This may work for genes in a pattern, but should likely not work in the window logic
                'DIAGNOSIS',
                'Dx',

        ]
        concept_feature_value = "Diagnosed_modifier"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }

    "value_hypothetical" {
        expressions = [


                'If\\s*(he|she|pt|they|vet|veteran)\\s*has(\\s*a)?',
                'If\\s*no ',
                'If\\s*an? ',
                ' If ',
                'should\\s*(he|she|pt|they|vet|veteran)\\s*have(\\s*a)?',
                'patients\\s*(who|that)\\s*have(\\s*a)?',
                'patients\\s*with(\\s*a)?(\\s*known)?',
                'if one of the gene mutations is note',
                'if mutations?',
                'if\\s*(detected|positive|present|identified|evidence|shows?)',
                '(could|can|might|would|should)\\s*show',
                //Should actually have modifier exclusion type for "represented by" being flagged as present  -- using this for now
                'rearrangments\\s*represented by these',
                'This\\s*pattern\\s*is\\s*Most\\s*commonly\\s*seen\\s*with'


        ]
        concept_feature_value = "hypothetical"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }

    "Value_Affirmed_Left" {
        expressions = [

                //Affirmed left are for potentially less precise affirmations that can only occur before the intended target
                'with',
                'has\\s*the',
                'has\\s*a',
                '(patient|pt|vet|veteran|he|she)\\s*has',
                'pathogenic mutation in the',
                'A likely pathogenic mutation was identified in the',
                //Test and lab only
                'Genetics/markers:',
                'The gene and alteration is:'



        ]
        concept_feature_value = "Detected_Left"
        outputType =  "gov.va.vinci.types.Modifier_Left_Concept"
    }
    //Detected and negated cases where the modifier also explicitly identifies the sample as being from the tumor
    "Detected_Tumor" {
        expressions = [

                //If it explicitly states that it's from a tumor, then it's detected tumor
                //Tumor sequencing positive for BRCA2 mutation
                'Tumor sequencing positive for',
                //'tumor was found to harbor Brca2 mutation
                'tumor was found to harbor',
                'Tumor\\s*sequencing\\s*confirmed\\s*positive\\s*for',
                'tumor found to be positive for',
                'mutation found in his tumor',
                'mutation in his tumor',
                'tissue\\s*NGS\\s*showing',
                'tumor\\s*profiling\\s*positive\\s*for',
                'Tumor\\s*sequencing\\s*confirmed',
                'Circulating tumor(\\s*is)?\\s*positive for',
                'ctdna(\\s*is)?\\s*positive for',
                'plasma(\\s*is)?\\s*positive\\s*for'


        ]
        concept_feature_value = "Detected_Tumor_sample"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }




    "negated_Tumor" {
        expressions = [

                //If it explicitly states that it's from a tumor, then it's detected tumor
                //Tumor sequencing positive for BRCA2 mutation
                'Tumor molecular testing negative',
                'Tumor sequencing negative for',
                //'tumor was found to harbor Brca2 mutation
                'tumor was found to harbor',
                'Tumor\\s*sequencing\\s*negative\\s*for',
                'tumor found to be negative for',
                'no mutation found in his tumor',
                'mutation in his tumor',
                'tumor\\s*profiling\\s*negative\\s*for',
                'Circulating tumor(\\s*is)?\\s*negative for',
                'ctdna(\\s*is)?\\s*negative for',
                'plasma(\\s*is)?\\s*negative for'


        ]
        concept_feature_value = "Negated_Tumor_sample"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }



    "Detected_germline_sample" {
        expressions = [

                //If it explicitly states that it's germline, then the modifier is set there
                //Tumor sequencing positive for BRCA2 mutation


                'blood positive for',
                'blood(\\s*is)?\\s*positive for',
                'positive in the blood sample',
                'germline\\s*prostate\\s*panel\\s*(;|,)\\s*mutation',
                'with\\s*a\\s*germline\\s*pathogenic\\s*variant\\s*in\\s*(the|his|her|their)?',
                'with\\s*a\\s*pathogenic\\s*germline\\s*variant\\s*in\\s*(the|his|her|their)?',
                'with\\s*a\\s*germline\\s*variant\\s*in\\s*(the|his|her|their)?',
                'germline\\s*pathogenic\\s*variant\\s*in\\s*(the|his|their)?',
                'with a reported germline'




        ]
        concept_feature_value = "Detected_germline_sample"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }

    "negated_germline_sample" {
        expressions = [

                //If it explicitly states that it's from a tumor, then it's detected tumor
                //Tumor sequencing positive for BRCA2 mutation

                'testing on blood - negative',
                'blood sample did not reveal',
                'blood was negative for germline mutations'

        ]
        concept_feature_value = "negated_germline_sample"
        outputType =  "gov.va.vinci.types.Modifier_Term"
    }





    "Value_Negated_Left" {
        expressions = [


                'no\b',
                'Germline testing negative through',



        ]
        concept_feature_value = "Negated_Left"
        outputType =  "gov.va.vinci.types.Modifier_Left_Concept"
    }
    //TODO: Confirm that the sectionizer doesn't already do this
    "Gene_anlyzed" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'Genes\\s*analyzed:',
                'Genes\\s*\\(50\\)\\s*analyzed:',
                'Genes\\s*included:'

        ]
        concept_feature_value = "Panel_Analyzed"
        outputType =     "gov.va.vinci.types.Modifier_Left_Concept"
    }

 //requested/not necessarily done
    "Value_Requested" {
        expressions = [

                'requested',
                'will\\s*be\\s*sent',
                'will\\s*be\\s*performed',
                'will\\s*be\\s*attempted',
                'have\\s*been\\s*requested',
                'has\\s*been\\s*requested',
                'elected to proceed with',
                'will\\s*obtain',
                'will\\s*send',
                'will\\s*order',
                'to\\s*be\\s*performed',


        ]
        concept_feature_value = "Requested"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }
    //Testing completed, not necessarily with a result
    "testing_performed" {
        expressions = [


                'performed at',
                'testing performed at',
                'Performing\\s*lab:',
                'tested\\s*at',
                'performed on',
                'Test\\s*performed:',
                'A kit was obtained from',
                'drew peripheral whole blood for',
                'drew blood for',
                'analysis\\s*performed\\s*at',
                'a\\s*block\\s*is\\s*sent\\s*to',
                'Performing Lab:',
                'Test:',
                'analysis was performed\\S*(at|BY|THROUGH)',
                'testing was completed\\S*(at|BY|THROUGH)',
                'Genetic analysis via the prostate cancer panel through',
                'Genetics:',
                'test was performed at',
                'TEST PERFORMED:',
                'performed by',
                'performed through',
                'You were tested at',
                'test was done through',
                'the lab that performed your testing',
                'was obtained and processed',
                '(GERMLINE|TEST)\\S*(DONE|COMPLETED|PERFORMED)\\S*(BY|THROUGH)',
                'testing was complete at',
                'tested by',
                'Report Was Received'



        ]
        concept_feature_value = "testing_performed"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }
    "Value_Pending" {
        expressions = [

                'pending',
                'will\\s*not\\s*be\\s*back',
                'WILL\\s*BE\\s*ATTEMPTED',
                'done\\s*but\\s*results\\s*are\\s*not\\s*updated',
                'Results\\s*pending',
                'collected\\s*today'


        ]
        concept_feature_value = "Pending"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }

    "consented" {
        expressions = [
            'gave\\s*consent\\s*for',
            'consented\\s*to',
            'consented\\s*for',
            'consented\\s*to\\s*enrolling\\s*in',
            'chose to pursue genetic testing for',
            'elected to proceed with',
            'consented to genetic testing via the',
            '(patient|pt|he|she|vet|veteran)\\s*agreed\\s*to',
            //'Veteran AGREES to GERMLINE GENETIC testing. '
            '(Veteran|vet|pt|s?he|patient)\\s*AGREE(S|d|ing)\\s*to',
                //    '//GERMLINE GENETIC testing'

        ]
        concept_feature_value = "consented"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }
    "declined" {
        expressions = [
                // Germline testing: declined.

                'declined',
                '(patient|pt|vet|veteran)\\d*declined',
                'chose NOT to pursue',
                'was offered and declined',
                'did not want to pursue',
                'testing deferred',
                'testing declined',
                'refused',
                'which\\s*s?he\\s*declined'

        ]
        concept_feature_value = "declined"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }



    "results_received" {
        expressions = [
                //Prevention Genetics results received, though the results not necessarily available yet/inthe instance
                'results received',
                //GERMLINE testing was completed throughgit status COLOR genomics
                'germline testing was completed through',
                'testing was completed through',
                'See Vista Imaging for scanned reference laboratory results',
                'discussed the finding'

        ]
        concept_feature_value = "results_received"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }

    "test_discussed" {
        expressions = [

        'discussed',
        'will consider',
        'agreed\\s*to\\s*proceed\\s*with',
        'discussed other cancer risks associated with',
        //'We also potentially discussed\\s*rechallenge with AR-pathway inhibitor.'
        'discussed\\s*rechallenge\\s*with\\s*(a\\s*)?',
        'if\\s*we\\s*can\\s*get',
        '(patient|vet|pt|he|she)\\s*does\\s*qualify\\s*for',
        'qualifies\\s*for',
        //Pathway copy paste
        // I was present during discussion with patient regarding germline testing in the setting of his prostate cancer.
        'discussion with patient regarding',
        'I was present during discussion with patient regarding'
        ]
        concept_feature_value = "test_discussed"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }

    "test_ordered" {
        expressions = [
//Prevention Genetics results received
            'ordered',
            'sent, results not\\s*back yet',
            'testing was done at',
            'Orders\\s*initiated',
            'placed the order with',
            'previously\\s*ordered'
        ]
        concept_feature_value = "test_ordered"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }
    "test_not_ordered" {
        expressions = [

            'not\\s*ordered',
            'not\\s*completed'
        ]
        concept_feature_value = "test_not_ordered"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }




    "Value_Indeterminate" {
        expressions = [
                'indeterminate',
                'not\\s*initially\\s*available',
                'inadequate\\s*specimen',
                'not\\s*obtainable\\s*because\\s*of\\s*insufficient tissue',
                'not\\s*obtainable',
                'insufficient\\s*tissue',
                'COULD\\s*NOT\\s*BE\\s*ASSESSED\\s*DUE\\s*TO\\s*INSUFFICENT\\s*TUMOR',
                'INSUFFICENT\\s*TUMOR'


        ]
        concept_feature_value = "Indeterminate"
        outputType =    "gov.va.vinci.types.Modifier_Term"
    }
    "Value_Not_Performed" {
        expressions = [
                'Test\\s*not\\s*performed',
                'not\\s*performed',
                'cannot\\s*be\\s*performed',
                'TNP',
                'not\\s*yet\\s*done',
                '\\(Test\\s*Not\\s*Performed\\)',
                'not\\s*checked',



        ]
        concept_feature_value = "Not_Performed"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }
    "Value_unknown" {
        expressions = [
                'unknown'


        ]
        concept_feature_value = "unknown"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }
    "hypothetical" {
        expressions = [
                //Will likely expand for common guidelines
                'may not be detected',
                'tumors\\s*\\(approximately\\s*5%\\)\\s*with',
                'patients\\s*for\\s*whom\\s*treatment\\s*with',
                'are\\s*detected\\s*in\\s*a\\s*wide\\s*variety\\s*of\\s*cancers',
                '(unless|if)\\s*(he|she|vet|pt)\\s*has',

                /*
                Activating KRAS oncogenic mutations are detected in a wide variety of cancers, including colorectal carcinomas, lung adenocarcinomas,
                A small proportion of tumors (approximately 5%) with ALK rearrangement demonstrated by other methods may be missed by this study.
This test is indicated as an aid in the assessment of patients for whom treatment with ALK inhibitors are being considered.
                 */
                //Patient education examples as well
                'The most common gene found to harbor mutations in men with prostate\\s*cancer is',
                //In addition, men with BRCA2 or HOXB13 gene mutations may have a higher risk of developing life-threatening forms of prostate cancer.
                'men\\s*with'

        ]
        concept_feature_value = "Hypothetical"
        outputType =     "gov.va.vinci.types.Modifier_Term"
    }



    "Expression_term" {
        expressions = [
                'expressed',
                'expressed\\s*at',
                'at'
        ]
        concept_feature_value = "Expression_Term"
        outputType =     "gov.va.vinci.types.Expression_Term"
    }
    //Removing expressions from current system.  Not relevant for test types and causes issues
    /*
    "Expression_Value" {
        expressions = [
                '\\d\\d?'
        ]
        concept_feature_value = "Expression_Value"
        outputType =     "gov.va.vinci.types.Expression_Value"
    }

     */



}






