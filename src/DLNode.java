public class DLNode<T>{
    T val;
    DLNode prev;
    DLNode next;

    public DLNode() {

    }
    public DLNode(T val) {
        this.val = val;
    }

    public DLNode(T val, DLNode prev, DLNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public DLNode getPrev() {
        return prev;
    }

    public void setPrev(DLNode prev) {
        this.prev = prev;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }
}
