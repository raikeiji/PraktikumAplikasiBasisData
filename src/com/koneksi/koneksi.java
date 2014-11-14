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

//    private String username, password, url;
//    masuk m = new masuk();
//    String url2 = "jdbc:Oracle:thin:@" + m.getString_url() + ":1521:orcl";
//    String userid = m.getString_username();
//    String userpassword = m.getString_password();
    public static Connection getkoneksi(String userid, String userpassword, String url) {
//        String url = "jdbc:Oracle:thin:@172.23.9.185:1521:orcl";
//        String userid = "mhs125314112";
//        String userpassword = "mhs125314112";

//        String url = "jdbc:Oracle:thin:@localhost:1521:xe";
//        String userid = "hr";
//        String userpassword = "hr";
        Connection conn = null;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(url);
            conn = ds.getConnection(userid, userpassword);
//            conn = ds.getConnection(m.getString_username(), m.getString_password());
//            System.out.println("koneksi berhasil");
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

//        String url = "jdbc:Oracle:thin:@localhost:1521:xe";
//        String userid = "hr";
//        String userpassword = "hr";
        Connection conn = null;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(url);
            conn = ds.getConnection(userid, userpassword);
//            conn = ds.getConnection(m.getString_username(), m.getString_password());
//            System.out.println("koneksi berhasil");
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("error pada " + e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
//        koneksi k = new koneksi();
//        getkoneksi();
    }
}
