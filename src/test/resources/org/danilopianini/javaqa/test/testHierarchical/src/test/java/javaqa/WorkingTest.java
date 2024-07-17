package javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WorkingTest {

    @Test
    void workingTest() {
        Assertions.assertFalse(System.getenv().isEmpty());
    }
}
