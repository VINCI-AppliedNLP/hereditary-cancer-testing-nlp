package readers
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
String url = "jdbc:sqlserver://<your_server>:1433;databasename=<your_database>;integratedSecurity=true"

//Use the batch processing Reader when there are more notes than your memory can hold
String query = ''' Select DocumentID, reporttext, rowno From
 [input].[denominator_notes]  where reporttext is not null
 '''


reader = new gov.va.vinci.leo.cr.DatabaseCollectionReader(driver, url,
        "", "", query, "tiudocumentsid","reporttext"
);