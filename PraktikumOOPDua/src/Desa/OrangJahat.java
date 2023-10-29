/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desa;

/**
 *
 * @author THINKPAD
 */
public class OrangJahat extends Penduduk {

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
     * @return the kriminal
     */
    public boolean isKriminal() {
        return kriminal;
    }

    /**
     * @param kriminal the kriminal to set
     */
    public void setKriminal(boolean kriminal) {
        this.kriminal = kriminal;
    }

    private boolean kriminal;
    private String watak;

    public OrangJahat(String watak) {
        this.watak = watak;
    }
    public OrangJahat() {
        super("Maling");
        this.kriminal = true;
    }

    public OrangJahat(String nama, int umur) {
        super(44, "Jordinho");
    }

    public OrangJahat(int umur, String pekerjaan, String nama) {
        super("Kleminho", "Penembak Jitu", 50);
    }

}
