// PADRÃO CORRETO: Novo notificador adicionado SEM modificar nenhuma classe existente
// Isso demonstra o Princípio Aberto/Fechado (OCP): aberto para extensão, fechado para modificação
public class WhatsAppNotificador implements Observer {
    private String numero;

    public WhatsAppNotificador(String numero) {
        this.numero = numero;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("[WHATSAPP] Mensagem para " + numero + ": " + mensagem);
    }
}
