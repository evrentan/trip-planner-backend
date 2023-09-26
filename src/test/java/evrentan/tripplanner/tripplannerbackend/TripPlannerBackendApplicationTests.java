package evrentan.tripplanner.tripplannerbackend;

import evrentan.tripplanner.tripplannerbackend.spring.spring.TripPlannerBackendApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

@SpringBootTest
class TripPlannerBackendApplicationTests {

    @Mock
    private ApplicationContext applicationContext;

    @Test
    @DisplayName("Context Load Testing")
    void contextLoads() {
        Mockito.when(Objects.nonNull(applicationContext.getBean(TripPlannerBackendApplication.class))).thenReturn(true);
        Assertions.assertTrue(Objects.nonNull(applicationContext.getBean(TripPlannerBackendApplication.class)));
    }

}
