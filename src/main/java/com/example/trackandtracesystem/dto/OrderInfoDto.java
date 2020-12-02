package com.example.trackandtracesystem.dto;

import java.time.LocalDate;

public class OrderInfoDto {

    private String clientInfo;

    private String orderDesc;

    private LocalDate deliveryDate;

    public static OrderInfoDtoBuilder builder(){
        return new OrderInfoDtoBuilder();
    }

    public static class OrderInfoDtoBuilder {
        private final OrderInfoDto orderInfoDto;

        private OrderInfoDtoBuilder(){
            orderInfoDto = new OrderInfoDto();
        }

        public OrderInfoDtoBuilder withClientInfo(String clientInfo){
            orderInfoDto.clientInfo = clientInfo;
            return this;
        }

        public OrderInfoDto build(){
            return orderInfoDto;
        }
    }

    @Override
    public String toString() {
        return "OrderInfoDto{" +
                "clientInfo='" + clientInfo + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        OrderInfoDto dto = OrderInfoDto.builder()
                .withClientInfo("info")
                .build();

        System.out.println(dto);

        dto.clone();
    }
}
