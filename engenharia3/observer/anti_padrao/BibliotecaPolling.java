// ANTI-PADRÃO: Acoplamento direto com todos os notificadores
// Problemas:
//   1. Para adicionar um novo notificador (ex: WhatsApp), é preciso MODIFICAR esta classe
//   2. Não é possível desativar um notificador sem alterar o código
//   3. Viola o Princípio Aberto/Fechado (OCP) do SOLID
//   4. Impossível usar polimorfismo — cada chamada é diferente
public class BibliotecaPolling {
    private EmailNotificador emailNotificador;
    private SMSNotificador smsNotificador;
    private LogNotificador logNotificador;

    public BibliotecaPolling() {
        // Acoplamento rígido: cria os notificadores diretamente
        this.emailNotificador = new EmailNotificador("admin@biblioteca.com");
        this.smsNotificador   = new SMSNotificador("11999999999");
        this.logNotificador   = new LogNotificador();
    }

    public void emprestarLivro(String livro, String cliente) {
        System.out.println("Livro '" + livro + "' emprestado para " + cliente);

        String mensagem = "Livro '" + livro + "' foi emprestado para " + cliente;

        // Precisa chamar cada notificador manualmente — métodos com nomes diferentes!
        emailNotificador.enviarNotificacao(mensagem);
        smsNotificador.enviarSMS(mensagem);       // nome diferente!
        logNotificador.registrar(mensagem);        // nome diferente!
    }

    public void devolverLivro(String livro, String cliente) {
        System.out.println("Livro '" + livro + "' devolvido por " + cliente);

        String mensagem = "Livro '" + livro + "' foi devolvido por " + cliente;

        // Repetição: obrigado a chamar tudo de novo manualmente
        emailNotificador.enviarNotificacao(mensagem);
        smsNotificador.enviarSMS(mensagem);
        logNotificador.registrar(mensagem);
    }
}
