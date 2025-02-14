package org.example;

import lombok.*;

@With
@Builder

public record Lehrer(String id, String name, String fach) {
}
