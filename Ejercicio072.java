/*
 * Buscar una subcadena y sustituirla por otra subcadena
 */

/**
 *
 * @author Infor
 */
public class Ejercicio072 {
    public static void main(String[] args) {
        char[] cadena1={'e','n',' ','u','n',' ','l','u','g','a','r',' ','e','n',' ','l','a',' ','m','a','n','c','h','a'};
        char[] subcad1={'e','n',' '}, subcad2={'x','X','x','X','x'};
        char[] cadena2=new char[150];
        
        sustituir(cadena1, subcad1, subcad2, cadena2);
        for(char pal: cadena2)
            System.out.print(pal);
        System.out.println("");
    }
    
    public static void sustituir(char[] cadena1, char[] sub1, char[] sub2, char[] cadena2){
        int cont=0;
        for(int i=0; i<cadena1.length; i++){
            if(cadena1[i]==sub1[0]){
                int j=0;
                while(j<3 && cadena1[j+i]==sub1[j])
                    j++;
                if(j==3){
                    for(j=0; j<sub2.length; j++){
                        cadena2[cont]=sub2[j];
                        cont++;
                    }
                    i+=sub1.length-1;
                }
            } else {
                cadena2[cont]=cadena1[i];
                cont++;
            }
        }
    }
}
