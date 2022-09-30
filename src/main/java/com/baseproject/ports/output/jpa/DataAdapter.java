package com.baseproject.ports.output.jpa;

import com.baseproject.domain.model.DataModel;
import com.baseproject.ports.output.jpa.mapper.DataModelMapper;
import com.baseproject.ports.output.DataPort;
import com.baseproject.ports.output.jpa.entity.DataEntity;
import com.baseproject.ports.output.jpa.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataAdapter implements DataPort {

    private final DataRepository repository;
    private final DataModelMapper mapper;

    @Override
    public DataModel createData(DataModel dataToCreate) {
        DataEntity dataEntityToCreate = mapper.modelToEntity(dataToCreate);
        DataEntity dataEntityCreated = repository.save(dataEntityToCreate);
        return mapper.entityToModel(dataEntityCreated);
    }

    @Override
    public DataModel findData(String id) {
        DataEntity entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Data not found"));
        return mapper.entityToModel(entity);
    }
}
