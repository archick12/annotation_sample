import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class TestListener implements ITestListener {
  public void onTestStart(ITestResult result) {


  }

  public void onTestSuccess(ITestResult result) {
      addDescriptionAnnotation(result);
  }

  public void onTestFailure(ITestResult result) {

  }

  public void onTestSkipped(ITestResult result) {

  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

  }

  public void onStart(ITestContext context) {

  }

  public void onFinish(ITestContext context) {

  }
    public void addDescriptionAnnotation(ITestResult result) {
        Class myClass = result.getTestClass().getRealClass();
        Method method = null; //
        try {
            String methodName = result.getMethod().getMethodName();
            method = myClass.getMethod(methodName); // спрашиваем Java: "Как называется, метод внутри которого
            // ты сейчас выполняешь этот кусочек кода". Проще говоря - "Где я выполнился?"
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        DescriptionAnnotation testDescriptionAnnotation = method.getAnnotation(DescriptionAnnotation.class); // Где бы я не выполнялся, Java верни
        // аннотацию из метода в котором я выполняюсь. Похожим образом можно сделать для класса.
        System.out.println("ANNOTATION: " + testDescriptionAnnotation);
        System.out.println("Jira id: " + testDescriptionAnnotation.comment()); // верни значение внутри аннотации
    }
}
