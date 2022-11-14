import java.util.ArrayList;

public class Graph
{
    ArrayList<ArrayList<Integer>> graph;
    int V;
    Graph(int nodes)
    {
        V=nodes;
        graph = new ArrayList<>();
        for(int i =0; i<V;i++)
        {
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int v, int u)
    {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
    void display()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println("Node : "+i);
            for(int element: graph.get(i))
            {
                System.out.println("--->"+element);
            }
        }
    }

    public static void main(String[] args) {
        Graph G = new Graph(5);
        G.addEdge(1,2);
        G.addEdge(2,4);
        G.addEdge(1,3);
        G.addEdge(3,4);
        G.addEdge(3,5);
        G.addEdge(4,5);
        G.display();
    }
}
