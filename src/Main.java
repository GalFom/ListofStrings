public class Main {
    public static void main(String[] arg) {
        //testList();
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            queue.add("String" + i);
        }
        while (true) {
            String str = queue.take();
            if (str != null) {
                System.out.println(str);
            } else {
                break;
            }
        }
    }

    private static void testList() {
        ListOfStrings list = new ListOfStrings();
        for (int i = 0; i < 10; i++) {
            list.add("string " + i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
