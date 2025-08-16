package guru.springframework.diexample.database;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev","!di","!spanish"})
public class DevDataStore implements DataStore{
    public String queryDatabase() {
        return "Hello Developer World!";
    }

    public String insertIntoDatabase() {
        return "inserted into database INSERT INTO DB";
    }
}
