import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainInitializer {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File archivo = new File("Comidas.csv");
            FileReader fl = new FileReader(archivo);
            Scanner sc = new Scanner(fl).useDelimiter(";");
            while (sc.hasNext())
                System.out.println(sc.next());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
