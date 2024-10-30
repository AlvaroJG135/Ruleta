import java.util.ArrayList;
import java.util.Scanner;
public class Menu_copia {
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador j = new Jugador("alvaro",24);
        int fichas_jugador;
        int añadir_fichas;
        String opcion;
        String color;
        String parImpar;
        String mitad;
        String fila;
        String docena;
        boolean salir=false;

        ArrayList<String> selecciones = new ArrayList<>();
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        do {
            
            System.out.println();
            System.out.println(ROJO+"3"+RESET+" 6 "+ROJO+"9 12"+RESET+"|15 "+ROJO+"18 21"+RESET+" 24|"+ROJO+"27 30"+RESET+ " 33 "+ROJO+"36"+RESET +" -> Fila 3\n"+
                                "2 "+ROJO+"5"+RESET+" 8 11|"+ROJO+"14"+RESET+" 17 20 "+ROJO+"23"+RESET+"|26 29 "+ROJO+"32"+RESET+ " 35"+" -> Fila 2\n"+
                                ROJO+"1"+RESET+" 4 "+ROJO+"7"+RESET+" 10|13 "+ROJO+"16 19"+RESET+" 22|"+ROJO+"25"+RESET+ " 28 31 "+ROJO+"34"+RESET+" -> Fila 1");
            System.out.println();
            System.out.println("|Nombre| "+j.getNombre()+" |Fichas| "+j.getfichas());
            System.out.println();
            System.out.println("|1| Números");
            System.out.println("|2| Color");
            System.out.println("|3| Par - Impar");
            System.out.println("|4| 1º Mitad - 2º Mitad");
            System.out.println("|5| 1º Fila - 2º Fila - 3º Fila");
            System.out.println("|6| 1º Docena - 2º Docena - 3º Docena");
            System.out.println("|7| Añadir fichas");
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
                        System.out.println("Cantidad de fichas");
                        fichas_jugador = sc.nextInt();
                        selecciones.add("Color:"+color);
                    break;
                case "3":
                        sc.nextLine();
                        System.out.println("Par - Impar");
                        parImpar = sc.nextLine().toUpperCase();
                        selecciones.add("ParImpar:"+parImpar);
                    break;
                case "4":
                        sc.nextLine();
                        System.out.println("1º Mitad - 2º Mitad");
                        mitad = sc.nextLine();
                        selecciones.add("Mitad:"+mitad);
                    break;
                case "5":
                        sc.nextLine();
                        System.out.println("1º Fila - 2º Fila - 3º Fila");
                        fila = sc.nextLine();
                        selecciones.add("Fila"+fila);
                    break;
                case "6":
                        sc.nextLine();
                        System.out.println("1º Docena - 2º Docena - 3º Docena");
                        docena = sc.nextLine();
                        selecciones.add("Docena:"+docena);
                    break;
                case "7":
                        sc.nextLine();
                        System.out.println("¿Cuantas fichas quieres añadir?");
                        añadir_fichas = sc.nextInt();
                        j.añadirFichas(añadir_fichas);
                    break;
                case "X":
                        salir=true;
                        System.out.println("Saliendo. Fichas ganadas: "+j.getfichas());
                    break;
                default:
                    System.out.println("opcion no valida");
            }
            System.out.println(numeroAleatorio.toString());
        } while (salir!=true);
        for (String seleccion : selecciones) {
            String[] partes = seleccion.split(":");
            switch (partes[0]) {
                case "color":
                    if (partes[1].equalsIgnoreCase(numeroAleatorio.colorDelNumero())) {
                        System.out.println("has ganado "+numeroAleatorio.toString());
                    }else{
                        System.out.println("has perdido "+numeroAleatorio.toString());
                    }
                    break;
                case "ParImpar":
                    if (partes[1].equalsIgnoreCase(numeroAleatorio.parImpar())) {
                        System.out.println("has ganado "+numeroAleatorio.toString());
                    }else{
                        System.out.println("has perdido "+numeroAleatorio.toString());
                    }
                    break;
                case "Mitad":
                    if (partes[1].equalsIgnoreCase(numeroAleatorio.parImpar())) {
                        System.out.println("has ganado "+numeroAleatorio.toString());
                    }else{
                        System.out.println("has perdido "+numeroAleatorio.toString());
                    }
                    break;
                case "Fila":
                    if (partes[1].equalsIgnoreCase(numeroAleatorio.queFilaEs())) {
                        System.out.println("has ganado "+numeroAleatorio.toString());
                    }else{
                        System.out.println("has perdido "+numeroAleatorio.toString());
                    }
                    break;
                case "Docena":
                    if (partes[1].equalsIgnoreCase(numeroAleatorio.parImpar())) {
                        System.out.println("has ganado "+numeroAleatorio.toString());
                    }else{
                        System.out.println("has perdido "+numeroAleatorio.toString());
                    }
                    break;
            }
        }
    }
}
