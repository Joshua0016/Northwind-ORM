
import package01.Archivos;
import package01.Product;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Product p1 = new Product(1, "Chai", 1, 1, "10 boxes x 20 bags", 18.0, 39, 0, 10, false);

        Archivos.guardarArchivo(p1);

    }

}
