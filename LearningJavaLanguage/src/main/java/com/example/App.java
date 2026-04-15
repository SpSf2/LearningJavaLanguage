package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	static String printObject(Object object) {
		
		/*Recibe como parametro un object y en dependencia del tipo, imprimirá el salario si se trata de
		 * un empleado o el total de asignaturas si se tratase de un estudiante*/
		
		if (object instanceof Empleado) {
			
			Empleado empleado = (Empleado) object;
			
			return "Salario del empleado: " + empleado.getSalario();
		} else if (object instanceof Estudiante)  {
			
			Estudiante estudiante = (Estudiante) object;
			
			return "Total de Asignaturas del Estudiante: " + estudiante.getTotalAsignaturas();
			
		} else  {
			return "No es ni Empleado ni Estudiante";
		}
	}
	
	public static void main(String[] args) {
		
		Persona[] personas = { 
				
				Persona.builder()
				.nombre("Jorge")
				.primerApellido("Pascual")
				.segundoApellido("Ramirez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
				.build(), 
				
				Persona.builder()
				.nombre("Sebastian")
				.primerApellido("Sanjuanelo")
				.segundoApellido("Arrieta")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1))
				.build(), 
				
				Persona.builder()
				.nombre("Alex Eduardo")
				.primerApellido("Pilicita")
				.segundoApellido("Changoluisa")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11))
				.build(), 
				
				Persona.builder()
				.nombre("Javier")
				.primerApellido("Jurado")
				.segundoApellido("Moran")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
				.build(), 
				
				Persona.builder()
				.nombre("Rodrigo")
				.primerApellido("Rivero")
				.segundoApellido("Fernandez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
				.build() 
		};
		
		/* El Operador "instanceof" se utiliza para saber si una variable de referencia o de objetoes una
		 * instancia de un tipo, es decir, si es de una clase concreta  */
		
		Persona p1 = new Persona();
		Estudiante e1 = new Estudiante();
		
		e1.setTotalAsignaturas(10);
		
		Empleado emp1 = new Empleado();
		
		emp1.setSalario(9450.25);
		
		/*  Invocar el método printobject */
		
		printObject(p1);
		printObject(e1);
		printObject(emp1);
		
		//  Invocar o llamar al metodo con String - return
		
		String resultado = null;
		
		resultado= printObject(p1);
		System.out.println(resultado);
		resultado= printObject(e1);
		System.out.println(resultado);
		resultado= printObject(emp1);
		System.out.println(resultado);
		
	}
} 













