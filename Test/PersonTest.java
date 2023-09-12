import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1,p2,p3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new Person("00000A", "Bob", "Tester1","Mr.",1950);
        p2 = new Person("00000A", "Sally", "Tester2", "Mrs.", 1975);
        p3 = new Person("00000A", "John", "Tester3", "Esq.", 1960);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Bob");
        assertEquals("Bob", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p2.setLastName("Tester2");
        assertEquals("Tester2", p2.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p3.setTitle("Esq.");
        assertEquals("Esq.", p3.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p3.setYOB(1960);
        assertEquals(1960, p3.getYOB());
    }

    @org.junit.jupiter.api.Test
    void getFullName() {
        p1.setFirstName("Bob");
        p1.setLastName("Tester1");
        assertEquals("Bob Tester1", p1.getFullName());
    }

    @org.junit.jupiter.api.Test
    void getFormalName() {
        p3.setTitle("Esq");
        p3.getFullName();
        assertEquals("Esq. John Tester3", p3.getFormalName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        p3.getAge();
        assertEquals(63,p3.getAge());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
        p2.getAge(1975);
        assertEquals(48,p2.getAge(1975));
    }

    @org.junit.jupiter.api.Test
    void toCSVDataRecord() {
        assertEquals("00000A, Bob, Tester1, Mr., 1950", p1.toCSVDataRecord());
    }
}