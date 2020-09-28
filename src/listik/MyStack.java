
package listik;


public class MyStack<T> extends MyList<T> {
    @Override
    public void add(T value) {
        super.add_front(value);
    }
    @Override
    public String toString() {
        String out = "Stack";
        for (Node<T> i = this.head; i != null; i = i.next)
            out += i.value.toString() + " ";
        return out;
    }
}