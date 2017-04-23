/*
  Ejemplo de uso de un bucle while para realizar un contador
*/

public class WhileContador {
  public static void main (String[] args) {

    Scanner reader = new Scanner(System.in);
    int iNumero;

    do {
    	System.out.println("Introduce carácter por consola");
    	iNumero = reader.nextInt();
    	System.out.println(iNumero);
    } while (iNumero <> 0);

  }
}
