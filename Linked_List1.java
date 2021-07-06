package DSA.Linked_List;

import java.util.*;

//Class to create the linked list
class LinkedList {
    Node head;

    // Class for creating the node
    class Node {
        int data;
        Node next;

        // Constructor of Node class
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Insert at beginning
    public void addFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    // Display the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at end
    public void addEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            // System.out.println("Empty List!!");
            newnode.next = head;
            head = newnode;
        } else {
            Node prev = head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = newnode;
        }
    }

    public void countNodes() {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("The total no of nodes = " + cnt);
    }

    public void reverse() {
        Node cur = head;
        Node prev = null;
        Node nxt;
        while (cur != null) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        head = prev;
    }

    public void insertatPos(int data, int pos) {
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            while (temp != null && i != pos - 2) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void sumList() {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum = sum + temp.data;
            temp = temp.next;
        }
        System.out.println("Sum of elements = " + sum);
    }

    public void findMax() {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Maximum element = " + max);
    }

    public void insertinSorted(int val) {
        Node prev = null, temp = head;
        Node newnode = new Node(val);
        if (head == null || head.data >= val) {
            newnode.next = head;
            head = newnode;
        } else {
            while (temp != null) {
                if (temp.data > val)
                    break;
                prev = temp;
                temp = temp.next;
            }
            newnode.next = prev.next;
            prev.next = newnode;
        }
    }

    public int searchNode(int key) {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            if (temp.data == key) {
                break;
            }
            i++;
            temp = temp.next;
        }
        if (temp == null)
            return -1;
        else
            return i;
    }

    public void deleteNode(int d) {
        Node temp = head;
        Node prev = head;
        if (head == null) {
            System.out.println("Empty List!!");
            return;
        } else if (head.data == d) {
            head = head.next;
        } else {
            while (temp != null) {
                if (temp.data == d) {
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Element not present ");
                return;
            }
            prev.next = temp.next;
            temp.next = null;
        }
    }

    public void checkSorted() {
        Node temp = head;
        int min = Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("Empty List!");
            return;
        } else {
            while (temp != null) {
                if (temp.data > min)
                    min = temp.data;
                else
                    break;
                temp = temp.next;
            }
            if (temp == null)
                System.out.println("Sorted list");
            else
                System.out.println("Unsorted list");
        }
    }

    public void detectLoop() {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Loop not present");
        else
            System.out.println("Loop present");
    }

}

public class Linked_List1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.addEnd(20);
        list.addEnd(4);
        list.addEnd(15);
        list.addEnd(12);
        list.addEnd(3);
        list.addEnd(9);
        // list.head.next.next.next.next = list.head;
        // list.head.next.next.next.next = list.head;
        /*
         * System.out.println("Enter the number of elements"); int n = sc.nextInt();
         */
        // System.out.println("Enter the head node");
        // int hn = sc.nextInt();
        // list.addFirst(hn);
        /*
         * System.out.println("Enter the elements"); for (int i = 0; i < n; i++) { int d
         * = sc.nextInt(); list.addEnd(d); }
         */
        // list.printList();
        // list.countNodes();
        // System.out.println("Linked List after reversal ");
        // list.reverse();
        // list.printList();
        // System.out.println("List after adding element");
        // list.insertatPos(12, 2);
        // list.insertatPos(56, 5);
        // list.printList();
        // list.sumList();
        // list.findMax();
        // list.insertinSorted(5);
        // list.printList();
        // int pos = list.searchNode(23);
        // if (pos == -1)
        // System.out.println("Element not found ");
        // else
        // System.out.println("Element found at position " + pos);
        // list.deleteNode(56);
        list.printList();
        // list.checkSorted();
        // list.detectLoop();
        // list.removeLoop();
        sc.close();
    }
}
