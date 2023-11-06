package com.example.mvc.dao;

import com.example.mvc.entity.Affair;

import java.util.List;

public interface AffairRepository {
    List<Affair> getAll();
    void save(Affair affair);

    Affair findById(Integer id);

    void delete(Integer id);
}
