//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的
//功能。(若队列中没有元素，deleteHead 操作返回 -1 ) 
//
// 
//
// 示例 1： 
//
// 输入：
//["CQueue","appendTail","deleteHead","deleteHead"]
//[[],[3],[],[]]
//输出：[null,null,3,-1]
// 
//
// 示例 2： 
//
// 输入：
//["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//[[],[],[5],[2],[],[]]
//输出：[null,-1,null,null,5,2]
// 
//
// 提示： 
//
// 
// 1 <= values <= 10000 
// 最多会对 appendTail、deleteHead 进行 10000 次调用 
// 
// Related Topics 栈 设计 
// 👍 249 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {
    LinkedList <Integer> stack_in, stack_out;
    public CQueue() {
        stack_in = new LinkedList<Integer>();
        stack_out = new LinkedList<Integer>();
    }
    
    public void appendTail(int value) {
        stack_in.addLast(value);
    }
    
    public int deleteHead() {
        if(!stack_out.isEmpty()) return stack_out.removeLast();
        if(stack_in.isEmpty()) return -1;
        while(!stack_in.isEmpty()) stack_out.addLast(stack_in.removeLast());
        return stack_out.removeLast();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)
