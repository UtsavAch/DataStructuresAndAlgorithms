import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));
       // nodeList.add(new GraphNode("H", 7));

        Graph g = new Graph(nodeList);

        // g.addDirectedEdge(0, 2);
        // g.addDirectedEdge(2, 4);
        // g.addDirectedEdge(4, 7);
        // g.addDirectedEdge(4, 5);
        // g.addDirectedEdge(5, 6);
        // g.addDirectedEdge(1, 2);
        // g.addDirectedEdge(1, 3);
        // g.addDirectedEdge(3, 5);


        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(1, 3);
        g.addUndirectedEdge(1, 6);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(2, 4);
        g.addUndirectedEdge(3, 5);
        g.addUndirectedEdge(4, 5);
        g.addUndirectedEdge(5, 6);

        System.out.print(g.toString());
        // g.bfs();
        // g.dfs();
        // g.topologicalSort();
        g.BFSForSSSPP(nodeList.get(0));
    }
}