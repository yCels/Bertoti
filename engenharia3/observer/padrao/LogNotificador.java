// PADRÃO CORRETO: Implementa a interface Observer
// Todos os notificadores têm o mesmo método update() — polimorfismo em ação
public class LogNotificador implements Observer {

    @Override
    public void update(String mensagem) {
        System.out.println("[LOG] Registro: " + mensagem);
    }
}
