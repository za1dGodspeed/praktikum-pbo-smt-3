/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desa;

/**
 *
 * @author THINKPAD
 */
public class OrangBaik extends Penduduk {

    /**
     * @return the watak
     */
    public String getWatak() {
        return watak;
    }

    /**
     * @param watak the watak to set
     */
    public void setWatak(String watak) {
        this.watak = watak;
    }

    /**
     * @return the religius
     */
    public boolean isReligius() {
        return religius;
    }

    /**
     * @param religius the religius to set
     */
    public void setReligius(boolean religius) {
        this.religius = religius;
    }

    private boolean religius;
    private String watak;

    public OrangBaik() {
        super("Nelayan");
        this.religius = true;
    }

    public OrangBaik(int umur, String nama) {
        super(19, "Asep");
    }

    public OrangBaik(String nama, String pekerjaan, int umur) {
        super("Uzumaki", "Kuli", 20);
    }
    
    public OrangBaik(String watak) {
        this.watak = watak;
    }

}
