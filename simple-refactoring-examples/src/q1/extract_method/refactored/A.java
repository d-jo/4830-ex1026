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

   public <T extends Containable> void printContains(List<T> l, String p) {
	   for (T o  : l) {
		   if (o.contains(p)) {
			   System.out.println(o);
		   }
	   }
   }
   
}

interface Containable {
	public abstract boolean contains(String p);
}

class Node implements Containable {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge implements Containable {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}