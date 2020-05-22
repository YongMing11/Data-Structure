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
public class Q2 {

    public static void main(String[] args) {
        System.out.println("Enter infix expression : 34 add 11 mul 7");
        System.out.println("The infix expression: " + "34+11*7");
        System.out.println("The postfix expression: " + infixToPostfix("34+11*7"));
        System.out.println("The result is " + postfixEvaluation("34+11*7"));

        System.out.println("Enter infix expression : ob 300 mul 75 add 4350 cb div 15 add 1126");
        System.out.println("The infix expression: " + "( 300 * 75 + 4350 ) / 15 + 1126");
        System.out.println("The postfix expression: " + infixToPostfix("(300*75+4350)/15+1126"));
        System.out.println("The result is " + postfixEvaluation("(300*75+4350)/15+1126"));

        System.out.println("Enter infix expression : ob ob 5 add 8 cb sub ob 7 sub 3 cb cb mul 8 add mod 3");
        System.out.println("The infix expression: " + "( ( 5 + 8 ) - ( 7 - 3 ) ) * 8 + 25 % 3");
        System.out.println("The postfix expression: " + infixToPostfix("((5+8)-(7-3))*8+25%3"));
        System.out.println("The result is " + postfixEvaluation("((5+8)-(7-3))*8+25%3"));

    }

    public static String infixToPostfix(String a) {
        String str = "";
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetterOrDigit(a.charAt(i))) {
                str += a.charAt(i);

            } else if (a.charAt(i) == '(') {
                operator.push(a.charAt(i));

            } else if (a.charAt(i) == ')') {
                str += " ";
                while (operator.peek() != '(') {
                    str += operator.pop();
                }
                operator.pop(); //pop out the '('
            } else {
                str += " ";
                if (!operator.isEmpty()) {
                    if (operator.peek() == '(') {
                        operator.push(a.charAt(i));
                    } else {
                        while (getPriority(a.charAt(i)) <= getPriority(operator.peek())) {
                            str += operator.pop() + " ";
                            if (!operator.isEmpty()) {
                                if (operator.peek() == '(') {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        operator.push(a.charAt(i));
//                        System.out.println(a.charAt(i));
//                        System.out.println(operator.peek());
                    }
                } else {
                    operator.push(a.charAt(i));
                }

            }
        }
        while (operator.peek() != null) {
            str += " " + operator.pop();
        }
        return str;
    }

    public static int getPriority(char x) {
        switch (x) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return 0;
        }
    }

    public static int postfixEvaluation(String x) {
        x = infixToPostfix(x);
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        while (count < x.length()) {
            if (Character.isDigit(x.charAt(count))) {
                String integer = x.charAt(count)+"";
                while(Character.isDigit(x.charAt(count+1))){
                    count++;
                    integer+=x.charAt(count)+"";
                }
                stack.push(Integer.parseInt(integer));
            } else if(x.charAt(count)=='+' ||x.charAt(count)=='-' ||
                    x.charAt(count)=='*' ||x.charAt(count)=='/' ||
                    x.charAt(count)=='%'){
                int a = stack.pop();
                int b = stack.pop();
                total = operate(b, a, x.charAt(count));
                stack.push(total);
            }
            count++;
        }
        return stack.pop();
    }

    public static int operate(int a, int b, char o) {
        switch (o) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a%b;
        }
        return -1;
    }

}
