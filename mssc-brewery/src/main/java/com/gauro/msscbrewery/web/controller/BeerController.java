package com.gauro.msscbrewery.web.controller;

import com.gauro.msscbrewery.services.BeerService;
import com.gauro.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by chandra
 */

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    private final BeerService beerService;
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    //https://www.uuidgenerator.net/
    //http://localhost:8080/api/v1/beer/d11b4d65-23f9-4e49-85a3-558efc2db44f
    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId){
        return new ResponseEntity<>(beerService.getBeerByID(beerId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<BeerDto> handlePost(BeerDto beerDto){
        BeerDto saveDto=beerService.saveNewBeer(beerDto);

        HttpHeaders headers=new HttpHeaders();
        headers.add("Location","/api/v1/beer"+saveDto.getId().toString());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }
}
