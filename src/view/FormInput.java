package view;

import controller.HitungBiayaSewa;
import model.enums.TipeSupir;

import javax.swing.*;

public class FormInput {
    public void inputData() {
        String merk = JOptionPane.showInputDialog("1. Mustibisha\n2. Toyomba\n3. LemperGember\nPilih merk mobil (input merk) : ");
        int hari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan durasi sewa (dalam hari)"));
        double sewa = new HitungBiayaSewa().hitungBiayaSewa(merk, hari);
        JOptionPane.showMessageDialog(null, "Merk mobil        : " + merk + "\nLama sewa          : " + hari + "\nTotal harga sewa   : " + sewa );
    }

    public boolean banSerep() {
        boolean serep = Boolean.parseBoolean(JOptionPane.showInputDialog("Pakai ban serep?"));
        return serep;
    }

    public boolean supir() {
        boolean supir = Boolean.parseBoolean(JOptionPane.showInputDialog("Pakai supir?"));
        return supir;
    }

    public int pilihSupir() {
        int supir = Integer.parseInt(JOptionPane.showInputDialog("1. Biasa\n2. Profesional\nPilih supir"));
        return supir;
    }

    public TipeSupir tipeSupir(int i) {
        if (i == 1) {
            return TipeSupir.BIASA;
        }
        if (i == 2) {
            return TipeSupir.PROFESIONAL;
        }
        return null;
    }
}
