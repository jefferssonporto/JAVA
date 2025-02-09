
package projetopessoas.projetopessoas;

/**
 *
 * @author Jeferson
 */
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos
    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;  
    }
    
    //Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    
    
}