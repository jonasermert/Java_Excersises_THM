package com.jonasermert.ss15.themenblock3;

public class Fakultaet {

    public static void main(String[] args) {
        System.out.println(fakul(5));
    }

    public static long fakul(int n) {
        if (n <= 1)
            return 1;
        else
            return (n * fakul(n - 1));
    }

}
