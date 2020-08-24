package ua.stepess.java.course.first.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnicodeCharacterExtractorTest {

    private final UnicodeCharacterExtractor extractor = new UnicodeCharacterExtractor();

    @Test
    public void shouldExtract1() {
        String s = "123456789";
        int index = 4;

        int unicode = extractor.extract(s, index);

        assertEquals(53, unicode);
    }


    @Test
    public void shouldExtract2() {
        String s = "123456789";
        int index = 7;

        int unicode = extractor.extract(s, index);

        assertEquals(56, unicode);
    }

    @Test
    public void shouldExtract3() {
        String s = "Hello World!";
        int index = 0;

        int unicode = extractor.extract(s, index);

        assertEquals(72, unicode);
    }

    @Test
    public void shouldExtract4() {

        String s = "kek™";
        int index = 3;

        int unicode = extractor.extract(s, index);

        assertEquals(8482, unicode);
    }

    @Test
    public void shouldExtract5() {

        String s = "Ω";
        int index = 0;

        int unicode = extractor.extract(s, index);

        assertEquals(937, unicode);
    }

}
