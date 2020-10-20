
/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio033 {
    
    public static void main(String[] args) {
        int matriz[][]={{10,20,30,40,70},{50,60,70,80,56},{90,100,110,120,25}}, producto[]=new int[3];
        double precios[]={1.5,2,0.8}, ganancias[]=new double[3];
        String productos[]={"Naranjas", "Peras", "Manzanas"};
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                producto[i]+=matriz[i][j];
                ganancias[i]+=matriz[i][j]*precios[i];
            }
            System.out.println(productos[i]+"-> "+producto[i]+"Kg -> "+ganancias[i]+" euros.");
            //printf(Coste %.2f, ganancias[i]) -> Te imprime 2 decimales
        }
        
        
    }
}
