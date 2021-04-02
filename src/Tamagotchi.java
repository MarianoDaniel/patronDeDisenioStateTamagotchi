package src;

public class Tamagotchi {
    private State estado;

    public Tamagotchi() {
        // Arranca con este estado pero porque quiero
        setState(new Aburrido());
    }

    public void setState(State estado) {
        this.estado = estado;
        // El estado tiene que guardar la referencia de este
        // tamagochi
        this.estado.setTamagotchi(this);

    }
    // El tamagotchi no se hace cargo de las acciones sino que se
    // las deja al estado esa es la idea del patrón STATE

    public void alimentar() {
        this.estado.alimentar();
    }

    public void dormir() {
        this.estado.dormir();
    }

    public void jugar() {
        this.estado.jugar();
    }

    public void comoEstas() {
        this.estado.comoEstas();
    }
}
