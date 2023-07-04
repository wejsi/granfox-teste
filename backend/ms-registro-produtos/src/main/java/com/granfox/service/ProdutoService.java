package com.granfox.service;

import com.granfox.model.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> findAll();

    Produto save(Produto produto);
}
