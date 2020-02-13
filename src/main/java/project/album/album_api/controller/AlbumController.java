package project.album.album_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.album.album_api.model.Album;
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
}
