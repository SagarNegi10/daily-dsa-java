import java.util.*;
class LinkedList {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAtMiddle(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void removeAtMiddle(int index){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        if(index == 0){
            removeFirst();
            return;
        }
        int i = 0;
        Node prev = head;
        while(i < index - 1 && prev.next != null){
            prev = prev.next;
            i++;
        }
        if(prev.next == null){
            tail = prev;
        }
        else{
            prev.next = prev.next.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void ui(LinkedList ll){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. add first");
        System.out.println("2. add last");
        System.out.println("3. add at index");
        System.out.println("4. remove first");
        System.out.println("5. remove last");
        System.out.println("6. remove at index");
        System.out.println("7. print LL");
        System.out.println("8. Exit");
        System.out.print("Select Operation: ");
        int op = sc.nextInt();
        int val;
        int idx;
        switch (op) {
            case 1:
                System.out.print("Enter value: ");
                val = sc.nextInt();
                ll.addFirst(val);
                ll.ui(ll);
                break;
            case 2:
                System.out.print("Enter value: ");
                val = sc.nextInt();
                ll.addLast(val);
                ll.ui(ll);
                break;
            case 3:
                System.out.print("Enter value: ");
                val = sc.nextInt();
                System.out.print("Enter index: ");
                idx = sc.nextInt();
                ll.addAtMiddle(val, idx);
                ll.ui(ll);
                break;
            case 4:
                ll.removeFirst();
                ll.ui(ll);
                break;
            case 5:
                ll.removeLast();
                ll.ui(ll);
                break;
            case 6:
                System.out.print("Enter index: ");
                idx = sc.nextInt();
                ll.removeAtMiddle(idx);
                ll.ui(ll);
                break;
            case 7:
                ll.printList();
                ll.ui(ll);
                break;
            case 8:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice.");
                ll.ui(ll);
                break;
        }
        sc.close();
        return;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of LinkedList: ");
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        System.out.print("Enter Elements in LL: ");
        for(int i = 0; i < n; i++){
            ll.addLast(sc.nextInt());
        }
        ll.ui(ll);
        sc.close();
    }
}