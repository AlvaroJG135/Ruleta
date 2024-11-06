
import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int edad;
    private int fichas;
    private int[] numeros_elegidos;

    public Jugador(String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
        fichas=100;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getfichas(){
        return fichas;
    }

    public int[] getNumeros_elegidos(){
        return numeros_elegidos;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setFichas(int fichas){
        this.fichas=fichas;
    }
    
    public void setNumeros_elegidos(int[] numeros_elegidos){
        this.numeros_elegidos=numeros_elegidos;
    }

    public void añadirFichas(int fichas){
        this.fichas+=fichas;
    }

    public void retirarFichas(int fichas){
        Scanner sc = new Scanner (System.in);
        while (fichas>this.fichas){
            System.out.println("No tienes esa cantidad de fichas. Introduce una cantidad de fichas válida");
            fichas = sc.nextInt();
        }
        this.fichas-=fichas;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;  
    }

}
