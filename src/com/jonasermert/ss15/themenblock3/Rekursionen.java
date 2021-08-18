
public class Rekursionen {

    public static void main(String[] args) {

        Rekursionen r = new Rekursionen();

        int[] x = new int[]{14,19,56,2,37,45,89};
        System.out.println(r.minimum(x));

        System.out.println(r.ggT(105,45));

        System.out.println(r.bin�rdarstellung(149));

    }

    public int minimum(int[] x){
        return minimum(x,x.length);
    }

    private int minimum(int[] x, int l){
        return (l==0) ? x[l] : (x[l-1]<minimum(x,l-1)) ? x[l-1] : minimum(x,l-1);
    }

    public int ggT(int a, int b){
        return (a>b) ? ggT(a-b,b) : (a<b) ? ggT(a,b-a) : a;
    }

    public String bin�rdarstellung(int x){
        return (x==0) ? "" : (x%2!=0) ? "1"+bin�rdarstellung(x/2) : "0"+bin�rdarstellung(x/2);
    }

}
