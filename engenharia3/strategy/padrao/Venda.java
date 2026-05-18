// PADRÃO CORRETO: Context — usa a estratégia sem conhecer sua implementação
// Venda só depende da interface EstrategiaPagamento
// A estratégia pode ser trocada em tempo de execução
public class Venda {
    private EstrategiaPagamento estrategia;
    private String produto;

    public Venda(String produto, EstrategiaPagamento estrategia) {
        this.produto   = produto;
        this.estrategia = estrategia;
    }

    // Permite trocar a estratégia em tempo de execução
    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void pagar(double valor) {
        System.out.println("Produto: " + produto + " | Valor: R$ " + valor);
        estrategia.processar(valor);  // delega para a estratégia correta
    }
}
