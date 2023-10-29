/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanconstructor;

/**
 *
 * @author bayu
 */
public class MakhlukHidup {

    public MakhlukHidup() {
        this.jenisMakanan = "sembarang";
    }

    public MakhlukHidup(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the spesies
     */
    public String getSpesies() {
        return spesies;
    }

    /**
     * @param spesies the spesies to set
     */
    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @param jenisMakanan the jenisMakanan to set
     */
    private String nama;
    private String spesies;
    protected String jenisMakanan;
    /**
     * @param args the command line arguments
     */

}
