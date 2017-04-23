/*
  Ejemplo de uso de una variable bandera en un bucle
*/

public class VariableBandera {
  public static void main (String[] args) {

    int[] numeros = {12,3,4,5,6,7,9,10};
    int posicion = -1;
    boolean encontrado = false;

    while ((!encontrado) && (posicion<numeros.length)) {
      posicion++;
      if (numeros[posicion] == 5) {
    		encontrado = true;
      }
    }

    if (encontrado) {
    	System.out.println("El número está en la posición: " + posicion);
    } else {
    	System.out.println("Número no encontrado");
    }

  }
}
