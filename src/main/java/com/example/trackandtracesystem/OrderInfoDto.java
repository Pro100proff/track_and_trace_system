package com.example.trackandtracesystem;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class OrderInfoDto {

    private String clientInfo;

    private String orderDesc;

    private LocalDate deliveryDate;
}
