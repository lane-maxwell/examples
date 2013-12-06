package com.terrafirmaeng.controller;

import com.terrafirmaeng.components.Handler;
import com.terrafirmaeng.components.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author: Lane Maxwell
 * 12/6/13 11:07 AM
 */
@Controller ("/a_mapping")
public class SimpleController {

    @Resource(name="handlerMap")
    private Map<MessageType, Handler> messageHandlers;

    public Map<MessageType, Handler> getMessageHandlers() {
        return messageHandlers;
    }
}
