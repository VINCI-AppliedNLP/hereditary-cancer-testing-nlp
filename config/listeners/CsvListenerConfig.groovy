package listeners

import gov.va.vinci.listeners.BasicCsvListener;
fieldList = [
         ["text_id", "0", "varchar(200)"],
        ["Pattern_Text", "-1", "varchar(500)"],
        ["Anchor_Type", "-1", "varchar(100)"],
        ["Anchor_Term", "-1", "varchar(400)"],
        ["Modifier_Type", "-1", "varchar(100)"],
        ["Modifier_Term", "-1", "varchar(300)"],
        ["HGVS_DNA", "-1", "varchar(200)"],
        ["HGVS_Protein", "-1", "varchar(200)"],
        ["Gene_Reference", "-1", "varchar(200)"],
        ["Variant_Type", "-1", "varchar(200)"],
        ["Expression_Value", "-1", "varchar(200)"],
        ["Test_Type", "-1", "varchar(200)"],
        ["Lab_Name", "-1", "varchar(200)"],
        ["Modifier_in_Window", "-1", "varchar(200)"],
       ["Section", "-1", "varchar(300)"],
        ["Anchored_Sentence", "-1", "varchar(5000)"],
        ["SpanStart", "-1", "int"],
        ["SpanEnd", "-1", "int"],
        ["Snippets", "-1", "varchar(5000)"]
]

File filePath = new File("Data\\Output\\outputData.csv")
listener = new BasicCsvListener(filePath, true , fieldList, Biomarker_Pattern.getCanonicalName());
listener.writeHeaders()
