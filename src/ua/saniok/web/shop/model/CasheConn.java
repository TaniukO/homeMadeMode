package ua.saniok.web.shop.model;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by sAnCho on 01.08.2016.
 */
public final class CasheConn {
    private static ComboPooledDataSource cpdsR;
    private static ComboPooledDataSource cpdsU;
    private static ComboPooledDataSource cpdsG;


    private static void getDataSourceRoot() throws PropertyVetoException
    {
        if (cpdsR == null) {
            cpdsR = new ComboPooledDataSource();
            cpdsR.setDriverClass("com.mysql.jdbc.Driver");
            cpdsR.setUser("saniok");
            cpdsR.setPassword("saniokPassword");
            cpdsR.setJdbcUrl("jdbc:mysql://localhost:3306/saniok_siteshop?characterEncoding=UTF-8&useSSL=false");

            // Optional Settings
            cpdsR.setInitialPoolSize(1);
            cpdsR.setMinPoolSize(1);
            cpdsR.setAcquireIncrement(1);
            cpdsR.setMaxPoolSize(5);

        }
    }


    private static void getDataSourceUser() throws PropertyVetoException
    {
        if (cpdsU == null) {
            cpdsU = new ComboPooledDataSource();
            cpdsU.setDriverClass("com.mysql.jdbc.Driver");
            cpdsU.setJdbcUrl("jdbc:mysql://localhost:3306");
            cpdsU.setUser("userTest");
            cpdsU.setPassword("userPassword");

            // Optional Settings
            cpdsU.setInitialPoolSize(5);
            cpdsU.setMinPoolSize(5);
            cpdsU.setAcquireIncrement(5);
            cpdsU.setMaxPoolSize(20);
            cpdsU.setMaxStatements(100);
        }
    }

    private static void getDataSourceGuest() throws PropertyVetoException
    {
        if (cpdsG == null) {
            cpdsG = new ComboPooledDataSource();
            cpdsG.setDriverClass("com.mysql.jdbc.Driver");
            cpdsG.setJdbcUrl("jdbc:mysql://localhost:3306");
            cpdsG.setUser("guestTest");
            cpdsG.setPassword("guestPassword");

            // Optional Settings
            cpdsG.setInitialPoolSize(5);
            cpdsG.setMinPoolSize(5);
            cpdsG.setAcquireIncrement(5);
            cpdsG.setMaxPoolSize(100);
            cpdsG.setMaxStatements(500);
        }
    }
    public static Connection getConnectionRoot() throws SQLException {
        if(cpdsR!=null)
            return cpdsR.getConnection();
        else{
            try {
                getDataSourceRoot();
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            }
            return cpdsR.getConnection();
        }
    }

    public static Connection getConnectionUser() throws SQLException {
        if(cpdsU!=null)
            return cpdsU.getConnection();
        else {
            try {
                getDataSourceUser();
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            }
            return cpdsU.getConnection();
        }
    }
    public static Connection getConnectionGuest() throws SQLException {
        if(cpdsG!=null)
            return cpdsG.getConnection();
        else{
            try {
                getDataSourceGuest();
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            }
            return cpdsG.getConnection();
        }
    }
}
