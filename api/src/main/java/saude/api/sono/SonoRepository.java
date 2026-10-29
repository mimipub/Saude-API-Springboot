package saude.api.sono;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SonoRepository extends JpaRepository<Sono, Long> {
    List<Sono> id(Long id);
}
