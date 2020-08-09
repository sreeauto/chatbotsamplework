package com.mini.workshop.template.orchestratorresponseentity;

public class MessageResponseAttachment extends GenericMessageType {

    public enum AttachmentType {
        URL, MEDIA, CARD, CARDLIST, BUTTON;
    }

    private AttachmentType attachmentType;

    public MessageResponseAttachment(AttachmentType attachmentType) {
        setType(MessageTypes.MESSAGE_TYPES_ATTACHMENT);
        setAttachmentType(attachmentType);
    }

    @Override
    public Object getMessage() {
        return super.getMessage();
    }

    @Override
    public void setMessage(Object attachment) {
        super.setMessage(attachment);
    }

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
    }
}
