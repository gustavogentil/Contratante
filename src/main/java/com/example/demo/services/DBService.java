package com.example.demo.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Contratante;
import com.example.demo.repository.ContratanteRepository;


@Service
public class DBService {

	

	
	@Autowired
	private ContratanteRepository contratanteRepository;

	public void instantiateTestDataBase() throws ParseException {
		
		
		
		
DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

		
		Contratante contratante1 = new Contratante(null, "Rafael Campos", "36709295848", "casa", "125", "casa",
				"centro", "04284020", "diadema", "sao paulo", "0245","045795");

		
		contratanteRepository.save(contratante1);
		
		
		

		
		
	}

}
