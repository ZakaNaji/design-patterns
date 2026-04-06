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
    private final Integer timeoutMillis;
    private final boolean followRedirects;
    private final String contentType;
    private final String accept;
    private final String authorizationHeader;

    private HttpRequest(HttpMethod method, String url, String body, Integer timeoutMillis, boolean followRedirects, String contentType, String accept, String authorizationHeader) {
        this.method = method;
        this.url = url;
        this.body = body;
        this.timeoutMillis = timeoutMillis;
        this.followRedirects = followRedirects;
        this.contentType = contentType;
        this.accept = accept;
        this.authorizationHeader = authorizationHeader;
    }

    public static class Builder {
        private final HttpMethod method;
        private final String url;
        private String body;
        private Integer timeoutMillis = null;
        private boolean followRedirects = false;
        private String contentType;
        private String accept;
        private String authorizationHeader;

        public Builder(HttpMethod method, String url) {
            this.method = method;
            this.url = url;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeoutMillis(int timeoutMillis) {
            this.timeoutMillis = timeoutMillis;
            return this;
        }

        public Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder accept(String accept) {
            this.accept = accept;
            return this;
        }

        public Builder authorizationHeader(String authorizationHeader) {
            this.authorizationHeader = authorizationHeader;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(method, url, body, timeoutMillis, followRedirects, contentType, accept, authorizationHeader);
        }
    }

    @Override
    public String toString() {
        //should print true null
        return "HttpRequest{" +
                "method=" + method +
                ", url=" + url +
                ", body=" + body +
                ", timeoutMillis=" + timeoutMillis +
                ", followRedirects=" + followRedirects +
                ", contentType=" + contentType +
                ", accept=" + accept +
                ", authorizationHeader=" + authorizationHeader +
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
