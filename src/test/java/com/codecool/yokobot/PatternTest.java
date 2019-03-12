package com.codecool.yokobot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.codecool.yokobot.Phrase;
import com.codecool.yokobot.Pattern;
import com.codecool.yokobot.InvalidPhraseException;

public class PatternTest {
    @Test
    public void testEmptyPattern() {
        assertThrows(InvalidPhraseException.class,
                     () -> new Pattern(""));
    }

    @Test
    public void testMatchSingleWord() {
        Pattern pattern = new Pattern("Foo");

        assertTrue(pattern.match(new Phrase("Foo")));
    }

    @Test
    public void testDontMatchSingleWord() {
        Pattern pattern = new Pattern("Foo");

        assertFalse(pattern.match(new Phrase("Bar")));
    }

    @Test
    public void testMatchTwoWords() {
        Pattern pattern = new Pattern("Foo bar");

        assertTrue(pattern.match(new Phrase("Foo bar")));
    }

    @Test
    public void testDontMatchDifferentSecondWord() {
        Pattern pattern = new Pattern("Foo bar");

        assertFalse(pattern.match(new Phrase("Foo baz")));
    }
}
