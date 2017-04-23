public class Switch {
  public static void main (String[] args) {

      int iMes = 3;
      String sMes;

      switch (iMes) {
      	case 1:
      		sMes = "Enero";
      		break;
      	case 2:
      		sMes = "Febrero";
      		break;
      	case 3:
      		sMes = "Marzo";
      		break;
      	case 4:
      		sMes = "Abril";
      		break;
      	case 5:
      		sMes = "Mayo";
      		break;
      	case 6:
      		sMes = "Junio";
      		break;
      	case 7:
      		sMes = "Julio";
      		break;
      	case 8:
      		sMes = "Agosto";
      		break;
      	case 9:
      		sMes = "Septiembre";
      		break;
      	case 10:
      		sMes = "Octubre";
      		break;
      	case 11:
      		sMes = "Noviembre";
      		break;
      	case 12:
      		sMes = "Diciembre";
      		break;
      	default:
      		sMes = "Mes incorrecto";
      }

      System.out.println(sMes);

  }
}
