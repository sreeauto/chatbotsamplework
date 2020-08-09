package com.mini.workshop.template.orchestratorresponseentity;



public class MessageActionIndicator extends GenericMessageType {

    /**
     * List of actions which can be sent to chat clients. This list can increase over period of time. Not all actions
     * can be supported by all channels
     */
    public enum ChatActions {
        /**
         * Typing indicator start
         */
        MESSAGE_TYPING_ON_ACTION,
        /**
         * Typing indicator off
         */
        MESSAGE_TYPING_OFF_ACTION,
        /**
         * Mark the message as marked.
         */
        MESSAGE_MARK_SEEN_ACTION,
        /**
         * Start recording action
         */
        MESSAGE_RECORDING_ON_ACTION
    }

    /**
     * Length in seconds for action
     */
    private Integer length;

    public MessageActionIndicator() {
        setType(MessageTypes.MESSAGE_CHAT_ACTION);
    }

    public MessageActionIndicator(ChatActions action) {
        this();
        setMessage(action);
    }

    public void setMessage(ChatActions action) {
        super.setMessage(action);
    }

    public ChatActions getMessage() {
        return (ChatActions) super.getMessage();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
