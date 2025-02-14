package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@With
public class Student {
    private String id;
    private String name;
    private String addresse;
    private double note;

}