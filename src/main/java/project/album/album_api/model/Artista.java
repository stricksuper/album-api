package project.album.album_api.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="artistas")
public class Artista {
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String nacionalidade;
	
	
    @ManyToMany
    @JoinTable(
            name="musicas_interpretes",
            joinColumns = @JoinColumn(name = "id_artista"),
            inverseJoinColumns = @JoinColumn(name = "id_musica")
    )
    private Set<Musica> musicasInterpretes = new HashSet<>();
    
    @ManyToMany
    @JoinTable(
            name="musicas_autores",
            joinColumns = @JoinColumn(name = "id_artista"),
            inverseJoinColumns = @JoinColumn(name = "id_musica")
    )
    
    private Set<Musica> musicasComoAutor = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name="artistas_albuns",
            joinColumns = @JoinColumn(name = "id_artista"),
            inverseJoinColumns = @JoinColumn(name = "id_album")
    )
    private Set<Album> albuns_teste = new HashSet<>();
    
    
    
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getId() {
		return id;
	}
	
	
	
	
}
