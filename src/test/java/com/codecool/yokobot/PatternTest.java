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
}
