package com.kelsonthony.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodios;

    /**
     *  1 - Alocado espaço em memória para o objeto
     *  2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
     *  3 - Bloco de inicializacao é executado
     *  4 - Construtor é iniciado
     *  */

    public Anime(String nome) {
        this.nome = nome;
    }
    {
        System.out.println("Bloco de inicializacao");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {


        for (int episodio: this.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
