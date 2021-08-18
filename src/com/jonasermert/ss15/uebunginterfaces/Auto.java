
public interface Auto {

    void fahren(int velocity);
    String getTyp();

}

/*
Schreiben Sie ein Interface, das die Methode
void fahren(int velocity) vorsieht.

Schreiben Sie daraufhin die Klassen BenzinAuto,
DieselAuto und ElektroAuto, die jeweils das
Interface implementieren. Schreiben Sie weiterhin
die Klasse Garage, die von allen Klassen eine
Instanz vorh�lt. Erlauben Sie dem Anwender, dass
er das Fahrzeug wechseln und damit fahren kann.
Wie k�nnte so eine Methode aussehen?

Geben Sie bei den �berschriebenen fahren-Methoden
auch eine sinnvolle Ausgabe auf der Konsole aus.

K�nnte die Funktionalit�t auch mit einer
abstrakten Klasse gel�st werden? Was w�ren
die Vorteile, was die Nachteile?
*/