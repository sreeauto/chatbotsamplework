package com.mini.workshop.template.orchestratorresponseentity.attachments;

import java.util.List;

import com.mini.workshop.template.orchestratorresponseentity.ButtonLinks;
import com.mini.workshop.template.orchestratorresponseentity.GenericMessageType;
import com.mini.workshop.template.orchestratorresponseentity.MessageResponseAttachment;

public class AttachmentButton extends GenericMessageType {

    public static final MessageResponseAttachment.AttachmentType ATTACHMENT_TYPE = MessageResponseAttachment.AttachmentType.BUTTON;

    private String text;

    private List<ButtonLinks> buttonLinksList;

    public String getText() {
        return text;
    }

    public void setText(String title) {
        this.text = title;
    }

    public List<ButtonLinks> getButtonLinksList() {
        return buttonLinksList;
    }

    public void setButtonLinksList(List<ButtonLinks> buttonLinksList) {
        this.buttonLinksList = buttonLinksList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (getText() != null) {
            sb.append(", Button Text:");
            sb.append(getText());
        }
        if (getButtonLinksList() != null) {
            sb.append(", ButtonLinks: [");
            for (ButtonLinks b : getButtonLinksList()) {
                sb.append(b.toString());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
        }

        return sb.toString();
    }
}
