package com.mini.workshop.template.orchestratorresponseentity;


public class MessageResponseText extends GenericMessageType {

    public MessageResponseText() {
        setType(MessageTypes.MESSAGE_TYPES_TEXT);
    }

    public MessageResponseText(String message) {
        this();
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return (String) super.getMessage();
    }

    public void setMessage(String message) {
        super.setMessage(message);
    }
}
