package byLinkedList;

public class Node<Person> {
    private Person data;
    private Node next;

    public Node(Person data) {
        this.data = data;
        this.next = null;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}