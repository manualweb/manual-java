/*
  Ejemplo de uso de las sentencia break
*/

public class UsoBreak {
  public static void main (String[] args) {

    int[] numeros = {12,3,4,5,6,7,9,10};
    int posicion = 0;
    boolean encontrado = false;

    while (posicion < numeros.length) {
      if (numeros[posicion] == 5) {
      		encontrado = true;
      		break;
      }
      posicion++;
    }

    if (encontrado) {
    	System.out.println("El número está en la posición: " + posicion);
    } else {
    	System.out.println("Número no encontrado");
    }

  }
}
