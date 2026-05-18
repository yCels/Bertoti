// ANTI-PADRÃO: Classe concreta sem interface
// Problema: método tem nome diferente de EmailNotificador (enviarSMS vs enviarNotificacao)
// Não há contrato comum — cada notificador faz do seu jeito
public class SMSNotificador {
    private String telefone;

    public SMSNotificador(String telefone) {
        this.telefone = telefone;
    }

    public void enviarSMS(String mensagem) {
        System.out.println("[SMS] Enviado para " + telefone + ": " + mensagem);
    }
}
