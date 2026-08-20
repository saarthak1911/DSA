import java.util.*;

class top_k_frequent_ele {
    public static ArrayList<Integer> topKFrequent(ArrayList<Integer> list, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Find top k
        for (int i = 0; i < k; i++) {

            int maxFrequency = -1;
            int maxElement = -1;

            for (int num : map.keySet()) {

                if (map.get(num) > maxFrequency) {
                    maxFrequency = map.get(num);
                    maxElement = num;
                }
            }

            result.add(maxElement);

            // Remove selected element
            map.remove(maxElement);
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 1, 1, 2, 2, 3));

        int k = 2;

        System.out.println(topKFrequent(list, k));
    }
}