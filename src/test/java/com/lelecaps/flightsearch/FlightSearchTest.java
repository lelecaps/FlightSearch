package com.lelecaps.flightsearch;

import com.lelecaps.flightsearch.data.ResultFlight;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author gabriele
 */
public class FlightSearchTest {
    
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Calendar cal;
    String date;
    String origin, destination;
    int adult, child, infant, days;
    
    public FlightSearchTest() {
    }

    @Test
    public void testFightSearchTest1() throws FileNotFoundException, ParseException {
        // Test #1
        ArrayList<ResultFlight> rs = new ArrayList<>();
        rs.add(new ResultFlight("TK2372", 157.6));
        rs.add(new ResultFlight("TK2659", 198.4));
        rs.add(new ResultFlight("LH5909", 90.4));
        // 1 adult, 31 days to the departure date, flying AMS -> FRA
        origin = "AMS";
        destination = "FRA";
        adult = 1;
        child = 0;
        infant = 0;
        days = 31;
        
        cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DAY_OF_MONTH, days);
        date = df.format(cal.getTime());
        FlightSearch fs = new FlightSearch(origin, destination, date, adult, child, infant);
        Assert.assertEquals(fs.results.toString(),rs.toString());
    }
    
    @Test
    public void testFightSearchTest2() throws FileNotFoundException, ParseException {
        // Test #2
        ArrayList<ResultFlight> rs = new ArrayList<>();
        rs.add(new ResultFlight("TK8891", 806));
        rs.add(new ResultFlight("LH1085", 481.19));
        // 2 adults, 1 child, 1 infant, 15 days to the departure date, flying LHR -> IST
        origin = "LHR";
        destination = "IST";
        adult = 2;
        child = 1;
        infant = 1;
        days = 15;
        
        cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DAY_OF_MONTH, days);
        date = df.format(cal.getTime());
        FlightSearch fs = new FlightSearch(origin, destination, date, adult, child, infant);
        Assert.assertEquals(fs.results.toString(),rs.toString());
    }
    
    @Test
    public void testFightSearchTest3() throws FileNotFoundException, ParseException {
        // Test #3
        ArrayList<ResultFlight> rs = new ArrayList<>();
        rs.add(new ResultFlight("IB2171", 909.09));
        rs.add(new ResultFlight("LH5496", 1028.43));
        // 1 adult, 2 children, 2 days to the departure date, flying BCN -> MAD
        origin = "BCN";
        destination = "MAD";
        adult = 1;
        child = 2;
        infant = 0;
        days = 2;
        
        cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DAY_OF_MONTH, days);
        date = df.format(cal.getTime());
        FlightSearch fs = new FlightSearch(origin, destination, date, adult, child, infant);
        Assert.assertEquals(fs.results.toString(),rs.toString());
    }
    
    @Test
    public void testFightSearchTest4() throws FileNotFoundException, ParseException {
        // Test #4
        ArrayList<ResultFlight> rs = new ArrayList<>();
        // CDG -> FRA
        origin = "CDG";
        destination = "FRA";
        adult = 1;
        child = 0;
        infant = 0;
        days = 20;
        
        cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DAY_OF_MONTH, days);
        date = df.format(cal.getTime());
        FlightSearch fs = new FlightSearch(origin, destination, date, adult, child, infant);
        Assert.assertEquals(fs.results.toString(),rs.toString());
    }

}
