package com.granfox.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "produtos")
public class Produto implements Serializable {
    @Id
    private String id;

    @Schema(
            description = "Nome do produto"
    )
    @NotEmpty(message = "Nome deve ser preenchido.")
    private String nome;

    @Schema(
            description = "Descrição do produto"
    )
    @NotEmpty(message = "Descrição deve ser preenchida.")
    private String descricao;

    @Schema(
            description = "Quantidade"
    )
    private Integer qtd;

    @Schema(
            description = "Preço do produto"
    )
    private BigDecimal preco;
}