package com.jonasermert.ss15.themenblock3;

public class Hanoi {

    private static int zaehler;

    private static void hanoi(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println("Lege die oberste Scheibe von " + "Turm " + a
                    + " auf Turm " + c + ".");
            zaehler++;

        } else {
            hanoi(a, c, b, n - 1);
            hanoi(a, b, c, 1);
            hanoi(b, a, c, n - 1);
        }
    }

    public static void main(String[] args) {
        hanoi('a', 'b', 'c', 20);
        System.out.println("anzahl an Bewegungen: " + zaehler);
    }

}
