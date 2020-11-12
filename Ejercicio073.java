/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio073 {
    public static void main(String[] args) {
        char[] cadena={'e','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','c','h','a'};
        char caracter='e';
        
        eliminarCaracter(cadena, caracter);
        
        for(char letra: cadena)
            System.out.print(letra);
        System.out.println("");
    }
    
    public static void eliminarCaracter(char[] cadena, char caracter){
        for(int i=0; i<cadena.length; i++){
            if(cadena[i]==caracter){
                for(int j=i; j<cadena.length-1; j++){
                    cadena[j]=cadena[j+1];
                }
                cadena[cadena.length-1]=' ';
            }
        }
    }
}
 