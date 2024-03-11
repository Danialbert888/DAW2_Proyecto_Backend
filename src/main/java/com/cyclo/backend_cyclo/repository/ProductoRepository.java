package com.cyclo.backend_cyclo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyclo.backend_cyclo.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	
	
	

}
