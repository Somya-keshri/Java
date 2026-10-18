package ques;

import java.util.Stack;

public class PushElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);

        int element = 50;
        pushAtBottom(st,element);
        System.out.println(st);

//        Stack<Integer> st2 = new Stack<>();
//        while (!st.isEmpty()){
//            st2.push(st.pop());
//        }

//        st.push(50);
//        while (!st2.isEmpty()){
//            st.push(st2.pop());
//        }
//        System.out.println(st);
    }
    private static void pushAtBottom(Stack<Integer> st, int element){
        if(st.size()==0){
            st.push(element);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, element);
        st.push(top);
    }
}
