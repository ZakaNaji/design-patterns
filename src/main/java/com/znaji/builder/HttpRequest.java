package com.znaji.builder;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

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
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;

    private HttpRequest(HttpMethod method, String url, String body, Integer timeoutMillis, boolean followRedirects, String contentType, String accept, String authorizationHeader, Map<String, String> headers, Map<String, String> queryParams) {
        this.method = method;
        this.url = url;
        this.body = body;
        this.timeoutMillis = timeoutMillis;
        this.followRedirects = followRedirects;
        this.contentType = contentType;
        this.accept = accept;
        this.authorizationHeader = authorizationHeader;
        this.headers = headers;
        this.queryParams = queryParams;
    }

    public static class Builder {
        private final HttpMethod method;
        private final String url;
        private String body;
        private Integer timeoutMillis = 5000;
        private boolean followRedirects = true;
        private String contentType;
        private String accept = "application/json";
        private String authorizationHeader;
        private Map<String, String> headers = new java.util.LinkedHashMap<>();
        private Map<String, String> queryParams = new java.util.LinkedHashMap<>();

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

        public Builder header(String key, String value) {
            if (key == null || key.isBlank()) {
                throw new IllegalArgumentException("Header key cannot be null or empty");
            }
            if (value == null) {
                throw new IllegalArgumentException("Header value cannot be null");
            }
            headers.put(key, value);
            return this;
        }

        public Builder queryParam(String key, String value) {
            if (key == null || key.isBlank()) {
                throw new IllegalArgumentException("Query parameter key cannot be null or empty");
            }
            if (value == null) {
                throw new IllegalArgumentException("Query parameter value cannot be null");
            }
            queryParams.put(key, value);
            return this;
        }

        public HttpRequest build() {
            validate();
            var headersCopy = new LinkedHashMap<>(headers);
            var queryParamsCopy = new LinkedHashMap<>(queryParams);
            return new HttpRequest(method, url, body, timeoutMillis, followRedirects, contentType, accept, authorizationHeader, Collections.unmodifiableMap(headersCopy), Collections.unmodifiableMap(queryParamsCopy));
        }

        private void validate() {
            if (method == null) {
                throw new IllegalStateException("HTTP method cannot be null");
            }
            if (url == null || url.isBlank()) {
                throw new IllegalStateException("URL cannot be null or empty");
            }
            if (timeoutMillis != null && timeoutMillis <= 0) {
                throw new IllegalStateException("Timeout must be positive when provided");
            }
            if (body != null && body.isBlank()) {
                throw new IllegalStateException("Body must not be blank when provided");
            }
            if ((method == HttpMethod.GET || method == HttpMethod.DELETE || method == HttpMethod.HEAD) && body != null) {
                throw new IllegalStateException(method + " requests must not have a body");
            }
            if (contentType != null && body == null) {
                throw new IllegalStateException("contentType requires a body");
            }
            if (body != null && (contentType == null || contentType.isBlank())) {
                throw new IllegalStateException("Content-Type header is required when body is provided");
            }
            if (authorizationHeader != null && authorizationHeader.isBlank()) {
                throw new IllegalStateException("Authorization header cannot be empty");
            }

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
                ", headers=" + headers +
                ", queryParams=" + queryParams +
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

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

}
