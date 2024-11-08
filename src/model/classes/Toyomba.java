package model.classes;

public class Toyomba extends Mobil {
    private boolean banSerep;
    private double hargaBanSerep;
    private boolean pakaiSupir;
    private double hargaPakaiSupir;

    public Toyomba(String nama, double harga, boolean banSerep, double hargaBanSerep, boolean pakaiSupir, double hargaPakaiSupir) {
        super(nama, harga);
        this.setNama("Toyomba");
        this.setHarga(4500);
        this.banSerep = banSerep;
        this.hargaBanSerep = hargaBanSerep;
        this.pakaiSupir = pakaiSupir;
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

    public double getHargaPakaiSupir() {
        return hargaPakaiSupir;
    }

    public void setHargaPakaiSupir(double hargaPakaiSupir) {
        this.hargaPakaiSupir = hargaPakaiSupir;
    }
}
