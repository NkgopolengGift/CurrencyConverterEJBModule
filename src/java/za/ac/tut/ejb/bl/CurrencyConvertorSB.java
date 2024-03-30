package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;

@Stateless
public class CurrencyConvertorSB implements CurrencyConvertorSBLocal {

    private final Double DOLLAR_RATE = 20.00;
    
    @Override
    public Double dollarToRand(Double dollar) {
        double rand = dollar*DOLLAR_RATE;
        return rand;
    }

    @Override
    public Double randToDollar(Double rand) {
        
        double dollar = rand / DOLLAR_RATE;
        return dollar;
    }
    
    
}
