package com.gauro.msscbrewery.web.controller.v2;

import com.gauro.msscbrewery.services.v2.BeerServiceV2;
import com.gauro.msscbrewery.web.model.BeerDto;
import com.gauro.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Chandra
 */

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {
    private final BeerServiceV2 beerServiceV2;

    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    //http://localhost:8080/api/v2/beer/fb08ac17-b577-4872-a5a5-ef9166726e13
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {
        BeerDtoV2 newBeerDtoV2 = beerServiceV2.getBeerByID(beerId);
        return new ResponseEntity<>(newBeerDtoV2, HttpStatus.OK);
    }

    //http://localhost:8080/api/v2/beer
    @PostMapping
    public ResponseEntity<BeerDtoV2> handlePost(@RequestBody BeerDtoV2 beerDtoV2) {
        BeerDtoV2 newbeerDtoV2 = beerServiceV2.saveBeerById(beerDtoV2);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v2/beer/" + newbeerDtoV2.getId());
        return new ResponseEntity<>(httpHeaders, HttpStatus.ACCEPTED);
    }

    //http://localhost:8080/api/v2/beer/fb08ac17-b577-4872-a5a5-ef9166726e13
    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> handlePut(@PathVariable("beerId") UUID beerId, @RequestBody BeerDtoV2 beerDtoV2) {
        beerServiceV2.updateBeer(beerId, beerDtoV2);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //http://localhost:8080/api/v2/beer/fb08ac17-b577-4872-a5a5-ef9166726e13
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("beerId") UUID beerId) {
        beerServiceV2.deleteById(beerId);
    }

}
