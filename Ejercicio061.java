/*
 * Convertir caracteres a mayusculas toUpperCase
 */

/**
 *
 * @author Infor
 */
public class Ejercicio061 {
    public static void main(String[] args) {
        char frase[]={'E','n',' ','u','n','a',' ','c','a','s','a'};
        
        mayusculas(frase);
        for(char frase1: frase)
            System.out.print(frase1);
        System.out.println("");
    }
    
    public static void mayusculas(char[] frase){
        for(int i=0; i<frase.length; i++){
            frase[i]=Character.toUpperCase(frase[i]);
        }
    }
}
