// Given the head of a linked list, rotate the list to the right by k places.

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
 

// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109

class Rotate List{
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ArrayList<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        k=k%list.size();
        reverse(list,0,list.size()-1);
        reverse(list,k,list.size()-1);
        reverse(list,0,k-1);
        ListNode DummyNode=new ListNode(100);
        ListNode cu=DummyNode;
        for(int nn:list){
            cu.next=new ListNode(nn);
            cu=cu.next;
        }
        return DummyNode.next;
    }
    static void reverse(List<Integer> ss,int r,int l){
        while(r<l){
            int t=ss.get(r);
            ss.set(r,ss.get(l));
            ss.set(l,t);
            r++;
            l--;
        }
    }
}