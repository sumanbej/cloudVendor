package com.cloudVendor_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cloudVendor_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudVendor")
public class CloudvendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor cloudVendor(){
        return new CloudVendor ("1", "CloudVendor Inc.",
                "123 Cloud St.", "123-456-7890");
    }
}
