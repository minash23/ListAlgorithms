public class SLlist<T> {
    SLNode head;

    public SLlist() {
        this.head = null;
    }

    public SLlist(SLNode node) {
        this.head = node;
    }

    public void listAdd(T p) {
        SLNode newNode = new SLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        SLNode current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        SLNode<T> current = head;
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

