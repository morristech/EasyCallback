package com.commit451.easycallback;

/**
 * Represents that the body was null
 */
public class NullBodyException extends Exception {

    @Override
    public String getMessage() {
        return "The body was null. If you are expecting the body to be null, call .allowNullBodies() on the callback";
    }
}
