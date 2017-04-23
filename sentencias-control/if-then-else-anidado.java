public class SentenciasIfThenElseAnidada {
  public static void main (String[] args) {

    int valor = 14;

    if (valor < 10) {
      System.out.println("El valor es una unidad");
    } else if (valor < 100) {
      System.out.println("El valor es una decena");
    } else if (valor < 1000) {
      System.out.println("El valor es una centena");
    } else if (valor < 10000) {
      System.out.println("El valor es un millar");
    } else {
      System.out.println("Es un número grande");
    }

  }
}
