/*
 * Pasar tabla enteros devolver suba de todos ellos
 */

/**
 *
 * @author Infor
 */
public class Ejercicio049 {
    public static void main(String[] args) {
        int matriz[][]={{700,900,1300,800,790,850},{1000,900,900,850,724,2300},{9050,1050,1070,700,950,764},{750,2100,900,1020,1005,766}};
        
        System.out.println("La suma de todas las casilla es de "+Suma(matriz));
    }
    
    public static int Suma(int[][] matriz){
        int suma=0;
        for(int[] matriz1: matriz){
            for(int i=0; i<matriz1.length; i++){
                suma+=matriz1[i];
            }
        }
        return suma;
    }
}
