// ANTI-PADRÃO: Classe concreta sem interface
// Problema: BibliotecaPolling depende diretamente dessa classe
// Se mudar o método, quebra a BibliotecaPolling
public class EmailNotificador {
    private String email;

    public EmailNotificador(String email) {
        this.email = email;
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("[EMAIL] Enviado para " + email + ": " + mensagem);
    }
}
