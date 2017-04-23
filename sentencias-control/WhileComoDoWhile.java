/*
  Ejemplo de uso de un bucle while para realizar un contador
*/

public class WhileComoDoWhile {
  public static void main (String[] args) {

    Scanner reader = new Scanner(System.in);
    int iNumero;

    System.out.println("Introduce carácter por consola");
    iNumero = reader.nextInt();
    System.out.println(iNumero);

    while (iNumero <> 0) {
      System.out.println("Introduce carácter por consola");
      iNumero = reader.nextInt();
      System.out.println(iNumero);
    }

  }
}
