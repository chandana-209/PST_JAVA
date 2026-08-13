import java.util.*;

class STask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int temp = sc.nextInt();

            if (temp > 50)
                map.computeIfAbsent(id, k -> new ArrayList<>()).add(temp);
        }

        map.entrySet().stream()
           .map(e -> new AbstractMap.SimpleEntry<>(
                   e.getKey(),
                   e.getValue().stream().mapToInt(x -> x).average().getAsDouble()))
           .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
           .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}