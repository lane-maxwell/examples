package com.terrafirmaeng.components;

import org.springframework.stereotype.Component;

/**
 * @author: Lane Maxwell
 * 12/6/13 11:04 AM
 */
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
