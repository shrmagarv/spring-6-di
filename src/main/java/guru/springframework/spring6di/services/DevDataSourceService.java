package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Dev")
@Service
public class DevDataSourceService implements DatasourceService{

    @Override
    public String getEnv() {
        return "Dev";
    }
}
