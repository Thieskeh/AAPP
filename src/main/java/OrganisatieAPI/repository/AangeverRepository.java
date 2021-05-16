package OrganisatieAPI.repository;

import OrganisatieAPI.model.Aangever;
import OrganisatieAPI.model.ModusOperandi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AangeverRepository extends JpaRepository<Aangever, Long> {
}