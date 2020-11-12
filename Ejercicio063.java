/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio063 {
    public static void main(String[] args) {
        char frase[]={'E','n',' ','u','n','a',' ','c','a','s','a'};
        char sustito[]={'X','x'}, sustituir='a';
        char frase2[]=new char[40];
        
        sustituirCaracter(frase, frase2, sustito, sustituir);
        for(char frase1: frase2){
            System.out.print(frase1);
        }
        System.out.println("");
        
    }
    
    public static void sustituirCaracter(char[] frase, char[] frase2, char[] sustituto, char sustituir){
        for(int i=0, cont=0; i<frase.length; i++){
            if(frase[i]==sustituir){
                frase2[i]=sustituto[cont];
                if(cont==0) cont++;
                else cont=0;
            }else{
                frase2[i]=frase[i];
            }
        }
    }
}
