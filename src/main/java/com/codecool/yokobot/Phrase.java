package com.codecool.yokobot;

import java.util.Arrays;
import java.util.List;
// import java.util.LinkedList;

/**
 * An object representing a phrase as a list of words.
 */
public class Phrase {
    private List<String> words;

    /**
     * Creating a phrase from a single line.
     *
     * @param phrase The line representing the phrase.
     * @throws InvalidPhraseException if the parameter is null
     */
    public Phrase(String phrase) {
        if (phrase == null) {
            throw new InvalidPhraseException("Phrase cannot be created from null.");
        }
        words = Arrays.asList(phrase.split("[, ]+"));
    }
}
