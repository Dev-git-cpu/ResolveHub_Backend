package com.example.ResolveHub.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public interface doFilter {
    void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException;
}
