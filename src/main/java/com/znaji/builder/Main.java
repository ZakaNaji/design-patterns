package com.znaji.builder;

public class Main {

    public static void main(String[] args) {

        HttpRequest request1 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .timeoutMillis(5000)
                .authorizationHeader("Bearer token123")
                .build();

        System.out.println("Request 1:");
        System.out.println(request1);

        HttpRequest request2 = new HttpRequest.Builder(HttpMethod.POST, "https://api.example.com/submit")
                .body("{\"name\":\"John\",\"age\":30}")
                .contentType("application/json")
                .accept("application/json")
                .build();

        System.out.println("\nRequest 2:");
        System.out.println(request2);

        HttpRequest request3 = new HttpRequest.Builder(HttpMethod.PUT, "https://api.example.com/update")
                .body("{\"id\":1,\"status\":\"active\"}")
                .timeoutMillis(3000)
                .followRedirects(true)
                .build();

        System.out.println("\nRequest 3:");
        System.out.println(request3);
    }
}
