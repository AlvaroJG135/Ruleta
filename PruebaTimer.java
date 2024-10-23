
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class PruebaTimer {
    ArrayList<Integer> numeros = new ArrayList<>();
    public void timer() {
        Timer timer = new Timer();

        TimerTask tarea = new TimerTask(){
            @Override
            public void run(){
                NumeroAleatorio n = new NumeroAleatorio();
                System.out.println(n.toString());
                elimirarNumeros();
                añadirNumeros();
            }
        };

        timer.schedule(tarea,10000,10000);

        }
    public void elimirarNumeros(){
        numeros.clear();
    }
    public void añadirNumeros(){
        Scanner sc = new Scanner(System.in);
        int numero;
        String entrada;

        do  { 
            System.out.print("Introduce un número (o 'salir' para terminar): ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("salir")) {
                try {
                    numero = Integer.parseInt(entrada);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número válido.");
                }
            }
        } while (!entrada.equalsIgnoreCase("salir"));

        System.out.println("Números almacenados: " + numeros);
    }
    public static void main(String[] args) {
        PruebaTimer t = new PruebaTimer();
        t.timer();
        t.añadirNumeros();1

    }
}
