package Gerenciamento_Produto.ex2.Repository;

import Gerenciamento_Produto.ex2.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{

}
