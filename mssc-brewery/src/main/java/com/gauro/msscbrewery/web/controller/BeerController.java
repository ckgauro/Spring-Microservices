package com.gauro.msscbrewery.web.controller;

import com.gauro.msscbrewery.services.BeerService;
import com.gauro.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by chandra
 */

@Slf4j
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
    @PostMapping(consumes = "application/json")
    public ResponseEntity<BeerDto> handlePost(@RequestBody BeerDto beerDto){
        log.info("BeerDto is called -->"+beerDto);
        BeerDto saveDto=beerService.saveNewBeer(beerDto);
        log.info("BeerDto is called -->"+saveDto);
        HttpHeaders headers=new HttpHeaders();
        headers.add("Location","/api/v1/beer/"+saveDto.getId().toString());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beerDto){
        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity<>((HttpStatus.NO_CONTENT));

    }
}
