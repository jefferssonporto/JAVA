/* Utilização dos Modificadores de Visibilidade  */

package aula02;

/**
 *
 * @author Jeferson
 */
public class Caneta {
   public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){ 
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor); 
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada ? " + this.tampada); 
    }
    
    public void rabiscar(){
        if (this.tampada == true){
        System.out.println("ERRO, não posso rabiscar");
    } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
     public void destampar(){
        this.tampada = false;
    }
}













