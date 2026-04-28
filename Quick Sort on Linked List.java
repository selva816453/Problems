// You are given a Linked List. Sort the given Linked List using quicksort. 

// Examples:

// Input: Linked list: 1->6->2
// Output: 1->2->6
// Explanation:
// After sorting the nodes, we have 1, 2 and 6.

// Input: Linked list: 1->9->3->8
// Output: 1->3->8->9
// Explanation:
// After sorting the nodes, we have 1, 3, 8 and 9. 


// Constraints:
// 1<= size of linked list <= 105


class Quick Sort on Linked List{
     public static Node quickSort(Node node) {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        Node cur=node;
        while(cur!=null){
            list.add(cur.data);
            cur=cur.next;
        }
        Collections.sort(list);
        Node Dm=new Node(0);
        Node cu=Dm;
        for(int n:list){
            cu.next=new Node(n);
            cu=cu.next;
        }
        return Dm.next;
    }
}