package project.album.album_api.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.album.album_api.model.Musica;
import project.album.album_api.repository.MusicaRepository;

import java.util.List;
import java.util.Objects;
import java.util.Set;



@Service
public class MusicaService {
	
	private final MusicaRepository musicaRepository;
	private final GenericoService<Musica> genericoService;
	
	
	@Autowired
	public MusicaService(MusicaRepository musicaRepository) {
		this.musicaRepository = musicaRepository;
		this.genericoService = new GenericoService<>(musicaRepository);
		
	}
	
	
	 @Transactional(readOnly = true)
	    public List<Musica> todos() {
	        // ...
	        return genericoService.todos();
	   }
	 
	  @Transactional(readOnly = true)
	  Musica buscaPorId(Integer id) {
	  return genericoService.buscaPor(id );
	    }
	  
	  @Transactional
	    public Musica salva(Musica musica) {

	        return genericoService.salva(musica);
	    }
	  
	  @Transactional
	    public Musica atualiza(Integer id, Musica musica) {
	        return genericoService.atualiza(musica, id );
	    }
	  
	    @Transactional(readOnly = true)
	    public Musica buscaPor(Integer id) {
	        return genericoService.buscaPor(id );
	    }
	    
	    @Transactional
	    public void excluiPor(Integer id) {
	        genericoService.excluirPor(id );
	    }

}
