package com.jonasermert.ss14;

import de.thm.adUebung.uebung.BinaryHeap;
import de.thm.adUebung.uebung.Uebung4;

//Dr�cken Sie rechts auf die Klasse -> Refactor -> Rename... und nennen Sie die Klasse nach der Konvention
//S�Matrikelnummer� um, wobei Sie �Matrikelnummer� mit Ihrer Matrikelnummer ersetzen. Z.B: S1234567

//Denken Sie daran, die Methoden entsprechend Ihrer pers�nlichen Daten auszuf�llen.
public class LoesungUebung4_2 extends Uebung4 {

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
    public MyBinaryHeap<Integer> ueb4() {
        return new MyBinaryHeap<Integer>();
    }

    // -------------- innere Klasse -------------- //

    private class MyBinaryHeap<AnyType extends Comparable<? super AnyType>>
            extends BinaryHeap<AnyType> {

        @Override
        public AnyType deleteMax() {
            if (isEmpty())
                return null;
            AnyType maxItem = array[1];
            int maxItemIndex = 1;

            for (int i = 2; i <= currentSize; i++) {
                if (array[i].compareTo(maxItem) > 0) {
                    maxItem = array[i];
                    maxItemIndex = i;
                }
            }

            if (maxItemIndex != currentSize) {
                array[maxItemIndex] = array[currentSize];
                upHeap(maxItemIndex);
            }
            array[currentSize] = null;
            currentSize--;

            return maxItem;
        }

    }

}
