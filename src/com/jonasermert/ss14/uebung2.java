package com.jonasermert.ss14;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import de.thm.adUebung.uebung.Kunde;
import de.thm.adUebung.uebung.Uebung2;

/**
 * Loesung zur Testat-Uebung 2.
 *
 */
public class LoesungUebung2 extends Uebung2 {

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
    public String ueb2aufg1() {
        return LOESUNG3;
    }

    @Override
    public List<Kunde> ueb2aufg2(List<Kunde> kunden) {
        KundenComparator comparator = new KundenComparator();
        Collections.sort(kunden, comparator);
        return kunden;
    }

    // -------------- innere Klasse -------------- //

    private class KundenComparator implements Comparator<Kunde> {

        @Override
        public int compare(Kunde o1, Kunde o2) {
            int result = o2.getRechnungen().size() - o1.getRechnungen().size();
            if (result == 0) {
                return o1.getNachname().compareTo(o2.getNachname());
            }
            return result;
        }

    }

}
