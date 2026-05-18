// PADRÃO CORRETO: Nova estratégia adicionada SEM modificar Venda nem outras classes
// Isso é o Princípio Aberto/Fechado (OCP) em ação
public class PagamentoBoleto implements EstrategiaPagamento {

    @Override
    public void processar(double valor) {
        System.out.println("[BOLETO] Gerando boleto: R$ " + valor);
        System.out.println("[BOLETO] Vencimento em 3 dias uteis.");
        System.out.println("[BOLETO] Codigo de barras gerado.");
    }
}
