/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio075 {
    public static void main(String[] args) {
        char[] cadena={'e','n',' ','u','n',' ','l','u','g','a','r',' ','e','n',' ','l','a',' ','m','a','n','c','h','a'};
        
        mayusEspacio(cadena);
        
        for(char letra: cadena)
            System.out.print(letra);
        System.out.println("");
    }
    
    public static void mayusEspacio(char[] cadena){
        for(int i=0; i<cadena.length; i++){
            if(cadena[i]==' ' && i<cadena.length-2){
                cadena[i-1]-=32;
                cadena[i+1]-=32;
            }
        }
    }
}
