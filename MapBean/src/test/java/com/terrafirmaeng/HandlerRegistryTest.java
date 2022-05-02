package com.terrafirmaeng;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.terrafirmaeng.components.Handler;
import com.terrafirmaeng.components.MessageType;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HandlerRegistryTest {

  @Autowired
  private Map<MessageType, Handler> handlerMap;

  @Test
  public void handlerMapIsPopulated() {
    // We have two Handlers marked as @Component, so I expect this list to contain two items
    assertThat(handlerMap.size(), is(equalTo(2)));

    // I expect to be able to retrieve a Handler for MessageType.HTTP and MessageType.HTTPS
    assertThat(handlerMap.get(MessageType.HTTP), is(notNullValue()));
    assertThat(handlerMap.get(MessageType.HTTPS), is(notNullValue()));
  }
}
