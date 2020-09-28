/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listik;

/**
 *
 * @author Netbeans
 */
public class MyQueue<T> extends MyList<T> {
    @Override
    public String toString() {
        String out = "ochered";
        for (Node<T> i = this.head; i != null; i = i.next)
            out += i.value.toString() + " ";
        return out;
    }
}