public class DateAndCases {

    private String date, cases;

    public DateAndCases(String s) {
        String[] temp = s.split(" on ",0);
        cases = temp[0];
        date = temp[1];
    }

    public String toString() {
        return (date+": "+cases+" cases\n");
    }
}
