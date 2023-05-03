import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {

    @Test
    void testTicketCompareTo() {
        Ticket t1 = new Ticket("A", "B", 100, 0, 5);
        Ticket t2 = new Ticket("A", "B", 200, 0, 5);
        assertTrue(t1.compareTo(t2) < 0);
    }

    @Test
    void testSearch() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket t1 = new Ticket("A", "B", 100, 0, 5);
        Ticket t2 = new Ticket("A", "B", 200, 0, 5);
        aviaSouls.add(t1);
        aviaSouls.add(t2);
        Ticket[] searchResult = aviaSouls.search("A", "B");
        assertEquals(2, searchResult.length);
        assertEquals(t1, searchResult[0]);
        assertEquals(t2, searchResult[1]);
    }

    @Test
    void testTicketTimeComparator() {
        Ticket t1 = new Ticket("A", "B", 100, 0, 5);
        Ticket t2 = new Ticket("A", "B", 200, 0, 7);
        TicketTimeComparator comparator = new TicketTimeComparator();
        assertTrue(comparator.compare(t1, t2) < 0);
    }

    @Test
    void testSearchAndSortBy() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket t1 = new Ticket("A", "B", 100, 0, 5);
        Ticket t2 = new Ticket("A", "B", 200, 0, 7);
        aviaSouls.add(t1);
        aviaSouls.add(t2);
        TicketTimeComparator comparator = new TicketTimeComparator();
        Ticket[] searchResult = aviaSouls.searchAndSortBy("A", "B", comparator);
        assertEquals(2, searchResult.length);
        assertEquals(t1, searchResult[0]);
        assertEquals(t2, searchResult[1]);
    }
}
