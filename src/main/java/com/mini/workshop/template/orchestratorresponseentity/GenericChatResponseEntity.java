package com.mini.workshop.template.orchestratorresponseentity;

import com.mini.workshop.template.orchestratornlpentity.NLPResponse;

public class GenericChatResponseEntity {

    private String chatClient;

    private String receiver;

    private String language;

    private Object response;

    private String channel;

    private String providerName;

    private NLPResponse nlpResponse;

    private String userLanguage;

    private String text;

    private String type;

    public GenericChatResponseEntity() {
    }

    public String getChatClient() {
        return chatClient;
    }

    public void setChatClient(String chatClient) {
        this.chatClient = chatClient;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProviderName() {
        return providerName;
    }

    public NLPResponse getNlpResponse() {
        return nlpResponse;
    }

    public void setNlpResponse(NLPResponse nlpResponse) {
        this.nlpResponse = nlpResponse;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.response.toString());
        return sb.toString();
    }

}
