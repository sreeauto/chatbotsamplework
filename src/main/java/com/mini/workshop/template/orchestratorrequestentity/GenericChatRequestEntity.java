package com.mini.workshop.template.orchestratorrequestentity;

import java.util.ArrayList;
import java.util.List;

import com.mini.workshop.template.orchestratornlpentity.NLPResponse;

public class GenericChatRequestEntity {

    private String providerName;
    private String language;
    private String userLanguage;
    private String text;
    private String type;
    private String channel;
    private Location location;
    private String url;
    private String sender;
    private boolean synchronous;
    private List synchronousResponse;
    private String source;
    private NLPResponse nlpResponse;


    public GenericChatRequestEntity() {
    }

    public GenericChatRequestEntity(String language) {
        this.language = language;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isSynchronous() {
        return synchronous;
    }

    public void setSynchronous(boolean synchronous) {
        this.synchronous = synchronous;
    }

    public List getSynchronousResponse() {
        return synchronousResponse;
    }

    public void addSynchronousResponse(Object response) {
        if (synchronousResponse == null) {
            synchronousResponse = new ArrayList();
        }
        synchronousResponse.add(response);
    }

    public String getSource() { return source; }

    public void setSource(String source) { this.source = source; }

    public NLPResponse getNlpResponse() {
        return nlpResponse;
    }

    public void setNlpResponse(NLPResponse nlpResponse) {
        this.nlpResponse = nlpResponse;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

}
