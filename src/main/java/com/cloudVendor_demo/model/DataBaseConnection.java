//package com.cloudVendor_demo.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataBaseConnection implements CommandLineRunner {
//
//    @Autowired
//    private CloudVendorRepo cloudVendorRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        CloudVendor cloudVendor=new CloudVendor();
//        cloudVendor.setVendorAddress("Kahi to kolkata me");
//        cloudVendor.setVendorId("123");
//        cloudVendor.setVendorName("Suman Bej");
//        cloudVendor.setVendorPhoneNumber("98989898989");
//
//        cloudVendorRepo.save(cloudVendor);
//        CloudVendor cloudVendor1=new CloudVendor();
//        cloudVendor1.setVendorAddress("Delhi");
//        cloudVendor1.setVendorId("231");
//        cloudVendor1.setVendorName("Mr. Modi");
//        cloudVendor1.setVendorPhoneNumber("36463734");
//        cloudVendorRepo.save(cloudVendor1);
//    }
//}
