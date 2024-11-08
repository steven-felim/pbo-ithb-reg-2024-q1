package model.classes;

import model.enums.TipeSupir;

public class Lempergember extends Mobil {
    private boolean banSerep;
    private double hargaBanSerep;
    private boolean pakaiSupir;
    private TipeSupir tipeSupir;
    private double hargaPakaiSupir;

    public Lempergember(String nama, double harga, boolean banSerep, double hargaBanSerep, boolean pakaiSupir, TipeSupir tipeSupir, double hargaPakaiSupir) {
        super(nama, harga);
        this.setNama("Lempergember");
        this.setHarga(5000);
        this.banSerep = banSerep;
        this.hargaBanSerep = hargaBanSerep;
        this.pakaiSupir = pakaiSupir;
        this.tipeSupir = tipeSupir;
        this.hargaPakaiSupir = hargaPakaiSupir;
    }

    public boolean isBanSerep() {
        return banSerep;
    }

    public void setBanSerep(boolean banSerep) {
        this.banSerep = banSerep;
    }

    public double getHargaBanSerep() {
        return hargaBanSerep;
    }

    public void setHargaBanSerep(double hargaBanSerep) {
        this.hargaBanSerep = hargaBanSerep;
    }

    public boolean isPakaiSupir() {
        return pakaiSupir;
    }

    public void setPakaiSupir(boolean pakaiSupir) {
        this.pakaiSupir = pakaiSupir;
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
