package com.sportapp.ports.output.jpa.mapper;

import com.sportapp.domain.model.DataModel;
import com.sportapp.ports.output.jpa.entity.DataEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataModelMapper {

    DataModel entityToModel(DataEntity entity);

    DataEntity modelToEntity(DataModel data);
}