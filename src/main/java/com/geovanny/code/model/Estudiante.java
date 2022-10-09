package com.geovanny.code.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="estudiantes")
@Data
public class Estudiante {
	
	@Id
	private Long id;
	@NotNull
	@NotBlank
	private String nombres;
	@NotNull
	@NotBlank
	private String apellidos;
	private Integer edad;
	@NotBlank(message = "Direccion es requerida")
	@Size(min = 5, max = 50)
	private String direccion;
	private String ciudad;
	private String pais;
	
}
