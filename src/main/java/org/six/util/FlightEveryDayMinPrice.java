package org.six.util;

/**
 * Created by yanglu on 6/11/17.
 */
public class FlightEveryDayMinPrice {
    private int id;
    private String flightNumber;
    private String minPrice;
    private String querytime;
    private String departureaDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getQuerytime() {
        return querytime;
    }

    public void setQuerytime(String querytime) {
        this.querytime = querytime;
    }

    public String getDepartureaDate() {
        return departureaDate;
    }


    public void setDepartureaDate(String departureaDate) {
        this.departureaDate = departureaDate;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", minPrice='" + minPrice + '\'' +
                ", querytime='" + querytime + '\'' +
                ", departureaDate='" + departureaDate + '\'' +
                '}';
    }
}
