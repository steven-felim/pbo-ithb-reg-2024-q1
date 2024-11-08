package model.classes;

import model.enums.TipeSupir;

public class Lempergember extends Mobil {
    private double hargaBanSerep;
    private TipeSupir tipeSupir;
    private double hargaPakaiSupir;

    public Lempergember() {
        this.setNama("Lempergember");
        this.setHarga(5000);
        this.hargaBanSerep = hargaBanSerep;
        this.tipeSupir = tipeSupir;
        this.hargaPakaiSupir = hargaPakaiSupir;
    }

    public double getHargaBanSerep() {
        return hargaBanSerep;
    }

    public void setHargaBanSerep(double hargaBanSerep) {
        this.hargaBanSerep = hargaBanSerep;
    }

    public TipeSupir getTipeSupir() {
        return tipeSupir;
    }

    public void setTipeSupir(TipeSupir tipeSupir) {
        this.tipeSupir = tipeSupir;
    }

    public double getHargaPakaiSupir() {
        return hargaPakaiSupir;
    }

    public void setHargaPakaiSupir(double hargaPakaiSupir) {
        this.hargaPakaiSupir = hargaPakaiSupir;
    }
}
