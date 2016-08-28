package com.ryangehring.cake.solns;


/**
 * Test if linkedlist has a cycle.
 * option 1: Have a 'fast' pointer and a 'slow' pointer and see if they meet.
 */
public class P23 {


    class LinkedList {
        public Link root;
        public class Link {
            public Link next ;
        }
    }

    public boolean hasCycle(LinkedList ll) {

        LinkedList.Link fast = ll.root ;
        LinkedList.Link slow = ll.root ;
        while (fast.next != null) {
            fast = fast.next ;
            if (fast == slow) return true ;
            fast = fast.next ;
            if (fast == slow) return true ;
            slow = slow.next ;
        }
        return false ;

    }
}
