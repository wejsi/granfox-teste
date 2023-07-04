package com.granfox.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.granfox.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {

}
