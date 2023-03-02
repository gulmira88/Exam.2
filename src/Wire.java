import java.time.LocalDate;

public class Wire {
    private String brand;
    private String country;
    private LocalDate yearDateOf;

    public Wire(String brand, String country, LocalDate yearDateOf) {
        this.brand = brand;
        this.country = country;
        this.yearDateOf = yearDateOf;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getYearDateOf() {
        return yearDateOf;
    }

    public void setYearDateOf(LocalDate yearDateOf) {
        this.yearDateOf =yearDateOf;
    }

    @Override
    public String toString() {
        return "Wire:" +
                "brand:" + brand + ' ' +
                "\n country:" + country + ' ' +
                "\n yearDateOf:" + yearDateOf +
                '\n';
    }
}
