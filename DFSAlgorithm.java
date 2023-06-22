
package dfs.algorithm;


public class DFSAlgorithm {

 
    public static void main(String[] args) {

    public void search(int v) {
        // visited = new boolean[4];
        // Graph g = new Graph(4);

        // g.addEdge(0, 1);
        // g.addEdge(0, 2);
        // g.addEdge(1, 2);
        // g.addEdge(2, 3);

        visited = new boolean[5];
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);

        adjLists = g.getList();

        System.out.println("Following Depth First Traversal");
        Dfs(v);
        // System.out.println(adjLists.length);
    }

    void Dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> ite = adjLists[v].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                Dfs(adj);
        }
    }
}
    
    

