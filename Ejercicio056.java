/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio056 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4,23,30,12},{5,6,7,8,17,18,16,9}};
        int precios[]={5,7};
        
        multiplicar(matriz, precios);
        for(int matriz1[]: matriz){
            for(int i=0; i<matriz1.length; i++){
                System.out.print("  "+matriz1[i]);
            }
            System.out.println("");
        }
    }
    public static void multiplicar(int[][] matriz, int[] num){
        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] *= num[i];
            }
        }
    }
}
