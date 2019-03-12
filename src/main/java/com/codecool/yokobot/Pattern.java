package com.codecool.yokobot;

/**
 * A pattern for matching an input.
 */
public class Pattern {
    private final Phrase pattern;

    /**
     * Build a pattern out of a string.
     *
     * @param phrase a phrase to build the pattern from.
     *
     * @throws InvalidPhraseException if the phrase is not valid.
     */
    public Pattern (String phrase) {
        pattern = new Phrase(phrase);
    }

    /**
     * Determine whether an input matches the pattern.  Words match
     * themselves.  Variables are matched by any word.
     *
     * @param input the input to be matched.
     */
    public boolean match(Phrase input) {
        return input.words.equals(pattern.words);
    }
}
