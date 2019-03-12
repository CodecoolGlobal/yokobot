package com.codecool.yokobot;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

/**
 * An object representing a phrase as a list of words.
 */
public class Phrase {
    List<String> words;

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

        words = new LinkedList(Arrays.asList(phrase.split("[, ]+")));

        sanitize();

        if (words.isEmpty()) {
            throw new InvalidPhraseException("Phrase didn't contain any words.");
        }
    }

    private void sanitize() {
        ListIterator<String> it = words.listIterator();

        while (it.hasNext()) {
            if (it.next().equals("")) {
                it.remove();
            }
        }
    }
}
