package com.wferdinando.dscatalog.resources;

import com.wferdinando.dscatalog.dto.CategoryDTO;
import com.wferdinando.dscatalog.entities.Category;
import com.wferdinando.dscatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll(){
        List<CategoryDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryDTO> findById(@PathVariable(value = "id") Long id){
        CategoryDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }



}
