package com.baseproject.ports.output;

import com.baseproject.domain.DataModel;

public interface DataEventPort {

    void notifyEvent(DataModel dataModel);
}
