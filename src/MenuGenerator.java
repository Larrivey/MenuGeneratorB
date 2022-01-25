import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MenuGenerator {
    private HashMap<String, Queue<Comida>> cargaComidas;
    private Dia[] menu;

    public MenuGenerator() {
        this.cargaComidas = new HashMap<>();
        this.menu = new Dia[7];

        cargaComidas.put("domingo", new ArrayDeque<Comida>());
        cargaComidas.put("sabado", new ArrayDeque<Comida>());
        cargaComidas.put("carne",new ArrayDeque<Comida>());
        cargaComidas.put("verdura",new ArrayDeque<Comida>());
        cargaComidas.put("hidrato",new ArrayDeque<Comida>());
        cargaComidas.put("carbohidrato",new ArrayDeque<Comida>());
        cargaComidas.put("pescado", new ArrayDeque<Comida>());
        cargaComidas.put("primero", new ArrayDeque<Comida>());
        cargaComidas.put("segundo", new ArrayDeque<Comida>());

        Comida pizza = new Comida(false,false,false,false,false,false,false,true,false,false,false);
        Queue<Comida> c = new ArrayDeque<>();
        c.add(pizza);
        cargaComidas.put("pizza", c);

        Comida untar = new Comida(false,false,false,false,false,false,false,false,true,false,false);
        c = new ArrayDeque<>();
        c.add(untar);
        cargaComidas.put("cenaUntar", c);
    }


    private void setComida(Queue<Comida> cola, boolean cena, int dia){
        Comida c = cola.poll();
        if (cena)
            menu[dia].setCena(c);
        else{
            menu[dia].setLunch(c);
        }
        cola.add(c);

    }
    public void Generate(){
        Queue<Comida> pizzaset = cargaComidas.get("pizza");
        setComida(pizzaset,true,5);
        cargaComidas.put("pizza",pizzaset);
        Queue<Comida> untarSet = cargaComidas.get("cenaUntar");
        setComida(untarSet,true,7);
    }

    public void cargarComidas(Comida nMeal){
        if(nMeal.isCarbohidrato()) {
             Queue<Comida> c =cargaComidas.get("carbohidrato");
             c.add(nMeal);
             cargaComidas.put("carbohidrato",c);
        }
        if(nMeal.isCarne()) {
            Queue<Comida> c =cargaComidas.get("carne");
            c.add(nMeal);
            cargaComidas.put("carne",c);
        }
        if(nMeal.isVerdura()) {
            Queue<Comida> c =cargaComidas.get("verdura");
            c.add(nMeal);
            cargaComidas.put("verdura",c);
        }
        if(nMeal.isHidrato()) {
            Queue<Comida> c =cargaComidas.get("hidrato");
            c.add(nMeal);
            cargaComidas.put("hidrato",c);
        }
        if(nMeal.isPescado()) {
            Queue<Comida> c =cargaComidas.get("pescado");
            c.add(nMeal);
            cargaComidas.put("pescado",c);
        }
        if(nMeal.isPrimero()) {
            Queue<Comida> c =cargaComidas.get("primero");
            c.add(nMeal);
            cargaComidas.put("primero",c);
        }
        if(nMeal.isSegundo()) {
            Queue<Comida> c =cargaComidas.get("segundo");
            c.add(nMeal);
            cargaComidas.put("segundo",c);
        }
        if(nMeal.isPizza()) {
            Queue<Comida> c =cargaComidas.get("pizza");
            c.add(nMeal);
            cargaComidas.put("pizza",c);
        }
        if(nMeal.isCenaUntar()) {
            Queue<Comida> c =cargaComidas.get("cenaUntar");
            c.add(nMeal);
            cargaComidas.put("cenaUntar",c);
        }
        if(nMeal.isComidaDomingo()) {
            Queue<Comida> c =cargaComidas.get("domingo");
            c.add(nMeal);
            cargaComidas.put("domingo",c);
        }
        if(nMeal.isCenaSabado()) {
            Queue<Comida> c =cargaComidas.get("sabado");
            c.add(nMeal);
            cargaComidas.put("sabado",c);
        }
    }

}
