package com.moni.ms.HotelMS.HotelEdgeMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class HotelEdgeServiceImpl implements HotelEdgeService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List getHotels() {
        List hotelList = restTemplate.getForObject("http://localhost:8090/hotels", List.class);
        return hotelList;
    }
}



