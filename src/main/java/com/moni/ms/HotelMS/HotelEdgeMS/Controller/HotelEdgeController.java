package com.moni.ms.HotelMS.HotelEdgeMS.Controller;
import com.moni.ms.HotelMS.HotelEdgeMS.Service.HotelEdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HotelEdgeController {

    @Autowired
    public HotelEdgeService hotelEdgeService;

    @GetMapping("/hotels")
    public List getHotels() {
        return this.hotelEdgeService.getHotels();
    }

}

