package P09;

import java.util.Currency;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        IBankRate bankRate = getBank();


        Request request = new Request(new Date(),"EUR");
        ICurrencyResponse rateResponse= bankRate.getRate(request);
        System.out.println(rateResponse.getRate());

    }

    static IBankRate getBank(){
        return new BankLT();

    }
}


        class BankLT implements IBankRate{

            @Override
            public ICurrencyResponse getRate(ICurrencyRequest request) {
                return new Response();
            }
            class Response implements ICurrencyResponse{
                @Override
                public double getRate() {
                    return 1.351;
                }
            }
        }

        class BankUK implements IBankRate{
            @Override
            public ICurrencyResponse getRate(ICurrencyRequest request) {
                return new Response();
            }

            class Response implements ICurrencyResponse{
                @Override
                public double getRate() {
                    return 1.120;
                }
            }
        }

        class Request implements ICurrencyRequest{

            private Date date;
            private String currency;

            public Request(Date date, String currency) {
                this.date = date;
                this.currency = currency;
            }

            @Override
            public Date getDate() {
                return null;
            }

            @Override
            public String getCurrency() {
                return null;
            }
        }

