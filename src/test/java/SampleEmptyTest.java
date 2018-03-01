import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SampleEmptyTest {

    @DescriptionAnnotation(comment = "my comment") // добавь к этому Java методу информацию под категорией TestCase со значением id=QAAUT-136
    @Test
    public void sampleTest() {
    }
    }


