package com.znaji.observer.pattern.store;

public class Message {
    private final String type;
    private final String name;

    public Message(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
