package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Contratante;
import com.example.demo.repository.ContratanteRepository;

@Service
public class ContratanteService {
	
	@Autowired
	private ContratanteRepository repo;
	
	
	public Contratante insert(Contratante obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Contratante find(Integer id) throws Exception {
		Optional<Contratante> obj = repo.findById(id);
		return obj.orElseThrow(() -> new Exception(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Contratante.class.getName()));
	}
	
	public List<Contratante> findAll(){
		return repo.findAll();
	}

}
