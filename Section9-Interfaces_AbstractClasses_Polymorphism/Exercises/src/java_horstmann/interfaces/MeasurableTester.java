package java_horstmann.interfaces;

public class MeasurableTester {

    public static void main(String[] args) {
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(100000);
        accounts[2] = new BankAccount(2000);
        double averageBalance = Data.average(accounts);
        System.out.println("Average balance is: " + averageBalance);

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);

        double averageArea = Data.average(countries);
        System.out.println("Average area is: " + averageArea);

        Measurable countryWithMaxArea = Data.max(countries);
        Country maxAreaCountry = (Country) countryWithMaxArea;
        System.out.println("The country with maximum area is " + maxAreaCountry.getName() + " with an area of " + maxAreaCountry.getMeasure());
    }

}
