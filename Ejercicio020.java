/*
Negativos a Positivos y positivos x2 
 */

public class Ejercicio020 {
    public static void main(String[] args) {
        int vector[]={10,-20,30,-40,50,-60};
        
        for(int i=0; i<vector.length; i++){
            if(vector[i]<0)
                vector[i]*=-1;
            else if(vector[i]>0)
                vector[i]*=2;
        }
        System.out.print("Vector:  ");
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
