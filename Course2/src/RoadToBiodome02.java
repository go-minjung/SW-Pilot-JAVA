// 입력된 문장의 각 문자를 역순으로 출력 (배열)
public class RoadToBiodome02 {
    static class CharStack {
        private char[] stack;
        private int top;

        // 생성자
        public CharStack(int size) {
            stack = new char[size];
            top = -1;
        }

        // push
        public void push(char c) {
            if (top <= stack.length - 1) {
                System.out.println("스택이 가득 찼습니다.");
                return;
            }
            stack[++top] = c;
        }

        // pop
        public char pop() {
            if (isEmpty()) {
                throw new RuntimeException("스택이 비어있습니다.");
            }
            return stack[top--];
        }

        // isEmpty
        public boolean isEmpty() {
            return top == -1;
        }
    }


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("메시지를 입력해주세요.");
            return;
        }

        StringBuilder inputBuilder = new StringBuilder();
        for (String arg : args) {
            inputBuilder.append(arg).append(" ");
        }

    }
}
