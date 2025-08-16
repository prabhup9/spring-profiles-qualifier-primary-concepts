package guru.springframework.diexample.database;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@ActiveProfiles("spanish")
public class SpanishDiDataTests {

    @Autowired
    private DataStore di;


    @Test
    public void testSpanishDiData(){
        String expectedResult = "hola mundo";
        String actualResult = di.queryDatabase();

        assert expectedResult.equals(actualResult);
        assertEquals(expectedResult, actualResult);
        System.out.println(di.queryDatabase());
    }

}
