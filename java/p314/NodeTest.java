package p314;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {
    @Test
    void compareTo_sameX_differentY() {
        Node node1 = new Node(1, 2, 3);
        Node node2 = new Node(1, 3, 4);
        assertEquals(-1, node1.compareTo(node2));
    }

    @Test
    void compareTo_differentX_sameY() {
        Node node1 = new Node(1, 2, 3);
        Node node2 = new Node(2, 2, 4);
        assertEquals(-1, node1.compareTo(node2));
    }

    @Test
    void compareTo_sameX_sameY() {
        Node node1 = new Node(1, 2, 3);
        Node node2 = new Node(1, 2, 4);
        assertEquals(0, node1.compareTo(node2));
    }

    @Test
    void compareTo_differentX_differentY() {
        Node node1 = new Node(1, 2, 3);
        Node node2 = new Node(2, 3, 4);
        assertEquals(-1, node1.compareTo(node2));
    }

}
