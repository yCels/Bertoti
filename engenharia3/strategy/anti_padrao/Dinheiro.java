// Subclasse concreta — existe, mas não é usada pelo ProcessadorPagamento
// O processador usa String ao invés de polimorfismo
public class Dinheiro extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento em dinheiro: R$ " + valor);
    }
}
