// ANTI-PADRÃO: A classe fica gigante com muitos IF/ELSE
// Problemas:
//   1. Para adicionar "boleto", é preciso MODIFICAR esta classe
//   2. A classe conhece todos os tipos de pagamento — alto acoplamento
//   3. Difícil de testar (precisa testar tudo junto)
//   4. Viola o Princípio Aberto/Fechado (OCP) do SOLID
//   5. Usar String como tipo é frágil — erro de digitação não é detectado pelo compilador
public class ProcessadorPagamento {

    public void processar(String tipo, double valor) {
        if (tipo.equals("dinheiro")) {
            System.out.println("Pagamento em dinheiro: R$ " + valor);

        } else if (tipo.equals("pix")) {
            System.out.println("Pagamento via Pix: R$ " + valor);
            System.out.println("Chave Pix: empresa@pagamentos.com");

        } else if (tipo.equals("cartao")) {
            System.out.println("Pagamento no cartao de credito: R$ " + valor);
            System.out.println("Processando junto a operadora...");

        } else if (tipo.equals("boleto")) {
            System.out.println("Gerando boleto: R$ " + valor);
            System.out.println("Vencimento em 3 dias uteis.");

        } else {
            // Erro só aparece em tempo de execução — o compilador não ajuda
            System.out.println("Tipo de pagamento desconhecido: " + tipo);
        }
    }
}
