package ru.rounb.springsBarcode.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rounb.springsBarcode.model.Institution;
import ru.rounb.springsBarcode.repository.InMemoryInstitutionDAO;
import ru.rounb.springsBarcode.service.InstitutionService;

import java.util.List;


@AllArgsConstructor
public class InMemoryInstitutionServiceImpl implements InstitutionService {
    private final InMemoryInstitutionDAO repository;
    @Override
    public List<Institution> findAllInstitution() {
        return repository.findAllInstitution();
    }

    @Override
    public Institution saveInstitution(Institution institution) {
        return repository.saveInstitution(institution);
    }

    @Override
    public Institution findByKey(String key) {
        return repository.findByKey(key);
    }

    @Override
    public Institution updateInstitution(Institution institution) {
        return repository.updateInstitution(institution);
    }

    @Override
    public void deleteInstitution(String key) {
        repository.deleteInstitution(key);
    }

    @Override
    public void deleteAllInstitution() {
        repository.deleteAllInstitution();
    }

    @Override
    public Institution authenticate(String login, String password) {
        return repository.findAllInstitution().stream()
                .filter(institution -> institution.getLogin().equals(login))
                .filter(institution -> institution.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
}
