-- Example of query when baseline NER component of the system uses a dictionary rather than the bespoke set of Prostate HRR genes

Select distinct
    name_of_laboratory, lab_test_name, CLIA_Number
    --, [TestType], [ObjectName], [condition_identifiers], gene.*
from
    [VINCI_CancerNLP].[dim].[nlm_gtr_test_condition_gene] gene
join [VINCI_CancerNLP].[dim].[nlm_gtr_test_version] test
    on gene.AccessionVersion=test.[test_accession_ver]
--It's a clinical test
where [TestType] like 'Clinical'
--and it's specific for the prostate or hereditary cancer
and [ObjectName] like '%prostate%'

and condition_identifiers not like 'Solid tumor'
and facility_country = 'United States'
