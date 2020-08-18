public class OutputCases {

    public static void main(String[] args) {

        In input = new In(args[0]);
        String temp = input.readAll().replaceFirst("<li>", "");
        temp = temp.replaceAll("</li><li>", ", ");
        temp = temp.replaceFirst("</li>", "");

        String[] valueAndDate = temp.split(", ");

        DateAndCases[] output = new DateAndCases[valueAndDate.length];
        for (int i=0; i < output.length; i++) {
            output[i] = new DateAndCases(valueAndDate[i]);
        }
        for (DateAndCases x : output)
          StdOut.print(x);

    }
}
