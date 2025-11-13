package Backend;


import java.sql.*;

class DBHelper {
    private static Connection koneksi;

    public static void bukakoneksi() {
        if (koneksi == null) {
            try {
                
                String url = "jdbc:mysql://localhost:3306/dbperpus"; 
                String user = "root";
                String password = "root"; 

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error koneksi!"); // 
            }
        }
    }

    public static int insertQueryGetId(String query) {
        bukakoneksi();
        int num = 0;
        int result = -1;

        try {
            Statement stmt = koneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); // 

            ResultSet rs = stmt.getGeneratedKeys(); // 
            if (rs.next()) {
                result = rs.getInt(1); // 
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQuery(String query) {
        bukakoneksi();
        boolean result = false;

        try {
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(query); // 
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) {
        bukakoneksi();
        ResultSet rs = null;

        try {
            Statement stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query); // 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }


    public static void main(String[] args) {
        System.out.println("Mencoba koneksi ke database...");
        bukakoneksi(); 

        if (koneksi != null) {
            System.out.println("Koneksi BERHASIL!");
            try {
                koneksi.close(); // Tutup koneksi setelah selesai tes
                System.out.println("Koneksi ditutup.");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi.");
            }
        } else {
            System.out.println("Koneksi GAGAL!");
        }
    }
}
