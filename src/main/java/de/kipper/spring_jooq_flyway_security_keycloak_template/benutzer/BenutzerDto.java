package de.kipper.spring_jooq_flyway_security_keycloak_template.benutzer;

import java.util.Objects;

public class BenutzerDto {

  private String name;

  public String getName() {
    return name;
  }

  public BenutzerDto setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BenutzerDto that = (BenutzerDto) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
