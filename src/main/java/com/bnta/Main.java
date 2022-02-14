package com.bnta;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
    }

    Faker faker = new Faker();

    public Faker getFaker() {
        System.out.println(faker.address());
        return null;
    }
}
