package com.ga.tc.common.exception;

import java.sql.SQLIntegrityConstraintViolationException;

public class TCException extends Exception{
    String exactMessage = "";

    public String getExactMessage() {
        return exactMessage;
    }

    public void setExactMessage(String exactMessage) {
        this.exactMessage = exactMessage;
    }
   

    @Override
    public String getMessage() {
        // TODO Implement this method
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        // TODO Implement this method
        super.printStackTrace();
    }
}
