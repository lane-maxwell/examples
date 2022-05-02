package com.terrafirmaeng.components;

import org.springframework.stereotype.Component;

@Component
public class HttpsHandler implements Handler  {

    @Override
    public void handleMessage(byte[] message) {
    }

    @Override
    public MessageType getType() {
        return MessageType.HTTPS;
    }
}
