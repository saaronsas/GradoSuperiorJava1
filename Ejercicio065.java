/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio065 {
    public static void main(String[] args) {
        char[] cadena1={'E','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','o',' '};
        
        intercambiar(cadena1);
        for(char frase: cadena1)
            System.out.print(frase);
    }
    
    public static void intercambiar(char[] frase){
        int inicio=0, fin=0;
        char aux;
        
        while(fin<frase.length){
            while(frase[fin]!=' ')
                fin++;
            
            aux=frase[inicio];
            frase[inicio]=frase[fin-1];
            frase[fin-1]=aux;
            
            inicio=fin+1;
            fin=inicio+1;
        }
        
    }
}
