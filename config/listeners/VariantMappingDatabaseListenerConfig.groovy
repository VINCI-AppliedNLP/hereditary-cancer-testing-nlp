package listeners



import gov.va.vinci.leo.sentence.types.AnchoredSentence
import gov.va.vinci.listeners.BasicDatabaseListener
import gov.va.vinci.leo.tools.LeoUtils
import gov.va.vinci.types.Biomarker_Pattern
import gov.va.vinci.types.Simple_Pattern
import gov.va.vinci.types.Variant_Mapping_Pattern


int batchSize = 1000
String url = "jdbc:sqlserver://<your_server>:1433;databasename=<your_database>;integratedSecurity=true"

String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
String dbUser = ""
String dbPwd = ""

String dbsName = "<your_database>"
String timeStamp = LeoUtils.getTimestampDateUnderscoreTime().substring(0, 8);

String tableName =   "[nlp].[germline_gene_output]"

fieldList = [

        ["text_id", "0", "varchar(200)"],
        ["Pattern_Text", "-1", "varchar(500)"],
        ["Anchor_Type", "-1", "varchar(100)"],
        ["Anchor_Term", "-1", "varchar(400)"],
        ["Gene_Name", "-1", "varchar(200)"],
        ["HGVS_DNA", "-1", "varchar(200)"],
        ["HGVS_Protein", "-1", "varchar(200)"],
        ["Gene_Reference", "-1", "varchar(200)"],
        ["SpanStart", "-1", "int"],
        ["SpanEnd", "-1", "int"],
        ["Snippets", "-1", "varchar(5000)"]
]

boolean dropExisting = true;
listener = BasicDatabaseListener.createNewListener(driver, url, dbUser, dbPwd, dbsName,
        tableName, batchSize, fieldList,

        Variant_Mapping_Pattern.getCanonicalName()
        )

//create table
listener.createTable(dropExisting)

