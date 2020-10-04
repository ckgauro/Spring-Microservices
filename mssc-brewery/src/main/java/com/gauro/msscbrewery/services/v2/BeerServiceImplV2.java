package com.gauro.msscbrewery.services.v2;

import com.gauro.msscbrewery.web.model.v2.BeerDtoV2;
import com.gauro.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

/**
 * @author Chandra
 */
@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerByID(UUID beerId) {
        log.info("getBeerByID is called");
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeerById(BeerDtoV2 beerDto) {
        log.info("saveBeerById is called");
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beeerId, BeerDtoV2 beerDto) {
        log.info("updateBeer is called");

    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("deleteById is called");
    }
}
