/* Chamada do código com os modificadores */


package aula02;

/**
 *
 * @author Jeferson
 */
public class Aula02 {

    public static void main(String[] args) {
       //Primeira Instancia
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
       // c1.tampada = false;
       c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
