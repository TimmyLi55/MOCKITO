
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterData poster1 = new PosterData(1, "Матрица", 1990);
    PosterData poster2 = new PosterData(2, "Форест Гамп", 1999);
    PosterData poster3 = new PosterData(5, "Омен", 2018);
    PosterData poster4 = new PosterData(6, "Послезавтра", 2010);
    PosterData poster5 = new PosterData(7, "Брат", 1999);
    PosterData poster6 = new PosterData(14, "Побег из шоушенка", 2001);
    PosterData poster7 = new PosterData(16, "Без чувств", 2005);
    PosterData poster8 = new PosterData(22, "Амероиканский пирог", 2006);
    PosterData poster9 = new PosterData(26, "Привет", 2015);
    PosterData poster10 = new PosterData(27, "Брат-2", 2005);
    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo);

    @Test
    public void testDelAll() {

        manager.removeAll();

        PosterData[] expected = {};
        PosterData[] actual = manager.showAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
