package com.dsajavarev;

public class LexicographicallySmallest {
    public static void main(String[] args) {
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";
        System.out.println(smallestEquivalentString(s1,s2,baseStr));
    }
    private static final int R = 26;

    private static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i=0; i < n; i++) parent[i] = i;
        }

        public int find(int x) {
            int y = parent[x];
            if (y != x) {
                y = find(y);
                parent[x] = y;
            }

            return y;
        }

        public void connect(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px < py) {
                parent[py] = px;
            } else if (px > py) {
                parent[px] = py;
            }
        }
    }

    public static String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind(26);
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            uf.connect(c1 - 'a', c2 - 'a');
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            char c = baseStr.charAt(i);
            char c2 = (char) ('a' + uf.find(c - 'a'));
            builder.append(c2);
        }
        return builder.toString();
    }
}
