public class Comida {
    private boolean primero;
    private boolean segundo;
    private boolean verdura;
    private boolean carne;
    private boolean pescado;
    private boolean hidrato;
    private boolean carbohidrato;
    private boolean pizza;
    private boolean cenaUntar;
    private boolean comidaDomingo;
    private boolean cenaSabado;

    public Comida(boolean primero, boolean segundo, boolean verdura, boolean carne, boolean pescado, boolean hidrato, boolean carbohidrato, boolean pizza, boolean cenaUntar, boolean comidaDomingo, boolean cenaSabado) {
        this.primero = primero;
        this.segundo = segundo;
        this.pescado = pescado;
        this.verdura = verdura;
        this.carne = carne;
        this.hidrato = hidrato;
        this.carbohidrato = carbohidrato;
        this.pizza = pizza;
        this.cenaUntar = cenaUntar;
        this.comidaDomingo = comidaDomingo;
        this.cenaSabado = cenaSabado;
    }

    public boolean isPrimero() {
        return primero;
    }

    public boolean isPescado() {
        return pescado;
    }

    public void setPescado(boolean pescado) {
        this.pescado = pescado;
    }

    public void setPrimero(boolean primero) {
        this.primero = primero;
    }

    public boolean isSegundo() {
        return segundo;
    }

    public void setSegundo(boolean segundo) {
        this.segundo = segundo;
    }

    public boolean isVerdura() {
        return verdura;
    }

    public void setVerdura(boolean verdura) {
        this.verdura = verdura;
    }

    public boolean isCarne() {
        return carne;
    }

    public void setCarne(boolean carne) {
        this.carne = carne;
    }

    public boolean isHidrato() {
        return hidrato;
    }

    public void setHidrato(boolean hidrato) {
        this.hidrato = hidrato;
    }

    public boolean isCarbohidrato() {
        return carbohidrato;
    }

    public void setCarbohidrato(boolean carbohidrato) {
        this.carbohidrato = carbohidrato;
    }

    public boolean isPizza() {
        return pizza;
    }

    public void setPizza(boolean pizza) {
        this.pizza = pizza;
    }

    public boolean isCenaUntar() {
        return cenaUntar;
    }

    public void setCenaUntar(boolean cenaUntar) {
        this.cenaUntar = cenaUntar;
    }

    public boolean isComidaDomingo() {
        return comidaDomingo;
    }

    public void setComidaDomingo(boolean comidaDomingo) {
        this.comidaDomingo = comidaDomingo;
    }

    public boolean isCenaSabado() {
        return cenaSabado;
    }

    public void setCenaSabado(boolean cenaSabado) {
        this.cenaSabado = cenaSabado;
    }
}
