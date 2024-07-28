package javaqa;

import com.google.common.collect.ImmutableMap;

final class HelloWorld {

    private static final ImmutableMap<String, String> MAP = ImmutableMap.of("key", "value");

    private HelloWorld() {
    }

    public static void main(final String... a) {
        System.out.println("Hello, World " + MAP); // NOPMD
    }
}
