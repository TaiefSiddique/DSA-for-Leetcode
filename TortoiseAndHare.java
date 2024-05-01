class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class TortoiseAndHare {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head.next;

        while (hare != null && hare.next != null) {
            if (tortoise == hare) {
                return true; // Cycle detected
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creates a cycle

        boolean hasCycle = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
