package de.kipper.spring_jooq_flyway_security_keycloak_template.benutzer;

import de.kipper.spring_jooq_flyway_security_keycloak_template.jooq.tables.daos.BenutzerDao;
import de.kipper.spring_jooq_flyway_security_keycloak_template.jooq.tables.pojos.Benutzer;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class BenutzerService {

  private final BenutzerDao benutzerDao;

  public BenutzerService(final BenutzerDao benutzerDao) {
    this.benutzerDao = benutzerDao;
  }

  public void createBenutzer(final BenutzerDto benutzerDto) {
    benutzerDao.insert(new Benutzer().setId(UUID.randomUUID()).setName(benutzerDto.getName()));
  }

  public BenutzerDto getBenutzer(final UUID benutzerId) {
    return benutzerDao
        .findOptionalById(benutzerId)
        .map(b -> new BenutzerDto().setName(b.getName()))
        .orElseThrow(
            (() ->
                new RuntimeException(
                    "Es konnte kein Benutzer mit der ID [%s] gefunden werden"
                        .formatted(benutzerId))));
  }
}
