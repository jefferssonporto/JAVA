package projetoyoutube.projetoyoutube;

/**
 *
 * @author Jeferson
 */
public class Visualizacao {
    private Publicos espectador;
    private Video filme;

    public Visualizacao(Publicos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setView(this.filme.getView() +1);
        
    }
    
    // 3 Métodos com o mesmo nome e com assinaturas diferentes dentro de uma mesma classe (Sobrecarga)
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <=50){
            tot = 5;
        } else if (porc <=90){
            tot =8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    
    public Publicos getEspectador() {
        return espectador;
    }

    public void setEspectador(Publicos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
