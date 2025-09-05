class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String str:operations){
            if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(str.equals("+")){
                int top = stack.peek();
                int prev = stack.get(stack.size()-2);
                stack.push(top+prev);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for(int i:stack){
            sum+=i;
        }
        return sum;
    }
}