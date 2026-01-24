package org.example.dto;


import java.math.BigDecimal;
import java.util.Map;

public class RatesDto {

    public String symbol;

    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String Symbol){
        this.symbol=symbol;
    }


    //    [
//    {
//        "baseCurrency": "USD",
//            "rates": {
//        "EUR": 0.93,
//                "GBP": 0.82,
//                "JPY": 149.2
//    }
//    },
//    {
//        "baseCurrency": "EUR",
//            "rates": {
//        "USD": 1.08,
//                "GBP": 0.88
//    }
//    }
//]
}
