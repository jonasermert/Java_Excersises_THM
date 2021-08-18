
public class ElektroAuto implements Auto {

    public String typ = "elektroauto";

    public void fahren(int velocity) {

        System.out.println("Ich fahre mit dem Elektroauto");

    }

    public String getTyp(){

        return typ;

    }

}
