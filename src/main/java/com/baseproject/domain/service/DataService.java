package com.baseproject.domain.service;

import com.baseproject.domain.model.DataModel;
import com.baseproject.ports.output.DataPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

    private final DataPort dataPort;

    public DataModel create(DataModel dataToCreate) {
        //We can validate if the data already exist or another business logic
        DataModel dataCreated = dataPort.createData(dataToCreate);

        return dataCreated;
    }

    public DataModel find(String id) {
        return dataPort.findData(id);
    }
}
