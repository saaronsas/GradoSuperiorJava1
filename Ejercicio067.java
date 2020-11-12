/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio067 {
    public static void main(String[] args) {
        char[] cadena1={'E','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','o',' '};
        char caracter='a', subcadena[]={'A','B','C','D','E'};
        char[] cadena2=new char[150];
            
        sustituir(cadena1, caracter, subcadena, cadena2);
        
        for(char letra: cadena2)
            System.out.print(letra);
        System.out.println("");
    }
    
    public static void sustituir(char[] cadena1, char caracter, char[] subcadena, char[] cadena2){
        System.arraycopy(cadena1, 0, cadena2, 0, cadena1.length);
        int longitud=cadena1.length;
        
        for(int i=0; i<longitud; i++){
            if(cadena2[i]==caracter){
                cadena2[i]=subcadena[0];
                for(int x=1; x<subcadena.length; x++){
                    for(int j=cadena2.length-2; j>i; j--){
                        cadena2[j+1]=cadena2[j];
                    }
                    cadena2[++i]=subcadena[x];
                    longitud++;
                }
            }
        }
    }
}
