class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head1 = l1;
            ListNode head2 = l2;
            ListNode prevhead1 = null;
            ListNode prevhead2 = null;
            ListNode anshead1 = head1;
            ListNode anshead2 = head2;
            ListNode newNode = null;
            int count1 = 0, count2 = 0;
            int carry = 0, sum;
            
            while(head1 != null || head2 != null)
            {
                    sum = carry + (head1 != null ? head1.val : 0) 
                                + (head2 != null ? head2.val : 0);
                    carry = sum / 10;
                    sum = sum % 10;
                    
                 if(head1 != null){
                         count1++;
                         prevhead1 = head1;
                         head1.val = sum;
                         head1 = head1.next;
                 }   
                    if(head2 != null){
                            count2++;
                            prevhead2 = head2;
                            head2.val = sum;
                            head2 = head2.next;
                    }
                    
            }
            
            if(carry > 0){
                 newNode = new ListNode(carry);
                    if(count1 > count2){
                             prevhead1.next = newNode;
                             return anshead1;
                    }
                    else if(count1 < count2){
                             prevhead2.next = newNode;
                              return anshead2;
                    }
                    else
                            prevhead1.next = newNode;
                             return anshead1;
            }
            else
            {
            if(count1 > count2)
                    return anshead1;
            else if(count1 < count2)
                    return anshead2;
            }
            return anshead1;
    }
}