package com.terrafirmaeng.components;

import org.springframework.stereotype.Component;

@Component
public class HttpHandler implements Handler {

    @Override
    public void handleMessage(byte[] message) {

    }

    @Override
    public MessageType getType() {
        return MessageType.HTTP;
    }

}
