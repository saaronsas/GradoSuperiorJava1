/*
 * Mostrar por pantalla las palabras de la frase, ordenadas alfabeticamente
 */

/**
 *
 * @author Infor
 */
public class Ejercicio084 {
    public static void main(String[] args) {
        String frase="5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String vector[]=new String[espaciosBlanco(frase)];
        
        cargarVector(frase, vector);
        ordenarVector(vector);

        for(String palabras: vector)
            System.out.print(palabras+" ");
        System.out.println("");
    }
    
    public static void cargarVector(String frase, String[] vector){
        int pos=frase.indexOf(" ", 0), cont=0, inicio=0;
        while(cont<vector.length && pos!=-1){
            pos=frase.indexOf(" ", inicio);
            vector[cont]=frase.substring(inicio, pos++);
            inicio=pos;
            cont++;
        }
    }
    
    public static int espaciosBlanco(String frase){
        int cont=0;
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)==' ')
                cont++;
        }
        return cont;
    }
    
    public static void ordenarVector(String[] vector){
        for(int i=0; i<vector.length-1; i++){
            for(int j=0; j<vector.length-1; j++){
                if(vector[j].compareTo(vector[j+1])>0){
                    String aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
        }
    }
}
