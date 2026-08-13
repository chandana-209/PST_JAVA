import java.util.*;

class STask8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();

        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = s.nextInt(), b = s.nextInt();
            g[a].add(b);
            g[b].add(a);
        }

        int start = s.nextInt(), end = s.nextInt();
        boolean[] v = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        v[start] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y : g[x])
                if (!v[y]) {
                    v[y] = true;
                    q.add(y);
                }
        }

        System.out.println(v[end] ? "YES" : "NO");
    }
}