package it.pizzeriasecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pizzeriasecurity.model.Offerta;

public interface OffertaRepository extends JpaRepository<Offerta, Integer> {

}