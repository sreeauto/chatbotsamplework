package com.mini.workshop.template.orchestratorresponseentity;


public class ButtonLinks extends GenericMessageType {

    private class ButtonLinksData {

        private String title;
        private String meta;
        private String url;
        private String image;
        private String payload;
    }

    public ButtonLinks() {
        setType(MessageTypes.MESSAGE_TYPES_BUTTONLINK);
        super.setMessage(new ButtonLinksData());
    }

    public ButtonLinksData getMessage() {
        return (ButtonLinksData) super.getMessage();
    }

    @Override
    public void setMessage(Object message) {
        // Hide setMessage() method for Button as it is used with private class
    }

    public String getTitle() {
        return getMessage().title;
    }

    public void setTitle(String title) {
        getMessage().title = title;
    }

    public String getMeta() {
        return getMessage().meta;
    }

    public void setMeta(String meta) {
        getMessage().meta = meta;
    }

    public String getUrl() {
        return getMessage().url;
    }

    public void setUrl(String url) {
        getMessage().url = url;
    }

    public String getImage() {
        return getMessage().image;
    }

    public void setImage(String image) {
        getMessage().image = image;
    }

    public String getPayload() {
        return getMessage().payload;
    }

    public void setPayload(String payload) {
        getMessage().payload = payload;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (getTitle() != null) {
            sb.append(", Button Title:");
            sb.append(getTitle());
        }
        if (getImage() != null) {
            sb.append(", Button Image:");
            sb.append(getImage());
        }
        if (getUrl() != null) {
            sb.append(", Button Url:");
            sb.append(getUrl());
        }
        if (getPayload() != null) {
            sb.append(", Button Payload:");
            sb.append(getPayload());
        }
        if (getMeta() != null) {
            sb.append(", Button Meta:");
            sb.append(getMeta());
        }

        return sb.toString();
    }
}
