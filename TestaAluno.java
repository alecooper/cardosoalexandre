
package exerciciofixacao;


public class TestaAluno {
    public static void main(String[] args){
        
        Data nascimento = new Data();
        nascimento.dia = "25";
        nascimento.mes = "11";
        nascimento.ano = "1999";
                
                
                
        Aluno a1 = new Aluno();
        a1.nome = "nome: "+"Alexandre Cardoso";
        a1.cpf = "cpf: "+"138-815-246-06";
        a1.dataDeNascimento = nascimento;
        
        String dados = a1.imprimir();
      
        System.out.println(dados);
        
    }
       
}
