// 입력된 문장의 각 문자를 역순으로 출력
public class RoadToBiodome02 {
    // stack 클래스 (배열)
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
            if (top >= stack.length - 1) {
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
        String input = inputBuilder.toString().trim();

        // 입력 검사
        if (input.trim().isEmpty() || input.length() < 2 || input.length() > 1000000) {
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
            return;
        }

        // stack 생성
        CharStack stack = new CharStack(input.length());

        // 문자 push
        for (int i=0; i<input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // pop하여 역순 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
