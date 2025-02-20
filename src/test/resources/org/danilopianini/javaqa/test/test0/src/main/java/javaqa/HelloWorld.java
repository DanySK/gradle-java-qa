package javaqa;

import java.util.Arrays;

final class HelloWorld {

    private NetworkManager networkManager = new NetworkManager();

    private HelloWorld() {
    }

    private void setNetworkManager(final NetworkManager networkManager) {
        this.networkManager = networkManager;
    }

    public static void main(final String... a) {
        final double something = Math.random();
        final double anotherVar = something + 1;
        Arrays.asList(1, 2, 3)
            .stream()
            .filter(it -> it % 2 != 0)
            .map(it -> it + 1)
            .forEach(System.out::println);
        final HelloWorld helloWorld = new HelloWorld();
        helloWorld.setNetworkManager(new NetworkManager());
        System.out.println(helloWorld.networkManager); // NOPMD
        System.out.println("Hello, World -> " + anotherVar); // NOPMD
        System.out.println("[ " + System.out + " " + System.class + " " + Runtime.class + " " + anotherVar + " ]"); // NOPMD
        System.out.println("[ " + System.out + "-" + System.class + "-" + Runtime.class + "-" + anotherVar + " ]"); // NOPMD
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 8, 16, 32, 100})); // NOPMD
    }

    private static final class NetworkManager {
    }
}
