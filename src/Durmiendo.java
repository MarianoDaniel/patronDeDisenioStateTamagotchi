package src;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private Tamagotchi tamagotchi;

    @Override
    public void jugar() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void comoEstas() {
        System.out.println("Está durmiendo");

    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                // como ahora está adentro de una clase no me toma
                // el this, por eso tengo que anteponer el nombre
                // de la clase a la que ese this corresponde
                Durmiendo.this.tamagotchi.setState(new Hambriento());

            }

        }, 7000);

    }
}
