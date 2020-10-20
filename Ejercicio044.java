/*
Metodo Burbuja
 */

/**
 *
 * @author Infor
 */
public class Ejercicio044 {
    public static void main(String[] args) {
        int vector[]={3,2,5,6,7,9,4,1}, aux;
        
        for(int i=0; i<vector.length-1; i++){
            //for(int j=0; j<vector.length-1; j++){
            for(int j=vector.length-1; j>i; j--){
                if(vector[j-1]>vector[j]){
                    aux=vector[j];
                    vector[j]=vector[j-1];
                    vector[j-1]=aux;
                }
            }
        }
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
