package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   printContains(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      printContains(edgeList, p);
      // other implementation
      return null;
   }

   public <T extends GraphObject> void printContains(List<T> l, String p) {
	   for (T o : l) {
		   if (o.contains(p)) {
			   System.out.println(o);
		   }
	   }
   }
   
}

class GraphObject {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }	
}

class Node extends GraphObject {

}

class Edge extends GraphObject {
}