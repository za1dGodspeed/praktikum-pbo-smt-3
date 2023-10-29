/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Desa;

/**
 *
 * @author THINKPAD
 */
public class Penduduk {

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    private String nama;
    private int umur;
    private String pekerjaan;
        
    public Penduduk(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public Penduduk() {
        this.pekerjaan = "Petani";
    }

    public Penduduk(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }
    
    public Penduduk(String nama, String pekerjaan, int umur) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.umur = umur;
    }

}
