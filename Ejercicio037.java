/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio037 {
    public static void main(String[] args) {
        int notas[][]={{9,9,9,9},{10,9,9,8},{9,10,1,7},{9,10,5,6},{8,4,5,6}}, media[]=new int[notas.length],ma[]=new int[notas[0].length], max=0, min=0;
        String alumnos[]={"Javier","Paco","Martir","Jacinto","ALfredoo"};
        String asignaturas[]={"Mates","Fisica","E.F","Recreo"};
        
        for(int i=0; i<notas.length; i++){
            for(int j=0; j<notas[i].length; j++){
                media[i]+=notas[i][j];
                ma[j]+=notas[i][j];
            }
            media[i]/=notas.length;
            if(media[i]>media[0])
                max=i;
            else if(media[i]<media[min])
                min=i;
        }
        System.out.println("El alumno con mejor media es "+alumnos[max]+" y tiene un "+media[max]);
        System.out.println("El alumno con peor media es "+alumnos[min]+" y tiene un "+media[min]);
        System.out.println("");
        for(int i=0; i<ma.length; i++)
            System.out.println("La media de "+asignaturas[i]+" es de "+ma[i]/(ma.length+1));
    }
}
