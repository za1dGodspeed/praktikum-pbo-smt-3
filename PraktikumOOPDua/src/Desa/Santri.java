/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desa;

/**
 *
 * @author THINKPAD
 */
public class Santri extends OrangBaik {

    /**
     * @return the pesantren
     */
    public String getPesantren() {
        return pesantren;
    }

    /**
     * @param pesantren the pesantren to set
     */
    public void setPesantren(String pesantren) {
        this.pesantren = pesantren;
    }

    private String pesantren;
    

    public Santri() {
        super("Baik");
        this.pesantren = "Pondok Candra";
    }

    public Santri(String nama, int umur) {
        super(21, "Rando");
    }

    public Santri(int umur, String pekerjaan, String nama) {
        super("Robet", "Pengurus", 20);
    }

}