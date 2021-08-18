
public class Garage {

    private Auto[] autos;
    private boolean[] verfuegbarkeit;

    public static void main(String[] args) {

        Garage g = new Garage(3);
        g.autoHinzufuegen(new BenzinAuto());
        g.autoHinzufuegen(new DieselAuto());
        g.autoHinzufuegen(new ElektroAuto());

        Auto a;
        a = g.fahrzeugAusgeben("Benzinauto");
        a.fahren(1);
        a = g.fahrzeugWechseln(a, "Elektroauto");
        a.fahren(1);
        a = g.fahrzeugWechseln(a, "Benzinauto");
        a.fahren(1);
        a = g.fahrzeugWechseln(a, "Dieselauto");
        a.fahren(1);
        g.fahrzeugZurueckgeben(a);

    }

    public Garage(){
        autos = new Auto[1];
        verfuegbarkeit = new boolean[1];
    }

    public Garage(int i){
        autos = new Auto[i];
        verfuegbarkeit = new boolean[i];
    }

    public void autoHinzuf�gen(Auto a){
        for(int i=0;i<autos.length;i++){
            if(autos[i] == null){
                autos[i] = a;
                System.out.println("Ein " + a.getTyp() + " wurde zur Garage hinzugef�gt.");
                return;
            }
        }
        throw new RuntimeException("Kein Garagenplatz mehr frei!");
    }

    public Auto fahrzeugWechseln(Auto a, String auto){
        fahrzeugZurueckgeben(a);
        return fahrzeugAusgeben(auto);
    }

    public Auto fahrzeugAusgeben(String auto){
        for(int i=0;i<autos.length;i++){
            if(auto.toLowerCase().equals(autos[i].getTyp()) && verf�gbarkeit[i] == false){
                System.out.println("Das " + autos[i].getTyp() + " wird benutzt.");
                verfuegbarkeit[i] = true;
                return autos[i];
            }
        }
        throw new RuntimeException("Unbekanntes Auto / Kein Auto dieses Typs verf�gbar!");
    }

    public boolean fahrzeugZurueckgeben(Auto a){
        if(a == null){
            throw new RuntimeException("Du sitzt in keinem Auto!");
        }else{
            for(int i=0;i<autos.length;i++){
                if(autos[i] == a){
                    System.out.println("Das " + a.getTyp() + " wurde zur�ckgegeben.");
                    verfuegbarkeit[i] = false;
                    return true;
                }
            }
            throw new RuntimeException("Unbekanntes Auto!");
        }
    }

}
