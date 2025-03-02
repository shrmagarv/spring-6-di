package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    private final DatasourceService datasourceService;

    public DataSourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getServiceEnv(){
        return datasourceService.getEnv();
    }
}
