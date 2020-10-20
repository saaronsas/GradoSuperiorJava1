/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio040 {
    public static void main(String[] args) {
        int matriz1[][]={{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
        int matriz2[][]=new int[matriz1.length][matriz1[0].length];
        
        System.out.println("Matriz 2");
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[i].length; j++){
                matriz2[i][j]=matriz1[i][j];
                System.out.print(matriz2[i][j]+"  ");
            }
            System.out.println("");
        }
        
    }
}
