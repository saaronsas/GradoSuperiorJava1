
public class Ejercicio023 {
    public static void main(String[] args) {
        int vector[]={10,-20,30,-40,50,60}, aux;    
        aux=vector[vector.length-1];                              
        for(int i=vector.length-1; i>0; i--){
            vector[i]=vector[i-1];                  
        }                                           
        vector[0]=aux;                
                                                    
        System.out.print("Vector:  ");              
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
