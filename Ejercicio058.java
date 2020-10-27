/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio058 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4,23,30,12},{5,6,7,8,17,18,16}}, ventas[]=new int[matriz.length], multiplicador=10;
        String productos[]={"Peras","Manzanas"};
        
        /*for(int i=0; i<matriz.length; i++){
            System.out.println("Se han vendido "+kilos(matriz[i],ventas[i])+" kilos de "+productos[i]);
        }*/
        int n=0;
        for(int suma: kilos(matriz)){
            System.out.println("Se han vendido "+suma+" kilos de "+productos[n]);
            n++;
        }
        System.out.println("\n\n");
        multiplicador(matriz, multiplicador);
        for(int[] matriz1: matriz){
            for(int i=0; i<matriz1.length; i++){
                System.out.print("  "+matriz1[i]);
            }
            System.out.println("");
        }
    }
    
    public static int[] kilos(int[][] vector){
        int suma[]=new int [vector.length];
        for(int i=0; i<vector.length; i++){
            for(int j=0; j<vector[i].length; j++){
                suma[i]+=vector[i][j];
            }
        }
        return suma;
    }
    
    public static void multiplicador(int[][] matriz, int mult){
        for(int[] matriz1: matriz){
            for(int i=0; i<matriz1.length; i++){
                if(matriz1[i]<10){
                    matriz1[i]*=mult;
                }
            }
        }
    }
}
