public class Potenzieren {

    public static void main(String[] args) {

        Potenzieren p = new Potenzieren();
        System.out.println(p.pot(2, 4));
        System.out.println(p.pot(0, 4));
        System.out.println(p.pot(-2, 4));
        System.out.println(p.pot(-2, 3));

    }

    public long pot(int b, int e) {
        long erg = 1; // Zuweisung 1; Initialisierung 1
        if (e <= 0) { // Vergleich 1
            throw new RuntimeException("Fehler!"); // Fehler werfen 1
        } else {
            while (e > 0) { // Vergleich n+1
                erg *= b; // Multiplikation 1
                e--; // Subtraktion 1
            }
            return erg; // R�ckgabe 1
        }
    }

    // Komplexit�t: 1+1+1+n(1+1)+1+1 = 5+2n = O(n)
}
