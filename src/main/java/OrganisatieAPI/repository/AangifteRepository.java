package OrganisatieAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import OrganisatieAPI.model.Aangifte;

public interface AangifteRepository extends JpaRepository<Aangifte, Long> {
}