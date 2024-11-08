package model.classes;

public abstract class Mobil {
    private String nama;
    private double harga;

    public Mobil() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String toString() {
        return "Merk             : " + getNama() + "\nHarga            :  " + getHarga();
    }
}
