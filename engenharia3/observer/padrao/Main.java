// PADRÃO CORRETO — Observer com interface
// Demonstra flexibilidade, extensibilidade e polimorfismo
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PADRÃO CORRETO: Observer com interface ===\n");

        Biblioteca biblioteca = new Biblioteca();

        // Cria os observers
        Observer email    = new EmailNotificador("admin@biblioteca.com");
        Observer sms      = new SMSNotificador("11999999999");
        Observer log      = new LogNotificador();
        Observer whatsapp = new WhatsAppNotificador("11988888888");

        // Registra os observers
        biblioteca.attach(email);
        biblioteca.attach(sms);
        biblioteca.attach(log);
        biblioteca.attach(whatsapp);

        // Ação 1: empréstimo — todos os 4 observers são notificados automaticamente
        System.out.println("-- Emprestando livro --");
        biblioteca.emprestarLivro("Dom Casmurro", "Maria");

        System.out.println();

        // Remove o SMS em tempo de execução — sem alterar nenhuma classe
        System.out.println("-- Removendo SMS (detach) --");
        biblioteca.detach(sms);

        System.out.println();

        // Ação 2: devolução — agora apenas 3 observers recebem
        System.out.println("-- Devolvendo livro (sem SMS) --");
        biblioteca.devolverLivro("Dom Casmurro", "Maria");

        System.out.println("\n--- Vantagens desta abordagem ---");
        System.out.println("1. Novo notificador: basta criar a classe e chamar attach()");
        System.out.println("2. Todos os observers usam o mesmo metodo update()");
        System.out.println("3. Pode adicionar/remover observers em tempo de execucao");
        System.out.println("4. Respeita o principio Aberto/Fechado (SOLID)");
    }
}
