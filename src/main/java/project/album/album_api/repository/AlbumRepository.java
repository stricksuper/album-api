package project.album.album_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.album.album_api.model.*;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
