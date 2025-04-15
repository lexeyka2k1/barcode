package ru.rounb.springsBarcode.repository;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.rounb.springsBarcode.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    void deleteByKey(String key);
    Institution findInstitutionByKey(String key);
    Institution findInstitutionByLogin(String login);
}
