/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio048 {
    public static void main(String[] args) {
        int vector[]={2,4,6,3,9,1};
        System.out.println("El maximo numero del vector es "+maximo(vector));
    }
    public static int maximo(int[] vector){
        int max=vector[0];
        for(int i=0; i<vector.length; i++){
            if(vector[i]>max){
                max=vector[i];
            }
        }
        return max;
    }
}
