/*
  Ejemplo de uso de las sentencia break con etiqueta
*/

public class BreakEtiqueta   {
  public static void main (String[] args) {

    int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int numeroBuscado = 5;

    busqueda:
      for (int x=0; x < matriz.length; x++) {
        for (int y=0; y < matriz[x].length; y++) {
          if (matriz[x][y] = numeroBuscado) {
            encontrado = true;
            break busqueda;
          }
        }
      }

    if (encontrado) {
      System.out.println(x + "," + y);
    } else {
      System.out.println("No encontrado");
    }

  }
}
