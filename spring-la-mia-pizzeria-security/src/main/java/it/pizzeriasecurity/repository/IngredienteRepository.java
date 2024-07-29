package it.pizzeriasecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pizzeriasecurity.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer> {
	
}