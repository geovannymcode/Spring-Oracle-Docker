package com.geovanny.code.controller;

import com.geovanny.code.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geovanny.code.exception.ModeloNotFoundException;
import com.geovanny.code.service.EstudianteService;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private EstudianteService service;
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Estudiante>> listar() {
		List<Estudiante> estudiantes = new ArrayList<>();
		 estudiantes = service.findEstudianteAll();
		return new ResponseEntity<List<Estudiante>>(estudiantes, HttpStatus.OK);
	}
	
	@PostMapping
    public ResponseEntity<Estudiante> crearEstudiante(@Valid @RequestBody Estudiante estudiante){
        service.createEstudiante(estudiante);
        return new ResponseEntity<Estudiante>(HttpStatus.CREATED);
    }
	
	@GetMapping("/{id}")
	public ResponseEntity<Estudiante> getEstudianteById(@PathVariable("id") Long id){
		Estudiante estudiante = service.getEstudiante(id).orElseThrow(() -> new ModeloNotFoundException("Estudiante no encontrado $id"));
		return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Estudiante> deleteEstudiante(@PathVariable("id") Long id){
		service.deleteEstudiante(id);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public Estudiante updateEstudiante(@PathVariable("id") Long id, @Valid @RequestBody Estudiante estudiante) {
		Estudiante dbestudiante = service.getEstudiante(id).orElseThrow(() -> new ModeloNotFoundException("Estudiante No enocntrado"));
		dbestudiante.setNombres(estudiante.getNombres());
		dbestudiante.setApellidos(estudiante.getApellidos());
		dbestudiante.setDireccion(estudiante.getDireccion());
		dbestudiante.setEdad(estudiante.getEdad());
		dbestudiante.setCiudad(estudiante.getCiudad());
		dbestudiante.setPais(estudiante.getPais());
		return service.updateEstudiante(dbestudiante);
	}
}
