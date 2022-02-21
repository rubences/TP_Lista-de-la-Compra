import java.util.Scanner; 
//import java.class.ListaDeLaCompra;

class Main extends ListaDeLaCompra{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);  
    ListaDeLaCompra miLista= new ListaDeLaCompra();
    miLista.listacompra(console);
  }
}