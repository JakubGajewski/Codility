package lesson7_stacksAndQueues;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;


//
//        A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
//
//                S is empty;
//                S has the form"(U)"or"[U]"or"{U}"where U is a properly nested string;
//                S has the form"VW"where V and W are properly nested strings.
//
//                For example,the string"{[()()]}"is properly nested but"([)()]"is not.
//
//                Write a function:
//
//                int solution(char*S);
//
//                that,given a string S consisting of N characters,returns 1if S is properly nested and 0otherwise.
//
//                For example,given S="{[()()]}",the function should return 1and given S="([)()]",the function should return 0,as explained above.
//
//                Write an efficient algorithm for the following assumptions:
//
//                N is an integer within the range[0..200,000];
//                string S consists only of the following characters:"(","{","[","]","}"and/or")".
//

//      RESULT: 100%

public class Brackets {
    public int solution(String S) {

        try {

            char c;

            ArrayDeque<Character> order = new ArrayDeque<>();

            for (int i = 0; i < S.length(); i++) {

                c = S.charAt(i);

                if (c == '{' || c == '[' || c == '(') {
                    order.addLast(c);
                }

                switch (c) {
                    case '}':
                        if (order.removeLast() != '{') {
                            return 0;
                        }
                        break;
                    case ']':
                        if (order.removeLast() != '[') {
                            return 0;
                        }
                        break;
                    case ')':
                        if (order.removeLast() != '(') {
                            return 0;
                        }
                        break;
                }
            }

            if (!order.isEmpty()) {
                return 0;
            }

            return 1;

        } catch (NoSuchElementException e) {
            return 0;
        }
    }
}
