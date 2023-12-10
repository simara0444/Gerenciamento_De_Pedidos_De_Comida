package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IRelacionamentoPagamentoClienteController;

import java.util.HashMap;
import java.util.Map;

public class RelacionamentoPagamentoClienteController implements IRelacionamentoPagamentoClienteController {
    private Map<Integer, Integer> pagamentoClienteMap;
    public RelacionamentoPagamentoClienteController() {
        this.pagamentoClienteMap = new HashMap<>();
    }

    public void associarPagamentoCliente(int idPagamento, int idCliente) {
        pagamentoClienteMap.put(idPagamento, idCliente);
    }

    public int encontrarClienteAssociadoAoPagamento(int idPagamento) {
        return pagamentoClienteMap.getOrDefault(idPagamento, -1);

    }
}
