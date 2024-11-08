package controller;

import model.classes.*;
import model.enums.TipeSupir;
import view.FormInput;

import static model.enums.TipeSupir.*;

public class HitungBiayaSewa {
    FormInput form = new FormInput();
    public double hitungBiayaSewa(String merk, int hari) {
        Mustibisha m = new Mustibisha();
        Toyomba t = new Toyomba();
        Lempergember l = new Lempergember();


        double sewa = 0.0;

        if (merk.equalsIgnoreCase(m.getNama())) {
            sewa = hitungMustibisha(hari, sewa);
            return sewa;
        }
        if (merk.equalsIgnoreCase(t.getNama())) {
            sewa = hitungToyomba(hari, sewa);
            return sewa;
        }
        if (merk.equalsIgnoreCase(l.getNama())) {
            sewa = hitungLempergember(hari, sewa);
            return sewa;
        }
        return sewa;
    }

    public double hitungMustibisha(int hari, double sewa) {
        Mustibisha m = new Mustibisha();

        sewa = m.getHarga() * hari;
        boolean banSerep = form.banSerep();
        if (banSerep) {
            m.setHargaBanSerep(0.05 * m.getHarga());
            sewa += m.getHargaBanSerep();
        }
        return sewa;
    }

    public double hitungToyomba(int hari, double sewa) {
        Toyomba t = new Toyomba();

        sewa = t.getHarga() * hari;
        boolean banSerep = form.banSerep();
        if (banSerep) {
            t.setHargaBanSerep(0.03 * t.getHarga());
            sewa += t.getHargaBanSerep();
        }
        boolean pakaiSupir = form.supir();
        if (pakaiSupir) {
            if (hari > 5) {
                t.setHargaPakaiSupir(0.07 * t.getHarga());
            } else {
                t.setHargaPakaiSupir(0.08 * t.getHarga());
            }
            sewa += t.getHargaPakaiSupir();
        }
        return sewa;
    }

    public double hitungLempergember(int hari, double sewa) {
        Lempergember l = new Lempergember();

        sewa = l.getHarga() * hari;
        l.setHargaBanSerep(0);
        boolean pakaiSupir = form.supir();
        if (pakaiSupir) {
            int pilihSupir = form.pilihSupir();
            TipeSupir tipeSupir = form.tipeSupir(pilihSupir);
            if (tipeSupir == BIASA) {
                l.setHargaPakaiSupir(0.07 * l.getHarga());
            } else if (tipeSupir == PROFESIONAL) {
                l.setHargaPakaiSupir(0.1 * l.getHarga());
            }
            sewa += l.getHargaPakaiSupir();
        }
        return sewa;
    }
}
