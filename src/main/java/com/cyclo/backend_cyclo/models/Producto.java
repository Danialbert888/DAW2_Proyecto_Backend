package com.cyclo.backend_cyclo.models;

import org.apache.el.parser.AstFalse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	
	
	private String marcaString;
	
	
	private String modeloString;
	
	
	private double precio;
	
	
	private int cantidad;
	
	
}
