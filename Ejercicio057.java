/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio057 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4,23,30,12},{5,6,7,8,17,18,16,9}}, ventas[][]=new int[matriz.length][matriz[0].length];
        int precios[]={5,7};
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("  "+multiplicar(matriz[i][j], precios[i]));
            }
            System.out.println("");
        }
    }
    public static int multiplicar(int matriz, int num){
        int aux = matriz*num;
        
        return aux;
    }
}
