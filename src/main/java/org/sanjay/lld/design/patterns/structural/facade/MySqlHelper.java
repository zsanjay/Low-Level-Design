package org.sanjay.lld.design.patterns.structural.facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        // get data from the table and generate PDF report
    }

    public void generateMySqlHTMLReport(String tableName, Connection connection) {
        // get data from table and generate pdf report
    }
}
