package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    public static int CC;
    public int increaseCC(){
        CC += 1;
        return CC;
    }
    public int decreaseCC(){
        CC -= 1;
        return CC;
    }
}
