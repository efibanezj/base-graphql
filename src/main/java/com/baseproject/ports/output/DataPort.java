package com.baseproject.ports.output;

import com.baseproject.domain.model.DataModel;

public interface DataPort {

    DataModel createData(DataModel dataToCreate);

    DataModel findData(String id);
}
