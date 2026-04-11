package com.znaji.builder;

public class Main {

    public static void main(String[] args) {

        //minimal Get request
        HttpRequest getRequest = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .build();

        System.out.println("GET Request:");
        System.out.println(getRequest);

        //explcit override of default values
        HttpRequest anotherGetRequest = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .timeoutMillis(10000)
                .followRedirects(false)
                .accept("application/xml")
                .build();

        System.out.println("Another GET Request with overridden defaults:");
        System.out.println(anotherGetRequest);

        //complex POST request with all options
        HttpRequest postRequest = new HttpRequest.Builder(HttpMethod.POST, "https://api.example.com/data")
                .body("{\"name\": \"John\", \"age\": 30}")
                .timeoutMillis(15000)
                .followRedirects(false)
                .contentType("application/json")
                .accept("application/json")
                .authorizationHeader("Bearer token123")
                .header("X-Custom-Header", "CustomValue")
                .queryParam("verbose", "true")
                .build();

        System.out.println("POST Request:");
        System.out.println(postRequest);

        //duplicate headers and query params :
        HttpRequest duplicateHeaderRequest = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .header("Accept", "application/json")
                .header("Accept", "application/xml")
                .build();

        System.out.println(duplicateHeaderRequest);

        HttpRequest duplicateQueryParamRequest = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .queryParam("page", "1")
                .queryParam("page", "2")
                .build();

        System.out.println(duplicateQueryParamRequest);

        //test immutability of HttpRequest
        HttpRequest request = new HttpRequest.Builder(HttpMethod.GET, "https://api.example.com/data")
                .header("Accept", "application/json")
                .build();

        System.out.println("Before external mutation: " + request);

        request.getHeaders().put("X-Debug", "true");

        System.out.println("After external mutation: " + request);
    }
}
