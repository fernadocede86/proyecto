package com.tallerperiodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tallerperiodo.dominio.PeriodosLectivos;
import com.tallerperiodo.repository.PensumInterface;

@RestController
public class PensumController {

	@Autowired
	private PensumInterface pensumInterface;
	
	@RequestMapping (value = "/pensum/{pensum_id}/grupos/{grupoid}/estudiante",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPensum(@PathVariable int pensum_id, @PathVariable int grupoid ){
        return new ResponseEntity<>(pensumInterface.getestudiantesbyPensum(pensum_id, grupoid),HttpStatus.OK); 
    }
	
	
	
}
