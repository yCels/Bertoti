// PADRÃO CORRETO: Interface que define o contrato
// Todos os observadores DEVEM implementar update()
// Isso garante que a Biblioteca não precisa conhecer os detalhes de cada notificador
public interface Observer {
    void update(String mensagem);
}
