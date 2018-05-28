package com.learn.currencyexchangeservice;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by MACHUNAGENDRADURGP on 21/05/2018.
 */

@Entity
@Table(name = "EXCHANGEVALUE")
public class ExchangeValue {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "FROMWHERE")
    private String from;

    @Column(name = "TOWHERE")
    private String to;

    @Column(name = "CONVERSIONMULTIPLE")
    private BigDecimal conversionMultiple;

    @Transient
    private int port;

    public ExchangeValue(){

    }


    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple,int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for property 'from'.
     *
     * @return Value for property 'from'.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Setter for property 'from'.
     *
     * @param from Value to set for property 'from'.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Getter for property 'to'.
     *
     * @return Value for property 'to'.
     */
    public String getTo() {
        return to;
    }

    /**
     * Setter for property 'to'.
     *
     * @param to Value to set for property 'to'.
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Getter for property 'conversionMultiple'.
     *
     * @return Value for property 'conversionMultiple'.
     */
    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    /**
     * Setter for property 'conversionMultiple'.
     *
     * @param conversionMultiple Value to set for property 'conversionMultiple'.
     */
    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
