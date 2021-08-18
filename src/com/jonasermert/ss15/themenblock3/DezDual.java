public class DezDual {

    public static void main(String[] args) {

        DezDual dd = new DezDual();
        dd.dez2dual(105);

    }

    public void dez2dual(int n) {
        if ((n >= 0) && (n <= 255)) { // Vergleich 2
            int a[] = { 0, 0, 0, 0, 0, 0, 0, 0 }; // Initialisierung 1;
            // Zuweisung 8
            int i = 7; // Initialisierung 1; Zuweisung 1
            do { // Durchlauf 1
                int rest = n % 2; // Initialisierung 1; Zuweisung 1; Modulo 1
                a[i] = rest; // Zuweisung 1
                n = n / 2; // Division 1
                i--; // Subtraktion 1
            } while (n != 0); // Vergleich n
            System.out.println(); // Ausgabe 1
            for (int j = 0; j <= 7; j++) { // Initialisierung 1; Vergleich 1+n;
                // Addition 1
                System.out.print(a[j]); // Ausgabe 1
            }
            System.out.println(); // Ausgabe 1
        } else {
            System.out.println("Wert nicht im zul�ssigen Bereich"); // Ausgabe 1
        }
    }

    // Komplexit�t: 2+1+8+1+1+1*(1+1+1+1+1+1)+n*(1+1+1+1+1+1)+1+1+1+n*1+1+1 =
    // 13+1*6+n*6+5+n*1 = 24+7n = O(log2(n))
}
