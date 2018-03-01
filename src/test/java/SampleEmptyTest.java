import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SampleEmptyTest {

    @myAnnotation(myComment = "Great")
    @TestCase(id = "QAAUT-136") // добавь к этому Java методу информацию под категорией TestCase со значением id=QAAUT-136
    @Test

    public void sampleTest() {

    }
}
