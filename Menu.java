
import java.util.Scanner;

public class Menu {
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m"; // Resetea el color

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        System.out.println();
        System.out.println(ROJO+"3"+RESET+" 6 "+ROJO+"9 12"+RESET+" 15 "+ROJO+"18 21"+RESET+" 24 "+ROJO+"27 30"+RESET+ " 33 "+ROJO+"36"+RESET +"\n"+
                            "2 "+ROJO+"5"+RESET+" 8 11 "+ROJO+"14"+RESET+" 17 20 "+ROJO+"23"+RESET+" 26 29 "+ROJO+"32"+RESET+ " 35"+"\n"+
                            ROJO+"1"+RESET+" 4 "+ROJO+"7"+RESET+" 10 13 "+ROJO+"16 19"+RESET+" 22 "+ROJO+"25"+RESET+ " 28 31 "+ROJO+"34"+RESET);
        System.out.println();
        System.out.println("|1| Números");
        System.out.println("|2| Color");
        System.out.println("|3| Par - Impar");
        System.out.println("|4| 1º Mitad - 2º Mitad");
        System.out.println("|5| 1º Fila - 2º Fila - 3º Fila");
        System.out.println("|X| Dejar de Jugar");
        System.out.println();

        opcion = sc.next().toUpperCase();
        switch (opcion) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "X":
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
}
