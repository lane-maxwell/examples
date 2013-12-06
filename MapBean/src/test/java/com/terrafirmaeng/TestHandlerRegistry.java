package com.terrafirmaeng;

import com.terrafirmaeng.components.Handler;
import com.terrafirmaeng.components.MessageType;
import com.terrafirmaeng.controller.SimpleController;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import sun.plugin2.message.Message;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author: Lane Maxwell
 * 12/6/13 2:51 PM
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class TestHandlerRegistry {

    @Resource(name="handlerMap")
    private Map<MessageType, Handler> handlerMap;

    @Test
    public void testHandlerMapIsPopulated() {
        Assert.assertEquals(handlerMap.size(), 2);
    }
}
