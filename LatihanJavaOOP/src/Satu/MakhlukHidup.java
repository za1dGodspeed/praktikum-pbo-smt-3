/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Satu;

/**
 *
 * @author bayu
 */
public class MakhlukHidup {

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
     * @return the alatPernapasan
     */
    public String getAlatPernapasan() {
        return alatPernapasan;
    }

    /**
     * @param alatPernapasan the alatPernapasan to set
     */
    public void setAlatPernapasan(String alatPernapasan) {
        this.alatPernapasan = alatPernapasan;
    }

    /**
     * @return the reproduksi
     */
    public String getReproduksi() {
        return reproduksi;
    }

    /**
     * @param reproduksi the reproduksi to set
     */
    public void setReproduksi(String reproduksi) {
        this.reproduksi = reproduksi;
    }

    /**
     * @return the makanan
     */
    public String getMakanan() {
        return makanan;
    }

    /**
     * @param makanan the makanan to set
     */
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    /**
     * @return the caraBergerak
     */
    public String getCaraBergerak() {
        return caraBergerak;
    }

    /**
     * @param caraBergerak the caraBergerak to set
     */
    public void setCaraBergerak(String caraBergerak) {
        this.caraBergerak = caraBergerak;
    }

    /**
     * @return the tempatHidup
     */
    public String getTempatHidup() {
        return tempatHidup;
    }

    /**
     * @param tempatHidup the tempatHidup to set
     */
    public void setTempatHidup(String tempatHidup) {
        this.tempatHidup = tempatHidup;
    }

    private String nama;
    private String alatPernapasan;
    private String reproduksi;
    private String makanan;
    private String caraBergerak;
    private String tempatHidup;
    
    protected String bernafas() {
        return "Aku Bernafas";
    }
}
