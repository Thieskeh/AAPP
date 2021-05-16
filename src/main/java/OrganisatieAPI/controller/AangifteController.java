package OrganisatieAPI.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import OrganisatieAPI.model.Aangever;
import OrganisatieAPI.model.Agent;
import OrganisatieAPI.model.ModusOperandi;
import OrganisatieAPI.repository.AangeverRepository;
import OrganisatieAPI.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import OrganisatieAPI.model.Aangifte;
import OrganisatieAPI.repository.AangifteRepository;
import OrganisatieAPI.repository.ModusOperandiRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AangifteController {
    
    @Autowired
    AangifteRepository aangifteRepository;

    @Autowired
    ModusOperandiRepository modusOperandiRepository;

    @Autowired
    AgentRepository agentRepository;

    @Autowired
    AangeverRepository aangeverRepository;


    @GetMapping("/aangiftes")
    public ResponseEntity<List<Aangifte>> getAllAangiftes() {
      try {
        List<Aangifte> aangiftes = aangifteRepository.findAll();
  
        if (aangiftes.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
  
        return ResponseEntity.ok(aangiftes);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @GetMapping("/aangiftes/{id}")
    public ResponseEntity<Aangifte> getAangifteById(@PathVariable("id") long id) {
      Optional<Aangifte> aangifteData = aangifteRepository.findById(id);

        return aangifteData.map(aangifte -> new ResponseEntity<>(aangifte, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/aangiftes/create")
    public ResponseEntity<Aangifte> createAangifte(@RequestBody Aangifte aangifte){
      try{
        Aangifte _aangifte = aangifteRepository
                  .save(new Aangifte(aangifte.getDate(), aangifte.getModusOperandi(), aangifte.getAangever(), aangifte.getOmschrijving(), aangifte.getAgent()));
        return new ResponseEntity<>(_aangifte, HttpStatus.CREATED);
      }catch(Exception e){
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @GetMapping("/ModusOperandi")
    public ResponseEntity<List<ModusOperandi>> getAllModusOperandi() {
        try {
            List<ModusOperandi> modusOperandiList = modusOperandiRepository.findAll();

            if (modusOperandiList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return ResponseEntity.ok(modusOperandiList);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Agenten")
    public ResponseEntity<List<Agent>> getAllAgenten() {
        try {
            List<Agent> agentList = agentRepository.findAll();

            if (agentList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return ResponseEntity.ok(agentList);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Aangevers")
    public ResponseEntity<List<Aangever>> getAllAangevers() {
        try {
            List<Aangever> aangeverList = aangeverRepository.findAll();

            if (aangeverList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return ResponseEntity.ok(aangeverList);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
