/* Chamada do código */

package aula02;

/**
 *
 * @author Jeferson
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){ 
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor); 
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada ? " + this.tampada); 
    }
    
    void rabiscar(){
        // Se estiver tampada exibir a primeira mensagem, se não a segunda 
        if (this.tampada == true){
        System.out.println("ERRO, não posso rabiscar");
    } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}

