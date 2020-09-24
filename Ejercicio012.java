/*
Multiplicacion mediante sumas
*/

public class Ejercicio012 {
    public static void main(String arg[]){
        
        int multiplicador = 7, multiplicando = 5, result=0;
        
        for(int i=0; i<multiplicando; i++)
            result+=multiplicador;
        System.out.println("El resultado de "+multiplicador+" * "+multiplicando+" = "+result);
        
    }
}
