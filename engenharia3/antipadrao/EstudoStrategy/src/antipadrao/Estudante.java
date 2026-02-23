package antipadrao;
public class Estudante extends Cliente {

    @Override
    public void emprestar(double emprestimo) {
        System.out.println("voce não pode emprestar dinheiro ");
    }
}
