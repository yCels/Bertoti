package antipadrao;


public class Aposentado extends Cliente {
// se herdar da super
    @Override
    public void emprestar(double emprestimo) {
        super.emprestar(emprestimo);
    }
}
