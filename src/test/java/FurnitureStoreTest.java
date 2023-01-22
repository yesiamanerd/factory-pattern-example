import org.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FurnitureStoreTest {
    @Test
    public void testCreateFurniture() {
        Furniture chair1 = FurnitureFactory.createChair(Color.RED, SeatingSize.LARGE);
        Furniture chair2 = FurnitureFactory.createChair(Color.BLUE, SeatingSize.SMALL);
        Furniture table1 = FurnitureFactory.createTable(Color.BROWN, Shape.RECTANGLE);
        Furniture table2 = FurnitureFactory.createTable(Color.BLACK, Shape.CIRCLE);
        Furniture sofa1 = FurnitureFactory.createSofa(Color.WHITE, SeatingSize.MEDIUM);
        Furniture bed1 = FurnitureFactory.createBed(Color.BEIGE, BedSize.KING);

        // Assert that the type of each created furniture is as expected
        assertEquals("Chair", chair1.getType());
        assertEquals("Chair", chair2.getType());
        assertEquals("Table", table1.getType());
        assertEquals("Table", table2.getType());
        assertEquals("Sofa", sofa1.getType());
        assertEquals("Bed", bed1.getType());
    }
}
