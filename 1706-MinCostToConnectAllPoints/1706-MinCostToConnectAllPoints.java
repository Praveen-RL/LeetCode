// Last updated: 9/3/2025, 10:50:06 AM
class Solution {
  public int minCostConnectPoints(int[][] points) {
    int n = points.length;
    int[][] adjMatrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
            adjMatrix[i][j] = Math.abs(points[i][0] - points[j][0]) +Math.abs(points[i][1] - points[j][1]);
        }
        else {
            adjMatrix[i][j] = 0;
        }
      }
    }
    boolean[] visited = new boolean[n];
    int[] minDist = new int[n];
    Arrays.fill(minDist, Integer.MAX_VALUE);
    minDist[0] = 0;
    int result = 0;
    for (int i = 0; i < n; i++) {
      int u = -1;
      for (int j = 0; j < n; j++) {
        if (!visited[j] && (u == -1 || minDist[j] < minDist[u])) {
          u = j;
        }
      }
      visited[u] = true;
      result += minDist[u];
      for (int v = 0; v < n; v++) {
        if (!visited[v] && adjMatrix[u][v] < minDist[v]) {
          minDist[v] = adjMatrix[u][v];
        }
      }
    }
    return result;
  }
}





