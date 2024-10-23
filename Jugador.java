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

    public int getNombre(){
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

    public void setNombre(int nombre){
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
        if (fichas<this.fichas){
            this.fichas-=fichas;
        }else{
            System.out.println("no tienes esa cantidad de fichas");
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;  
    }

}
