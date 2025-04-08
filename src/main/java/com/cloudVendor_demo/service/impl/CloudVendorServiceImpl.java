package com.cloudVendor_demo.service.impl;

import com.cloudVendor_demo.model.CloudVendor;
import com.cloudVendor_demo.repository.CloudVendorRepository;
import com.cloudVendor_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully created cloud vendor with ID: " + cloudVendor.getVendorId();
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        if (cloudVendorRepository.existsById(cloudVendor.getVendorId())) {
            cloudVendorRepository.save(cloudVendor);
            return "Successfully updated cloud vendor with ID: " + cloudVendor.getVendorId();
        }
        return " Cloud vendor with ID: " + cloudVendor.getVendorId() + " does not exist.";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        if (cloudVendorRepository.existsById(vendorId)) {
            cloudVendorRepository.deleteById(vendorId);
            return "Successfully deleted cloud vendor with ID: " + vendorId;
        }
        return "cloud vendor with ID: " + vendorId + " does not exist.";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if (cloudVendorRepository.existsById(vendorId)) {
            return cloudVendorRepository.findById(vendorId).orElse(null);
        }
        return null;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        if (cloudVendorRepository.count() > 0) {
            return cloudVendorRepository.findAll();
        }
        return null;
    }
}
