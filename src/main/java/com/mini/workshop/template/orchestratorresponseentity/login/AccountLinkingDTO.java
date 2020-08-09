package com.mini.workshop.template.orchestratorresponseentity.login;


public class AccountLinkingDTO {

    private String authorizationCode;

    private String status;


    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
