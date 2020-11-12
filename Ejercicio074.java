/*
 * Borrar subacadena en otro cadena
 */

/**
 *
 * @author Infor
 */
public class Ejercicio074 {
    public static void main(String[] args) {
        char[] cadena={'e','n',' ','u','n',' ','l','u','g','a','r',' ','e','n',' ','l','a',' ','m','a','n','c','h','a'};
        char subcadena[]={'e','n',' '};
        
        borrarCadena(cadena, subcadena);
        
        for(char letra: cadena)
            System.out.print(letra);
        System.out.println("");
    }
    
    public static void borrarCadena(char[] cadena, char[] subcadena){
        int longitud=cadena.length-1;
        for(int i=0; i<longitud; i++){
            if(cadena[i]==subcadena[0]){
                int j=0;
                while(j<3 && cadena[i+j]==subcadena[j])
                    j++;
                if(j==3){
                    for(int z=0; z<subcadena.length; z++){
                        for(j=i; j<longitud; j++)
                            cadena[j]=cadena[j+1];
                        cadena[cadena.length-1]=' ';
                    }
                }
            }
        }
    }
}
