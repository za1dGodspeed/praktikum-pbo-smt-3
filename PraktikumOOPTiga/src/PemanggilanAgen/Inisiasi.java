/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemanggilanAgen;

import PersiapanAgen.*;

/**
 *
 * @author THINKPAD
 */
public class Inisiasi {
    public static void main (String[] args) {
        AgenIntelijen aswin = new AgenIntelijen();
        aswin.setNamaAlias("Cenglu");
        System.out.println(aswin.apel() + ", Aswin diwajibkan untuk hadir");
        System.out.println("Apel akan dilaksanakan di daerah penempatannya, yaitu " + aswin.getPenempatan());
        System.out.println("Nama samaran Aswin dari seniornya adalah " + aswin.getNamaAlias());
        
        
        Digital langgam = new Digital();
        langgam.setNamaAlias("Petruk");
        System.out.println("\n" + langgam.apel("minggu") + ", Langgam mendapat tugas lain sebagai agen digital");
        System.out.println("Tugasnya bersifat " + langgam.getStatusJaga());
        System.out.println("Ada 6 tugas yang harus diselesaikan oleh alias " + langgam.getNamaAlias() + " ini, yaitu:");
        langgam.networkMonitoring();
        langgam.terimaLaporanDigital();
        langgam.dokumentasiData();
        langgam.visualisasiData();
        langgam.auditingPerangkat();
        langgam.testingGabungan();
        
        Physical bondan = new Physical();
        System.out.println("\n" + bondan.apel(7) + ", tugas Bondan masih belum terselesaikan sebagai agen fisikal");
        System.out.println("Alasan utamanya adalah karena tugasnya bersifat " + bondan.getStatusJaga());
        System.out.println("Selain itu, ada 6 tugas yang menjadi kewajiban dalam penyamarannya, yaitu:");
        bondan.pickupOrder();
        bondan.mangkal();
        bondan.menggila();
        bondan.berubahKepribadian();
        bondan.menjadwalMeeting();
        bondan.mengantar();
        
        
        
        // kurang sout dan pemanggilan method interface dan method apel dan super
        // semangat untuk dirimu sendiri
        // aku tahu bahwa ini berat
        // tapi ingat jika dahulu semuanya lebih dari ini
        // tangis, sedih, dan kecewa
        // rasanya harapan adalah dongeng belaka
        // jadi ini rasanya lebih baik dan lebih cukup
        // untuk membuat dirimu bersyukur
        // jangan lupa,
        // ini perjalanan jarak jauh,
        // bukan perjalanan singkat.
        // jalani saja prosesnya, hasil akhir adalah hadiah.
        // with love from yourself, Yuna.
    }
}