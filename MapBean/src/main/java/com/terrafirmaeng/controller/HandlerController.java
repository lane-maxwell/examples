package com.terrafirmaeng.controller;

import com.terrafirmaeng.components.Handler;
import com.terrafirmaeng.components.MessageType;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handler")
public class HandlerController {

  private final Map<MessageType, Handler> messageHandlers;

  public HandlerController(Map<MessageType, Handler> messageHandlers) {
    this.messageHandlers = messageHandlers;
  }

  @GetMapping
  public Map<MessageType, Handler> getMessageHandlers() {
    return messageHandlers;
  }
}
