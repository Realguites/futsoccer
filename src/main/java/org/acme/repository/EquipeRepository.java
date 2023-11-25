package org.acme.repository;

import org.acme.model.Equipe;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EquipeRepository implements PanacheRepository<Equipe> {
    // Métodos específicos do repositório, se necessário
}