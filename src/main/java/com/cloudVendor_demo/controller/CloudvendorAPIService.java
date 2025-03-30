package com.cloudVendor_demo.controller;

import org.springframework.web.bind.annotation.*;
import com.cloudVendor_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudVendor")
public class CloudvendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor cloudVendor(){
        return new CloudVendor ("1", "CloudVendor Inc.",
                "123 Cloud St.", "123-456-7890");
    }
    @PostMapping()
    public CloudVendor createCloudVendor( @RequestBody CloudVendor cloudVendor){
        return cloudVendor;
    }
}
