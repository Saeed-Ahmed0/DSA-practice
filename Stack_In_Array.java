import java.util.Stack;
public class Stack_In_Array {
        int [] stack;
        int size;
        int top;
        Stack_In_Array(int size){
            this.size=size;
            stack=new int[size];
            top=-1; // top<0 ,stack initially is zero;

        }
        // push() method is used to add the value at the top !
        public void Push(int x){
            if(top>=(size-1)){  // 3-1=2
                System.out.println("Stack is full");
            }
            else {
                top++;
                stack[top]=x;
                System.out.println("inserted "+x);
            }
        }
        // Pop() method is used to delete the first top element !
        public void Pop(){
            if(top<0){
                System.out.println("Stack is empty!");
            }
            else
                System.out.println("Deleted: "+stack[top--]);
        }
        // peek() method is used to return the top element
        public int peek(){

            return stack[top];
        }


        public boolean isEmpty(){
            if(top<0){
                return true;
            }
            else {
                return false;
            }
        }
        public void makeEmpty(){

            top=-1;
        }
//push at  bottom in stack
//    public static void pushAtBottom(Stack<Integer> s, int data) {
//        if(s.isEmpty()) {
//            s.push(data);
//            return;
//        }
//
//        int temp = s.pop();
//        pushAtBottom(s, data);
//        s.push(temp);
//    }

        // copy stack Array
        public void copy(Stack_In_Array s){
            System.out.println("copied elements are ");
            s.stack=this.stack;
            s.top=this.top;
        }


        // Reverse the stack Array
        public  Stack_In_Array reverse(){
            Stack_In_Array s=new Stack_In_Array(stack.length);
            for(int i=stack.length-1;i>=0;i--){
                s.Push(this.stack[i]);
            }
            return  s;
        }


        public void displayStack(){

            if(top<0){
                System.out.println("Stack is empty :");
            }
            else {
                for(int i=top;i>=0;i--){
                    System.out.print(" "+stack[i]);
                    System.out.print("\n");
                }
            }
        }
        public static void main(String[] args) {
            Stack_In_Array list=new Stack_In_Array(6);
            Stack_In_Array list2=new Stack_In_Array(6);
            list.Push(3);
            list.Push(6);
            list.Push(9);
            list.Push(11);
//    list.pushAtBottom(8);
//list.copy(list2);
//        list2=list.reverse();
//        System.out.println("Top element is "+list.peek());
//        list.displayStack();
//        System.out.println();
//        list2.displayStack();
        }

        private void pushAtBottom(int i) {
        }
    }

