package projetoyoutube.projetoyoutube;

/**
 *
 * @author Jeferson
 */
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Video 1");
        v[1] = new Video ("Video 2");
        v[2] = new Video ("Video 3 ");
             
        Publicos p[] = new Publicos[2];
        p[0] = new Publicos ("Jubileu", 22, "M", "juba");
        p[1] = new Publicos ("Creuza", 12, "F", "creuzita");
        
        /* System.out.println("VÍDEOS\n -------------------- ");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("PUBLICOS \n -------------------- ");
        System.out.println(p[0].toString());
        System.out.println(p[1].toString());
        */
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao (p[0], v[2]); //Jubileu assiste video 3
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
         vis[1] = new Visualizacao (p[0], v[1]); //Jubileu assiste Video 2
         vis[0].avaliar(35.0f);
         System.out.println(vis[1].toString());
        
        
    }
}
