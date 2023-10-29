/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author THINKPAD
 */
public class DatabaseConnection {

    // Belum membuat close connection
    // Informasi koneksi database
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/DBL_A_M4_09010622015";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "20040228";

    // Metode untuk membuat koneksi ke database
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Metode untuk melakukan SELECT dari tabel mata kuliah
    public static void selectData() {
        try (Connection connection = connect(); Statement statement = connection.createStatement()) {
            String sql = "SELECT * FROM mata_kuliah";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String kodeMataKuliah = resultSet.getString("kode_mata_kuliah");
                String namaMataKuliah = resultSet.getString("nama_mata_kuliah");
                int sks = resultSet.getInt("sks");
                int semester = resultSet.getInt("semester");
                String kodeJenis = resultSet.getString("kodejenis");
                System.out.println("Kode Mata Kuliah: " + kodeMataKuliah);
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah);
                System.out.println("Bobot SKS: " + sks);
                System.out.println("Semester: " + semester);
                System.out.println("Jenis Mata Kuliah: " + kodeJenis + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metode untuk melakukan INSERT data ke tabel mata kuliah
    public static void insertData(String kodeMataKuliah, String namaMataKuliah, int sks, int semester, String kodeJenis) {
        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO mata_kuliah (kode_mata_kuliah, nama_mata_kuliah, sks, semester, kodejenis) VALUES (?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, kodeMataKuliah);
            preparedStatement.setString(2, namaMataKuliah);
            preparedStatement.setInt(3, sks);
            preparedStatement.setInt(4, semester);
            preparedStatement.setString(5, kodeJenis);
            preparedStatement.executeUpdate();

            System.out.println("Data berhasil ditambahkan!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metode untuk melakukan UPDATE data di tabel mata kuliah berdasarkan kode mata kuliah
    public static void updateData(String kodeMataKuliah, String namaMataKuliah, int sks, int semester, String kodeJenis) {
        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE mata_kuliah SET nama_mata_kuliah = ?, sks = ?, semester = ?, kodejenis = ? WHERE kode_mata_kuliah = ?")) {

            preparedStatement.setString(1, namaMataKuliah);
            preparedStatement.setInt(2, sks);
            preparedStatement.setInt(3, semester);
            preparedStatement.setString(4, kodeJenis);
            preparedStatement.setString(5, kodeMataKuliah);
            preparedStatement.executeUpdate();

            System.out.println("Data berhasil diperbarui!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metode untuk melakukan DELETE data di tabel mata kuliah berdasarkan kode mata kuliah
    public static void deleteData(String kodeMataKuliah) {
        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(
                "DELETE FROM mata_kuliah WHERE kode_mata_kuliah = ?")) {

            preparedStatement.setString(1, kodeMataKuliah);
            preparedStatement.executeUpdate();

            System.out.println("Data berhasil dihapus!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan:
//        selectData();
//         insertData("A0013005", "Senam Bugar OOP", 6, 9,"MPK");   
//         updateData("A0013005", "Kultum (Koding Lulus Tujuh Menit)", 1, 1,"MKK");
//         deleteData("A0013005");
    }
}
