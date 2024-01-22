package java_code;

import java.util.ArrayList;
import java.util.List;

public class No_802_M_FindEventualSafeStates {
    public static void main(String[] args) {
        No_802_M_FindEventualSafeStates findEventualSafeStates = new No_802_M_FindEventualSafeStates();
        int[][] graph = new int[][] { { 1, 2 }, { 2, 3 }, { 5 }, { 0 }, { 5 }, {}, {} };
        System.out.println(findEventualSafeStates.eventualSafeNodes(graph));
    }

    boolean[] isSafe = new boolean[100000];
    int[] isVisited = new int[100000];

    public List<Integer> eventualSafeNodes(int[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            if (!isSafe[i]) {
                isSafeNode(graph, i);
            }
        }

        List<Integer> safeNodes = new ArrayList<Integer>();
        for (int i = 0; i < isSafe.length; i++) {
            if (isSafe[i]) {
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    public void isSafeNode(int[][] graph, int node) {
        isVisited[node] += 1;

        if (isSafe[node]) {
            return;
        }

        if (graph[node] == null || graph[node].length == 0) {
            isSafe[node] = true;
            return;
        }

        if (isVisited[node] > 1) {
            isSafe[node] = false;
            return;
        }

        for (int i : graph[node]) {
            isSafeNode(graph, i);
            if (!isSafe[i]) {
                isSafe[node] = false;
                return;
            }
        }

        isSafe[node] = true;
    }
}
