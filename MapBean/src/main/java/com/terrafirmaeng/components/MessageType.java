package com.terrafirmaeng.components;

/**
 * @author: Lane Maxwell
 * 12/6/13 11:09 AM
 */
public enum MessageType {
    HTTP ("HTTP"), HTTPS("HTTPS"), SSH("SSH"), FTP("FTP");


    MessageType (String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
