/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersiapanAgen;

/**
 *
 * @author THINKPAD
 */
public class Physical extends AgenIntelijen implements OjekOnline, OrangGangguanJiwa, AsistenPejabat{
    public void setStatusJaga(String statusJaga) {
        super.setStatusJaga("On-Site");
    }
    
    public Physical() {
        this.setStatusJaga("On-Site");
    }

    @Override
    public void pickupOrder() {
        System.out.println("Mengambil pesanan...");
    }

    @Override
    public void mangkal() {
        System.out.println("Mangkal untuk memantau pergerakan...");
    }

    @Override
    public void menggila() {
        System.out.println("Berpura-pura berperilaku gila agar tidak ketahuan...");
    }

    @Override
    public void berubahKepribadian() {
        System.out.println("Menjadi berbeda dari kepribadian sebelumnya...");
    }

    @Override
    public void menjadwalMeeting() {
        System.out.println("Mengatur jadwal meeting atasan...");
    }

    @Override
    public void mengantar() {
        System.out.println("Mengantarkan atasan ke tempat meeting...");
    }
    
    
    
}
