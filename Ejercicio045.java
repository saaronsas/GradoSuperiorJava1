/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio045 {
    public static void main(String[] args) {
        int vector[]={3,2,5,6,7,9,4,1}, aux, pos=0;
        
        for(int i=0; i<vector.length; i++){
            pos=i;
            for(int j=i; j<vector.length; j++){
                if(vector[j]<vector[pos]){
                    pos=j;
                }
            }
            aux=vector[i];
            vector[i]=vector[pos];
            vector[pos]=aux;
        }
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
