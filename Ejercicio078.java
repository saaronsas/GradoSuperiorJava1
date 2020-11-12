/*
 * metodo->  compareTo
 *           String.compareTo(AnotherString)>0 -> String > AnotherString
 *           String.compareTo(AnotherString)<0 -> String < AnotherString
 *           String.compareTo(AnotherString)==0 -> String == AnotherString
 */

/**
 *
 * @author Infor
 */
public class Ejercicio078 {
    public static void main(String[] args) {
        String nombres[]={"Pepe","Carlos","Antonio","Luisa"};
        
        ordenarNombres(nombres);
        for(String nombre: nombres)
            System.out.print(nombre+"  ");
        System.out.println("");
    }
    
    public static void ordenarNombres(String[] nombre){
        for(int i=0; i<nombre.length-1; i++){
            for(int j=0; j<nombre.length-1; j++){
                if(nombre[j].compareTo(nombre[j+1])>0){
                    String aux=nombre[j];
                    nombre[j]=nombre[j+1];
                    nombre[j+1]=aux;
                }
            }
        }
    }
}
