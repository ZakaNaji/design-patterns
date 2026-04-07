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

        //valid request with query parameters and headers
        HttpRequest request7 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .queryParam("search", "test")
                .queryParam("limit", "10")
                .header("X-Custom-Header", "value")
                .build();
        System.out.println(request7);

        //request - header with repeat key
        HttpRequest request8 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .header("X-Custom-Header", "value1")
                .header("X-Custom-Header", "value2") // This will overwrite the previous header
                .build();
        System.out.println(request8);

        //invalid request - header with null key
        try {
            HttpRequest request9 = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                    .header(null, "value")
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
