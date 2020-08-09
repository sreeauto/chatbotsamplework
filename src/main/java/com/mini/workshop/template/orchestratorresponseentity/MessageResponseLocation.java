package com.mini.workshop.template.orchestratorresponseentity;


public class MessageResponseLocation extends GenericMessageType {

    private double latitude;

    private double longitude;

    public MessageResponseLocation() {
        setType(MessageTypes.MESSAGE_TYPES_LOCATION);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
