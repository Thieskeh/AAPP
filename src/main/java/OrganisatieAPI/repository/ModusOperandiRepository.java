package OrganisatieAPI.repository;

import OrganisatieAPI.model.ModusOperandi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModusOperandiRepository extends JpaRepository<ModusOperandi, Long> {
}