package com.znaji.builder;

public class Main {

    public static void main(String[] args) {

        HttpRequest.Builder builder = new HttpRequest.Builder(HttpMethod.POST, "https://api.example.com/data")
                .body("{\"name\": \"John\", \"age\": 30}")
                .timeoutMillis(10000)
                .followRedirects(false)
                .contentType("application/json")
                .accept("application/json")
                .authorizationHeader("Bearer token123")
                .header("X-Custom-Header", "CustomValue")
                .queryParam("verbose", "true");

        HttpRequest request = builder.build();

        builder.header("X-Custom-Header", "NewValue");
        System.out.println(request);

        HttpRequest request1 = builder.build();
        System.out.println(request1);

        try {
            request1.getHeaders().put("X-Another-Header", "AnotherValue");
            System.out.println(request1);
        } catch (Exception e) {
            System.out.println("Cannot modify headers: " + e.getMessage());
        }
    }
}
