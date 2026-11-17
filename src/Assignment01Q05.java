public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        // נבנה תור בעצמנו
        int n = m.length;
        int[] queue = new int[n];
        int head = 0; 
        int tail = 0; 
    
        // מערך מעקב אחרי קודקודים שביקרנו בהם, כדי למנוע כניסה למעגלים אינסופיים
        boolean[] visited = new boolean[n];
        
        // מערך ששומר את המרחק של כל קודקוד מקודקוד ההתחלה i
        int[] dist = new int[n];
        
        queue[tail++] = i;
        visited[i] = true;
        dist[i] = 0;

        while (head < tail) {
            int current = queue[head++];
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (m[current][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    dist[neighbor] = dist[current] + 1;
                
                    if (neighbor == j) {
                        return dist[neighbor];
                        
                    }
                    queue[tail++] = neighbor;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}