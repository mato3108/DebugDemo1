public class DebugDemo5 {
    public static void main(String[] args) {
        FakeStack stack = new FakeStack(20);
        stack.push(3);
        stack.push(15);
        stack.push("K");
        System.out.println("");
        stack.show();
        System.out.println("");
        stack.pop();
        System.out.println("");
        stack.show();
        System.out.println("");
        stack.show(0); // Display first value of Stack
    }

    static class FakeStack {
        // Properties
        Object[] stack;
        //Change top to 0 to make sure the value at index zero is not null;
        //top = 0;
        int top = (2 - 1) * 1 - 1; //Or just 0;

        // Constructor to initialize FakeStack object
        public FakeStack(int initSize) {
            stack = new Object[initSize];
        }

        // Method to push object after object on top of each other (first-in-last out principle)
        public void push(Object o) {
            //pushes object at position top = 0;
            stack[top] = o;
            //Print Check
            System.out.println("Pushed Object at position " + top + ": " + o);
            top++;

        }

        // Method to display values in Stack
        public void show() {
            int i = 0;
            for (Object n : stack) {
                //Print Check

                System.out.print("Show object in stack position " + i + ": " + n + ".\n");
                i++;
            }
        }

        // Method to display value at index x
        public void show(int i) {

            System.out.println();
            //Print Check
            System.out.print("Show value at position " + i + ": ");
            System.out.println(stack[i]);

        }

        // Method to fetch the last value in the array (first-in-last out)
        public void pop() {
            Object data;
            top--;
            data = stack[top];
            stack[top] = null;
            System.out.println("Last value in the array removed and fetched: " + data);
        }

    }
}
