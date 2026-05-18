// ANTI-PADRÃO: Classe abstrata sem utilidade real aqui
// O verdadeiro problema está em ProcessadorPagamento
public abstract class Pagamento {
    public abstract void processar(double valor);
}
