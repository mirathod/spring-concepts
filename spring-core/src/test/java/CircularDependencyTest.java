import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.milan.CircularA;
import org.milan.CircularB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test class for Circular Dependency
 *
 * @author Milan Rathod
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@Ignore
public class CircularDependencyTest {

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public CircularA getCircularA() {
        return new CircularA();
    }

    @Bean
    public CircularB getCircularB() {
        return new CircularB();
    }

    @Test
    public void givenCircularDependency_whenConstructorInjection_thenItfails() {
        CircularA circularA = applicationContext.getBean(CircularA.class);

        Assert.assertEquals("Hi", circularA.getCircularB().getMessage());
    }


}
