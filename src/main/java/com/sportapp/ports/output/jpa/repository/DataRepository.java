package com.sportapp.ports.output.jpa.repository;

import com.sportapp.ports.output.jpa.entity.DataEntity;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<DataEntity, String> {
}
