import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


class AviaSoulsTest {

    @Test
    void testSearchByPriceFromTo() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 5); // 4 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("E", "F", 350, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] expected = {ticket6, ticket4, ticket1, ticket8, ticket9};
        Ticket[] actual = aviaSouls.search("A", "B");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void testSearchByPriceFromToZero() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 5); // 4 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("E", "F", 350, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("W", "Q");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void testSearchByPriceFromToOne() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 5); // 4 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("C", "F", 350, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] expected = {ticket3};
        Ticket[] actual = aviaSouls.search("C", "F");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void testSearchByPriceFromToStraight() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 100, 7, 18); // 11 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("C", "F", 300, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 400, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 500, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 600, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 700, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 800, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 900, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);

        Ticket[] expected = {ticket1, ticket4, ticket6, ticket8, ticket9};
        Ticket[] actual = aviaSouls.search("A", "B");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSearchByPriceFromToComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 5); // 4 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("C", "F", 350, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6, ticket1, ticket4, ticket8, ticket9};
        Ticket[] actual = aviaSouls.search("A", "B", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSearchByPriceFromToComparatorOne() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 5); // 4 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("C", "F", 350, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7};
        Ticket[] actual = aviaSouls.search("E", "F", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSearchByPriceFromToComparatorZero() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 5); // 4 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 2, 5); // 3 flight time
        Ticket ticket3 = new Ticket("C", "F", 350, 5, 11); // 6 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 10, 17); // 7 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 11, 16); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 9, 11); // 2 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 8, 9); // 1 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 7, 18); // 11 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 7, 19); // 12 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("D", "W", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSearchByPriceFromToComparatorStraight() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("A", "B", 400, 1, 2); // 1 flight time
        Ticket ticket2 = new Ticket("C", "D", 200, 1, 3); // 2 flight time
        Ticket ticket3 = new Ticket("C", "F", 350, 1, 4); // 3 flight time
        Ticket ticket4 = new Ticket("A", "B", 150, 1, 5); // 4 flight time
        Ticket ticket5 = new Ticket("C", "D", 300, 1, 6); // 5 flight time
        Ticket ticket6 = new Ticket("A", "B", 100, 1, 7); // 6 flight time
        Ticket ticket7 = new Ticket("E", "F", 250, 1, 8); // 7 flight time
        Ticket ticket8 = new Ticket("A", "B", 500, 1, 9); // 8 flight time
        Ticket ticket9 = new Ticket("A", "B", 500, 1, 10); // 9 flight time
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket1, ticket4, ticket6, ticket8, ticket9};
        Ticket[] actual = aviaSouls.search("A", "B", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}
