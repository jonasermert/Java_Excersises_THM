package com.jonasermert.ss15;

public class Treppe {

    public static void treppe(int n) {

        if (n == 0) {
            System.out.println("Anker!!: " + n);
            return;
        }

        System.out.println(n);

        treppe(n - 1);

        System.out.println(n);
    }

    public void test() {
        return;
        // System.out.println("Hallo");

    }

    public static void main(String[] args) {
        treppe(5);
    }

}
