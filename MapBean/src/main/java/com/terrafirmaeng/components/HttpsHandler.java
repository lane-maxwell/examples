package com.terrafirmaeng.components;

import org.springframework.stereotype.Component;
import com.terrafirmaeng.components.MessageType.*;

import java.lang.annotation.Inherited;

/**
 * @author: Lane Maxwell
 * 12/6/13 11:04 AM
 */
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
