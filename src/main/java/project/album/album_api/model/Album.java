package project.album.album_api.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="albuns")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer ano;
	
    @ManyToMany(mappedBy = "albuns_teste")
	private Set<@NotEmpty Artista> participantes = new HashSet<>();
	@ManyToMany
    @JoinTable(
            name="musicas_albuns",
            joinColumns = @JoinColumn(name = "id_album"),
            inverseJoinColumns = @JoinColumn(name = "id_musica")
    )
	private Set<Musica> musicas= new HashSet<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Set<Musica> getMusicas() {
		return musicas;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void setParticipantes(Set<Artista> participantes) {
		this.participantes = participantes;
	}
	public Set<Artista> getParticipantes() {
		return participantes;
	}
	public void setMusicas_teste(Set<Musica> musicas) {
		this.musicas = musicas;
	}
	public Integer getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
