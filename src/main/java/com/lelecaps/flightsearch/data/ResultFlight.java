/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelecaps.flightsearch.data;

import java.text.DecimalFormat;

/**
 *
 * @author gabriele
 */
public class ResultFlight {
    String flight;
    double price;

    public ResultFlight(String flight, double price) {
      this.flight = flight;
      this.price = price;
    }
    
    public String getFlight(){
        return flight;
    }
    
    public double getPrice(){
        return price;
    }
  
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return getFlight() + ", " + df.format(getPrice()) + " €";
    }
 
}
