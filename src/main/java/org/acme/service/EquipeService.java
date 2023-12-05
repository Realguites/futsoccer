package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

import org.acme.model.Equipe;
import org.acme.repository.EquipeRepository;

@ApplicationScoped
public class EquipeService {

    @Inject
    EquipeRepository equipeRepository;

    public List<Equipe> getAllEquipes() {
        return equipeRepository.listAll();
    }

    public Equipe getEquipeById(Long id) {
        return equipeRepository.findById(id);
    }

    @Transactional
    public void createEquipe(Equipe equipe) {
        equipeRepository.persist(equipe);
    }

    @Transactional
    public void createEquipes(List<Equipe> equipes) {
        equipeRepository.persist(equipes);
    }

    @Transactional
    public void updateEquipe(Long id, Equipe equipe) {
        Equipe existingEquipe = equipeRepository.findById(id);
        if (existingEquipe != null) {
            existingEquipe.setName(equipe.getName());
            // Atualize outros campos conforme necessário
        }
    }

    @Transactional
    public void deleteEquipe(Long id) {
        equipeRepository.deleteById(id);
    }
}
