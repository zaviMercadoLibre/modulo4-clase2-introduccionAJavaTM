package ejercicio2;

public class Contador {
    private int count;

    public Contador()
    {

    }

    public Contador(int count)
    {
        this.count = count;
    }

    public void increment()
    {
        setCount(this.count++);
    }
    public void decrement()
    {
        setCount(this.count--);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
