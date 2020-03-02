package graph;
import java.util.*;
public class BasicGraph {

  private LinkedList<Integer> vertex_list[];
  private int num_of_vertices;

  BasicGraph(int v) {
    num_of_vertices = v;
    vertex_list = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      vertex_list[i] = new LinkedList<>();
    }
  }
   public void add_edges(int u, int v, boolean is_bidirectional){

    vertex_list[u].add(v);
    if (is_bidirectional){
      vertex_list[v].add(u);
  }
}

  public static void main(String[] args) {

  }
}
