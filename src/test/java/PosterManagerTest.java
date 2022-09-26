import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterData poster1 = new PosterData(1, "Матрица", 1990);
    PosterData poster2 = new PosterData(2, "Форест Гамп", 1999);
    PosterData poster3 = new PosterData(5, "Омен", 2018);
    PosterData poster4 = new PosterData(6, "Послезавтра", 2010);
    PosterData poster5 = new PosterData(7, "Брат", 1999);

    @Test
    public void test() {
        PosterManager manager = new PosterManager();
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        manager.savePoster(poster5);

        PosterData[] expected = {poster2, poster1};
        PosterData[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);

    }
}
