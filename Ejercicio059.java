/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio059 {
    public static void main(String[] args) {
        char frase[]={'E','n',' ','u','n','a',' ','c','a','s','a'};
        System.out.println("El numero de caracteres distinto sde ' ' son "+numCaracteres(frase));
    }
    
    public static int numCaracteres(char[] frase){
        int i=0, acu=0;
        while(i<frase.length){
            if(frase[i]!=' ')
                acu++;
            i++;
        }
        return acu;
    }
}
