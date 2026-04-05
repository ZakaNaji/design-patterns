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
    private HttpMethod method;
    private String url;
    private String body;
    private int timeoutMillis;
    private boolean followRedirects;
    private String contentType;
    private String accept;
    private String authorizationHeader;



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

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTimeoutMillis(int timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }

    public void setFollowRedirects(boolean followRedirects) {
        this.followRedirects = followRedirects;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public void setAuthorizationHeader(String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
    }
}
