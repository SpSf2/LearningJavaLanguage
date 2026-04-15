package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Estudiante extends Persona{
	
	private int totalAsignaturas;
	private Facultad facultad;

}
