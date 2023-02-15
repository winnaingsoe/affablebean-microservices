package com.example.transportationservice.controller;

import com.example.transportationservice.entity.ProductDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transport")
public class TransportationController {

    /*
    * customerName
    * customerEmail
    * productName
    * price
    * productQuantity
    * TransportTime
    * orderId
    * totalAmount
    */

    record TransPortInfoRequest(
            @JsonProperty("customer_name") String customerName,
            String email,
            List<ProductDto> products,
            @JsonProperty("total_amount") double totalAmount
    ){}

    record TransPortInfoResponse(String name){}

    @PostMapping("/save-transport-info")
    public TransPortInfoResponse transPortInfo(@RequestBody TransPortInfoRequest request){
        System.out.println(request);
        return new TransPortInfoResponse("success");
    }
}
