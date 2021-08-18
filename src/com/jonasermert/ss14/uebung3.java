package com.jonasermert.ss14;

import java.util.ArrayList;
import java.util.List;

import de.thm.adUebung.uebung.BinaryNode;
import de.thm.adUebung.uebung.BinarySearchTree;
import de.thm.adUebung.uebung.Uebung3;

/**
 * Loesung zur Testat-Uebung 3.
 *
 */
public class LoesungUebung3 extends Uebung3 {

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
    public BinarySearchTree<String> ueb3aufg1() {
        return new MyBinarySearchTree<String>();
    }

    @Override
    public BinarySearchTree<String> ueb3aufg2() {
        return new MyBinarySearchTree<String>();
    }

    // -------------- innere Klasse -------------- //

    private class MyBinarySearchTree<AnyType extends Comparable<? super AnyType>>
            extends BinarySearchTree<AnyType> {

        @Override
        public void insert(List<AnyType> list) {
            for (AnyType t : list) {
                insert(t);
            }
        }

        @Override
        public ArrayList<AnyType> toArrayList() {
            ArrayList<AnyType> al = new ArrayList<>();
            fillArrayList(al, root);
            return al;

            // Alternativ auch iterativ mit L�schen des Minimums
//			ArrayList<AnyType> l = new ArrayList<>();
//			AnyType a = findMin();
//			while (a != null) {
//				l.add(a);
//				remove(a);
//				a = findMin();
//			}
//
//			return l;
        }

        private void fillArrayList(ArrayList<AnyType> al, BinaryNode<AnyType> n) {
            if (n == null) {
                return;
            }
            fillArrayList(al, n.leftChild); // Rekursion
            al.add(n.data);
            fillArrayList(al, n.rightChild); // Rekursion
        }

    }

}

