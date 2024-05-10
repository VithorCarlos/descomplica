package com.scholl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scholl.service.ClassService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import com.scholl.entity.Class;

@RestController
@RequestMapping("/api-class")
public class ClassController {
  @Autowired
  ClassService classService;

  @GetMapping
  @Operation(summary = "Listar todas as categorias")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Sucesso"),
      @ApiResponse(responseCode = "400", description = "Requisição inválida"),
      @ApiResponse(responseCode = "403", description = "Você não tem permissão"),
      @ApiResponse(responseCode = "404", description = "Recurso não encontrado"),
  })
  public ResponseEntity<List<Class>> getAll() {
    List<Class> data = classService.getAll();
    if (!data.isEmpty()) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping
  @Operation(summary = "Salvar uma categoria")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Sucesso"),
      @ApiResponse(responseCode = "400", description = "Requisição inválida"),
      @ApiResponse(responseCode = "403", description = "Você não tem permissão"),
      @ApiResponse(responseCode = "404", description = "Recurso não encontrado"),
  })
  public ResponseEntity<Class> saveClass(@RequestBody Class data) {
    return new ResponseEntity<>(classService.saveClass(data), HttpStatus.CREATED);
  }

  @GetMapping("/create")
  public ResponseEntity<String> getCreatePage() {
    return ResponseEntity.ok("Página de criação"); // Retorna uma mensagem de sucesso ou renderiza uma página HTML
  }
}
