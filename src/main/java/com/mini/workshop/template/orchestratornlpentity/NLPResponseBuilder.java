package com.mini.workshop.template.orchestratornlpentity;

import java.util.List;
import java.util.Map;

public abstract class NLPResponseBuilder {

    public static final String USER_TEXT = "USER_TEXT";
    public static final String NLP_ACTION = "NLP_ACTION";
    public static final String ACTION_INCOMPLETE = "ACTION_INCOMPLETE";
    public static final String INTENT_NAME = "INTENT_NAME";
    public static final String STATUS_CODE = "STATUS_CODE";
    public static final String OK_RESPONSE = "200";

    protected Object resp;

    public NLPResponseBuilder(Object resp){
        this.resp = resp;
    }

    public final NLPResponse buildNLPResponse(){
        if(resp == null){
            return null;
        }
        NLPResponse response = extractResponse();
        response.setNlpContext(extractNLPResponseContext());
        response.setParameters(extractNLPParameters());
        response.setPrompts(extractNLPPrompts());
        response.setResponseMessages(extractNLPResponseMessage());
        return response;
    }

    protected abstract Map<String, String> extractNLPParameters();
    protected abstract NLPResponse extractResponse();
    protected abstract List<String> extractNLPPrompts();
    protected abstract List<NLPContext> extractNLPResponseContext();
    protected abstract List<NLPResponseMessage> extractNLPResponseMessage();

}
