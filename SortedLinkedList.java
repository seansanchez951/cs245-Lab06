public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {

    protected Node<T> head;
    protected int size;

    // constructor
    public SortedLinkedList() {
        head = null;   // head of list, make head null
        size = 0;
    }

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T value) {
            data = (T) value;
            next = null;
        }
    }

    @Override
    public boolean add(T item) throws Exception {

        // if the head is null add node to head
        if (head == null) {
            head = new Node<>(item);
            ++size;
            return true;
        }

        Node<T> prev = head;
        Node<T> curr = head;

        // while the previous nodes next is not pointing at a null
        while (prev.data.compareTo(item) < 0) {
            curr = prev;
            if (curr.next == null) {
                Node new_node = new Node(item);
                prev.next = new_node;
                ++size;
                return true;
            }
            prev = prev.next;
        }

        Node<T> new_node = new Node(item);

        if (head==curr) {
            new_node.next=head;
            head = new_node;
            ++size;
            return true;
        }
        new_node.next = prev;
        curr.next=new_node;

        ++size;
        return true;
    }



    @Override
    public T remove(int pos) throws Exception {
        if (head == null) {
            throw new RuntimeException("Linked list is empty!!");
        }

        if (pos < 0 || pos >= size) {
            throw new Exception("Invalid Position for Remove!!");
        }

        if (pos == 0) {
            Node<T> node = head;
            head = head.next;
            --size;
            return node.data;
        } else {
            Node<T> prev = head;
            for (int i=0; i < pos-1; i++) {
                prev = prev.next;
            }
            Node<T> node = prev.next;
            prev.next = node.next;
            --size;
            return node.data;
        }
    }

    @Override
    public T get(int pos) throws Exception {
        if (pos < 0 || pos >= size) {
            throw new Exception("Invalid LinkedList Position!!");
        }
        Node<T> curr = head;
        for (int i =0; i<pos; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public String toString(){
        String s="[";
        Node<T> temp = head;
        if (temp!=null){
            s = String.format("%s%s", s, temp.data);
            temp=temp.next;
        }
        while(temp!=null){
            s = String.format("%s, %s", s, temp.data);
            temp=temp.next;
        }
        s = String.format("%s]",s);
        return s;
    }

}
