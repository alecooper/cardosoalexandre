
package exerciciofixacao;



public class TestaPorta {
    public static void main(String[] args){
        Porta p1 = new Porta();
        
        p1.cor = "azul";
        p1.dimensaoX = 1;
        p1.dimensaoY = 2;
        p1.dimensaoZ = 3;
        
        p1.pinta("azul");
        p1.pinta("vermelho");
        
        System.out.println("Cor da porta: "+ p1.cor); 
        
        p1.abre();
        p1.fecha();
        
        if(p1.aberta){
            System.out.println("Aberta");
        }else{
            System.out.println("Fechada");
        }
    }
    
}
