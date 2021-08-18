package com.jonasermert.ss15.themenblock3;

public class HarmonischeReihe {

    public static void main(String[] args) {
        HarmonischeReihe hr = new HarmonischeReihe();
        System.out.println(hr.harmonisch(3));
    }

    public double harmonisch(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1.0 / n + harmonisch(n - 1);
        }
    }

}
