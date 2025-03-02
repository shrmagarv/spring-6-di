package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"QA", "default"})
@Service
public class QADatasourceService implements DatasourceService {

    @Override
    public String getEnv() {
        return "QA";
    }
}
