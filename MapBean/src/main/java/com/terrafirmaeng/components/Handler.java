package com.terrafirmaeng.components;

import java.lang.annotation.Inherited;

/**
 * This defines behavior for Handlers
 *
 * @author Lane Maxwell
 *
 * 12/6/13 11:01 AM
 */
public interface Handler {

    public void handleMessage (byte [] message);

    /**
     * Return the {@link MessageType} this handler will handle
     */
    public MessageType getType();
}
