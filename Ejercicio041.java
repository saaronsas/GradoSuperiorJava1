/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio041 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}}, aux;
        
        System.out.println("Matriz 2");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
