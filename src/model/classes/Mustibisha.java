package model.classes;

public class Mustibisha extends Mobil {
    private double hargaBanSerep;

    public Mustibisha() {
        this.setNama("Mustibisha");
        this.setHarga(3000);
    }

    public double getHargaBanSerep() {
        return hargaBanSerep;
    }

    public void setHargaBanSerep(double hargaBanSerep) {
        this.hargaBanSerep = hargaBanSerep;
    }
}
