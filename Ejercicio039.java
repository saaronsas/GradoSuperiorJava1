

/**
 *
 * @author Infor
 */
public class Ejercicio039 {
    public static void main(String[] args) {
        int salario[][]={{700,900,1300,800,790,850},{1000,900,900,850,724,2300},{9050,1050,1070,700,950,764},{750,2100,900,1020,1005,766}}, 
                media[]=new int[salario.length],mediaMes[]=new int[salario[0].length] , maxE=0, minE=0, maxM=0,minM=0;
        String empleados[]={"Javier","Paco","Martir","Jacinto"};
        String meses[]={"Enero","Feberero","Marzo","Abril","Myo","Junio"};
        
        for(int i=0; i<salario.length; i++){
            for(int j=0; j<salario[i].length; j++){
                media[i]+=salario[i][j];
                mediaMes[j]+=salario[i][j];
            }
            if(media[i]>media[maxE])
                maxE=i;
            else if(media[i]<media[minE])
                minE=i;
        }
        System.out.println("El empleado que menos cobra es "+empleados[minE]+" y cobra "+media[minE]/meses.length+" al mes de media");
        System.out.println("El empleado que mas cobra es "+empleados[maxE]+" y cobra "+media[maxE]/meses.length+" al mes de media");
        
        for(int i=0; i<mediaMes.length; i++){
            if(mediaMes[i]<mediaMes[minM])
                minM=i;
            else if(mediaMes[i]>mediaMes[maxM])
                maxM=i;
        }
        System.out.println("El mes que mas se cobra es "+meses[maxM]+" y se cobra un media de "+mediaMes[maxM]/salario.length+" por empleado");
        System.out.println("El mes que menos se cobra es "+meses[minM]+" y se cobra un media de "+mediaMes[minM]/salario.length+" por empleado");
    }
}
