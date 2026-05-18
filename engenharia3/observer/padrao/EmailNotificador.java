// PADRÃO CORRETO: Implementa a interface Observer
// A Biblioteca só conhece a interface — não essa classe diretamente
public class EmailNotificador implements Observer {
    private String email;

    public EmailNotificador(String email) {
        this.email = email;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("[EMAIL] Enviado para " + email + ": " + mensagem);
    }
}
