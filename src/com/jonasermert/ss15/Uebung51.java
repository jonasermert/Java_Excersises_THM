package Ihre_Loesung;

import de.thm.ad.testat.tester.uebung.HashEntry;
import de.thm.ad.testat.tester.uebung.HashingWithOpenAdressing;
import de.thm.ad.testat.tester.uebung.Uebung5;

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
            HashEntry<T>[] storeTmp = store;
            store = new HashEntry[size];
            for (HashEntry<T> entry : storeTmp) {
                insert(entry);
            }
        }

    }

}
