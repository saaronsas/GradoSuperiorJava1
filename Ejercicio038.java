
/**
 *
 * @author Infor
 */
public class Ejercicio038 {
    public static void main(String[] args) {
        int notas[][]={{9,9,9,9},{10,9,9,8},{9,10,1,7},{9,10,5,6},{8,4,5,6}}, rep=0;
        String alumnos[]={"Javier","Paco","Martir","Jacinto","ALfredoo"};
        String asignaturas[]={"Mates","Fisica","E.F","Recreo"};
        int dx=0, dy=0;
        for(int i=0; i<notas.length; i++){
            for(int j=0; j<notas[i].length; j++){
                if(notas[i][j]==10){
                    rep++;
                }        
            }     
        }
        int diecesx[]=new int[rep], diecesy[]=new int[rep];
        for(int i=0; i<notas.length; i++){
            for(int j=0; j<notas[i].length; j++){
                if(notas[i][j]==10){
                    diecesx[dx]=i;
                    diecesy[dy]=j;
                    dx++;dy++;
                }        
            }     
        }
        for(int i=0; i<diecesx.length; i++){
            System.out.println(alumnos[diecesx[i]]+" ha sacado un 10 en "+asignaturas[diecesy[i]]);
        }
    }
}
