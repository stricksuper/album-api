package project.album.album_api.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.album.album_api.model.Artista;
import project.album.album_api.model.Musica;
import project.album.album_api.service.ArtistaService;
import project.album.album_api.service.MusicaService;


@RestController
@RequestMapping("/artistas")
public class ArtistaController {
private final ArtistaService artistaService;
	
    @Autowired
    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }
    
    @GetMapping
    public List<Artista> todos(){
    	return artistaService.todos();
    }
    
    @PostMapping
    public ResponseEntity<Artista> cria(@Validated @RequestBody Artista artista, HttpServletResponse response) {
        Artista artistaSalvo = artistaService.salva(artista);


        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(artistaSalvo );
    }
    
    @GetMapping("/{id}")
    public Artista buscaPor(@PathVariable Integer id) {
        return artistaService.buscaPor(id);
    }
}
