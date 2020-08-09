package com.mini.workshop.template.orchestratorresponseentity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericMessageUtils {

    public static GenericMessageType createGenericTextMessage(String prompt) {
        MessageResponseText message = new MessageResponseText();
        if (prompt != null && prompt.length() > 0) {
            message.setMessage(prompt);
        }
        return message;
    }


    public static GenericMessageType createMessageWithQuickReply(String prompt, List<Map<String, String>> quickRepliesList) {
        List<GenericMessageType> quickReplies = new ArrayList<>();
        for (Map<String, String> quickReplyParams : quickRepliesList) {
            MessageResponseText reply = new MessageResponseText();
            reply.setMessage(quickReplyParams.get("QUICK_REPLY_TITLE"));
            reply.setPayloadText(quickReplyParams.get("QUICK_REPLY_PAYLOAD_KEY"));
            quickReplies.add(reply);
        }

        GenericMessageType message = createGenericTextMessage(prompt);
        message.setReplyOptions(quickReplies);
        return message;
    }
}
