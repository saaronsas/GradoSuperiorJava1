/*

 */

/**
 *
 * @author Infor
 */
public class Ejercicio032 {
    public static void main(String[] args) {
        int matriz[][]={{10,20,30,40,70},{50,60,70,80,56},{90,100,110,120,25}}, producto[]=new int[3];
        String productos[]={"Naranjas", "Peras", "Manzanas"};
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                producto[i]+=matriz[i][j];
                matriz[i][0]+=matriz[i][j];
            }
            System.out.println(productos[i]+": "+producto[i]+"Kg");
        }
        /*for(int i=0; i<producto.length; i++)
            System.out.println(productos[i]+": "+producto[i]+"Kg");*/
    }
}
