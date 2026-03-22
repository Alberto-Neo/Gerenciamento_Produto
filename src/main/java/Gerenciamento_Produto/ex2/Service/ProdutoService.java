package Gerenciamento_Produto.ex2.Service;

import Gerenciamento_Produto.ex2.Controller.ProdutoController;
import Gerenciamento_Produto.ex2.Models.ProdutoModel;
import Gerenciamento_Produto.ex2.Repository.ProdutoRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoModel> Listar() {
        return produtoRepository.findAll();
    }

    public ProdutoModel salvarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel buscar(Long id){
        return produtoRepository.findById(id).get();
    }

    public void deletar(long id){
        produtoRepository.deleteById(id);
    }

}
