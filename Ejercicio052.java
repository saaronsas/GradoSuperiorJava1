/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio052 {
    public static void main(String[] args) {
        int matriz[][]={{700,900,1300,800,790,850},{1000,900,900,850,724,2300},{9050,1050,1070,700,950,764},{750,2100,900,1020,1005,766}};
        
        ordenar(matriz);
        for(int[] matriz1: matriz){
            for(int i=0; i<matriz1.length; i++)
                System.out.print("  "+matriz1[i]);
            System.out.println("");
        }        
    }
    
    public static void ordenar(int[][] matriz){
        int aux;
        
        for(int[] matriz1: matriz){
            for(int[] matriz2: matriz){
                for(int i=0; i<matriz2.length-1; i++){
                    if(matriz2[i]>matriz2[i+1]){
                        aux=matriz2[i];
                        matriz2[i]=matriz2[i+1];
                        matriz2[i+1]=aux;
                    }
                }
            }
        }
    }
}
