// ANTI-PADRÃO — Observer sem interface
// Demonstra os problemas do acoplamento direto
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTI-PADRÃO: Observer sem interface ===\n");

        BibliotecaPolling biblioteca = new BibliotecaPolling();

        biblioteca.emprestarLivro("Dom Casmurro", "Maria");
        System.out.println();
        biblioteca.devolverLivro("Dom Casmurro", "Maria");

        System.out.println("\n--- Problemas desta abordagem ---");
        System.out.println("1. Para adicionar WhatsApp, é preciso editar BibliotecaPolling");
        System.out.println("2. Cada notificador tem método com nome diferente");
        System.out.println("3. Impossível remover um notificador em tempo de execucao");
        System.out.println("4. Viola o principio Aberto/Fechado (SOLID)");
    }
}
