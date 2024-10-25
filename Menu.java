import java.util.Scanner;
public class Menu {
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        String color;
        String parImpar;
        int mitad;
        int fila;
        int docena;
        boolean salir=false;

        do {
            NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
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
            System.out.println("|6| 1º Docena - 2º Docena - 3º Docena");
            System.out.println("|X| Dejar de Jugar");
            System.out.println();

            opcion = sc.next().toUpperCase();
            switch (opcion) {
                case "1":
                    break;
                case "2":
                        sc.nextLine();
                        System.out.println("Rojo - Negro");
                        color = sc.nextLine().toUpperCase();
                        if (color.equals(numeroAleatorio.colorDelNumero().toUpperCase())){
                            System.out.println("has ganado "+numeroAleatorio.toString());
                        }else{
                            System.out.println("has perdido "+numeroAleatorio.toString());
                        }
                    break;
                case "3":
                        sc.nextLine();
                        System.out.println("Par - Impar");
                        parImpar = sc.nextLine().toUpperCase();
                        if (parImpar.equals(numeroAleatorio.parImpar().toUpperCase())){
                            System.out.println("has ganado "+numeroAleatorio.toString());
                        }else{
                            System.out.println("has perdido "+numeroAleatorio.toString());
                        }
                    break;
                case "4":
                        sc.nextLine();
                        System.out.println("1º Mitad - 2º Mitad");
                        mitad = sc.nextInt();
                        if (mitad==numeroAleatorio.queMitadEs()){
                            System.out.println("has ganado "+numeroAleatorio.toString());
                        }else{
                            System.out.println("has perdido "+numeroAleatorio.toString());
                        }
                    break;
                case "5":
                        sc.nextLine();
                        System.out.println("1º Fila - 2º Fila - 3º Fila");
                        fila = sc.nextInt();
                        if (fila==numeroAleatorio.queFilaEs()){
                            System.out.println("has ganado "+numeroAleatorio.toString());
                        }else{
                            System.out.println("has perdido "+numeroAleatorio.toString());
                        }
                    break;
                case "6":
                        sc.nextLine();
                        System.out.println("1º Docena - 2º Docena");
                        docena = sc.nextInt();
                        if (docena==numeroAleatorio.queDocenaEs()){
                            System.out.println("has ganado "+numeroAleatorio.toString());
                        }else{
                            System.out.println("has perdido "+numeroAleatorio.toString());
                        }
                    break;
                case "X":
                        salir=true;
                        System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (salir!=true);
    }
}
