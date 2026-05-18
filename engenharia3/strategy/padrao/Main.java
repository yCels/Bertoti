// PADRÃO CORRETO — Strategy com interface
// Demonstra troca de estratégia em tempo de execução e extensibilidade
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PADRÃO CORRETO: Strategy com interface ===\n");

        // Pagamento em dinheiro
        Venda venda1 = new Venda("Notebook", new PagamentoDinheiro());
        venda1.pagar(2500.0);

        System.out.println();

        // Pagamento via Pix
        Venda venda2 = new Venda("Mouse", new PagamentoPix("loja@empresa.com"));
        venda2.pagar(150.0);

        System.out.println();

        // Pagamento no cartão parcelado
        Venda venda3 = new Venda("Monitor", new PagamentoCartao(6));
        venda3.pagar(1800.0);

        System.out.println();

        // Troca de estratégia em tempo de execução — sem alterar nada
        System.out.println("-- Cliente mudou de ideia: vai pagar no boleto --");
        venda3.setEstrategia(new PagamentoBoleto());
        venda3.pagar(1800.0);

        System.out.println("\n--- Vantagens desta abordagem ---");
        System.out.println("1. Novo pagamento: basta criar classe que implementa EstrategiaPagamento");
        System.out.println("2. Sem if/else — compilador garante que o tipo esta correto");
        System.out.println("3. Cada estrategia pode ser testada isoladamente");
        System.out.println("4. Respeita o principio Aberto/Fechado (SOLID)");
    }
}
