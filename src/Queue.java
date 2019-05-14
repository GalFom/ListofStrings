public class Queue {
    private QueueItem begin = null;
    private QueueItem end = null;

    public void add(String arg) {
        if (begin == null) {
            QueueItem newItem = new QueueItem();
            newItem.item = arg;
            newItem.next = null;
            newItem.prev = null;
            begin = newItem;
            end = newItem;
        } else {
            QueueItem newItem = new QueueItem();
            newItem.item = arg;
            newItem.prev = begin;
            newItem.next = null;
            begin.next = newItem;
            begin = newItem;
        }
    }

    public String take() {
        if (begin == null) {
            return null;
        }
        if (begin == end) {
            String elem = begin.item;
            begin = null;
            end = null;
            return elem;
        }
        String elem2 = begin.item;
        begin = begin.prev;
        begin.next = null;
        return elem2;
    }
}
