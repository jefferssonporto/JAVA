/* Exemplo de um POO com uma caneta como exemplo e alguns de seus atributos e funcionalidades */ 

package aula02;

/**
 *
 * @author Jefferson
 */
public class Aula02 {

    public static void main(String[] args) {
       //Primeira Instancia
        Caneta c1 = new Caneta();
        //Atributos, não tem parenteses
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.status(); //Chamada para método, tem parenteses
        c1.rabiscar();
        
//Segundo Instacia
        Caneta c2 = new Caneta();
        c2.modelo = "Game";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
                
    }
}


