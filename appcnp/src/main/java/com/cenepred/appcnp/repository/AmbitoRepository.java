package com.cenepred.appcnp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenepred.appcnp.model.Ambito;

@Repository
public interface AmbitoRepository extends JpaRepository<Ambito, String>  {

}
