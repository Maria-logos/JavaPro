package org.example;

import com.example.PasswordGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGenerate {
    @Test
    public void testLength() {
        assertEquals(12, PasswordGenerator.generatePassword(12).length());
    }
}
