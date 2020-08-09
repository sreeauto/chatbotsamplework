package com.mini.workshop.template.orchestratorresponseentity.attachments;

import java.util.List;
import java.util.Map;

import com.mini.workshop.template.orchestratorresponseentity.GenericMessageType;
import com.mini.workshop.template.orchestratorresponseentity.MessageResponseAttachment;

public class AttachmentListCardGroup extends GenericMessageType {

    public static final MessageResponseAttachment.AttachmentType ATTACHMENT_TYPE = MessageResponseAttachment.AttachmentType.CARDLIST;

    private List<AttachmentListCard> cards;

    public List<AttachmentListCard> getCards() {
        return cards;
    }

    public void setCards(List<AttachmentListCard> cards) {
        this.cards = cards;
    }

    public void addMeta(String key, String value) {
        super.addMeta(key, value);
    }

    @Override
    public String getMeta(String key) {
        return (String) super.getMeta(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (getCards() != null) {
            sb.append(", ListCardGroup:");
            for (AttachmentListCard m : getCards()) {
                sb.append(m.toString());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        if (getMetaMap().size() > 0) {
            sb.append(", Meta: [");
            for (Map.Entry<String, Object> entry : getMetaMap().entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue().toString());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
        }

        return sb.toString();
    }
}
