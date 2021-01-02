package com.example.ActualDataBaseAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Pirate {
    private final UUID id;
    private final String name;
    private final String crew;
    private final Float reward;

    public Pirate(@JsonProperty("id") UUID id,
                  @JsonProperty("pirateName") String name,
                  @JsonProperty("pirateCrew") String crew,
                  @JsonProperty("pirateReward") Float reward) {
        this.id = id;
        this.name = name;
        this.crew = crew;
        this.reward = reward;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCrew() {
        return crew;
    }

    public Float getReward() {
        return reward;
    }
}
