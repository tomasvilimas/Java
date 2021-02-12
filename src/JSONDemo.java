import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JSONDemo {
    public static void main(String[] args) throws JsonProcessingException {


        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Apple",
                new BigDecimal("45642365463546"),
                new Address("LT-59874", "Kaunas")));

        companies.add(new Company("Samsung",
                new BigDecimal("32168946546"),
                new Address("LT-12346", "Ringaudai")));


        String json=  "";

        System.out.println(json);

        ObjectMapper objectMapper= new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        json= objectMapper.writeValueAsString(companies);

//



        System.out.println(json);








    }
}

class Company {
    private String name;
    private BigDecimal earnings;
    private Address address;

    public Company(String name, BigDecimal earnings, Address address) {
        this.name = name;
        this.earnings = earnings;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {

    private String index;
    private String city;

    public Address(String index, String city) {
        this.index = index;
        this.city = city;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}