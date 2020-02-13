package project.album.album_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.album.album_api.model.*;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer>{
	Artista findByNome(String nome);

}
