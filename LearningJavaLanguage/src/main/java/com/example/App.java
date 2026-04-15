package com.example;

import java.time.LocalDate;
import java.time.Month;
 
public class App {
	
	static String printObject(Object obj) {
		
		/*Recibe como parametro un object y en dependencia del tipo, imprimirá el salario si se trata de
		 * un empleado o el total de asignaturas si se tratase de un estudiante*/
		
		/*  Utilizando los beneficios de Pattern Maching  */
		if (obj instanceof Empleado empleado) {
			
			// Empleado empleado = (Empleado) object;
			
			
			return "Salario del empleado: " + empleado.getSalario();
		} else if (obj instanceof Estudiante estudiante)  {
			
			// Estudiante estudiante = (Estudiante) object;
			
			return "Total de Asignaturas del Estudiante: " + estudiante.getTotalAsignaturas();
			
		} else  {
			return "No es ni Empleado ni Estudiante";
		}
	}
	
	public static void main(String[] args) {
		
	/*	Persona[] personas = { 
				
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
		*/
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
		
/* Ejericio de la actividad 15 de Abril: Crear un array de Objetos y agregarle elementos de tipo Empleado
 * de 3 empleados y 3 estudiantes con todas las propiedades de Persona en ambos casos
 * 2- Recorrer el array o iterar utilizando una sentencia for mejorada, para los estudiantes obtener la 
 * media de asignaturas matriculadas y para los empleados obtener el salario medio de los empleados del
 * genero Hombre*/
/* Se sugiere utilizar Pattern Maching con instanceof en el momento de recorre el array*/
		
		
		

		        System.out.println("==============================================");
		        System.out.println("   EJERCICIO: ARRAY DE PERSONAS, EMPLEADOS");
		        System.out.println("              Y ESTUDIANTES");
		        System.out.println("==============================================");

		        // Array de tipo Persona, pero con objetos de tipo Empleado y Estudiante
		        Persona[] personas = {

		            Empleado.builder()
		                    .nombre("Manuel")
		                    .primerApellido("Serrano")
		                    .segundoApellido("Pool")
		                    .genero(Genero.HOMBRE)
		                    .fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
		                    .salario(1800)
		                    .dpto(Dpto.INFORMATICA)
		                    .fechaAlta(LocalDate.of(2022, Month.MARCH, 15))
		                    .ssn("11111111A")
		                    .build(),

		            Empleado.builder()
		                    .nombre("Camilo")
		                    .primerApellido("Suarez")
		                    .segundoApellido("Gómez")
		                    .genero(Genero.HOMBRE)
		                    .fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1))
		                    .salario(2100)
		                    .dpto(Dpto.FINANZAS)
		                    .fechaAlta(LocalDate.of(2023, Month.JUNE, 10))
		                    .ssn("22222222B")
		                    .build(),

		            Empleado.builder()
		                    .nombre("Lucia")
		                    .primerApellido("Martinez")
		                    .segundoApellido("Lopez")
		                    .genero(Genero.MUJER)
		                    .fechaNacimiento(LocalDate.of(1998, Month.AUGUST, 20))
		                    .salario(1950)
		                    .dpto(Dpto.CONTABILIDAD)
		                    .fechaAlta(LocalDate.of(2024, Month.JANUARY, 5))
		                    .ssn("33333333C")
		                    .build(),

		            Estudiante.builder()
		                    .nombre("Javier")
		                    .primerApellido("Jurado")
		                    .segundoApellido("Moran")
		                    .genero(Genero.HOMBRE)
		                    .fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
		                    .totalAsignaturas(8)
		                    .facultad(Facultad.LETRAS)
		                    .build(),

		            Estudiante.builder()
		                    .nombre("Ramiro")
		                    .primerApellido("Rivero")
		                    .segundoApellido("Arenal")
		                    .genero(Genero.HOMBRE)
		                    .fechaNacimiento(LocalDate.of(2004, Month.NOVEMBER, 4))
		                    .totalAsignaturas(6)
		                    .facultad(Facultad.INGENIERIA)
		                    .build(),
		                       
		            Estudiante.builder()
		                    .nombre("Maria")
		                    .primerApellido("Sanchez")
		                    .segundoApellido("Garcia")
		                    .genero(Genero.MUJER)
		                    .fechaNacimiento(LocalDate.of(2003, Month.APRIL, 18))
		                    .totalAsignaturas(10)
		                    .facultad(Facultad.INFORMATICA)
		                    .build()
		        };

		        double sumaAsignaturas = 0;
		        int totalEstudiantes = 0;

		        double sumaSalariosHombres = 0;
		        int totalEmpleadosHombres = 0;

		        System.out.println("\n----- LISTADO DE PERSONAS -----");

		        for (Persona persona : personas) {

		            // Pattern Matching con instanceof
		            if (persona instanceof Estudiante estudiante) {
		                System.out.println("Estudiante -> "
		                        + estudiante.getNombre() + " "
		                        + estudiante.getPrimerApellido() + " "
		                        + estudiante.getSegundoApellido()
		                        + " | Género: " + estudiante.getGenero()
		                        + " | Facultad: " + estudiante.getFacultad()
		                        + " | Asignaturas matriculadas: " + estudiante.getTotalAsignaturas());

		                sumaAsignaturas += estudiante.getTotalAsignaturas();
		                totalEstudiantes++;

		            } else if (persona instanceof Empleado empleado) {
		                System.out.println("Empleado   -> "
		                        + empleado.getNombre() + " "
		                        + empleado.getPrimerApellido() + " "
		                        + empleado.getSegundoApellido()
		                        + " | Género: " + empleado.getGenero()
		                        + " | Departamento: " + empleado.getDpto()
		                        + " | Salario: " + empleado.getSalario());

		                if (empleado.getGenero() == Genero.HOMBRE) {
		                    sumaSalariosHombres += empleado.getSalario();
		                    totalEmpleadosHombres++;
		                }
		            }
		        }

		        System.out.println("\n----- RESULTADOS -----");

		        if (totalEstudiantes > 0) {
		            double mediaAsignaturas = sumaAsignaturas / totalEstudiantes;
		            System.out.println("Media de asignaturas de los estudiantes: " + mediaAsignaturas);
		        } else {
		            System.out.println("No hay estudiantes en el array.");
		        }

		        if (totalEmpleadosHombres > 0) {
		            double mediaSalarioHombres = sumaSalariosHombres / totalEmpleadosHombres;
		            System.out.println("Salario medio de los empleados hombres: " + mediaSalarioHombres);
		        } else {
		            System.out.println("No hay empleados hombres en el array.");
		        }

		        System.out.println("==============================================");
		    }
		
		
		
	
} 













