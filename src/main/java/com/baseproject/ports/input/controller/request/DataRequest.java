package com.baseproject.ports.input.controller.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class DataRequest {

    @NotNull
    @Size(max = 15)
    private String name;

    @NotNull
    @Size(max = 15)
    private String country;

}
