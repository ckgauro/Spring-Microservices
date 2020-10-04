package com.gauro.msscbrewery.services.v2;

import com.gauro.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author Chandra
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerByID(UUID beerId);

    BeerDtoV2 saveBeerById(BeerDtoV2 beerDto);

    void updateBeer(UUID beeerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);

}
