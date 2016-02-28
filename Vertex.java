package net.datastructures;

/**
 * A vertex of a graph.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public interface Vertex<V> {
  /** Returns the element associated with the vertex. */
  V getElement();
}
