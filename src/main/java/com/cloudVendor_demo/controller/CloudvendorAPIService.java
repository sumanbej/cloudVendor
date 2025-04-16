package com.cloudVendor_demo.controller;

import com.cloudVendor_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;
import com.cloudVendor_demo.model.CloudVendor;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudvendorAPIService {

    CloudVendorService cloudVendorService;
    public CloudvendorAPIService(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



    @GetMapping()
    public List<CloudVendor > getAllCloudVendors(){

        return cloudVendorService.getAllCloudVendors();
    }

    @GetMapping("{vendorId}")
    public CloudVendor cloudVendor(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }
    @PostMapping()
    public CloudVendor createCloudVendor( @RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return cloudVendor;
    }
    @PutMapping()
    public CloudVendor updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return cloudVendor;
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor with ID: " + vendorId + " deleted successfully.";
    }
}


