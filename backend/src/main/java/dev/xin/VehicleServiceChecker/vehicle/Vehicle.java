package dev.xin.VehicleServiceChecker.vehicle;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// @Document is specific to map a class to noSQL database (specifically used for mongoDB), it represents a MongoDB documents
@Document
// @Data is a Lombok annotation to generate all the boilerplate that is generally associated with simple POJOs (Plain Old Java Objects) and value objects
@Data
// @NoArgsConstructor is a Lombok annotation to generate a constructor with no arguments
@NoArgsConstructor
// @AllArgsConstructor is a Lombok annotation to generate a constructor with all arguments
@AllArgsConstructor
public class Vehicle {
    @Id
    private Integer id;

    private Integer year;

    private String model;
}
