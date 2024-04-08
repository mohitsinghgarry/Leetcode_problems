class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i =sandwiches.length-1 ;i>=0;i--) stack.push(sandwiches[i]);
        for(int i = 0 ;i<students.length;i++) queue.offer(students[i]);
        // for (Integer element : queue) {
        //     System.out.println(element);
        // }
          int i = 0;
            while(i!=queue.size()){
            if(queue.peek() == stack.peek()){
                i = 0;
                stack.pop();
                queue.poll();
            }
            else{
                int n = queue.poll();
                i++;
                queue.offer(n);
            }

        }
        return i;
    }
}