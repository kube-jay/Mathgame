public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }



}

//            public void addFirst(int value) {
//                head = new Node(value, head);
//            }


//    Node head;

//    static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//
//        }
//    }
//
//    //method of inserting new node
//    public static LinkedList insert (LinkedList list, int data) {
//        Node newnode = new Node(data);
//
//        if (list.head == null){
//            list.head = newnode;
//        }
//        else {
//            Node last = list.head;
//            while (last.next != null ) {
//                last = last.next;
//            }
//            last.next = newnode;
//
//        }
//        return list;
//    }
//}
