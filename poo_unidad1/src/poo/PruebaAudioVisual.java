package poo;

import documental.Documental;
import documental.Investigador;
import pelicula.Actor;
import pelicula.Pelicula;
import serieDeTv.SerieDeTV;
import serieDeTv.Temporada;
import tikTok.TikTok;
import tikTok.Influencer;
import videoMusical.VideoMusical;
import videoMusical.Artista;

public class PruebaAudioVisual {

    public static void main(String[] args) {

        System.out.println("=== MI CATÁLOGO AUDIOVISUAL ===");
        System.out.println("=====================================");

        //CREACIÓN DE UNA PELÍCULA Y SUS ACTORES
        //Pelìcula
        System.out.println("Pelicula");
        Pelicula pelicula1 = new Pelicula("Terribles", 170, "Ciencia Ficción", "Cuenca Films");
        //Actor
        pelicula1.agregarActor(new Actor("Mateo Vivar", 2005));
        pelicula1.agregarActor(new Actor("Zoe Swin", 2000));

        pelicula1.mostrarDetalles();
        System.out.println("-------------------------------------");


        //CREACIÓN DE UNA SERIE Y SUS TEMPORADAS ---
        //Serie
        System.out.println("Serie");
        SerieDeTV serie1 = new SerieDeTV("Game of Thrones", 70, "Fantasía", 3);

        //Temporadas
        serie1.agregarTemporada(new Temporada(1, 10));
        serie1.agregarTemporada(new Temporada(2, 10));
        serie1.agregarTemporada(new Temporada(3, 10));

        serie1.mostrarDetalles();
        System.out.println("---------------------------------------");


        //CREACIÓN DE UN DOCUMENTAL Y SUS INVESTIGADORES ---
        //Documental
        System.out.print("Documental");
        Documental docu1 = new Documental("Ecuador maravillas", 45, "Divulgación Científica", "Turismo");

        //Investigador
        docu1.agregarInvestigador(new Investigador("Julio Perez", "Astrofísico"));
        docu1.agregarInvestigador(new Investigador("Julio Mendoza", "Astrofísico"));

        docu1.mostrarDetalles();
        System.out.println("-----------------------------------------");
        
        //CREACIÓN DE UNA videos de tiktok
        System.out.println("Tik Tok");
        TikTok tiktok1 = new TikTok("Haciendo cuy",5,"Comedia", "Cuyfilms");
        //Influencer
        tiktok1.agregarInfluencer(new Influencer("Albert", "Cuymania"));
        tiktok1.agregarInfluencer(new Influencer("Ismael", "Cumanda"));
   

        tiktok1.mostrarDetalles();
        System.out.println("-------------------------------------");

        
      //CREACIÓN DE UN VIDEO MUSICAL
        System.out.println("Video musical");
        VideoMusical videomusical1 = new VideoMusical("Ecuador amazonico",4,"POP","Sony");
        //ARTISTA
        videomusical1.agregarArtista(new Artista("Juan", 22));
        videomusical1.agregarArtista(new Artista("Pepe", 18));
   

        videomusical1.mostrarDetalles();
        System.out.println("-------------------------------------");

    }
}