import java.util.ArrayList;
import java.util.List;

// PADRÃO CORRETO: Subject (observável)
// A Biblioteca não conhece NENHUM notificador específico
// Ela só sabe que os observers têm o método update()
// Para adicionar novo notificador: basta criar a classe e chamar attach() — sem tocar aqui
public class Biblioteca {
    private List<Observer> observers = new ArrayList<>();

    // Adiciona um observer à lista
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Remove um observer da lista (flexibilidade em tempo de execução)
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Notifica todos os observers com uma única chamada em loop
    private void notificarObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }

    public void emprestarLivro(String livro, String cliente) {
        System.out.println("Livro '" + livro + "' emprestado para " + cliente);
        notificarObservers("Livro '" + livro + "' foi emprestado para " + cliente);
    }

    public void devolverLivro(String livro, String cliente) {
        System.out.println("Livro '" + livro + "' devolvido por " + cliente);
        notificarObservers("Livro '" + livro + "' foi devolvido por " + cliente);
    }
}
