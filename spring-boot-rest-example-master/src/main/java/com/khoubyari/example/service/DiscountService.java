package com.khoubyari.example.service;


import com.khoubyari.example.dao.jpa.DiscountRepository;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
public class DiscountService {

    private static final Logger log = LoggerFactory.getLogger(DiscountService.class);

    @Autowired
    private DiscountRepository hotelRepository;

    @Autowired
    CounterService counterService;

    @Autowired
    GaugeService gaugeService;

    public DiscountService() {
    }


    
    public String getCustomerType(String customerID)
    {
    	
    	return "A";
    }
    public Date getJoinDate(String customerID){
    	return new Date();
    }
    public int getDiscountPercentage(String custType){
    	return 30;
    	
    }
}
