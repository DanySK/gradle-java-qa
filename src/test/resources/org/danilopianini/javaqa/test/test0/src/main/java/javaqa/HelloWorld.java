package javaqa;

import java.util.Arrays;

final class HelloWorld {

    private HelloWorld() {
    }

    public static void main(final String... a) {
        final double something = Math.random();
        final double anotherVar = something + 1;
        Arrays.asList(1, 2, 3)
            .stream()
            .filter(it -> it % 2 != 0)
            .map(it -> it + 1)
            .forEach(System.out::println);
        System.out.println("Hello, World -> " + anotherVar); // NOPMD
        System.out.println("[ " + System.out + " " + System.class + " " + Runtime.class + " " + anotherVar + " ]"); // NOPMD
    }
}
