package com.sportapp.ports.input.controller.mapper;

import com.sportapp.domain.model.DataModel;
import com.sportapp.ports.input.controller.request.DataRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper {

    DataModel requestToModel(DataRequest request);

}