package guru.springframework.diexample.database;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class SpanishDiData implements DataStore {
    @Override
    public String queryDatabase() {
        return "hola mundo";
    }
    public String insertIntoDatabase() {
        return "insertado en base de datos";
    }

}
