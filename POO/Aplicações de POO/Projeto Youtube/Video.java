package projetoyoutube.projetoyoutube;

/**
 *
 * @author Jeferson
 */
public class Video implements AcoesVideo {
    //Encapsulamento junto aos Getters e Setters
    private String titulo;
    private int avaliacao;
    private int view;
    private int curtidas;
    private boolean reproduzindo;

    
    //Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.view = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    
    //Getters e Setters.  / Encapsulamento
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.view;
        this.avaliacao = nova;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //Implementação do da Interface ACOESVIDEO
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    //Polimorfismo de Sobreposição 
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", view=" + view + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
