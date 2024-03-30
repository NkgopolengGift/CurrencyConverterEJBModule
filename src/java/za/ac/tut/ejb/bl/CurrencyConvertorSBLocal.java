package za.ac.tut.ejb.bl;

import javax.ejb.Local;

@Local
public interface CurrencyConvertorSBLocal {

    Double dollarToRand(Double dollar);

    Double randToDollar(Double rand);
    
}
