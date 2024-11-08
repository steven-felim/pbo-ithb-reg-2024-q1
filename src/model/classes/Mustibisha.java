package model.classes;

public class Mustibisha extends Mobil {
    private boolean banSerep;
    private double hargaBanSerep;

    public Mustibisha(String nama, double harga, boolean banSerep, double hargaBanSerep) {
        super(nama, harga);
        this.setNama("Mustibisha");
        this.setHarga(3000);
        this.banSerep = banSerep;
        this.hargaBanSerep = hargaBanSerep;
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
}
