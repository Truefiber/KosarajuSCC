import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class KosarajuSCCTest {

    @Test
    public void testScc() {

        String testFile = "C:\\JavaProject\\CourseraHW\\SCC.txt";
        List<Integer> result = new KosarajuSCC(testFile).find();
        Collections.sort(result);
        for (int i = result.size() - 1; i >= result.size() - 5; i--) {
            System.out.println(result.get(i));
        }

        //assertEquals(3, result.size());

    }

}