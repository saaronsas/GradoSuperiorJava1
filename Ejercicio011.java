/*
Bucl decrementativo
*/

public class Ejercicio011 {
    public static void main(String arg[]){
        int num=4, result=1;
        
        for(int i=num; i>=1; i--)
            result = result*i;
        
        System.out.println("El factorial de "+num+" es "+result);
    }
    
}
