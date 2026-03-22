package Gerenciamento_Produto.ex2.Controller;

import Gerenciamento_Produto.ex2.Models.ProdutoModel;
import Gerenciamento_Produto.ex2.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")

public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll() {
        return produtoService.Listar();
    }

    @GetMapping("/{id}")
    public ProdutoModel buscar(@PathVariable long id){
        return produtoService.buscar(id);
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel){
        return produtoService.salvarProduto(produtoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id){
        produtoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
