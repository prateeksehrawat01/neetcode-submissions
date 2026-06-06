class Item {
    int element;
    int freq;

    public Item(int element, int freq) {
        this.element = element;
        this.freq = freq;
    }

    // @Override
    // public String toString() {
    //     return "Item{a=" + a + ", b=" + b + '}';
    // }
}
 
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     Integer value = map.get(nums[i]);
        //     if (value != null) {
        //         map.put(nums[i],value+1);
        //     } else {
        //         map.put(nums[i],1);
        //     }
        // }
        
        // int[] cap=new int[3000];

        // for(int i=0;i<nums.lenght;i++){
        //     cap[3000-Math.abs(nums[i])]++;
        // }
        // for(){

        // }
                HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min-heap based on frequency
        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.freq, b.freq));

        // Maintain top k elements in the heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new Item(entry.getKey(), entry.getValue()));
            if (pq.size() > k) {
                pq.poll(); // remove least frequent
            }
        }

        // Extract result from heap
        int[] result = new int[k];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index++] = pq.poll().element;
        }

        return result;

    }
}
