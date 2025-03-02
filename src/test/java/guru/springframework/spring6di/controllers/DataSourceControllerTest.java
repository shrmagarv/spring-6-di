package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@ActiveProfiles("Dev")
class DataSourceControllerTest {
    @Autowired
    DataSourceController dataSourceController;

    @Test
    void hello(){
        System.out.println(dataSourceController.getServiceEnv());
    }
    @Test
    void hello2(){
        System.out.println(dataSourceController.getServiceEnv());
    }

}