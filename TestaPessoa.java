
package exerciciofixacao;


public class TestaPessoa {
    public static void main(String[] args){
        Pessoa me = new Pessoa();
        
        me.nome = "Alexandre Cardoso";
        me.idade = 19;
        
        me.fazAniversario();
        me.fazAniversario();
        me.fazAniversario();
        
        String dados = me.nome +"\n"+ me.idade;
        System.out.println(dados);
        
        
    }
    
}
