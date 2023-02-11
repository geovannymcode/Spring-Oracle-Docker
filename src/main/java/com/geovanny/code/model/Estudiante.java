package com.geovanny.code.model;

import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="TBL_ESTUDIANTES")
public class Estudiante{
        @Id
        @Column(name = "ID")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEstudiantes")
        @SequenceGenerator(name = "seqEstudiantes", allocationSize = 1, sequenceName = "SEQ_ESTUDIANTES")
        @Builder.Default
        Long id=0L;
        @NotNull @NotBlank
        String nombres;
        @NotNull @NotBlank
        String apellidos;
        Integer edad;
        @NotBlank(message = "Direccion es requerida")
        @Size(min = 5, max = 50)
        String direccion;
        String ciudad;
        String pais;
}
