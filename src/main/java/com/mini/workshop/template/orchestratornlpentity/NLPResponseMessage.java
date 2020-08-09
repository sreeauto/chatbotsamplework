package com.mini.workshop.template.orchestratornlpentity;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public abstract class NLPResponseMessage {

    final static Gson gson = GsonFactory.getDefaultFactory().getGson();

    @Expose
    private final NLPResponseMessage.MessageType type;

    protected NLPResponseMessage(NLPResponseMessage.MessageType type) {
        assert type != null;
        this.type = type;
    }

    public NLPResponseMessage.MessageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }

    public enum MessageType {
        /**
         * Text response message object
         */
        SPEECH(0, "speech", NLPResponseMessage.NLPResponseSpeech.class),
        /**
         * Card message object
         */
        CARD(1, "card", NLPResponseMessage.NLPResponseCard.class),
        /**
         * Quick replies message object
         */
        QUICK_REPLY(2, "quick_reply", NLPResponseMessage.NLPResponseQuickReply.class),
        /**
         * Image message object
         */
        IMAGE(3, "image", NLPResponseMessage.NLPResponseImage.class),
        /**
         * Custom payload message object
         */
        PAYLOAD(4, "custom_payload", NLPResponseMessage.NLPResponsePayload.class);

        private static Map<Integer, MessageType> typeByCode = new HashMap<>();
        private static Map<String, MessageType> typeByName = new HashMap<>();

        static {
            for (NLPResponseMessage.MessageType type : values()) {
                typeByCode.put(type.code, type);
                typeByName.put(type.name.toLowerCase(), type);
            }
        }

        private final int code;
        private final String name;
        private final Type type;

        MessageType(int code, String name, Type curClass) {
            assert name != null;
            assert curClass != null;
            this.code = code;
            this.name = name;
            this.type = curClass;
        }

        public static NLPResponseMessage.MessageType fromCode(int code) {
            return typeByCode.get(code);
        }

        public static NLPResponseMessage.MessageType fromName(String name) {
            return typeByName.get(name != null ? name.toLowerCase() : null);
        }

        /**
         * @return Message integer code value
         */
        public int getCode() {
            return this.code;
        }

        /**
         * @return Type name presentation
         */
        public String getName() {
            return name;
        }

        /**
         * @return Related class {@link Type}
         */
        public Type getType() {
            return type;
        }

    }



    public static class NLPResponseSpeech extends NLPResponseMessage {

        @Expose
        public List<String> speech;

        public NLPResponseSpeech() {
            super(MessageType.SPEECH);
        }

        /**
         * Get agent's text replies.
         */
        public List<String> getSpeech() {
            return this.speech;
        }

        /**
         * Set agent's text replies.
         */
        public void setSpeech(List<String> speech) {
            this.speech = speech;
        }

        /**
         * Set agent's text replies.
         */
        public void setSpeech(String... speech) {
            setSpeech(Arrays.asList(speech));
        }
    }

    public static class NLPResponseCard extends NLPResponseMessage {

        @Expose
        private String title;

        @Expose
        private String subtitle;

        @Expose
        private String imageUrl;

        @Expose
        private List<Button> buttons;

        public NLPResponseCard() {
            super(MessageType.CARD);
        }

        /**
         * Get card title.
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * Set card title.
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * Get card subtitle.
         */
        public String getSubtitle() {
            return this.subtitle;
        }

        /**
         * Set card subtitle.
         */
        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        /**
         * Get image url
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * Set image url
         */
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        /**
         * Get list of objects corresponding to card buttons.
         */
        public List<Button> getButtons() {
            return this.buttons;
        }

        /**
         * Set list of objects corresponding to card buttons.
         */
        public void setButtons(List<Button> buttons) {
            this.buttons = buttons;
        }

        /**
         * Set sequence of objects corresponding to card buttons.
         */
        public void setButtons(NLPResponseCard.Button... buttons) {
            setButtons(Arrays.asList(buttons));
        }

        /**
         * Card button object
         */
        public static class Button {

            @Expose
            private String text;

            @Expose
            private String postback;

            public Button(String text, String postback) {
                this.text = text;
                this.postback = postback;
            }

            /**
             * Get button text
             */
            public String getText() {
                return this.text;
            }

            /**
             * Set button text
             */
            public void setText(String text) {
                this.text = text;
            }

            /**
             * Get a text sent back to API.AI or a URL to open.
             */
            public String getPostback() {
                return this.postback;
            }

            /**
             * Set a text sent back to API.AI or a URL to open.
             */
            public void setPostback(String postback) {
                this.postback = postback;
            }
        }
    }

    public static class NLPResponseQuickReply extends NLPResponseMessage {

        @Expose
        private String title;

        @Expose
        private List<String> replies;

        public NLPResponseQuickReply() {
            super(MessageType.QUICK_REPLY);
        }

        /**
         * Get list of text replies
         */
        public List<String> getReplies() {
            return this.replies;
        }

        /**
         * Set list of text replies
         */
        public void setReplies(List<String> replies) {
            this.replies = replies;
        }

        /**
         * Set sequence of text replies
         */
        public void setReplies(String... replies) {
            setReplies(Arrays.asList(replies));
        }

        /**
         * Get quick replies title. Required for the Facebook Messenger, Kik, and Telegram one-click
         * integrations.
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * Set quick replies title. Required for the Facebook Messenger, Kik, and Telegram one-click
         * integrations.
         */
        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class NLPResponseImage extends NLPResponseMessage {

        @Expose
        private String imageUrl;

        public NLPResponseImage() {
            super(MessageType.IMAGE);
        }

        /**
         * Get image url
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * Set image url
         */
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    public static class NLPResponsePayload extends NLPResponseMessage {

        @Expose
        private JsonObject payload;

        public NLPResponsePayload() {
            super(MessageType.PAYLOAD);
        }

        /**
         * Get custom defined JSON.
         */
        public JsonObject getPayload() {
            return this.payload;
        }

        /**
         * Set custom defined JSON.
         */
        public void setPayload(JsonObject payload) {
            this.payload = payload;
        }
    }
}

class GsonFactory {

    private static final Gson PROTOCOL_GSON;

    private static final GsonFactory DEFAULT_FACTORY = new GsonFactory();

    static {
        GsonBuilder gsonBuilder = new GsonBuilder()
                .setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).toPattern());
        PROTOCOL_GSON = gsonBuilder.create();
    }

    /**
     * Create a default factory
     */
    public static GsonFactory getDefaultFactory() {
        return DEFAULT_FACTORY;
    }

    /**
     * Get a {@link Gson} object
     */
    public Gson getGson() {
        return PROTOCOL_GSON;
    }

}