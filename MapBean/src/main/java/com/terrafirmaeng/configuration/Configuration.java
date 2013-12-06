package com.terrafirmaeng.configuration;

import com.terrafirmaeng.components.Handler;
import com.terrafirmaeng.components.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Lane Maxwell
 * 12/6/13 11:12 AM
 */
@org.springframework.context.annotation.Configuration
@ComponentScan
public class Configuration {

    @Autowired
    private ApplicationContext context;

    private Map<MessageType, Handler> messageHandlerRegistry;

    @Bean (name="handlerMap")
    public Map<MessageType, Handler> getMessageHandlerMap() {
        if (messageHandlerRegistry == null) {
            messageHandlerRegistry = new HashMap<MessageType, Handler>();
            do {
              Map<String, Handler> handlers = context.getBeansOfType(Handler.class);
              for (String key : handlers.keySet()) {
                  Handler handler = handlers.get(key);
                  messageHandlerRegistry.put(handler.getType(), handler);
              }
            } while ((context = context.getParent()) != null);
        }

        return messageHandlerRegistry;
    }
}
