/*
 *  Dada la cadena de caracteres "frase", crear una nueva cadena de caracteres que sea igual que la anterior, pero 
 *  a cada palabra le añada una "x"
 */

/**
 *
 * @author Infor
 */
public class Ejercicio060 {
    public static void main(String[] args) {
        char frase[]={'E','n',' ','u','n','a',' ','c','a','s','a',' '};
        
        for(char caracter: frase){
            lasX(caracter);
            System.out.print(caracter);
        }
        System.out.println("");
    }
    
    public static void lasX(char frase){
        if(frase==' ')
            System.out.print("x");
    }
}
