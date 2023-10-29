/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desa;

/**
 *
 * @author THINKPAD
 */
public class Gangster extends OrangJahat {

    /**
     * @return the geng
     */
    public String getGeng() {
        return geng;
    }

    /**
     * @param geng the geng to set
     */
    public void setGeng(String geng) {
        this.geng = geng;
    }

    private String geng;

    public Gangster() {
        super("Jahat");
        this.geng = "Dumb Public Rebellion";
    }

    public Gangster(int umur, String nama) {
        super("Shumboo", 19);
    }

    public Gangster(String pekerjaan, String nama, int umur) {
        super(21,"Mucikari", "Dugong");
    }

}
