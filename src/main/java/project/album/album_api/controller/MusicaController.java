package project.album.album_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import project.album.album_api.model.Artista;
import project.album.album_api.model.Musica;
import project.album.album_api.service.MusicaService;


@RestController
@RequestMapping("/musicas")
public class MusicaController {	
	private final MusicaService musicaService;
	
    @Autowired
    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }
    
    @GetMapping
    public List<Musica> todos(){
    	return musicaService.todos();
    }
    @PostMapping
    public ResponseEntity<Musica> cria(@Validated @RequestBody Musica musica, HttpServletResponse response) {
        Musica musicaSalva = musicaService.salva(musica);


        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(musicaSalva );
    }
    
    @GetMapping("/{id}")
    public Musica buscaPor(@PathVariable Integer id) {
        return musicaService.buscaPor(id);
    }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualiza(@PathVariable Integer id, @Validated @RequestBody Musica musica ) {
        Musica musicaManager = musicaService.atualiza(id, musica );
        return ResponseEntity.ok(musicaManager );
    }
    
}
