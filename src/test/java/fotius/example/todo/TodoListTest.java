package fotius.example.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    // EXAMPLE TEST
    // READS AS: Test that newly created list has no items in it
    @Test
    void newlyCreatedListHasNoItemsInIt() {
        TodoList list = new TodoList();

        Assertions.assertTrue(list.items().isEmpty());
    }
}
