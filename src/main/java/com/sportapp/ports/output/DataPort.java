package com.sportapp.ports.output;

import com.sportapp.domain.model.DataModel;

public interface DataPort {

    DataModel createData(DataModel dataToCreate);

    DataModel findData(String id);
}
