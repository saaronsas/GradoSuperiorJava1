/*
 * Ordenacion Parcial
 */

/**
 *
 * @author Infor
 */
public class Ejercicio046 {
    public static void main(String[] args) {
        int vector[]={31,25,54,68,79,96,45,10}, aux, j;
        
        for(int i=0; i<vector.length-1; i++){
            j=i+1;
            while(j>0 && vector[j]<vector[j-1]){
                aux=vector[j];
                vector[j]=vector[j-1];
                vector[j-1]=aux;
                j--;
            }
        }
        
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
