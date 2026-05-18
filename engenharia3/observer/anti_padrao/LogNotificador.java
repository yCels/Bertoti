// ANTI-PADRÃO: Mais uma classe concreta sem interface
// Problema: método se chama "registrar" — nome completamente diferente dos outros
// Não há nenhum padrão entre os notificadores
public class LogNotificador {
    public void registrar(String mensagem) {
        System.out.println("[LOG] Registro: " + mensagem);
    }
}
