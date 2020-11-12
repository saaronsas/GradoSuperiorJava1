/*
 * Sobre cadena 2 tenemos que escribir las mismas palabras que hay en cadena1, pero al reves. La ultima palabra tiene
 * que ser la primera, la penultima tiene que ser la segunda...
 */

/**
 *
 * @author Infor
 */
public class Ejercicio070 {
    public static void main(String[] args) {
        char[] cadena1={' ','E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','c','h','a'};
        char cadena2[]=new char[150];
        
        copiar(cadena1, cadena2);
        
        for(char pal: cadena2)
            System.out.print(pal);
        System.out.println("");
    }
    
    public static void copiar(char[] cadena1, char[] cadena2){
        int inicio=cadena1.length, var=0;
        for(int i=cadena1.length-1; i>=0; i--){
            if(cadena1[i]==' '){
                for(int j=i; j<inicio; j++){
                    cadena2[var]=cadena1[j];
                    var++;
                }
                inicio=i;
            }
        }
    }
}
