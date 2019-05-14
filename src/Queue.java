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
            newItem.next = newItem.next;
            //newItem.prev=item;
            begin = newItem;
            end = newItem;
            //заполнить поля
        }
    }

    public String take() {
        return "";
    }
}
