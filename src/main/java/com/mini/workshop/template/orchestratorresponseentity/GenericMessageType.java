package com.mini.workshop.template.orchestratorresponseentity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class GenericMessageType {

    private Object message;

    private MessageTypes type;

    private List<GenericMessageType> replyOptions;

    private String payloadText;

    private Map<String, Object> metaMap = new HashMap<String, Object>();

    public List<GenericMessageType> getReplyOptions() {
        return replyOptions;
    }

    public void setReplyOptions(List<GenericMessageType> replyOptions) {
        this.replyOptions = replyOptions;
    }

    public String getPayloadText() {
        return payloadText;
    }

    public void setPayloadText(String payloadText) {
        this.payloadText = payloadText;
    }

    public MessageTypes getType() {
        return type;
    }

    public void setType(MessageTypes type) {
        this.type = type;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Map<String, Object> getMetaMap() {
        return metaMap;
    }

    public void setMetaMap(Map<String, Object> metaMap) {
        this.metaMap = metaMap;
    }

    public void addMeta(String key, Object value) {
        metaMap.put(key, value);
    }

    public Object getMeta(String key) {
        return metaMap.get(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message Type:");
        sb.append(getType());
        if(getMessage() != null) {
            sb.append(", Data: {");
            sb.append(getMessage().toString());
            sb.append("}");
        }
        if (getPayloadText() != null) {
            sb.append(", Payload:");
            sb.append(getPayloadText());
        }
        if (getReplyOptions() != null) {
            sb.append(", Quick Reply: [");
            for (GenericMessageType reply : getReplyOptions()) {
                sb.append(reply.toString());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
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
