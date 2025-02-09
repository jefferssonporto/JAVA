package projetopessoas.projetopessoas;

/**
 *
 * @author Jeferson
 */
public class Aluno extends Pessoa {
    //Atributos
    private int mat;
    private String curso;
    
    //Métodos
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }
    
    //Métodos Especiais
    public int getMatricula() {
        return mat;
    }

    public void setMatricula(int matricula) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
