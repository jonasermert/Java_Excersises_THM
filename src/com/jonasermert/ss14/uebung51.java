package com.jonasermert.ss14;

import de.thm.adUebung.uebung.HashEntry;
import de.thm.adUebung.uebung.HashingWithOpenAdressing;
import de.thm.adUebung.uebung.Uebung5;

//Dr�cken Sie rechts auf die Klasse -> Refactor -> Rename... und nennen Sie die Klasse nach der Konvention
//S�Matrikelnummer� um, wobei Sie �Matrikelnummer� mit Ihrer Matrikelnummer ersetzen. Z.B: S1234567

//Denken Sie daran, die Methoden entsprechend Ihrer pers�nlichen Daten auszuf�llen.
public class LoesungUebung5_1 extends Uebung5 {

    @Override
    public String getTHMBenutzerkennung() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getVorname() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getNachname() {
        // TODO Auto-generated method stub
        return null;
    }

    // -------------- die �bungsaufgaben -------------- //

    @Override
    public HashingWithOpenAdressing<String> ueb5(int size) {
        return new MyHashing<String>(size);
    }

    // -------------- innere Klasse -------------- //

    private class MyHashing<T extends Comparable<? super T>> extends
            HashingWithOpenAdressing<T> {

        public MyHashing(int size) {
            super(size);
        }

        @Override
        protected void grow() {
            size = size * 2;
            HashEntry<T>[] storeTmp = new HashEntry[size];
            for (HashEntry<T> entry : store) {
                storeTmp[hash(entry.getKey())] = entry;
            }
            store = storeTmp;
        }

    }

}
