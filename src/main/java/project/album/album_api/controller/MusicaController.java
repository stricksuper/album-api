package project.album.album_api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
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
 
    
}
