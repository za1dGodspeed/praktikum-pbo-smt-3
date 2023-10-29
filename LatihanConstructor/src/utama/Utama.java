/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import latihanconstructor.Herbivora;
import latihanconstructor.Hewan;

/**
 *
 * @author bayu
 */
public class Utama {

    public static void main(String[] args) {
        // TODO code application logic here
        Herbivora sapi = new Herbivora();
        sapi.setNama("sapi");
        Herbivora kambing = new Herbivora("empal goreng");
        kambing.setNama("kambing");
        Hewan hiu = new Hewan();
        hiu.setNama("hiu");

        System.out.println("Nama saya " + sapi.getNama() + " , makan saya " + sapi.getJenisMakanan());
        System.out.println("Nama saya " + kambing.getNama() + " , makan saya " + kambing.getJenisMakanan());
        System.out.println("Nama saya " + hiu.getNama() + " , makan saya " + hiu.getJenisMakanan());

    }
}
