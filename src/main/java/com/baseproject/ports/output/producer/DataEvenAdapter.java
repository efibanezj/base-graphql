package com.baseproject.ports.output.producer;

import com.baseproject.domain.DataModel;
import com.baseproject.ports.output.DataEventPort;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataEvenAdapter implements DataEventPort {

    private final StreamBridge streamBridge;

    @Override
    public void notifyEvent(DataModel dataModel) {
        Message<DataModel> message = MessageBuilder.withPayload(dataModel).build();
        streamBridge.send("dataCreatedProducer", message);
    }
}
