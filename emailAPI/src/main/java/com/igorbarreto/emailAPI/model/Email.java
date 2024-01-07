package com.igorbarreto.emailAPI.model;

public record Email(
        String to,
        String subject,
        String body
) {
}
