package com.baseproject.ports.input.controller;

import com.baseproject.domain.model.DataModel;
import com.baseproject.domain.service.DataService;
import com.baseproject.ports.input.controller.mapper.DataMapper;
import com.baseproject.ports.input.controller.request.DataRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class BaseController {

    private final DataMapper mapper;
    private final DataService service;

    @QueryMapping
    public DataModel dataById(@Argument String dataId) {
        return service.find(dataId);
    }

    @MutationMapping
    public DataModel createData(@Argument @Valid DataRequest input) {
        DataModel dataToCreate = mapper.requestToModel(input);
        return service.create(dataToCreate);
    }
}
