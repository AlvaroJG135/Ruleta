public class Jugador {
    private String nombre;
    private int edad;
    private int fichas;
    private int[] numeros_elegidos;

    public Jugador(String nombre, int edad, int fichas) {
        this.nombre=nombre;
        this.edad=edad;
        this.fichas=fichas;
    }

    public int getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int fichas(){
        return fichas;
    }

    public void setNombre(int nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setFichas(int fichas){
        this.fichas=fichas;
    }

    public void añadirFichas(int fichas){
        this.fichas=+fichas;
    }

    public void retirarFichas(int fichas){
        if (fichas<this.fichas){
            this.fichas=-fichas;
        }else{
            System.out.println("no tienes esa cantidad de fichas");
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;  
    }

}
