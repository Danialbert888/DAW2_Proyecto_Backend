package com.cyclo.backend_cyclo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cyclo.backend_cyclo.excepcion.ResourceNotFoundException;
import com.cyclo.backend_cyclo.models.Producto;
import com.cyclo.backend_cyclo.repository.ProductoRepository;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {
	
	@Autowired
	private ProductoRepository productoRepository;

	
	//metodo para listar los productos
	@GetMapping("/productos")
	public List<Producto> listarproductos(){
		return productoRepository.findAll();
	}
	
	@PostMapping("/productos")
	public Producto guardarproducto(@RequestBody Producto produ) {
		return productoRepository.save(produ);
	}
	
	//metodo para buscar un producto por id
	@GetMapping("/productos/{id}")
	public ResponseEntity<Optional<Producto>> obtenerProductoPorId( @PathVariable Long id){
		
		Optional<Producto> producto = productoRepository.findById(id);
		
		return ResponseEntity.ok(producto);
	
		
	}
	
//	@PutMapping("/productos/{id}")
//	public ResponseEntity<Optional<Producto>> actualizaProducto(@PathVariable Long id, @RequestBody Producto detallesProducto ){
		
//		Optional<Producto> producto = productoRepository.findById(id);
		
//	}
	
	
	
	
}
