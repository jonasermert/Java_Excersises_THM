
public class BenzinAuto implements Auto {

    private String typ = "benzinauto";

    public void fahren(int velocity) {

        System.out.println("Ich fahre mit dem Benzinauto");

    }

    public String getTyp(){

        return typ;

    }

}
