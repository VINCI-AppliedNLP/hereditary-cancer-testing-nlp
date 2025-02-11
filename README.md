

# Hereditary Cancer Testing NLP

This repository contains the Natural Language Processing (NLP) code related to identifying hereditary cancer documentation in clinical notes. The project is composed of two main pipelines:

## Pipelines

### 1. Biomarker Pipeline

The Biomarker Pipeline was used for the hereditary cancer publication. This pipeline focuses on identifying and extracting information related to prostate cancer HRR tests from clinical notes.


#### Citations
More information regarding this system, and the overal project can be found in the citation below, 
Please cite the following publication(s) when using this pipeline:

Danielle Candelieri-Surette et al., Incorporating Structured and Unstructured Data Sources to Identify and Characterize Hereditary Cancer Testing Among Veterans With Metastatic Castration-Resistant Prostate Cancer. JCO Clin Cancer Inform 9, e2400189(2025).

DOI:10.1200/CCI-24-00189 

### 2. Gene Mapping Pipeline

The Gene Mapping Pipeline is a stripped-down version meant for extracting gene Named Entity Recognition (NER) information. This pipeline focuses on mapping genes mentioned in clinical notes.

## Repository Structure

- **src/**: Contains the source code for the NLP pipelines.
  - src/main/java/ae: contains the logic annotator for the final system output types
  - src/main/java/resources: Contains the rules and pattern annotators for the system logic
- **data/**: Directory for storing input data files.
- **output/**: Directory for storing output results.


