package project.album.album_api.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.album.album_api.model.Artista;

import project.album.album_api.repository.ArtistaRepository;


import java.util.List;
import java.util.Optional;


@Service
public class ArtistaService {
	
	private final ArtistaRepository artistaRepository;
	private final GenericoService<Artista> genericoService;
	
	
	@Autowired
	public ArtistaService(ArtistaRepository artistaRepository) {
		this.artistaRepository = artistaRepository;
		this.genericoService = new GenericoService<>(artistaRepository);
		
	}
	
	
	 @Transactional(readOnly = true)
	    public List<Artista> todos() {
	        // ...
	        return genericoService.todos();
	   }
	 
	  @Transactional(readOnly = true)
	  Artista buscaPorId(Integer id) {
	  return genericoService.buscaPor(id );
	    }
	  
	    @Transactional(readOnly = true)
	    public Optional<Artista> buscaPor(String nome) {
	        return Optional.ofNullable( artistaRepository.findByNome(nome ) );
	    }	
	  @Transactional
	    public Artista salva(Artista artista) {

	        return genericoService.salva(artista);
	    }
	  
	  @Transactional
	    public Artista atualiza(Integer id, Artista artista) {
	        return genericoService.atualiza(artista, id );
	    }
	  
	    @Transactional(readOnly = true)
	    public Artista buscaPor(Integer id) {
	        return genericoService.buscaPor(id );
	    }
	    @Transactional
	    public void excluiPor(Integer id) {
	        genericoService.excluirPor(id );
	    }

}
