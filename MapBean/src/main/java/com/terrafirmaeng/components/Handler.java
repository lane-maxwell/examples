package com.terrafirmaeng.components;

public interface Handler {
    void handleMessage (byte [] message);

    /**
     * Return the {@link MessageType} this handler will handle
     */
    MessageType getType();
}
