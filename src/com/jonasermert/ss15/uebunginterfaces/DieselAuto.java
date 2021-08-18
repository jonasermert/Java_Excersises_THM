
public class DieselAuto implements Auto {

    public String typ = "dieselauto";

    public void fahren(int velocity) {

        System.out.println("Ich fahre mit dem Dieselauto");

    }

    public String getTyp(){

        return typ;

    }

}
