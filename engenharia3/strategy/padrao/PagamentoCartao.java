// PADRÃO CORRETO: Estratégia com lógica própria encapsulada aqui
public class PagamentoCartao implements EstrategiaPagamento {
    private int parcelas;

    public PagamentoCartao(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public void processar(double valor) {
        double valorParcela = valor / parcelas;
        System.out.println("[CARTAO] Pagamento no cartao de credito: R$ " + valor);
        System.out.printf("[CARTAO] %dx de R$ %.2f%n", parcelas, valorParcela);
        System.out.println("[CARTAO] Processando junto a operadora...");
    }
}
