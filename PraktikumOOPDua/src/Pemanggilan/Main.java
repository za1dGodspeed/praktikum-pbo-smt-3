/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemanggilan;

import Desa.*;

/**
 *
 * @author THINKPAD
 */
public class Main {
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        Penduduk langgam = new Penduduk();
        langgam.setNama("Langgam");
        System.out.println("Aku adalah " + langgam.getNama() + ", pekerjaanku " + langgam.getPekerjaan());

        OrangBaik cipto = new OrangBaik();
        cipto.setNama("Beta");
        System.out.println("\nAku adalah " + cipto.getNama() + ", pekerjaanku " + cipto.getPekerjaan());
        System.out.println("Apakah " + cipto.getNama() + " religius? " + cipto.isReligius());

        Santri aswin = new Santri();
        aswin.setNama("Aswin");
        System.out.println("\nAku adalah " + aswin.getNama() + ", aku memiliki watak " + aswin.getWatak());
        System.out.println("Sekarang aku mondok di "+ aswin.getPesantren());

        OrangJahat panjul = new OrangJahat();
        panjul.setNama("Panjul");
        System.out.println("\nAku adalah " + panjul.getNama() + ", pekerjaanku " + panjul.getPekerjaan());
        System.out.println("Apakah " + panjul.getNama() + " kriminal? " + panjul.isKriminal());

        Gangster bendot = new Gangster();
        bendot.setNama("Bendot");
        System.out.println("\nAku adalah " + bendot.getNama() + ", aku memiliki watak " + bendot.getWatak());
        System.out.println("Sekarang aku menjadi anggota geng di "+ bendot.getGeng());
    }

}
