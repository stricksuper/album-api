package project.album.album_api.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.*;


@Entity
@Table(name="musicas")
public class Musica {
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
    
    
	@NotEmpty
	private String nome;
	
	
	private Integer duracao;
	
	
	@ManyToMany(mappedBy = "musicasInterpretes")
    private Set<@NotEmpty Artista> interpretes = new HashSet<>();
	
	@ManyToMany(mappedBy = "musicasComoAutor")
    private Set<@NotEmpty Artista> autores = new HashSet<>();

	@ManyToMany(mappedBy = "musicas")
    private Set<Album> albuns = new HashSet<>();
	 
	

	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public Integer getDuracao() {
		return duracao;
	}




	public String getAlbuns() {
		return albuns.toString();
	}




	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}




	public Set<Artista> getInterpretes() {
		return interpretes;
	}




	public void setInterpretes(Set<Artista> interpretes) {
		this.interpretes = interpretes;
	}




	public Set<Artista> getAutores() {
		return autores;
	}




	public void setAutores(Set<Artista> autores) {
		this.autores = autores;
	}








	public void setAlbuns(Set<Album> albuns) {
		this.albuns = albuns;
	}




	public Integer getId() {
		return id;
	}




	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Musica)) return false;
        Musica musica = (Musica) o;
        return Objects.equals(getId(), musica.getId());
    }

}
