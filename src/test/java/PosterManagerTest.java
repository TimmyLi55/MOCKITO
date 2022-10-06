
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class PosterManagerTest {
    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);
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

    @Test
    public void MockitoTest1() {
        PosterData[] poster = {poster1, poster2, poster3};
        doReturn(poster).when(repo).findAll();

        PosterData[] expected = {poster1, poster2, poster3};
        PosterData[] actual = manager.showAll();

        Assertions.assertArrayEquals(expected,actual);


    }
    @Test
    public void MockitoTest2() {
        PosterData[] poster = {poster1};

        doReturn(poster).when(repo).findById(1);

        PosterData[] expected = {poster1};
        PosterData[] actual = repo.findById(1);

        Assertions.assertArrayEquals(expected,actual);


    }

}
