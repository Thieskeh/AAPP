package OrganisatieAPI.repository;

import OrganisatieAPI.model.Aangifte;
import OrganisatieAPI.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
}