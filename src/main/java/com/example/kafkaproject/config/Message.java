package com.example.kafkaproject.config;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime created) {
}
