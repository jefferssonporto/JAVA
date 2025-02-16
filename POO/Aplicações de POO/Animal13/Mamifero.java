/* Java Class estendido com Animal */ 

package animal13.animal13;

/**
 *
 * @author Jeferson
 */
public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero ");
    }
    
}