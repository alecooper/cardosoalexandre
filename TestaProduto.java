
package exerciciofixacao;


public class TestaProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.preco = 1000.00;
        p1.nome = "Armario";
        p1.diminuir10();
        
        String dados = p1.nome+"\n"+p1.preco;
        System.out.println(dados);
        
        Produto p2 = new Produto();
        p2.preco = 4000.00;
        p2.nome = "PC";
        p2.aumentar25();
        
        String dados2 = p2.nome+"\n"+p2.preco;
        System.out.println(dados2);
    }

}
