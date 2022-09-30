package com.baseproject.ports.input.controller.mapper;

import com.baseproject.domain.model.DataModel;
import com.baseproject.ports.input.controller.request.DataRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper {

    DataModel requestToModel(DataRequest request);

}