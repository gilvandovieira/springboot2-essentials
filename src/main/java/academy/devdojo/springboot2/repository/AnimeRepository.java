package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Integer> {

    List<Anime> findByName(String name);
}
