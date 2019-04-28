//n° de estudiantes, n° de materias, notas, promedio de notas,promedio de curso

package curso_1;

import java.util.Scanner;


public class Curso_1 {

   
    public static void main(String[] args) {
        
        
        Scanner obtener=new Scanner (System.in);
        int i,j,curso,materias,k,nota,s,m;
        float ingresar,suma=0,pm,pme,pmc;
        
        
        System.out.print("Cuantos estudiantes hay: ");
        curso=obtener.nextInt();
        
        System.out.print("cuantas materias: ");
        materias=obtener.nextInt();
        
        System.out.print("cuantas notas: ");
        nota=obtener.nextInt();
        
        
        
        for(i=1;i<=curso;i++){
             System.out.println("estudiante numero "+i);
            for(j=1;j<=materias;j++){
                    System.out.println("materia "+j);    
                           for(k=1;k<=nota;k++){
                            do{
                             System.out.print("nota "+k+" : ");
                             ingresar=obtener.nextFloat();
                             if(ingresar>5||ingresar<0)
                                 System.out.println("Fraude");
                             else {
                              suma = suma +ingresar;   
                             }
                             
                            }
                            while(ingresar>5||ingresar<0);
                           }
                           pm=suma/nota;
                           System.out.println("El promedio de notas es:  "+pm);
                           pme=pm/nota;
                           System.out.println("El promedio del estudiante es: "+pme);
                            
                           
             }
                     
         }   


        
        
        }        
        
        
        
    }
    

