package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph<T> {
    HashMap<T, LinkedList<T>> graph;
    Graph(){
      graph = new HashMap<>();
    }

    public void addEdges(T u, T v,boolean isBirdirectional)
    {
      if(!graph.containsKey(u)){
        graph.put(u, new LinkedList<T>());
      }

      if(!graph.containsKey(v)){
        graph.put(v, new LinkedList<T>());
      }
      graph.get(u).add(v);
      if(isBirdirectional){
        graph.get(v).add(u);
      }

    }

    public void print(){
      for (T i: graph.keySet()){
        for (int j = 0; j < graph.get(i).size(); j++) {
          System.out.print(graph.get(i).get(j)+", ");
        }
        System.out.println();
      }
    }

  public static void main(String[] args) {
    Graph g = new Graph();
    g.addEdges("putin","trump",false);
    g.addEdges("putin","modi",false);
    g.addEdges("putin","pope",false);
    g.addEdges("modi","trump",true);
    g.addEdges("modi","yogi",true);
    g.addEdges("yogi","prabhu",false);
    g.addEdges("prabhu","modi",false);
    g.print();
  }
}
