import gov.va.vinci.leo.cr.BatchDatabaseCollectionReader;

String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

String url = "jdbc:sqlserver://<your_server>:1433;databasename=<your_database>;integratedSecurity=true"

// keep username and password blank for Windows authentication
String username = "";
String password = "";


String query = '''Select DocumentID, reporttext, rowno From
 [input].[denominator_notes] 
 where   rowno >{min} and rowno<{max}
'''

String docIDColumnName = "rowno"
String docTextColumnName = "reporttext"
//1,114,034 Total notes processed in the CRPC cohort
int startingIndex = 0;
int endingIndex = 1200000;
int batchSize = 50000;


reader = new BatchDatabaseCollectionReader(dbDriver, url ,
        "", "",
        query,
        docIDColumnName.toLowerCase(),
        docTextColumnName.toLowerCase(),
        startingIndex, endingIndex,
        batchSize);

