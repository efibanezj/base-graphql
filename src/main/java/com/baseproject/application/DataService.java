package com.baseproject.application;

import com.baseproject.domain.DataModel;
import com.baseproject.ports.output.DataEventPort;
import com.baseproject.ports.output.DataPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

    private final DataPort dataPort;
    private final DataEventPort eventPort;

    public DataModel create(DataModel dataToCreate) {
        //We can validate if the data already exist or another business logic
        DataModel dataCreated = dataPort.createData(dataToCreate);
        eventPort.notifyEvent(dataCreated);
        return dataCreated;
    }

    public DataModel find(String id) {
        return dataPort.findData(id);
    }
}
