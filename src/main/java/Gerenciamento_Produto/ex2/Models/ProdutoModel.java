package Gerenciamento_Produto.ex2.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "produto")
@Table(name = "tb_produto")

public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_produto")
    private String nome;

    @Column(name = "c_preco")
    private BigDecimal preco;

    @Column (name = "c_estoque")
    private Integer estoque;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
