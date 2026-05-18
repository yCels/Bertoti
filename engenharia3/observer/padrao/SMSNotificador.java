// PADRÃO CORRETO: Implementa a interface Observer
// Agora o método também se chama update() — mesmo contrato que o Email
public class SMSNotificador implements Observer {
    private String telefone;

    public SMSNotificador(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("[SMS] Enviado para " + telefone + ": " + mensagem);
    }
}
