package OO;

public class Address {
    private int HouseNumber;
    private String FirstLine;
    private String SecondLine;
    private String Postcode;

    public Address(int aHouseNumber, String aFirstLine, String aSecondLine, String aPostCode) {

        HouseNumber = aHouseNumber;
        FirstLine = aFirstLine;
        SecondLine = aSecondLine;
        Postcode = aPostCode;
    };

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int Value) {
        HouseNumber = Value;
    }

    public String getFirstLine() {
        return FirstLine;
    }

    public void setFirstLine(String Value) {
        FirstLine = Value;
    }

    public String getSecondLine() {
        return SecondLine;
    }

    public void setSecondLine(String Value) {
        SecondLine = Value;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setHouseNumber(String Value) {
        Postcode = Value;
    }

    public String getFullAddress() {
        return HouseNumber + " " + FirstLine + " " + SecondLine + " " + Postcode;
    }
}
