/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersiapanAgen;

/**
 *
 * @author THINKPAD
 */
public class AgenIntelijen {

    /**
     * @return the penempatan
     */
    public String getPenempatan() {
        return penempatan;
    }

    /**
     * @param penempatan the penempatan to set
     */
    public void setPenempatan(String penempatan) {
        this.penempatan = penempatan;
    }

    /**
     * @return the namaAlias
     */
    public String getNamaAlias() {
        return namaAlias;
    }

    /**
     * @param namaAlias the namaAlias to set
     */
    public void setNamaAlias(String namaAlias) {
        this.namaAlias = namaAlias;
    }

    /**
     * @return the statusTugas
     */
    public String getStatusJaga() {
        return statusJaga;
    }

    /**
     * @param statusJaga the statusTugas to set
     */
    public void setStatusJaga(String statusJaga) {
        this.statusJaga = statusJaga;
    }

    /**
     * @return the jadwalJaga
     */
    public String getJadwalKerja() {
        return jadwalKerja;
    }

    /**
     * @param jadwalKerja the jadwalJaga to set
     */
    public void setJadwalKerja(String jadwalKerja) {
        this.jadwalKerja = jadwalKerja;
    }
    private String penempatan = "Kantor Badan Intelijen Negara";
    private String namaAlias;
    private String statusJaga;
    private String jadwalKerja;
    
    public String apel() {
        return "Konfirmasi waktu belum diterima, namun dapat dipastikan akan ada apel";
    }
    
    public String apel(String hari) {
        return "Konfirmasi waktu diterima, apel akan diadakan pada hari " + hari;
    }
    
    public String apel(int pukul) {
        return "Konfirmasi waktu diterima, apel akan diadakan hari ini, pada pukul " + pukul;
    }
}
