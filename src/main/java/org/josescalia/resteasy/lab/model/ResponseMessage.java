package org.josescalia.resteasy.lab.model;

import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by josescalia on 04/05/14.
 */
@XmlRootElement(name = "serverResponse")
public class ResponseMessage {
    private int statusCode;
    private String message;

    public ResponseMessage() {
    }

    public ResponseMessage(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    @XmlElement
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
