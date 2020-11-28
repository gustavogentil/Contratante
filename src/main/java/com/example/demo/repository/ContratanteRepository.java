package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Contratante;

@Repository
public interface ContratanteRepository extends JpaRepository<Contratante, Integer>{

}
