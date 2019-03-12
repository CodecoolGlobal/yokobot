package com.codecool.yokobot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.codecool.yokobot.Phrase;
import com.codecool.yokobot.InvalidPhraseException;

public class PhraseTest {

    @Test
    public void testCreationFromString() {
        assertNotNull(new Phrase("hello world"));
    }

    @Test
    public void testPhraseOfNull() {
        assertThrows(InvalidPhraseException.class,
                     () -> new Phrase(null));
    }

    @Test
    public void testPhraseOfEmptyString() {
        assertThrows(InvalidPhraseException.class,
                     () -> new Phrase(""));
    }
}
