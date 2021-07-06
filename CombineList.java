package DSA.Linked_List;

class Node {
    int data;
    Node next;

    // Constructor of Node class
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class CombineList {
    Node head;

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

    public void combine(CombineList list1, CombineList list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = temp2;
    }

    public static void main(String[] args) {
        CombineList list1 = new CombineList();
        CombineList list2 = new CombineList();

        list1.addEnd(2);
        list1.addEnd(3);
        list2.addEnd(10);
        list2.addEnd(11);
        list2.addEnd(12);

        list1.printList();
        list2.printList();

        list1.combine(list1, list2);
        list1.printList();
    }
}
