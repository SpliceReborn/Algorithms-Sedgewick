public class Bag<Item> {

    private int count;
    private Item[] a;
    private String toPrint = "";

    public Bag() {
        a = (Item[]) new Object[2];
    }

    public void add(Item item) {
        if (count == a.length)
            upsize();
        a[count++] = item;
    }

    public void upsize() {
        Item[] temp = (Item[]) new Object[2*a.length];
        for (int i=0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public String toString() {
        for (Item i : a) {
            String test = ""+i;
            if (!test.equals("null")) {
                toPrint += ""+i+", ";
            }
        }

        return("Bag contains " +count+" items: " + toPrint);
    }
}
