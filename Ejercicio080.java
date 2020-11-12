/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio080 {
    public static void main(String[] args) {
        String frase="En un lugar de la mancha, de cuyo nombre no quiero acordarme";
        
        frase=frase.replace('a', 'X');
        System.out.println(frase);
        
        frase=frase.replace("lugXr", "sitio");
        System.out.println(frase);
        
        System.out.printf("La palabra sitio se encuentra en la posicion %d\n",frase.indexOf("sitio"));
    }
}
