package com.baseproject.ports.output;

import com.baseproject.domain.model.DataModel;

public interface DataEventPort {

    void notifyEvent(DataModel dataModel);
}
