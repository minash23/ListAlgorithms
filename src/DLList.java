public class DLList<T> {
    DLNode<T> head;

    public DLList() {
        head = null;
    }

    public void listAdd(T p) {
        DLNode<T> newNode = new DLNode<>(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        DLNode<T> current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        DLNode<T> current = head;
        while (current != null) {
            result.append("{");
            result.append(current.getVal().toString());
            result.append("}");
            result.append("\n");
            current = current.getNext();
        }
        return result.toString();
    }

}
