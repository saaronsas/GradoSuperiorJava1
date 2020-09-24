/*
Modificar elementos vector
*/
public class Ejercicio016 {
    public static void main(String[] args) {
        int datos[]={1,2,3,4,6,5};
                
        for(int i=0; i<datos.length; i++){
            datos[i]*=2;
            System.out.println(i+1+". "+datos[i]);
        }
        
    }
}
