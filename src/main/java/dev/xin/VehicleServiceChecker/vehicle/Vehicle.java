package dev.xin.VehicleServiceChecker.vehicle;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// @Document is specific to map a class to noSQL database (specifically mongoDB), it represents a MongoDB documents
@Document(collection = "vehicles")
public record Vehicle(
    @Id
    String id,
    Integer year,
    Integer miles,
    String make,
    String model
) {}
