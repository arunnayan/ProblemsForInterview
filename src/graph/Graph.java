package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.*;
import javax.swing.text.StyledEditorKit.BoldAction;

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


  private void bfs(T root) {
  Queue<T> queue = new LinkedList<>();
  queue.add(root);
  Map<T, Boolean> is_visited = new HashMap<>();


  while (!queue.isEmpty())
  {
    T currentNode = queue.remove();
    System.out.print(currentNode+", ");
    //is_visited.put(currentNode, true);

    //Traversing all the linked list attached to Node
    for (int i = 0; i < graph.get(currentNode).size(); i++) {

      if(is_visited.get(graph.get(currentNode).get(i))==null){
        queue.add(graph.get(currentNode).get(i));
        is_visited.put(graph.get(currentNode).get(i), true);
      }
    }
    System.out.println();

  }
  }


  public static void main(String[] args) {
    Graph g = new Graph();
//    g.addEdges("putin","trump",false);
//    g.addEdges("putin","modi",false);
//    g.addEdges("putin","pope",false);
//    g.addEdges("modi","trump",true);
//    g.addEdges("modi","yogi",true);
//    g.addEdges("yogi","prabhu",false);
//    g.addEdges("prabhu","modi",false);

    g.addEdges(0,1,true);
    g.addEdges(1,2,true);
    g.addEdges(0,4,true);
    g.addEdges(2,4,true);
    g.addEdges(2,3,true);
    g.addEdges(3,5,true);
    g.addEdges(3,4,true);
    g.bfs(0);
    //g.print();
  }

}
