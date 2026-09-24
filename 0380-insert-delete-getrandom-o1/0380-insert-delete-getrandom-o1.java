import java.util.*;

class RandomizedSet {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {

        // If value already exists
        if (map.containsKey(val)) {
            return false;
        }

        // Add value at the end of the list
        list.add(val);

        // Store value and its index
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        // If value does not exist
        if (!map.containsKey(val)) {
            return false;
        }

        // Index of value we want to remove
        int index = map.get(val);

        // Get the last element
        int lastValue = list.get(list.size() - 1);

        // Put last element at the position of val
        list.set(index, lastValue);

        // Update last element's new index
        map.put(lastValue, index);

        // Remove last element
        list.remove(list.size() - 1);

        // Remove val from map
        map.remove(val);

        return true;
    }

    public int getRandom() {

        // Generate random index
        int randomIndex = random.nextInt(list.size());

        // Return element at random index
        return list.get(randomIndex);
    }
}