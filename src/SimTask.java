import java.util.TimerTask;

public class SimTask extends TimerTask

{

    private SimEngine a; //Prywatne pole do przechowywania obiektu klasy SimEngine

    private SpringApplet b; //Prywatne pole do przechowywania obiektu klasy SpringApplet

    private double t; //Prywatne pole do przechowywania odstępu czasowego pomiędzy kolejnymi krokami symulacji

    SimTask(SimEngine E, SpringApplet S, double time) //Konstruktor z parametrami pozwalający na przypisanie do pól klasy obiektu klasy SimEngine

    {

        b = S;

        a = E;

        t = time;

    }

    @Override public void run() //Przeciążona, publiczna, bezparametrowa metoda run

    {

        a.timeStep(t);

        b.repaint();

    }

}
