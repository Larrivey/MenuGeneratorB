public class Dia {

    private Comida lunch;
    private Comida cena;


    public Dia(Comida lunch, Comida cena) {
        this.lunch = lunch;
        this.cena = cena;
    }

    public Comida getLunch() {
        return lunch;
    }

    public void setLunch(Comida lunch) {
        this.lunch = lunch;
    }

    public Comida getCena() {
        return cena;
    }

    public void setCena(Comida cena) {
        this.cena = cena;
    }
}
