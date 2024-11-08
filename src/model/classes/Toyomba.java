package model.classes;

public class Toyomba extends Mobil {
    private double hargaBanSerep;
    private double hargaPakaiSupir;

    public Toyomba() {
        this.setNama("Toyomba");
        this.setHarga(4500);
        this.hargaBanSerep = hargaBanSerep;
        this.hargaPakaiSupir = hargaPakaiSupir;
    }

    public double getHargaBanSerep() {
        return hargaBanSerep;
    }

    public void setHargaBanSerep(double hargaBanSerep) {
        this.hargaBanSerep = hargaBanSerep;
    }

    public double getHargaPakaiSupir() {
        return hargaPakaiSupir;
    }

    public void setHargaPakaiSupir(double hargaPakaiSupir) {
        this.hargaPakaiSupir = hargaPakaiSupir;
    }
}
