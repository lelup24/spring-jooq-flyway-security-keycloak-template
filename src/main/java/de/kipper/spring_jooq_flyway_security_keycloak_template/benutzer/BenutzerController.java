package de.kipper.spring_jooq_flyway_security_keycloak_template.benutzer;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/benutzer")
public class BenutzerController {

  private final BenutzerService benutzerService;

  public BenutzerController(final BenutzerService benutzerService) {
    this.benutzerService = benutzerService;
  }

  @GetMapping("/{benutzerId}")
  public ResponseEntity<BenutzerDto> getBehutzer(@PathVariable final UUID benutzerId) {
    return ResponseEntity.ok(benutzerService.getBenutzer(benutzerId));
  }

  @GetMapping
  public ResponseEntity<String> getBehutzer() {
    return new ResponseEntity<>("katze", HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Void> postBehutzer(final BenutzerDto benutzerDto) {
    benutzerService.createBenutzer(benutzerDto);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
}
