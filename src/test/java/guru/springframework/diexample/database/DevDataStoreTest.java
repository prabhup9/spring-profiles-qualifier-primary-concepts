package guru.springframework.diexample.database;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import guru.springframework.diexample.database.DataStore;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("deva")
public class DevDataStoreTest {

    @Autowired
    private  DataStore dev;

    @Test
    public void testDevProfile(){
        String expectedProfile = "inserted into database INSERT INTO DB";
        System.out.println(dev.insertIntoDatabase());

        //assertEquals(expectedProfile, dev.insertIntoDatabase());


    }

}
