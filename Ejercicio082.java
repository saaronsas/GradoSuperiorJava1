/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio082 {
    public static void main(String[] args) {
        String frase[]={"en un lugar"," en la mancha,"," de cuyo nombre"," no quiero acordarme"};
        String subcadena="en";
        
        for(int i=0; i<frase.length; i++){
            frase[i]=frase[i].replace(subcadena, subcadena.toUpperCase());
        }
        frase[0]=frase[0].concat(" Hola");
        
        for(String letra: frase)
            System.out.print(letra);
        System.out.println("");
    }
}
