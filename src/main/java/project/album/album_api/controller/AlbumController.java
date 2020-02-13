package project.album.album_api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import project.album.album_api.model.Album;
import project.album.album_api.model.Artista;
import project.album.album_api.model.Musica;
import project.album.album_api.service.AlbumService;


@RestController
@RequestMapping("/albuns")
public class AlbumController {
	private final AlbumService albumService;
	
    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }
    
    @GetMapping
    public List<Album> todos(){
    	return albumService.todos();
    }
    @GetMapping("/{id}")
    public Album buscaPor(@PathVariable Integer id) {
        return albumService.buscaPor(id);
    }
    
    @PostMapping
    public ResponseEntity<Album> cria(@Validated @RequestBody Album album, HttpServletResponse response) {
        Album albumSalvo = albumService.salva(album);


        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(albumSalvo );
    }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<Album> atualiza(@PathVariable Integer id, @Validated @RequestBody Album album ) {
        Album albumManager = albumService.atualiza(id, album );
        return ResponseEntity.ok(albumManager );
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void exclui(@PathVariable Integer id) {
        albumService.excluiPor(id);
    }
}
