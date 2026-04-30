// Given a linked list with the head node and a key, the task is to check if the key is present in the linked list or not. Return true if key is present, else return false.

// Example:

// Input: key = 3,
      
// Output: true 
// Explanation: 3 is present in Linked List.
// Input: key = 4,
   
// Output: false
// Explanation: 4 is not present in Linked List.
// Constraint:
// 1 ≤ Number of nodes ≤ 105
// 1 ≤ node.data, key ≤ 105

class Search in Linked List{
    public boolean searchKey(Node head, int key) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        Node cur=head;
        while(cur!=null){
            list.add(cur.data);
            cur=cur.next;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                return true;
            }
        }
        return false;
    }
}