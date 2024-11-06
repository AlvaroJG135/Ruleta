import java.util.Random;

public class NumeroAleatorio {
    Random rnd = new Random();
    int numero_ruleta;
    int[] numeros_rojos = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    int[] numeros_negros = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
    int[] fila3 = {3,6,9,12,15,18,21,24,27,30,33,36};
    int[] fila2 = {2,5,8,11,14,17,20,23,26,29,32,35};

    public NumeroAleatorio() {
        numero_ruleta=rnd.nextInt(2);
    }

    public int getNumero_ruleta(){
        return numero_ruleta;
    }
    public String parImpar(){
        if(numero_ruleta==0){
            return "";
        }else if (numero_ruleta%2==0){
            return "P";
        }
        return "I";
    }
    public String colorDelNumero(){
        if(numero_ruleta==0){
            return "Verde";
        }else{
            for (int i = 0; i < numeros_negros.length; i++) {
                if(numero_ruleta==numeros_negros[i]){
                    return "N";
                }
            }
        }
        return "R";
    }
    public String queMitadEs(){
        if(numero_ruleta==0){
            return "0";
        }else if (numero_ruleta>=1 && numero_ruleta<=18) {
            return "1";
        }
        return "2";
    }
    public String queFilaEs(){
        if (numero_ruleta==0){
            return "0";
        }else{
            for (int i = 0; i < fila3.length; i++) {
                if(numero_ruleta==fila3[i]){
                    return "3";
                }else if (numero_ruleta==fila2[i]) {
                    return "2";
                }
            }
        }
        return "1";
    }
    public String queDocenaEs(){
        if (numero_ruleta==0){
            return "0";
        }else if(numero_ruleta>=1 && numero_ruleta<=12){
            return "1";
        }else if(numero_ruleta>=13 && numero_ruleta<=24){
            return "2";
        }
        return "3";
    }
    @Override
    public String toString(){
        if(numero_ruleta==0){
            return numero_ruleta+" "+colorDelNumero();
        }
            return numero_ruleta+" "+colorDelNumero()+" "+parImpar()+" ("+queMitadEs()+"º mitad)"+" ("+queFilaEs()+"º fila)"+" ("+queDocenaEs()+"º docena)";
    } 
}
