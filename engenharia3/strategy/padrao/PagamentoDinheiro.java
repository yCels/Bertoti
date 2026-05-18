// PADRÃO CORRETO: Cada forma de pagamento em sua própria classe
// Fácil de testar isoladamente, fácil de adicionar novas formas

public class PagamentoDinheiro implements EstrategiaPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("[DINHEIRO] Pagamento em dinheiro: R$ " + valor);
        System.out.println("[DINHEIRO] Troco calculado pelo caixa.");
    }
}
