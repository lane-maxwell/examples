package com.terrafirmaeng.configuration;

import com.terrafirmaeng.components.Handler;
import com.terrafirmaeng.components.MessageType;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
  private final ApplicationContext context;

  public SpringConfiguration(ApplicationContext context) {
    this.context = context;
  }

  @Bean
  public Map<MessageType, Handler> getMessageHandlerMap() {
    Map<MessageType, Handler> messageHandlerRegistry = new HashMap<>();
    Map<String, Handler> handlers = context.getBeansOfType(Handler.class);

    for (String key : handlers.keySet()) {
      Handler handler = handlers.get(key);
      messageHandlerRegistry.put(handler.getType(), handler);
    }
    return messageHandlerRegistry;
  }
}
