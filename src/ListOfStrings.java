public class ListOfStrings {

    private String[] data = new String[4];
    private int currentSize = 0;

    public void add(String item) {
        data[currentSize] = item;
        currentSize++;
        if (currentSize == data.length) {
            String[] newData = new String[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public String get(int index) {
        return this.data[index];
    }


    public int size() {
        return currentSize;
    }

}