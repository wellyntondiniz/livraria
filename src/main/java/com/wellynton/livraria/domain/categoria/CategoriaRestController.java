package com.wellynton.livraria.domain.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaRestController {
	
	@Autowired
	CategoriaService categoriaService;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
		return ResponseEntity.ok(categoriaService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		return ResponseEntity.ok(categoriaService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
		categoria = categoriaService.save(categoria);
		return ResponseEntity.ok(categoria);
	}
	
	@PutMapping(value = "{id}")
	public ResponseEntity<Categoria> update(@PathVariable Integer id, @RequestBody  Categoria categoria){
		categoria = categoriaService.save(categoria);
		return ResponseEntity.ok(categoria);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		categoriaService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
