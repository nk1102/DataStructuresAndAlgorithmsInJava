public class HashTable {
    private HashNode[] buckets;
    private int noOfBuckets;
    private int size;

    public HashTable(int capacity) {
        this.buckets = new HashNode[capacity];
        this.noOfBuckets = capacity;

    }
    public class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }





    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String get(Integer key){
        return null;
    }
    public String remove(Integer key){
        return null;
    }

    public int getBucketIndex(int key) {
        return key%buckets.length;
    }
    public void put(Integer key,String value){
        if(key == null || value ==null){
            throw new IllegalArgumentException("Key or value cannot be null");

        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key,value);
        node.next = head;
        buckets[bucketIndex] = node;
    }
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(105,"Tom");
        table.put(21,"jkl");
        table.put(35,"ghi");
        table.put(15,"def");
        table.put(1015,"abc");
        System.out.println(table.size());


    }

}
