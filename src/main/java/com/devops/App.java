package com.devops;

public class App {
    public String getGreeting() {
        return "Hello, DevOps World!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
    }
}
