package com.znaji.builder;

/**
 * HttpMethod method
 * String url
 * String body
 * int timeoutMillis
 * boolean followRedirects
 * String contentType
 * String accept
 * String authorizationHeader
 */
public class HttpRequest {
    private final HttpMethod method;
    private final String url;
    private final String body;
    private final int timeoutMillis;
    private final boolean followRedirects;
    private final String contentType;
    private final String accept;
    private final String authorizationHeader;

    public HttpRequest(HttpMethod method, String url, String body, int timeoutMillis,
                       boolean followRedirects, String contentType, String accept, String authorizationHeader) {
        this.method = method;
        this.url = url;
        this.body = body;
        this.timeoutMillis = timeoutMillis;
        this.followRedirects = followRedirects;
        this.contentType = contentType;
        this.accept = accept;
        this.authorizationHeader = authorizationHeader;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method=" + method +
                ", url='" + url + '\'' +
                ", body='" + body + '\'' +
                ", timeoutMillis=" + timeoutMillis +
                ", followRedirects=" + followRedirects +
                ", contentType='" + contentType + '\'' +
                ", accept='" + accept + '\'' +
                ", authorizationHeader='" + authorizationHeader + '\'' +
                '}';
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getBody() {
        return body;
    }

    public int getTimeoutMillis() {
        return timeoutMillis;
    }

    public boolean isFollowRedirects() {
        return followRedirects;
    }

    public String getContentType() {
        return contentType;
    }

    public String getAccept() {
        return accept;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }
}
