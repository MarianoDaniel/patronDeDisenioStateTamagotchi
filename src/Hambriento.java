package src;

public class Hambriento implements State {
    private Tamagotchi tamagotchi;

    @Override
    public void jugar() {
        System.out.println("No quiero jugar");

    }

    @Override
    public void alimentar() {
        System.out.println("Ñom Ñomm");
        tamagotchi.setState(new Aburrido());

    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir");

    }

    @Override
    public void comoEstas() {
        System.out.println("Hambriento");

    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;

    }
}