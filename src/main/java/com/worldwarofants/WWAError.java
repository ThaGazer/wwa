package com.worldwarofants;

public enum WWAError {
    BAD_VERSION("Bad version");

    private String errorMessage;

    WWAError(String error) {
        setErrorMessage(error);
    }

    private void setErrorMessage(String message) {
        errorMessage = message;
    }

    public String getMessage() {
        return errorMessage;
    }
}
