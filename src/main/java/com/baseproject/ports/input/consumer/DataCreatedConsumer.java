package com.baseproject.ports.input.consumer;

import com.baseproject.domain.DataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component("dataCreated")
public class DataCreatedConsumer implements Consumer<DataModel> {
    @Override
    public void accept(DataModel dataModel) {
        log.info(dataModel.toString());
    }
}
