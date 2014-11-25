/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author admiin
 */
public class koneksi {

    public static Connection getkoneksi(String userid, String userpassword, String url) {
        Connection conn = null;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL("jdbc:Oracle:thin:@"+url+":1521:xe");
            conn = ds.getConnection(userid, userpassword);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("error pada " + e.getMessage());
        }
        return conn;
    }
    
     public static Connection getkoneksi2() {
        String url = "jdbc:Oracle:thin:@localhost:1521:xe";
        String userid = "hr";
        String userpassword = "hr";

        Connection conn = null;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(url);
            conn = ds.getConnection(userid, userpassword);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("error pada " + e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        getkoneksi2();
    }
}
