package fiap.br.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fiap.br.challenge.domain.Compra;
import fiap.br.challenge.domain.Produto;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{

	  @Query("SELECT c.produtos FROM Compra c WHERE c.idCompra = :compraId")
	    List<Produto> listaProdutosDaCompra(@Param("compraId") Long compraId);
	
}
