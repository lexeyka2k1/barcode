package ru.rounb.springsBarcode.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.rounb.springsBarcode.model.Institution;
import ru.rounb.springsBarcode.service.InstitutionService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/institutions")
@AllArgsConstructor
public class InstitutionController {
    private final InstitutionService service;

    @GetMapping
    public List<Institution> findAllInstitution() {
        return service.findAllInstitution();
    }

    @PostMapping("save_institution")
    public Institution saveInstitution(@RequestBody Institution institution) {
        return service.saveInstitution(institution);
    }

    @GetMapping("/{id}")
    public Institution findByKey(@PathVariable String key) {
        return service.findByKey(key);
    }
    @PutMapping("update_institution")
    public Institution updateInstitution(Institution institution) {
        return service.updateInstitution(institution);
    }

    @DeleteMapping ("delete_institution/{key}")
    public void deleteInstitution(@PathVariable String key){
        service.deleteInstitution(key);
    }

    @DeleteMapping ("delete_all_institution")
    public void deleteAllInstitution(){
        service.deleteAllInstitution();
    }
}
