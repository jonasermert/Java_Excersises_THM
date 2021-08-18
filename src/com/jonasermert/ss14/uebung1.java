package com.jonasermert.ss14;

import de.thm.adUebung.uebung.GrowingArray;
import de.thm.adUebung.uebung.Uebung1;

/**
 * Loesung zur Testat-Uebung 1.
 *
 */
public class LoesungUebung1 extends Uebung1 {

    @Override
    public String getTHMBenutzerkennung() {
        return null;
    }

    @Override
    public String getVorname() {
        return null;
    }

    @Override
    public String getNachname() {
        return null;
    }

    // -------------- die �bungsaufgaben -------------- //

    @Override
    public int ueb1aufg1(int x) {
        int count = 0;

        while (x > 0) {
            x = x / 10;
            count++;
        }
        System.out.println("Aufgegessen");
        return count;
    }

    @Override
    public GrowingArray ueb1aufg2() {
        GrowingArray ga = new GrowingArray() {

            @Override
            public void delete(int x) {
                for (int i = x; i < array.length; i++) {
                    if (x == array.length - 1) {
                        array[x] = null;
                    } else {
                        array[i] = array[i + 1];
                    }
                }
            }
        };
        return ga;
    }

    @Override
    public String ueb1aufg3(int x) {
        if (x == 0) {
            return "";
        }
        return ueb1aufg3(x / 8) + x % 8;
    }

}