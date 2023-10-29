 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Satu;

/**
 *
 * @author THINKPAD
 */
public class MainClass {
    public static void main(String[] args) {
        Vertebrata bebek = new Vertebrata();
        bebek.setNama("Cinnamon");
        bebek.setTempatHidup("Darat");
        bebek.setReproduksi("Bertelur");
        bebek.setMakanan("Omnivora");
        bebek.setKelompok("Aves");
        bebek.setJumlahKaki(2);
        bebek.setCaraBergerak("Kaki");
        bebek.setAlatPernapasan("Paru-paru");
        
        System.out.print("Halo semuanya, perkenalkan namaku " + bebek.getNama());
        System.out.print(". Aku adalah hewan vertebrata yang hidup di " + bebek.getTempatHidup());
        System.out.print(". Kelompokku dikenal dengan nama " + bebek.getKelompok());
        System.out.print(". Aku berkembangbiak dengan cara " + bebek.getReproduksi());
        System.out.print(".\nPorsi makanku nggak banyak, sih. Tapi entah kenapa aku doyan semua jenis makanan, oleh karena itu aku juga dikategorikan sebagai hewan " + bebek.getMakanan());
        System.out.print(".\nAku bernafas menggunakan " + bebek.getAlatPernapasan());
        System.out.print(" dan bergerak menggunakan " + bebek.getCaraBergerak());
        System.out.print(" sejumlah " + bebek.getJumlahKaki() + ".\n");
        
        System.out.println(bebek.bernafas());
    }
}
