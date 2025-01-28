import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
name = "SectionHeaderAnnotator"

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
    "separator" {
        expressions = [
                '\\r\\n *\\r\\n'
        ]
        concept_feature_value = "separator"
        //outputType = "gov.va.vinci.types.SectionHeader"
    }

*/
    "pmh" {
        expressions = [
                '(past )?medica\\s+(history|hx)(:|-)',
                '\\bmhx?(:|-)',
                '\\bmh?(:|-)',
                'pohx(:|-)',
                'pmh?(:|-)',
                'past\\s*history(:|-)',
                'history(:|-)',
                'p[hm]+\\s*computerized\\s+problem\\s+list(:|-)',
                'significant\\smedical\\shx(:|-)',
                'past\\smedical\\shistory\\s?\\/\\s?problem list(:|-)',
                //SecTag Additions
                'patient_history(:|-)',
                'patient history(:|-)',
                'pt history(:|-)',
                'history/physical examination(:|-)',
                'history physical examination(:|-)',
                'clinical history(:|-)',
                'in clinical history(:|-)',
                'clinical history/indications(:|-)',
                'clinical history indication(:|-)',
                'issues briefly as following(:|-)',
                'issue briefly as following(:|-)',
                'history(:|-)',
                'current medical problems(:|-)',
                'current medical problem(:|-)',
                'history of chronic illness(:|-)',
                'history chronic illness(:|-)',
                'clinical presentation(:|-)',
                'issues briefly as follows(:|-)',
                'issue briefly as follow(:|-)',
                'interval history(:|-)',
                'past medical history and review of systems(:|-)',
                'past medical history and review of system(:|-)',
                'past medical history review system(:|-)',
                'past medical problems(:|-)',
                'past medical problem(:|-)',
                'history of past illness(:|-)',
                'history past illness(:|-)',
                'past medical history(:|-)',
                'previous medical history(:|-)',
                'hematology/oncology history(:|-)',
                'hematology oncology history(:|-)',
                'history of general health(:|-)',
                'history general health(:|-)',
                'past medical history/past surgical history(:|-)',
                'past medical history past surgical history(:|-)',
                'medical problems(:|-)',
                'medical problem(:|-)',
                'significant past medical history(:|-)',
                'history of major illnesses and injuries(:|-)',
                'history of major illness and injury(:|-)',
                'history major illness injury(:|-)',
                'past med history(:|-)',
                'past hospitalization history(:|-)',
                'medical history(:|-)',
                'past medical and surgical history(:|-)',
                'past medical surgical history(:|-)',
                'brief medical history(:|-)',
                'Past Medical History/Problem List(:|-)',
                'past medical history problem list(:|-)',
                'past medical issues(:|-)',
                'past medical issue(:|-)',
                'past_medical_history(:|-)',
                'past medical history/surgical history(:|-)',
                'past medical history surgical history(:|-)',
                'past infectious history(:|-)',
                'past medical history/family history(:|-)',
                'past medical history family history(:|-)',
                'Known Significant Medical Diagnoses and Conditions(:|-)',
                'past history(:|-)',
                'past medical history and physical examination(:|-)',
                'past medical history physical examination(:|-)',
                'past medical history/physical examination(:|-)',
                'past_medical_history_and_physical_examination(:|-)',
                //Custom @ Barb
                'Historical\\s*data(:|-)?',
                'RELEVANT PERSONAL MEDICAL HISTORY(:|-)?',
                'BRIEF CLINICAL HISTORY(:|-)?'
        ]
        concept_feature_value = "PMH"
        outputType = "gov.va.vinci.types.SectionHeader"
    }

    "FAMILY_HISTORY" {
        expressions = [
                'FAMILY HISTORY(:|-)',
                'fhx(:|-)',

        ]
        concept_feature_value = "FAMILY_HISTORY"
        outputType = "gov.va.vinci.types.SectionHeader"
    }
    /*
    //Specific to Pneumonia Project
    Excluded CXR Option
    "cxr" {
        expressions = [
              //  'cxr(:|-)',
                'x-?rays?'
                //Please correlate for
                //visualizing
        ]
        concept_feature_value = "cxr"
        outputType = "gov.va.vinci.types.SectionHeader"
    }
*/
    "problem_list" {
        expressions = [
                'active problem list(:|-)',
                'chronic\\s+stable\\s+problems(:|-)',
                'PROBLEMS ?\\- ACTIVE(:|-)',
                'problem\\s*list'

        ]
        concept_feature_value = "ProblemList"
        outputType = "gov.va.vinci.types.SectionHeader"
    }
        "sexual and social history" {
            expressions = [
                    'SH:',
                    'social history:',
                    'PSHx:',
                    'soc\\s*hx(:|-)',
                    'mh/pshx(:|-)',
                    'sexual history',
                    'pmh[sx](:|-)',
                    'pmhx\\/pshx(:|-)',
                    'sexual history:',
                    'LGBTQ SCREENING NWI(:|-)'

            ]
            concept_feature_value = "Social_History"
            outputType = "gov.va.vinci.types.SectionHeader"
        }

        "HIV screening" {
            expressions = [
                    'HIV(:|-)',
                    'HIV Screening(:|-)',
                    'HIV Risk(:|-)'

            ]
            concept_feature_value = "HIV_Screening"
            outputType = "gov.va.vinci.types.SectionHeader"
        }
        "Observation_and_plan" {
            expressions = [
                    'ADDITIONAL ASSESSMENT(:|-)',
                    'MEDICAL\\s*DECISION\\s*MAKING/PLAN:',
                    'ASS(:|-)',
                    'ASSESMENT(:|-)',
                    'ASSESS(:|-)',
                    'ASSESSMENT(:|-)',
                    'Assessment\\s*.\\s*Plan(:|-)',
                    'CLINICAL IMPRESSION(:|-)',
                    'CLINICAL IMPRESSIONS(:|-)',
                    '\bimp(:|-)',
                    'Imp:',
                    'IMPRESSION AND RECOMMENDATION(:|-)',
                    'IMPRESSION AND RECOMMENDATIONS(:|-)',
                    'IMPRESSION RECOMMENDATION(:|-)',
                    'IMPRESSION SECTION(:|-)',
                    'IMPRESSION(:|-)',
                    'IMPRESSION/ASSESSMENT(:|-)',
                    'IMPRESSIONS(:|-)',
                    'IMPRESSIONS/ASSESSMENT(:|-)',
                    'IMPRESSSION(:|-)',
                    'IMPRESSSIONS(:|-)',
                    'INITAL IMPRESSION(:|-)',
                    'INITIAL ASSESSMENT(:|-)',
                    'INITIAL IMPRESSION(:|-)',
                    'INITIAL IMPRESSION/ASSESSMENT(:|-)',
                    'Recommendations(:|-)',
                    '\\bA/P(:|-)',
                    '\\bA/P(:|-)',
                    '\\bA(:|-)',
                    '\\r(\\n)? *ASSESSMENT AND PLAN(:|-)',
                    '\\r(\\n)? *Impression(:|-)',
                    'assessment and plan(:|-)',
                    'assessment and recommendation(:|-)',
                    'assessment and recommendations(:|-)',
                    'assessment plan(:|-)',
                    'assessment recommendation(:|-)',
                    'assessment(:|-)',
                    'assessment/plan(:|-)',
                    'assessment(:|-)',
                    'assessment_and_plan(:|-)',
                    'clinical comment(:|-)',
                    'clinical comments(:|-)',
                    'clinical impression(:|-)',
                    'diagnoses(:|-)',
                    'diagnosis(:|-)',
                    'diagnosis(:|-)',
                    'impression and plan(:|-)',
                    'impression and plans(:|-)',
                    'impression and recommendation(:|-)',
                    'impression and recommendations(:|-)',
                    'impression plan(:|-)',
                    'impression recommendation(:|-)',
                    'impression(:|-|\\*)',
                    'impresion(:|-)',
                    'impression/plan(:|-)',
                    'impression/recommendations(:|-)',
                    'initial impression(:|-)',
                    'interpretation(:|-)',
                    'objective(:|-)',
                    'plan and discussion(:|-)',
                    'plan discussion(:|-)',
                    'medical decision making(:|-)',
                    //2023 additions
                    'Diagnosis/CC:',
                    //Addednum
                    '\\bplan(:|-)',
                    //Genetic letter for patients
                    'Next Steps:'


            ]
            concept_feature_value = "Observation_and_Plan"
            outputType = "gov.va.vinci.types.SectionHeader"
        }


        "medication" {
            expressions = [
                    'ACTIVE\\s*INPATIENT\\s*AND\\s*OUTPATIENT\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*MEDICATIONS\\s*COMBINED(:|-)',
                    'ACTIVE\\s*MEDICATIONS\\s*INCLUDE(:|-)',
                    'ACTIVE\\s*MEDICATIONS\\s*LIST(:|-)',
                    'ACTIVE\\s*MEDICATIONS\\s*PRESCRIBED\\s*AT\\s*SAGINAW\\s*VAMC(:|-)',
                    'ACTIVE\\s*MEDICATIONS\\s*PRESCRIBED\\s*AT\\s*THE\\s*SAGINAW\\s*VAMC(:|-)',
                    'ACTIVE\\s*NON-VA\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*NONVA\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*NON\\s*VA\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*OPT\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*OUTPATIENT\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*OUTPATIENT\\s*PRESCRIPTIONS(:|-)',
                    'ACTIVE\\s*VA\\s*MEDICATIONS(:|-)',
                    'ACTIVE\\s*\\s*MEDICATIONS(:|-)',
                    'ADMISSION\\s*MEDICATIONS(:|-)',
                    'ALL\\s*ACTIVE\\s*MEDICATIONS(:|-)',
                    'Active\\s*Inpatient\\s*Medications\\s*\\(including\\s*supplies\\)(:|-)',
                    'Active\\s*Inpatient\\s*Medications\\s*drug\\s*dosage(:|-)',
                    'Active\\s*Inpatient\\s*Medications\\s*status(:|-)',
                    'Active\\s*Medications\\s*\\(including\\s*supplies\\)(:|-)',
                    'Active\\s*Medications\\s*from\\s*Remote\\s*Data(:|-)',
                    'Active\\s*Outpatient\\s*Medications\\s*\\(including\\s*supplies\\)(:|-)',
                    'Active\\s*medications(:|-)',
                    'Active\\s*medications?\\s*prior\\s*to\\s*admission(:|-)',
                    'CORRECT\\s*MEDICATIONS\\s*INCLUDE(:|-)',
                    'CURRENT\\s*INPATIENT\\s*MEDICATIONS(:|-)',
                    'CURRENT\\s*INPATIENT\\s*MEDICATIONS\\s*INCLUDE(:|-)',
                    'CURRENT\\s*MEDICATIONS(:|-)',
                    'CURRENT\\s*MEDICATIONS/RECONCILIATION(:|-)',
                    'CURRENT\\s*MEDICATIONS\\s*LIST(:|-)',
                    'DISCHARGE\\s*MEDICATIONS(:|-)',
                    'DRUGS(:|-)',
                    'HEALTH\\s*SUPPLEMENTS(:|-)',
                    'HISTORY/MEDICATIONS(:|-)',
                    'HISTORY\\s*OF\\s*MEDICATION\\s*TREATMENTS(:|-)',
                    'HISTORY\\s*OF\\s*MEDICATION\\s*USE(:|-)',
                    'Home\\s*medications(:|-)',
                    'INACTIVE\\s*OUTPATIENT\\s*MEDICATIONS(:|-)',
                    'INHOSPITAL\\s*MEDICATIONS(:|-)',
                    'INPATIENT\\s*MEDICATIONS(:|-)',
                    'INPATIENT\\s*MEDICATION\\s*RECONCILIATION(:|-)',
                    'INPT\\s*MEDICATIONS(:|-)',
                    'Inpatient\\s*medications?(:|-)',
                    'Inpatient\\s*medications?\\s*=(:|-)',
                    'MEDICATION(S)\\s*REVIEW(:|-)',
                    'MEDICATIONS(:|-)',
                    'MEDICATIONS\\s*AT\\s*ADMISSION(:|-)',
                    'MEDICATIONS\\s*AT\\s*DISCHARGE(:|-)',
                    'MEDICATIONS\\s*DURING\\s*ADMISSION(:|-)',
                    'MEDICATIONS\\s*GIVEN\\s*TODAY(:|-)',
                    'MEDICATIONS\\s*ON\\s*ADMISSION(:|-)',
                    'MEDICATIONS\\s*ON\\s*DISCHARGE(:|-)',
                    'MEDICATIONS\\s*PRIOR\\s*TO\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*AT\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*AT\\s*DISCHARGE(:|-)',
                    'MEDICATION\\s*DURING\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*HISTORY(:|-)',
                    'MEDICATION\\s*MANAGEMENT\\s*AT\\s*DISCHARGE(:|-)',
                    'MEDICATION\\s*ON\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*PRIOR\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*PRIOR\\s*TO\\s*ADMISSION(:|-)',
                    'MEDICATION\\s*RECONCILIATION(:|-)',
                    'MEDICATION\\s*RECONCILIATION\\s*REVIEW(:|-)',
                    'MEDICATION\\s*RECONCILIATION\\s*SUMMARY(:|-)',
                    'MEDICATION\\s*RECONCILLIATION(:|-)',
                    'MEDICATION\\s*REVIEW\\s*for\\s*MEDICATION\\s*RECONCILIATION(:|-)',
                    'MEDICINES\\s*AT\\s*PHARMACY(:|-)',
                    'MED\\s*RECON(:|-)',
                    'MED\\s*RECONCILIATION(:|-)',
                    'MED\\s*RECONCILIATION\\s*OUTPT(:|-)',
                    'MISUSE\\s*OF\\s*MEDICATIONS(:|-)',
                    'M\\s*E\\s*D\\s*I\\s*C\\s*A\\s*T\\s*I\\s*O\\s*N\\s*S(:|-)',
                    'NON-VA\\s*MEDICATIONS(:|-)',
                    'NON-VA\\s*PRESCRIBED(:|-)',
                    'NON-VA\\s*PRESCRIPTIONS(:|-)',
                    'NON-VA\\s*PRESCRIPTION\\s*MEDICATIONS(:|-)',
                    'NON-VA\\s*SUPPLIED\\s*MEDICATIONS(:|-)',
                    'NONVA\\s*MEDICATIONS(:|-)',
                    'NONVA\\s*MEDICATIONS\\s*LIST(:|-)',
                    'NON\\s*VA(:|-)',
                    'NON\\s*VA\\s*MEDICATIONS(:|-)',
                    'NON\\s*VA\\s*PRESCRIBED(:|-)',
                    'NON\\s*VA\\s*PRESCRIPTIONS(:|-)',
                    'NON\\s*VA\\s*PRESCRIPTION\\s*MEDICATIONS(:|-)',
                    'NON\\s*VA\\s*SUPPLIED\\s*MEDICATIONS(:|-)',
                    'Non-VA\\s*medications(:|-)',
                    'OUTPATIENT\\s*MEDICATIONS(:|-)',
                    'OUTPATIENT\\s*MEDICATION\\s*REVIEW(:|-)',
                    'OUTPT.\\s*MEDICATION\\s*RECONCILIATION(:|-)',
                    'OUTPT\\s*MEDICATIONS(:|-)',
                    'Outpatient\\s*medications(:|-)',
                    'Outpatient\\s*medications\\s*status(:|-)',
                    'Outpatient\\s*meds\\s*DRUG\\s*List(:|-)',
                    'PENDING\\s*INPATIENT\\s*MEDICATIONS(:|-)',
                    'PRE-ADMISSION\\s*MEDICATIONS(:|-)',
                    'PRE-VISIT\\s*MED\\s*RECONCILIATION(:|-)',
                    'PREADMISSION\\s*MEDICATION(:|-)',
                    'PRESENT\\s*MEDICATIONS(:|-)',
                    'PROVIDER\\s*MED\\s*RECONCILIATION(:|-)',
                    'PTA\\s*Meds(:|-)',
                    'RECONCILED\\s*MEDICATION\\s*LIST(:|-)',
                    'RECONCILIATION(:|-)',
                    'RECONCILIATION\\s*OF\\s*MEDICATIONS\\s*COMPLETED(:|-)',
                    'SIGNIFICANT\\s*MEDICATIONS(:|-)',
                    'SUBSTANCE\\s*USE/MISUSE\\s*OF\\s*MEDICATIONS(:|-)',
                    'Status\\s*Active(:|-)',
                    'VA\\s*MEDICATIONS(:|-)',
                    '\\r(\\n)? *Active Outpatient Medications(:|-)',
                    '\\r(\\n)? *meds(:|-)',
                    '\\r(\\n)?\\s*MEDICATIONS(:|-)',
                    'summary\\s*of\\s*medications'
            ]
            concept_feature_value = "Medications"
            outputType = "gov.va.vinci.types.SectionHeader"
        }

    "Medication_indication:" {
        expressions = [
                'Medication indication:'
        ]
        concept_feature_value = "Medication_indication"
        outputType = "gov.va.vinci.types.SectionHeader"
    }


        "allergy" {
            expressions = [

                    'A L L E R G I E S(:|-)',
                    'ADDITIONAL ADRS AND/OR ALLERGIES(:|-)',
                    'ADR(:|-)',
                    'ADVERSE DRUG REACTIONS(:|-)',
                    'ADVERSE EVENTS(:|-)',
                    'ADVERSE REACTION(:|-)',
                    'ADVERSE REACTIONS(:|-)',
                    'ALLERGIC DISORDER HISTORY(:|-)',
                    'ALLERGIC REACTIONS(:|-)',
                    'ALLERGIC(:|-)',
                    'ALLERGIES AND ADVERSE REACTIONS(:|-)',
                    'ALLERGIES AND SENSITIVITIES(:|-)',
                    'ALLERGIES FAMILY HISTORY(:|-)',
                    'ALLERGIES REVIEWED(:|-)',
                    'ALLERGIES TO MEDICATIONS(:|-)',
                    'ALLERGIES/ADVERSE REACTIONS(:|-)',
                    'ALLERGIES/REACTIONS(:|-)',
                    'ALLERGIES(:|-)',
                    'ALLERGY ADVERSE REACTION(:|-)',
                    'ALLERGY ENVIRONMENTAL ALLERGEN(:|-)',
                    'ALLERGY FAMILY HISTORY(:|-)',
                    'ALLERGY INFORMATION(:|-)',
                    'ALLERGY REVIEW(:|-)',
                    'ALLERGY SCREENING(:|-)',
                    'ALLERGY SYMPTOM(:|-)',
                    'ALLERGY SYMPTOMS(:|-)',
                    'ALLERGY TO ENVIRONMENTAL ALLERGEN(:|-)',
                    'ALLERGY TO ENVIRONMENTAL ALLERGENS(:|-)',
                    'ALLERGY/ADVERSE DRUG REACTION HISTORY(:|-)',
                    'ALLERGY/ADVERSE DRUG REACTION INFORMATION(:|-)',
                    'ALLERGY/ADVERSE DRUG REACTION(:|-)',
                    'ALLERGY(:|-)',
                    'CONCOMITANT MEDICATIONS(:|-)',
                    'CURRENT ALLERGIES(:|-)',
                    'DRUG ALLERGIC REACTIONS(:|-)',
                    'DRUG ALLERGIES(:|-)',
                    'DRUG SENSITIVITIES(:|-)',
                    'FOOD & DRUG REACTIONS INCLUDING ALLERGIES AS ENTERED IN CPRS(:|-)',
                    'FOOD ALLERGIES(:|-)',
                    'HISTORY ALLERGY(:|-)',
                    'HISTORY OF ALLERGIES(:|-)',
                    'KNOWN ALLERGIES(:|-)',
                    'LATEX ALLERGY(:|-)',
                    'MEDICATIONS ALLERGIES(:|-)',
                    'NEW ALLERGIES(:|-)',
                    'NEWLY IDENTIFIED ALLERGIES(:|-)',
                    'OTHER ALLERGIES(:|-)',
                    'PREVIOUSLY DOCUMENTED ALLERGIES(:|-)',
                    'SEASONAL ALLERGIES(:|-)',
                    'SEASONAL ALLERGY(:|-)',
                    'SENSITIVITIES(:|-)',
                    '\\r\\n *\\d+ *\\).? *allergies(:|-)',
                    '\\r\\n *all(:|-)',
                    '\\r\\n *allergies(:|-)',
                    '\\r\\n *allergy(:|-)',
                    'allergies/adr(:|-)',
                    'allergies(:|-)',
                    'allergy'
            ]
            concept_feature_value = "Allergies"
            outputType = "gov.va.vinci.types.SectionHeader"
        }
        "Chief complaint" {
            expressions = [
                    'CHIEF COMPLAINT(:|-)',
            ]
            concept_feature_value = "Complaint"
            outputType = "gov.va.vinci.types.SectionHeader"
        }

        "Physical Exam" {
            expressions = [
                    '\\r(\\n)? *Physical Exam\\w*?(:|-)',
                    '\\r(\\n)? *Review of systems(:|-)',
                    'PHYSICAL EXAMINATION',
                    'PE(:|-)',
                    'exam(:|-)'
            ]
            concept_feature_value = "Exam"
            outputType = "gov.va.vinci.types.SectionHeader"
        }


        "ED_Course" {
            expressions = [
                    'ED\\s*COURSE(:|-)',
                    'Er\\s*COURSE(:|-)',
                    'Emergency\\s*Department\\s*Course'

            ]
            concept_feature_value = "ED_Course"
            outputType = "gov.va.vinci.types.SectionHeader"
        }

        "labs_and_studies" {
            expressions = [
                    '\\r(\\n)? *findings *(:|-)',
                    '\\r(\\n)? *LABORATORY DATA(:|-)',
                    '\\r(\\n)? *operation and findings *(:|-)',
                    '\\r(\\n)? *operative findings *(:|-)',
                    '\\r(\\n)? *pathologic staging *(:|-)',
                    '\\r(\\n)? *pathology report *(:|-)',
                    '\\r(\\n)? *performing lab\\b *(:|-)',
                    '\\r(\\n)? *performing laboratory *(| *\r(\n)?)(:|-)',
                    '\\r(\\n)? *reporting lab *(:|-)',
                    '\\bo:',
                    'objective(:|-)',
                    's/o(:|-)',
                    'indication(:|-)',
                    'clinical indication(:|-)',
                    'indication(:|-)',
                    'indications(:|-)',
                    '\\r(\\n)? *micro *(:|-)',
                    '\\r(\\n)? *micro exam *',
                    'labs(:|-)'

            ]
            concept_feature_value = "Labs_and_Studies"
            outputType = "gov.va.vinci.types.SectionHeader"
        }



        "Present Illness" {
            expressions = [
                    'hpi/interval history(:|-)',
                    'hpi interval history(:|-)',
                    'patient hpi(:|-)',
                    'present illness(:|-)',
                    'history_present_illness(:|-)',
                    'history of the present illness(:|-)',
                    'history of present illness(:|-)',
                    'history present illness(:|-)',
                    'summary of present illness(:|-)',
                    'summary present illness'
            ]
            concept_feature_value = "HPI"
            outputType = "gov.va.vinci.types.SectionHeader"
        }


    /*  The following sections were added specifically for genetic consult and genetic result notes

     */
    "Patient Education" {
        expressions = [
                'PATIENT EDUCATION:',
                'Background on Genetics and Cancer',
                'About this test:',
                'What Olaparib Is Used For:',
                'education(:|-)',
                'Education provided on(:|-)',
                'Educated on(:|-)',

        ]
        concept_feature_value = "Patient_Education"
        outputType = "gov.va.vinci.types.SectionHeader"
    }
    "management_options_consultation" {
        expressions = [
                'MEDICAL MANAGEMENT OPTIONS FOR THE VETERAN:',
                'MEDICAL MANAGEMENT OPTIONS FOR THE FAMILY:'

        ]
        concept_feature_value = "management_options"
        outputType = "gov.va.vinci.types.SectionHeader"
    }


    "Gene_anlyzed" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'Genes\\s*analyzed:',
                'The genes tested included:',
                'Genes\\s*\\(\\d\\d?\\d?\\)\\s*analyzed:',
                'Genes\\s*included\\s*\\(\\d\\d?\\):',
                'Genes\\s*included:',
                'The following genes were analyzed:',
                'GENE\\(S\\)\\s*ANALYZED:',
                'For reference the following 18 genes were tested as part of panel',
                'The genes below were analyzed, and no pathogenic or likely pathogenic genetic' +
                'The genes below were analyzed, and no pathogenic or likely pathogenic genetic\\s*variants associated with an increased risk of breast, colorectal, melanoma,\\s*ovarian, pancreatic, prostate,\\s*stomach, or uterine cancers were identified',
                'the\\s*genes\\s*below\\s*were\\s*analyzed',
                'Genes\\s*analyzed include:',
                'Genes\\s*analyzed through\\s*invitae:',
                'The following genes were tested:',
                '\\d\\d\\s*genes\\s*were\\s*analyzed\\s*as\\s*part\\s*of\\s*this\\s*panel:',
                //added 2024-01-31
                'genetic testing; analysis of',
                'which analyzes the following genes:',
                'following genes:'

        ]
        concept_feature_value = "Panel_Analyzed"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }
    "Genetics_non_specific:" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'Genetic Consult:',

        ]
        concept_feature_value = "Genetics_non_specific"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }


    "Test_Performed" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'Test performed:',

        ]
        concept_feature_value = "Test_Performed"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }
    "Reason_for_referral" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'REASON FOR REFERRAL:',

        ]
        concept_feature_value = "Reason_for_referral"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }


    "RISK ASSESSMENT:" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'RISK ASSESSMENT:',
                'GENETIC\\s*RISK\\s*ASSESSMENT:',
                'GENETIC RISK ASSESSMENT AND TESTING:',
                'Risk Factors:'
        ]
        concept_feature_value = "Risk_Assessment"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }

    "Results" {
        expressions = [
                //Next phase of development/annotation should identify any genes without a modifier attached when found in the results section
                'Results?:',
                'YOUR GENETIC TEST RESULT:',
                'RESULTs? OF MOLECULAR TESTING:',
                'INTERPRETATION OF TEST RESULTs?:',
                'results were as follows"',
                'LABORATORY RESULTS:',
                //May consider separating interpretation and results
                'INTERPRETATION:',
                '\\r(\\n)? *result *(:|-)',
                'The report is as follows:',
                'Summary of\\s*Results:',
                'Genetic\\s*Test\\s*Results:'

        ]
        concept_feature_value = "Results"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }
    "Genomic_testing" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'Genomic testing\\s*(:|-)'

        ]
        concept_feature_value = "Genomic_testing"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }
    "Clinical_Summary" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'Clinical Summary:'

        ]
        concept_feature_value = "Clinical_Summary"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }
    "RECOMMENDATIONS" {
        expressions = [
                //Post processing will likely set as negative, these rules are for panels and genes being described as included in the panel
                'RECOMMENDATIONS:'

        ]
        concept_feature_value = "RECOMMENDATIONS"
        outputType =     "gov.va.vinci.types.SectionHeader"
    }



    "microscopic description" {
        expressions = [
                'MICROSCOPIC DESCRIPTION(:|-)'
        ]
        concept_feature_value = "MICROSCOPIC_DESCRIPTION"
        outputType = "gov.va.vinci.types.SectionHeader"
    }

    "gross description" {
        expressions = [
                'Gross DESCRIPTION(:|-)'
        ]
        concept_feature_value = "GROSS_DESCRIPTION"
        outputType = "gov.va.vinci.types.SectionHeader"
    }



    "other" {
        expressions = [
                '\\r(\\n)? *A signed copy of this report(:|-)',
                '\\r(\\n)? *modified report *(:|-)',
                '\\r(\\n)? *note *(:|-)',
                '\\r(\\n)? *postoperative diagnosis *(| *\r(\n)?)(:|-)',
                '\\r(\\n)? *preoperative diagnosis *(| *\r(\n)?)(:|-)',
                '\\r(\\n)? *procedure *(:|-)',
                '\\r(\\n)? *rectal mass *(:|-)',
                '\\r(\\n)? *regional lymph nodes *(:|-)',
                '\\r(\\n)? *smw *(:|-)',
                '\\r(\\n)? *\\bsp\\b *(:|-)',
                '\\r(\\n)? *submitted *(:|-)',
                '\\r(\\n)? *summary of section *(:|-)',
                '\\r(\\n)? *supplementary report *(:|-)',
                '\\r(\\n)? *supplementary report\\(s\\) *(:|-)',
                '\\r(\\n)? *synoptic report for colon rectum *(:|-)',
                '\\r(\\n)? *test performed at *(:|-)',
                '\\r(\\n)? *tumor synopsis *(:|-)',
                '/es/(:|-)',
                'medications\\s*held\\s*or\\s*discontinued\\s*upon\\s*admission(:|-)',
                'changes/additions(:|-)',
                'possible risks or complications include'
        ]
        concept_feature_value = "other"
        outputType = "gov.va.vinci.types.SectionHeader"
    }


    }







