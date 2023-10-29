/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersiapanAgen;

/**
 *
 * @author THINKPAD
 */
public class Digital extends AgenIntelijen implements AdminCyber, PengolahData, PengujiSistem{
    public void setStatusJaga(String statusJaga) { // dalam kode ini, jika menggunakan parameter berarti method turunan, jika tidak, berarti method deklarasi baru//
        super.setStatusJaga("Hybrid");
    }
    
    public Digital() {
        this.setStatusJaga("Hybrid");
    }

    @Override
    public void networkMonitoring() {
        System.out.println("Melakukan pemantauan jaringan antar agen...");
    }

    @Override
    public void terimaLaporanDigital() {
        System.out.println("Menerima laporan digital dari agen...");
    }

    @Override
    public void dokumentasiData() {
        System.out.println("Melakukan pengarsipan data yang telah diterima...");
    }

    @Override
    public void visualisasiData() {
        System.out.println("Melakukan visualisasi data agar dapat menunjang keputusan intelijen...");
    }

    @Override
    public void auditingPerangkat() {
        System.out.println("Melakukan inspeksi dan perawatan terhadap perangkat intelijen yang digunakan oleh agen...");
    }

    @Override
    public void testingGabungan() {
        System.out.println("Melakukan pengujian perangkat dengan divisi lain...");
    }
    
    
}
