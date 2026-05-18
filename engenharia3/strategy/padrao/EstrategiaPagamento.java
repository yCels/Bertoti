// PADRÃO CORRETO: Interface que define o contrato de todas as estratégias
// A classe Venda depende apenas desta interface — não das implementações concretas
public interface EstrategiaPagamento {
    void processar(double valor);
}
