package com.mini.workshop.template.orchestratornlpentity;

import java.util.Date;
import java.util.List;
import java.util.Map;


public class NLPResponse {

    private List<String> prompts;

    private Map<String,String> parameters;

    private List<NLPResponseMessage> responseMessages;

    private List<NLPContext> nlpContext;

    private String sessionId;

    private Date timestamp;

    private boolean isError;

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public List<NLPContext> getNlpContext() {
        return nlpContext;
    }

    public void setNlpContext(List<NLPContext> nlpContext) {
        this.nlpContext = nlpContext;
    }

    public List<String> getPrompts() {
        return prompts;
    }

    public void setPrompts(List<String> prompts) {
        this.prompts = prompts;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public List<NLPResponseMessage> getResponseMessages() {
        return responseMessages;
    }

    public void setResponseMessages(List<NLPResponseMessage> responseMessages) {
        this.responseMessages = responseMessages;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getAction(){
        if(this.getParameters()!=null && this.getParameters().size()>0 && this.getParameters().get(NLPResponseBuilder.NLP_ACTION)!=null){
            return this.getParameters().get(NLPResponseBuilder.NLP_ACTION);
        }
        return "";
    }

    public String getUserText(){
        if (this.getParameters() != null && this.getParameters().size() > 0 && this.getParameters().get(NLPResponseBuilder.USER_TEXT) != null) {
            return this.getParameters().get(NLPResponseBuilder.USER_TEXT);
        }
        return "";
    }

    public boolean getActionInComplete(){
        return Boolean.parseBoolean(this.getParameters().get(NLPResponseBuilder.ACTION_INCOMPLETE));
    }

    public String getIntentName(){
        if(this.getParameters()!=null && this.getParameters().size()>0 && this.getParameters().get(NLPResponseBuilder.INTENT_NAME)!=null){
            return this.getParameters().get(NLPResponseBuilder.INTENT_NAME);
        }
        return "";
    }

    public Integer getStatusCode(){
        if(this.getParameters().get(NLPResponseBuilder.STATUS_CODE)!=null){
            return Integer.parseInt(this.getParameters().get(NLPResponseBuilder.STATUS_CODE));
        }
        return null;
    }



}
