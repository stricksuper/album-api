package project.album.album_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.album.album_api.model.Album;
import project.album.album_api.repository.AlbumRepository;

import java.util.List;

@Service
public class AlbumService {
	
	private final AlbumRepository albumRepository;
	private final GenericoService<Album> genericoService;
	
	
	@Autowired
	public AlbumService(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
		this.genericoService = new GenericoService<>(albumRepository);
		
	}
	
	
	 @Transactional(readOnly = true)
	    public List<Album> todos() {
	        // ...
	        return genericoService.todos();
	   }
	 
	  @Transactional(readOnly = true)
	  Album buscaPorId(Integer id) {
	  return genericoService.buscaPor(id );
	    }
	  
	  @Transactional
	    public Album salva(Album album) {

	        return genericoService.salva(album);
	    }
	  
	  @Transactional
	    public Album atualiza(Integer id, Album album) {
	        return genericoService.atualiza(album, id );
	    }
	  
	    @Transactional(readOnly = true)
	    public Album buscaPor(Integer id) {
	        return genericoService.buscaPor(id );
	    }
	    @Transactional
	    public void excluiPor(Integer id) {
	        genericoService.excluirPor(id );
	    }

}
