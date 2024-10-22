
import java.util.Timer;
import java.util.TimerTask;

public class PruebaTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask tarea = new TimerTask(){
            @Override
            public void run(){
                NumeroAleatorio n = new NumeroAleatorio();
                System.out.println(n.toString());
            }
        };

        timer.schedule(tarea,0,5000);

        }
    }
