/*
1. 5 edades * 4 grupos 1h,2e,2h,1e -> edad media alumnos de cada clase
2. 5 futbolistas guardar 4 goles -> vector nombres y media goles por año cada futbolistas(4años)
 */

/**
 *
 * @author Infor
 */
public class Ejercicio042 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}}, aux;
        
        for(int i=0; i<matriz.length; i++){
            aux=matriz[i][i];
            matriz[i][i]=matriz[i][matriz.length-1-i];
            matriz[i][matriz.length-1-i]=aux;
        }
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++)
                System.out.print(matriz[i][j]+"  ");
            System.out.println("");
        }
    }
}
