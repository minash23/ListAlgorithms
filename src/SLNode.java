public class SLNode<T> {
    T val;
    SLNode next;
    public SLNode(){

    }
    public SLNode(T val) {
        this.val = val;
    }
    public SLNode(SLNode next) {
        this.next = next;
    }

    public SLNode(T val, SLNode next) {
        this.val = val;
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
}
