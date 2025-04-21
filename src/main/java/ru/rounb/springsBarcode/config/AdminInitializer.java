package ru.rounb.springsBarcode.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.rounb.springsBarcode.model.Institution;
import ru.rounb.springsBarcode.model.Role;
import ru.rounb.springsBarcode.repository.InstitutionRepository;

@Configuration
public class AdminInitializer {
    @Bean
    CommandLineRunner initAdmin(InstitutionRepository repository) {
        return args -> {
            if (repository.findInstitutionByLogin("admin") == null) {
                Institution admin = new Institution();
                admin.setKey("000");
                admin.setName("Admin");
                admin.setLogin("admin");
                admin.setPassword("7,tl1htptn");
                admin.setRole(Role.ADMIN);
                repository.save(admin);
            }
        };
    }
}