
package listik;


public class Listik {

   
  public static void main(String[] args) {
        MyStack<Integer>[] arrayOfStacks = new MyStack[2];
      MyQueue<Integer>[] arrayOfQueue = new MyQueue[2];

       for (int i = 0; i < arrayOfStacks.length; i++) { arrayOfStacks[i] = new MyStack<>(); }
        for (int i = 0; i < arrayOfQueue.length; i++) { arrayOfQueue[i] = new MyQueue<>(); }

        for (MyStack<Integer> i : arrayOfStacks) {
            i.add(1);
           i.add(2);
           i.add(3);
       }
        for (MyQueue<Integer> i : arrayOfQueue) {
            i.add(7);
            i.add(8);
            i.add(9);
        }

        for (MyStack<Integer> i : arrayOfStacks) { System.out.println(i.toString()); }
        for (MyQueue<Integer> i : arrayOfQueue) { System.out.println(i.toString()); }

        System.out.println("Pop from stack[0] " + arrayOfStacks[0].pop());

        for (MyStack<Integer> i : arrayOfStacks) { System.out.println(i.toString());}
    }
}