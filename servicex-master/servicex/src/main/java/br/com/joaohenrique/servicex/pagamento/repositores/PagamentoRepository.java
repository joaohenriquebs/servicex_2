package br.com.joaohenrique.servicex.pagamento.repositores;

import br.com.joaohenrique.servicex.pagamento.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {
}