package project.album.album_api.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;


public class Musica {
	
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
    
    
	@NotEmpty
	private String nome;
	
	
	private Integer duracao;
	
	@OneToMany(mappedBy = "artista", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<@NotEmpty Artista> artistas = new LinkedHashSet<>();

	 
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getDuracao() {
		return duracao;
	}


	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
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
