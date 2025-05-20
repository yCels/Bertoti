# CELSO MOREIRA FREITAS 2 ADS

## ATIVIDADE 1

TEXTO 1
What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.


ANOTAÇÃO: O Texto 1 compara a engenharia de software com outras engenharias tradicionais, destacando que, embora os produtos criados por engenheiros de software sejam intangíveis, eles são reais e relevantes. No entanto, a engenharia de software ainda não alcançou o mesmo nível de rigor técnico exigido em áreas como a engenharia civil ou aeronáutica. Com o avanço da tecnologia e a crescente presença de software em diversas áreas da vida humana, torna-se cada vez mais necessário aplicar métodos mais confiáveis e disciplinados no desenvolvimento de sistemas. O texto aponta que é hora de tornar a prática da engenharia de software mais madura e precisa.

--- 

## ATIVIDADE 2

TEXTO 2
Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth



ANOTAÇÂO: O texto propõe que a engenharia de software vai além da simples programação, abrangendo todas as práticas, ferramentas e processos usados por uma organização para construir e manter código de forma sustentável ao longo do tempo. A principal ideia apresentada é que engenharia de software pode ser entendida como “programação ao longo do tempo”, considerando todas as fases do ciclo de vida do código — da concepção à descontinuação. O livro destaca três princípios fundamentais para orientar essa prática: a importância de considerar como o código precisará se adaptar com o tempo e diante de mudanças; como a organização deve evoluir à medida que cresce, enfrentando novos desafios de escala; e como as decisões técnicas sempre envolvem compensações e custos, que devem ser avaliados com base nas lições aprendidas ao lidar com o tempo, a mudança, a escala e o crescimento.

---

## ATIVIDADE 3

Código limpo vs. Desempenho
Usar código modular e legível (como funções bem separadas) facilita a manutenção, mas pode ser mais lento que código otimizado e mais difícil de entender.

Velocidade de entrega vs. Qualidade
Entregar um sistema rápido sem testes automatizados acelera o prazo, mas aumenta o risco de bugs e retrabalho.

Flexibilidade vs. Simplicidade
Criar um sistema genérico e configurável permite adaptações futuras, mas torna o código mais complexo e difícil de manter.

---

## ATIVIDADE 4
![image](https://github.com/user-attachments/assets/2e383721-b6ce-4ed9-b4f5-765850b69fa9)
A imagem do slide 57 faz uma relfexão sobre as etapas de desenvolvimento de um produto. E a partir dela se conclui que a melhor forma de desenvolver um produto novo é produzir um produto mínimo viavél(um protótipo mais simples , porém funcional)  em cada etapa até o desenvolvimento do produto final.

---

## ATIVIDADE 5

[Uplopackage estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    // Busca um produto pelo nome (retorna o primeiro encontrado)
    public Produto buscarProdutoNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null; // Se não encontrar
    }

    // Busca todos os produtos de um tipo (doce/salgado)
    public List<Produto> buscarProdutoTipo(String tipo) {
        List<Produto> encontrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getTipo().equalsIgnoreCase(tipo)) {
                encontrados.add(produto);
            }
        }
        return encontrados;
    }

    // Retorna todos os produtos (opcional)
    public List<Produto> getProdutos() {
        return produtos;
    }
}ading Estoque.java…]()




[Uplopackage estoque;

public class Produto {
    private String nome;
    private String tipo; // "doce" ou "salgado"

    public Produto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}ading Produto.java…]()




[Uploading Tpackage estoque;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class TesteEstoque {
    @Test
    void testBuscarProduto() {
        Estoque estoque = new Estoque();
        estoque.addProduto(new Produto("Brigadeiro", "doce"));
        estoque.addProduto(new Produto("Coxinha", "salgado"));
        estoque.addProduto(new Produto("Pudim", "doce"));

        // Verifica se há 3 produtos
        assertEquals(3, estoque.getProdutos().size());

        // Busca um produto pelo nome
        Produto produto = estoque.buscarProdutoNome("Coxinha");
        assertNotNull(produto);
        assertEquals("salgado", produto.getTipo());

        // Busca todos os doces
        List<Produto> doces = estoque.buscarProdutoTipo("doce");
        assertEquals(2, doces.size()); // Brigadeiro e Pudim
    }
}esteEstoque.java…]()


















