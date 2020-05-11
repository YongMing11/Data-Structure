/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    public static void main(String[] args) {
        System.out.println("Enter a expression : " + "System.out.println(str.charAt(3);");
        System.out.println("System.out.println(str.charAt(3);");
        System.out.println(isBalance("System.out.println(str.charAt(3);"));

        System.out.println("\nEnter a expression : System.out.print(\"\\(No Error\");");
        System.out.println("System.out.print(\"\\(No Error\");");
        System.out.println(isBalance("System.out.print(\"\\(No Error\");"));

        System.out.println("\nEnter a expression : int[] num = 1, 2}");
        System.out.println("int[] num = 1, 2}");
        System.out.println(isBalance("int[] num = 1, 2}"));

        System.out.println("\nEnter a expression : if (arr[{3] < 4)");
        System.out.println("if (arr[{3] < 4)");
        System.out.println(isBalance("if (arr[{3] < 4)"));
    }

    public static String isBalance(String s) {
        Stack<Character> stack1 = new Stack<>();
        String space = "";
        for (int i = 0; i < s.length(); i++) {
//            System.out.println(stack1.peek());

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                if (i == 0 || s.charAt(i - 1) != '\\') {
                    stack1.push(s.charAt(i));
//                    stack1.showStack();
//                    System.out.println("");
                }
                space += " ";
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                switch (s.charAt(i)) {
                    case ')': {
                        if (stack1.getSize() != 0 && stack1.peek() == '(') {
                            stack1.pop();
                        } else {
                            if (stack1.contains('(')) {
                                return (space + "^ Missing " + reverse(stack1.peek()));
                            }
                            return (space + " ^ Extra " + s.charAt(i));
                        }
                        break;
                    }
                    case '}': {
                        if (stack1.getSize() != 0 && stack1.peek() == '{') {
                            stack1.pop();
                        } else {
                            if (stack1.contains('{')) {
                                return (space + "^ Missing " + reverse(stack1.peek()));
                            }
                            return (space + " ^ Extra " + s.charAt(i));
                        }
                        break;
                    }
                    case ']': {
                        if (stack1.getSize() != 0 && stack1.peek() == '[') {
                            stack1.pop();
//                            stack1.showStack();
                        } else {
                            if (stack1.contains('[')) {
                                return (space + "^ Missing " + reverse(stack1.peek()));
                            }
                            return (space + " ^ Extra " + s.charAt(i));
                        }
                        break;
                    }
                }
            } else {
                space += " ";
            }
        }

        while (stack1.peek() != null) {
//            System.out.println(stack1.peek());
            char c = stack1.pop();
            return (space + "^ Missing " + reverse(c));
//            switch (c) {
//                case '{': {
//                    return (space + "^ Missing " + '}');
////                    break;
//                }
//                case '[': {
//                    return (space + "^ Missing " + ']');
////                    break;
//                }
//                case '(': {
//                    return (space + "^ Missing " + ')');
////                    break;
//                }
//            }

        }
        return ("The expression is balanced");
    }
    public static char reverse(char o){
                switch (o) {
                case '{': {
                    return ('}');
//                    break;
                }
                case '[': {
                    return (']');
//                    break;
                }
                case '(': {
                    return (')');
//                    break;
                }
            }
                return ' ';
    }

}
