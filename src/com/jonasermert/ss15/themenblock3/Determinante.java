import java.util.ArrayList;

public class Determinante {

    public static void main(String[] args) {

        Determinante d = new Determinante();

        ArrayList<double[][]> mAll = new ArrayList<>();

        mAll.add(new double[][] { { 1 } });
        mAll.add(new double[][] { { 1, 2 }, { 2, 1 } });
        mAll.add(new double[][] { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } });
        mAll.add(new double[][] { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 } });
        mAll.add(new double[][] { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 1 }, { 3, 4, 5, 1, 2 }, { 4, 5, 1, 2, 3 },
                { 5, 1, 2, 3, 4 } });

        for (double[][] m : mAll) {
            System.out.println(d.determinante(m));
        }

    }

    public double determinante(double[][] m) {
        if (m.length != m[0].length) {
            throw new RuntimeException("Fehler, Matrix ist nicht quadratisch!");
        } else if (m.length == 1) {
            return m[0][0];
        } else {
            return determinanteR(m);
        }
    }

    private double determinanteR(double[][] m) {
        int dim = m.length;
        if (dim > 2) {
            double erg = 0;
            for (int i = 0; i < dim; i++) {
                double[][] mNew = new double[dim - 1][dim - 1];
                int a = 0, b = 0;
                for (int s = 1; s < dim; s++) {
                    for (int z = 0; z < dim; z++) {
                        if (z == i) {
                            continue;
                        }
                        mNew[a][b] = m[s][z];
                        b++;
                    }
                    a++;
                    b = 0;
                }
                erg += m[0][i] * determinanteR(mNew) * (Math.pow(-1, i));
            }
            return erg;
        } else {
            return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
        }
    }
}
