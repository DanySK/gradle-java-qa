package javaqa;

import com.google.common.collect.ImmutableMap;

/**
 * Simple entry point used by integration tests.
 */
public final class HelloWorld {

    private static final ImmutableMap<String, String> MAP = ImmutableMap.of("key", "value");

    private HelloWorld() {
    }

    /**
     * Launches the sample application.
     *
     * @param a ignored command line arguments
     */
    public static void main(final String... a) {
        System.out.println("Hello, World " + MAP); // NOPMD
    }
}
