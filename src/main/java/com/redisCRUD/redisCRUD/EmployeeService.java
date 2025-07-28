package com.redisCRUD.redisCRUD;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public Optional<Employee> getById(String id) {
        return repository.findById(id);
    }

    public Iterable<Employee> getAll() {
        return repository.findAll();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
