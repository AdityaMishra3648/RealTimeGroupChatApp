package com.chatgroup.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Handles messages sent to /app/sendMessage
    @SendTo("/topic/messages") // Broadcast messages to /topic/messages
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Simply return the message to be broadcast
    }
}
