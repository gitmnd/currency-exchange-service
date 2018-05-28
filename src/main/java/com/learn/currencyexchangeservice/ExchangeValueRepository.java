package com.learn.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MACHUNAGENDRADURGP on 21/05/2018.
 */

@RequestMapping
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{

    ExchangeValue findByFromAndTo(String from,String to);
}
