
package estudiantes;


public class Principal {
    
    public static void main ( String[]args){
    Estudiante[] estudiantes = new Estudiante [3];
    estudiantes[0] = new Estudiante("Juan ","Perez"," 1234567890");
    estudiantes[1] = new Estudiante("Maria ","Castro"," 0987654321");
    estudiantes[2] = new Estudiante("Pedro ","Benitez"," 5678654323");
    
    System.out.println("\t###INFORMACIÓN ESTUDIANTES###\n");
    
    //Materias 2
    Estudiante estudiantes1 = new Estudiante("Juan ", "Perez","1234567890 " );
        System.out.println("##Estudiante 1: ");
        System.out.println("Nombre completo: "+ estudiantes1.getNombre()+ estudiantes1.getApellido());
        System.out.println("Cedula: "+ estudiantes1.getCedula());
        System.out.println("Materias: ");
        String []m1= {"m1","m2"};
        estudiantes[0].setMaterias(m1);
        String [] materiasEstudiantes = estudiantes[0].getMaterias();
        for(int i=0; i<materiasEstudiantes.length; i++){
            System.out.println(materiasEstudiantes[i]);
        }
       
    //Materias 3
    System.out.println();
    Estudiante estudiantes2 = new Estudiante("Maria ","Castro"," 0987654321");
        System.out.println("##Estudiante 2: ");
        System.out.println("Nombre: "+ estudiantes2.getNombre() + estudiantes2.getApellido());
        System.out.println("Cedula: "+ estudiantes2.getCedula());
        System.out.println("Materias: ");
        String []m2= {"m2","m3","m4"};
        estudiantes[1].setMaterias(m2);
        String [] materiasEstudiantes2 = estudiantes[1].getMaterias();
        for(int i=0; i<materiasEstudiantes2.length; i++){
            System.out.println(materiasEstudiantes2[i]);
        }
    //Materias 4
    System.out.println();
    Estudiante estudiantes3 = new Estudiante("Pedro ","Benitez"," 5678654323");
        System.out.println("##Estudiante 3: ");
        System.out.println("Nombre completo : "+ estudiantes3.getNombre() + estudiantes3.getApellido());
        System.out.println("Cedula: "+ estudiantes3.getCedula());
        System.out.println("Materias: ");
        String []m3= {"m2","m3","m4","m5"};
        estudiantes[2].setMaterias(m3);
        String [] materiasEstudiantes3 = estudiantes[2].getMaterias();
        for(int i=0; i<materiasEstudiantes3.length; i++){
            System.out.println(materiasEstudiantes3[i]);
        }
        // Contadores para el resumen de materias
        int acumulador = 0;
        int acumulador2 = 0;
        int acumulador3 = 0;
        int acumulador4 = 0;
        int acumulador5 = 0;
       
            for(int i = 0; i < m1.length; i++){
           
               if(materiasEstudiantes[i].equals("m1")){
               acumulador++;
               }else if(materiasEstudiantes[i].equals("m2")){
               acumulador2++;
               }
               System.out.println();
            }
            
            for(int i = 0; i < m2.length; i++){
           
               if(materiasEstudiantes2[i].equals("m2")){
               acumulador2++;
               }else if(materiasEstudiantes2[i].equals("m3")){
               acumulador3++;
               }
               else if(materiasEstudiantes2[i].equals("m4")){
               acumulador4++;
               }
               
               System.out.println();
            } 
            for(int i = 0; i < m3.length; i++){
           
               if(materiasEstudiantes3[i].equals("m2")){
               acumulador2++;
               }else if(materiasEstudiantes3[i].equals("m3")){
               acumulador3++;
               }
               else if(materiasEstudiantes3[i].equals("m4")){
               acumulador4++;
               }
               else if(materiasEstudiantes3[i].equals("m5")){
               acumulador5++;
               }
            } 
        
        System.out.println("\t ### RESUMEN DE MATERIAS ###\n");
        System.out.println("Numero de veces que se repite cada materia");
        System.out.println("m1: "+acumulador);
        System.out.println("m2: "+acumulador2);
        System.out.println("m3: "+acumulador3);
        System.out.println("m4: "+acumulador4);
        System.out.println("m5: "+acumulador5);
        
       }
    
       
        
    }
