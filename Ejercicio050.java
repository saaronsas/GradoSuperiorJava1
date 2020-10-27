/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio050 {
    public static void main(String[] args) {
        int salario[][]={{700,900,1300,800,790,850},{1000,900,900,850,724,2300},{9050,1050,1070,700,950,764},{750,2100,900,1020,1005,766}};
        int media[]=new int[salario.length];
        String empleados[]={"Javier","Paco","Martir","Jacinto"};
        String meses[]={"Enero","Feberero","Marzo","Abril","Myo","Junio"};
        
        media2(salario, media);
        for(int i=0; i<empleados.length; i++)
            System.out.println("El empleado "+empleados[i]+" ha cobradouna media de "+media[i]/6+" euros");
        
    }
    
    public static int media(int[][] matriz, int[] vector, int j){
        for(int z=0; z<matriz.length; z++){
            for(int i=0; i<matriz[z].length; i++)
                vector[z]+=matriz[z][i];
        }
        return vector[j]/matriz[0].length;
    }
    
    public static void media2(int[][] matriz, int[] vector){
        for(int z=0; z<matriz.length; z++){
            for(int i=0; i<matriz[z].length; i++){
                vector[z]+=matriz[z][i];                
            }
        }
    }
    
    public static int[] mesesSalario(int[][] matriz){
        int meses[]=new int[matriz.length];
        for(int[] matriz1: matriz){
            for(int i=0; i<matriz1.length; i++){
                meses[i]=matriz1[i];
            }
        }
        return meses;
    }
    
}
