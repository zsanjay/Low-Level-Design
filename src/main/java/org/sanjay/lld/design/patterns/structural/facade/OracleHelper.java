package org.sanjay.lld.design.patterns.structural.facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection() {
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        // get data from the table and generate PDF report
    }

    public void generateOracleHTMLReport(String tableName, Connection connection) {
        // get data from table and generate pdf report
    }
}
