package com.baseproject.ports.output.jpa.mapper;

import com.baseproject.domain.model.DataModel;
import com.baseproject.ports.output.jpa.entity.DataEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataModelMapper {

    DataModel entityToModel(DataEntity entity);

    DataEntity modelToEntity(DataModel data);
}