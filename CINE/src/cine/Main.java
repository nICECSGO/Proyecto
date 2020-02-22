package cine;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		Sala sala[] = new Sala[6];
		Cine cine = new Cine();
		Funciones funciones[] = new Funciones[4];
		Funciones fun = new Funciones();
		
		// Clases Salas (numerosala/valor/cantidad)
		sala[0] = new Sala2D(1,2000,40);
		sala[1] = new Sala2D(2,2000,40);
		sala[2] = new Sala3D(3,3000,35);
		sala[3] = new Sala4DX(4,7000,30);
		sala[4] = new SalaImax(5,5000,45);
		sala[5] = new SalaImax(6,5000,45);
		//Class  Funciones    (horariofuncion,nombrefuncion,asiento)
		funciones[0] = new Funciones(1, "X-men 1", 0);
		funciones[1] = new Funciones(2, "X-men 2", 0);
		funciones[2] = new Funciones(3, "X-men 3", 0);
		funciones[3] = new Funciones(3, "X-men 4", 0);
		
		fun.visualizar(sala);
		
		
		System.out.println ("seleccione un horario");
		System.out.println ("1 = 12:00 14:00");
		System.out.println ("2= 15:00 18:00");
		System.out.println ("3= 19:00 21:00");
		System.out.println ("4= 22:00 24:00 ");
		
		/*if(nombre de la funcion) {
			horarios y salas
		}
        switch (){
        
        case 1:
        	
            break;
        case 2:
        	
            break;
        case 3:
        	
            break;
        }*/
		
		
		
		//nombre de cine
		System.out.println("Cine "+cine.getNombre());
		
		//hora actual
		LocalTime ahora = LocalTime.now(); 
	       System.out.printf(" %d:%d:%d ", ahora.getHour(),  
	       ahora.getMinute(), ahora.getSecond()); 

				
				 
		
		
		
	}

}
