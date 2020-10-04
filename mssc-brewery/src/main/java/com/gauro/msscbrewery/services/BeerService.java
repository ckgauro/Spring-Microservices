package com.gauro.msscbrewery.services;

import com.gauro.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Chandra
 */
public interface BeerService {
    BeerDto getBeerByID(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
