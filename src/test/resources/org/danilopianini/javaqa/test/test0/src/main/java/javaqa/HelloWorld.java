package javaqa;

final class HelloWorld {

    private HelloWorld() {
    }

    public static void main(final String... a) {
        final double something = Math.random();
        final double anotherVar = something + 1;
        System.out.println("Hello, World -> " + anotherVar); // NOPMD
    }
}
