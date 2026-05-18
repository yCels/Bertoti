// ANTI-PADRÃO — Strategy sem interface
// Demonstra os problemas da abordagem com if/else e Strings
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTI-PADRÃO: Strategy com if/else ===\n");

        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.processar("dinheiro", 50.0);
        System.out.println();
        processador.processar("pix", 150.0);
        System.out.println();
        processador.processar("cartao", 300.0);
        System.out.println();

        // Erro de digitação — o compilador não detecta, só falha em tempo de execução
        processador.processar("cartão", 300.0); // acento faz falhar silenciosamente

        System.out.println("\n--- Problemas desta abordagem ---");
        System.out.println("1. Adicionar 'boleto' exige modificar ProcessadorPagamento");
        System.out.println("2. String como tipo e fragil — erros so aparecem em execucao");
        System.out.println("3. Classe cresce indefinidamente a cada novo metodo");
        System.out.println("4. Viola o principio Aberto/Fechado (SOLID)");
    }
}
