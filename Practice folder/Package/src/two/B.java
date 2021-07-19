package two;

public class B {
    public String items;

    public B(String items) {
        this.items = items;
    }

    public String getItems() {
        return items;
    }

    public void msg()
    {
        System.out.println(getItems());
    }
}
