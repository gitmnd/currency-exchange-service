package com.learn.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by MACHUNAGENDRADURGP on 21/05/2018.
 */

@RestController
public class CurrencyExchangeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ExchangeValueRepository exchangeValueRepository;

    @Autowired
    private Environment environment;

    @Autowired
    public CurrencyExchangeController(ExchangeValueRepository exchangeValueRepository){
        this.exchangeValueRepository = exchangeValueRepository;
    }

    @RequestMapping(value="/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to){

        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from,to);
        exchangeValue.setPort(
                Integer.parseInt(environment.getProperty("local.server.port")));

        logger.info("{}",exchangeValue);
        return exchangeValue;
    }
}
