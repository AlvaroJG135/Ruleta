import java.util.Random;

public class NumeroAleatorio {
    Random rnd = new Random();
    int numero_ruleta;
    int[] numeros_negros = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    int[] numeros_rojos = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};

    public NumeroAleatorio() {
        numero_ruleta=rnd.nextInt(5);
    }

    public int getNumero_ruleta(){
        return numero_ruleta;
    }
    public String parImpar(){
        if (numero_ruleta%2==0){
            return "Par";
        }
        return "Impar";
    }
    public String colorDelNumero(){
        if(numero_ruleta==0){
            return "Verde";
        }else{
            for (int i = 0; i < numeros_negros.length; i++) {
                if(numero_ruleta==numeros_negros[i]){
                    return "Negro";
                }
            }
        }
        return "Rojo";
    }
    public String queMitadEs(){
        if (numero_ruleta>=1 && numero_ruleta<=18) {
            return "Primera mitad 1-18";
        }
        return "Segunda mitad 19-36";
    }
    public String queDocenaEs(){
        if(numero_ruleta>=1 && numero_ruleta<=12){
            return "Primera docena 1-12";
        }else if(numero_ruleta>=13 && numero_ruleta<=24){
            return "Segunda docena 13-24";
        }
        return "Tercera docena 25-36";
    }
    @Override
    public String toString(){
        if(numero_ruleta==0){
            return numero_ruleta+" "+colorDelNumero();
        }
            return numero_ruleta+" "+colorDelNumero()+" "+parImpar()+" ("+queDocenaEs()+") ("+queMitadEs()+")";
    } 
}
