// PADRÃO CORRETO: Nova estratégia sem modificar nenhuma classe existente
public class PagamentoPix implements EstrategiaPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processar(double valor) {
        System.out.println("[PIX] Pagamento via Pix: R$ " + valor);
        System.out.println("[PIX] Chave: " + chavePix);
        System.out.println("[PIX] Aprovacao instantanea.");
    }
}
