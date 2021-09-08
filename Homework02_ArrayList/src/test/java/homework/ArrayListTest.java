package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

    @Test
    void addObjectTest() {
        Integer integer = 10;
        List<Integer> integers = new ArrayList<>();

        integers.add(integer);

        assertEquals(integer, integers.get(0), "Объект не был добавлен в массив.");
    }

    // todo: остальные тесты
}
