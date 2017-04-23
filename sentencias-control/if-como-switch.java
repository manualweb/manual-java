/*
  Usar una estructura if-then-else como si fuese un switch
*/

public class SwitchComoIf {
  public static void main (String[] args) {

    if (iMes == 1){
    	sMes = "Enero";
    } else if (iMes == 2) {
    	sMes = "Febrero";
    } else if (iMes == 3) {
    	sMes = "Marzo";
    } else if (iMes == 4) {
    	sMes = "Abril";
    } else if (iMes == 5) {
    	sMes = "Mayo";
    } else if (iMes == 6) {
    	sMes = "Junio";
    } else if (iMes == 7) {
    	sMes = "Julio";
    } else if (iMes == 8) {
    	sMes = "Agosto";
    } else if (iMes == 9) {
    	sMes = "Septiembre";
    } else if (iMes == 10) {
    	sMes = "Octubre";
    } else if (iMes == 11) {
    	sMes = "Noviembre";
    } else if (iMes == 12) {
    	sMes = "Diciembre";
    } else {
    	sMes = "Mes incorrecto";
    }

    System.out.println(sMes);

  }
}
