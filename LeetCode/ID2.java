
// 2. Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

}

class ID2 {

  public static void main(String[] args) {
    ID2 solution = new ID2();
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode result = solution.addTwoNumbers(l1, l2);
    System.out.println("Result: " + printList(result));
  }

  // Helper method to print the linked list as a string
  public static String printList(ListNode node) {
    StringBuilder sb = new StringBuilder();
    while (node != null) {
      sb.append(node.val);
      if (node.next != null) {
        sb.append("->");
      }
      node = node.next;
    }
    return sb.toString();
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode tail = dummyHead;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int digit1 = (l1 != null) ? l1.val : 0;
      int digit2 = (l2 != null) ? l2.val : 0;

      int sum = digit1 + digit2 + carry;
      int digit = sum % 10;
      carry = sum / 10;

      ListNode newNode = new ListNode(digit);
      tail.next = newNode;
      tail = tail.next;

      l1 = (l1 != null) ? l1.next : null;
      l2 = (l2 != null) ? l2.next : null;
    }
    ListNode result = dummyHead.next;
    dummyHead.next = null;
    return result;
  }

}