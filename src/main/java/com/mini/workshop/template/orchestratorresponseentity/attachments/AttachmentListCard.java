package com.mini.workshop.template.orchestratorresponseentity.attachments;

import java.util.List;


import com.mini.workshop.template.orchestratorresponseentity.ButtonLinks;
import com.mini.workshop.template.orchestratorresponseentity.GenericMessageType;
import com.mini.workshop.template.orchestratorresponseentity.MessageResponseAttachment;

public class AttachmentListCard extends GenericMessageType {

    public static final MessageResponseAttachment.AttachmentType ATTACHMENT_TYPE = MessageResponseAttachment.AttachmentType.CARD;
    private String title;
    private String imageUrl;
    private String subtitle;
    private List<ButtonLinks> buttonLinksList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
        if (getTitle() != null) {
            sb.append(", Button Title:");
            sb.append(getTitle());
        }
        if (getImageUrl() != null) {
            sb.append(", ImageURL:");
            sb.append(getImageUrl());
        }
        if (getSubtitle() != null) {
            sb.append(", Subtitle:");
            sb.append(getSubtitle());
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
