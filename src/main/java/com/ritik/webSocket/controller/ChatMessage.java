package com.ritik.webSocket.controller;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder  // ?
public class ChatMessage {
    private String content;
    private String sender;
    private String receiver;
    private MessageType type;

}
