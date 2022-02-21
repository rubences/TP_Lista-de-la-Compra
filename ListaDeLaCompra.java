package listadelacompra;
import java.util.Scanner;  
  
public class ListaDeLaCompra{  
  // Variables
         final String SALIR = "t";  
         final int MAX = 100;  
         Scanner console = new Scanner(System.in);  
         String[] aComprar = new String[MAX];  
         int numArticulos = 0;  
         String valorIntroducido; 
  // Métodos
public void listacompra(Scanner console){
         do {  
            System.out.println("Indique el artículo para añadir "+"a la lista de la compra o escriba " + SALIR + "para terminar ");  
            valorIntroducido = console.nextLine();  
                 if (!valorIntroducido.equals(SALIR)) {  
                       aComprar[numArticulos] = valorIntroducido;  
                       numArticulos++;  
                  }  
         } while (!valorIntroducido.equals(SALIR) && numArticulos < MAX);  
         if (numArticulos == MAX) {  
                 System.out.println("Lista completa. Vaya a comprar:");  
         } else {  
                 System.out.println("Lista de la compra:");  
         }  
         for (int i = 0; i < numArticulos; i++)  
                 System.out.println(" - " + aComprar[i]);  
         console.close();  
} 
}  
