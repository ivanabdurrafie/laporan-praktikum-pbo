/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Ivan Abdurrafie
 */
import java.sql.*;

public class DBHelper1841720099Rafi {

    private static Connection koneksi;

    public static void bukaKoneksiRafi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/db_perpus?useUnicode=true"
                        + "&useJDBCCompliantTimezoneShift=true"
                        + "&useLegacyDatetimeCode=false&serverTimezone=UTC";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi " + t);
            }
        }
    }

    public static int insertQueryGetIdRafi(String query) {
        bukaKoneksiRafi();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = koneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQueryRafi(String query) {
        bukaKoneksiRafi();
        boolean result = false;

        try {
            Statement statement = koneksi.createStatement();
            statement.executeUpdate(query);
            result = true;
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQueryRafi(String query) {
        bukaKoneksiRafi();
        ResultSet rs = null;

        try {
            Statement stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

}
