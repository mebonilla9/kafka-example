package dev.manuel.kafkaexample;

import java.time.LocalDateTime;

public record Message(
  String message,
  LocalDateTime created
) {
}
