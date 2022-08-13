package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    @Test
    void createLinkedListTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.createLinkedList(new int[]{0,6,2,7,4});
        assertEquals(5,list.length());
    }
}