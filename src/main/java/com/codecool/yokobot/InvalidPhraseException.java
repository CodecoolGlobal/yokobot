package com.codecool.yokobot;

/**
 * An exception representing that the phrase cannot be created from
 * the given input.
 */
public class InvalidPhraseException extends RuntimeException {
    public InvalidPhraseException (String msg) {
        super(msg);
    }

    public InvalidPhraseException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public InvalidPhraseException(Throwable cause) {
        super(cause);
    }
}
