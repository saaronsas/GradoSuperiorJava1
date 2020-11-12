/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio083 {
    public static void main(String[] args) {
        String frase="En un lugar de la mancha, de cuyo nombre no quiero acordarme";       
        int pos=frase.indexOf(" ",0);
        
        while(pos!=-1){
           frase=frase.substring(0, pos).concat(frase.substring(pos+1, frase.length()-1));
           pos=frase.indexOf(" ",0);
        }
        
        System.out.println(frase);
    }
}
