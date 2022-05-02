package com.terrafirmaeng.components;

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
