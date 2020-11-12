/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio066 {
    public static void main(String[] args) {
        
        char[] cadena1={'E','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','o',' '};
        int inicio=0, fin=0;
        
        moverIzq(cadena1, inicio, fin);
        //moverDcha(cadena1, inicio, fin);
        
        for(char letras: cadena1)
            System.out.print(letras);
    }
    
    public static void moverIzq(char[] frase, int inicio, int fin){
        char aux, guardar;
        while(fin<frase.length){
            while(frase[fin]!=' ')
                fin++;

            guardar=frase[fin-1];    
            for(int i=fin-1; i>inicio; i--){
                frase[i]=frase[i-1];
            }
            frase[inicio]=guardar;
                
            inicio=fin+1;
            fin=inicio+1;
            
        }
    }
    
    public static void moverDcha(char[] frase, int inicio, int fin){
        char aux, guardar;
        while(fin<frase.length){
            while(frase[fin]!=' ')
                fin++;

            guardar=frase[inicio];    
            for(int i=inicio; i<fin-1; i++){
                frase[i]=frase[i+1];
            }
            frase[fin-1]=guardar;
                
            inicio=fin+1;
            fin=inicio+1;
            
        }
    }
}
