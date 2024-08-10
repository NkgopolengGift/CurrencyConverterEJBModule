# Currency Converter EJB

## Overview

The Currency Converter EJB (Enterprise JavaBean) project provides a stateless session bean for converting between US Dollars (USD) and South African Rand (ZAR). The EJB provides methods to convert USD to ZAR and vice versa using a fixed exchange rate.

## Project Structure

- **`CurrencyConvertorSB.java`**: The stateless session bean that implements the currency conversion logic. It provides methods to convert between USD and ZAR.

- **`CurrencyConvertorSBLocal.java`**: The local interface for the stateless session bean, defining the business methods that can be invoked by clients.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Java EE application server (e.g., Apache Tomcat with JEE support, WildFly, or GlassFish)
- Basic knowledge of EJB and JEE


## How It Works

1. **Currency Conversion Methods:**
   - **`dollarToRand(Double dollar)`**: Converts a given amount in USD to ZAR using a fixed exchange rate of 20.00.
   - **`randToDollar(Double rand)`**: Converts a given amount in ZAR to USD using the same fixed exchange rate.

2. **Stateless Session Bean:**
   - The `CurrencyConvertorSB` class is annotated with `@Stateless`, indicating it is a stateless session bean that does not maintain any conversational state between method calls.


## Known Issues

- The fixed exchange rate used in the conversion is hard-coded and may not reflect real-time rates.

## Future Enhancements

- Implement dynamic exchange rates by integrating with an external currency exchange rate service.
- Add error handling and validation for input values.
- Create a web or desktop client application to interact with the EJB more easily.

Feel free to update the contact information and any other project-specific details as needed!
