package com.granfox.controller;


import com.granfox.model.Produto;
import com.granfox.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Crud Produtos",
        description = "Crud Produtos - Cadastrar e listar produtos"
)
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Operation(
            summary = "Obter todos os produtos cadastrados.",
            description = "Obter todos os produtos cadastrados na base de dados"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Sucesso."
    )
    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = produtoService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @Operation(
            summary = "Cadastrar produto",
            description = "Cadastrar produto e salvar na base de dados."
    )
    @ApiResponse(
            responseCode = "201",
            description = "Produto criado."
    )
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Produto produto) {
        Produto savedProduto = produtoService.save(produto);
        return ResponseEntity.ok().body(savedProduto);
    }

}
