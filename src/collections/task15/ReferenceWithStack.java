package collections.task15;

import codeFromBook.Stack;

public class ReferenceWithStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("U");
        stack.push("n");
        stack.push("c");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push("e");
        stack.push("r");
        stack.push("t");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push("a");
        System.out.print(stack.pop());
        stack.push("i");
        System.out.print(stack.pop());
        stack.push("n");
        stack.push("t");
        stack.push("y");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push(" ");
        System.out.print(stack.pop());
        stack.push("r");
        stack.push("u");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push("l");
        stack.push("e");
        stack.push("s");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());

    }
}


