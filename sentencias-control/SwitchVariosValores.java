/*
  Ejemplo de uso de switch que valida varios valores por bloque
*/

public class SwitchVariosValores {
  public static void main (String[] args) {

      int iMes = 3;
      String sDias;

      switch (iMes) {
      	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
      		sDias = "El mes tiene 31 días";
      		break;
      	case 4: case 6: case 9: case 11:
      		sDias = "El mes tiene 30 días";
      		break;
      	case 2:
      		sDias = "El mes tiene 28 días (o 29 días si es año bisiesto)";
      		break;
      	default:
      		sDias = "Mes incorrecto";
      }

      System.out.println(sDias);

  }
}
