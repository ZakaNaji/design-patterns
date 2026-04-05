package com.znaji.builder;

public class Main {

    public static void main(String[] args) {
        //shows the pain of using the constructor directly
        HttpRequest postRequest = new HttpRequest(HttpMethod.POST,
                "https://api.example.com/data",
                """
                        {
                            "name": "John Doe",
                            "email": "john.doe@example.com"
                        }
                        """,
                5000,
                true,
                "application/json",
                "application/json",
                "Bearer token"
        );

        HttpRequest getRequest = new HttpRequest(HttpMethod.GET,
                "https://api.example.com/data/123",
                null,
                3000,
                false,
                null,
                "application/json",
                "Bearer token"
        );
        //a POST with several null/default-looking arguments
            HttpRequest postRequestWithNulls = new HttpRequest(HttpMethod.POST,
                    "https://api.example.com/data",
                    """
                            {
                                "name": "John Doe",
                                "email": "anon@example.com"
                            }
                           """,
                    5000,
                    true,
                    "application/json",
                    "application/json",
                    null
            );

            HttpRequest deleteRequest = new HttpRequest(HttpMethod.DELETE,
                    "https://api.example.com/data/123",
                    null,
                    3000,
                    false,
                    null,
                    null,
                    "Bearer token"
            );

            //print the requests to verify they were created correctly
            System.out.println(postRequest);
            System.out.println(getRequest);
            System.out.println(postRequestWithNulls);
            System.out.println(deleteRequest);
    }
}
