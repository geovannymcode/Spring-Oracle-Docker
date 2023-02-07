package com.geovanny.code.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TBL_ESTUDIANTES")
@Data
public class Estudiante {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seqEstudiantes")
	@SequenceGenerator(name = "seqEstudiantes", allocationSize=1, sequenceName="SEQ_ESTUDIANTES")
	@Builder.Default
	private Long id=0L;

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
