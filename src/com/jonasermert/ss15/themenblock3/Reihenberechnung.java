public class Reihenberechnung {

    public static void main(String[] args) {

        Reihenberechnung r = new Reihenberechnung();

        System.out.println(r.doIt(0.1));
        System.out.println(r.doIt(0.01));
        System.out.println(r.doIt(0.001));
        System.out.println(r.doIt(0.0001));
        System.out.println(r.doIt(0.00001));
        System.out.println(r.doIt(0.000001));
        System.out.println(r.doIt(0.0000001));
        System.out.println(r.doIt(0.00000001));

        System.out.println("-------------------------");

        System.out.println(r.doItR(0.1));
        System.out.println(r.doItR(0.01));
        System.out.println(r.doItR(0.001));
        System.out.println(r.doItR(0.0001));
        System.out.println(r.doItR(0.00001));
        System.out.println(r.doItR(0.000001));
        System.out.println(r.doItR(0.0000001));
        System.out.println(r.doItR(0.00000001));

    }

    public double doIt(double eps) {
        double erg = 0.0;
        for (double i = 1;; i++) {
            erg += (1.0 / i) * Math.pow(-1.0, (i % 2) + 1);
            if ((1.0 / i - (1.0 / (i + 1))) < eps) {
                break;
            }
        }
        return erg;
    }

    public double doItR(double eps) {
        try {
            return doItR(eps, 1.0);
        } catch (StackOverflowError soe) {
            throw new Error("Fehler, der Stack ist nicht gro� genug f�r diese Berechnung!");
        }
    }

    public double doItR(double eps, double x) throws StackOverflowError {
        if ((1.0 / x) - (1.0 / (x + 1.0)) >= eps) {
            return ((1.0 / x) * Math.pow(-1.0, (x % 2.0) + 1.0)) + doItR(eps, x + 1.0);
        } else {
            return ((1.0 / x) * Math.pow(-1.0, (x % 2.0) + 1.0));
        }
    }

}
