package com.znaji.builder;

public class Main {

    public static void main(String[] args) {
        //a slight improvement over the previous example, showing how to create multiple requests with default constructors + setters, which is more verbose and error-prone than using a builder pattern
       //bad scenario: we forget to set the method:
        HttpRequest request1 = new HttpRequest();
        request1.setUrl("https://api.example.com/data");
        request1.setBody("{\"key\":\"value\"}");
        request1.setTimeoutMillis(5000);
        request1.setFollowRedirects(true);
        request1.setContentType("application/json");
        request1.setAccept("application/json");
        request1.setAuthorizationHeader("Bearer token123");

        System.out.println(request1);

        //another bad scenario: seemingly complete request, then later mutate it unexpectedly
        HttpRequest request2 = new HttpRequest();
        request2.setMethod(HttpMethod.POST);
        request2.setUrl("https://api.example.com/submit");
        request2.setBody("name=John&age=30");
        request2.setTimeoutMillis(3000);
        request2.setFollowRedirects(false);
        request2.setContentType("application/x-www-form-urlencoded");
        request2.setAccept("*/*");
        request2.setAuthorizationHeader("Basic dXNlcjpwYXNzd29yZA==");
        System.out.println(request2);

        //later in the code, we accidentally mutate request2, which can lead to bugs:
        request2.setTimeoutMillis(10000); //oops, we changed the timeout for request
        request2.setBody(null);//oops, we accidentally cleared the body of request2
        System.out.println(request2);

        //good scenario:
        HttpRequest request3 = new HttpRequest();
        request3.setMethod(HttpMethod.GET);
        request3.setUrl("https://api.example.com/users");
        request3.setTimeoutMillis(2000);
        request3.setFollowRedirects(true);
        request3.setAccept("application/json");
        System.out.println(request3);


    }
}
