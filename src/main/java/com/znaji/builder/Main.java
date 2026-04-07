package com.znaji.builder;

public class Main {

    public static void main(String[] args) {

        //valid request
        HttpRequest request = new HttpRequest.Builder(HttpMethod.POST, "https://api.example.com/data")
                .body("{\"name\": \"John\", \"age\": 30}")
                .timeoutMillis(5000)
                .followRedirects(true)
                .contentType("application/json")
                .accept("application/json")
                .authorizationHeader("Bearer token")
                .build();
        System.out.println(request);
        //valid request with only required fields
        HttpRequest request2 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .build();
        System.out.println(request2);
        //invalid request - missing required url
        try {
            HttpRequest request3 = new HttpRequest.Builder(HttpMethod.GET, null)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        //invalid request - missing required method
        try {
            HttpRequest request4 = new HttpRequest.Builder(null, "https://api.example.com/data")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        //invalid request - invalid timeout
        try {
            HttpRequest request5 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                    .timeoutMillis(-100)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        //invalid request - get request with body
        try {
            HttpRequest request6 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                    .body("This should not be allowed")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

    }
}
