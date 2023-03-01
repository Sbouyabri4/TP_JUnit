package Tp2;
import org.JUnit.Test;
import org.JUnit.runner.RunWith;
import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.JUnit.Assert;
import static org.mockito.Mockito.when;
import org.mockito.JUnit.MockitoJUnitRunner;

import org.junit.Test;

public class CalculatorApplicationTester {
    CalculatorApplication calculatorApplication = new CalculatorApplication();
    //@Mock annotation est utilisée pour créer l'objet fictif à injecter
    CalculatorService calcService;
    @Test
    public void testAdd(){
// ajouter le comportement de calcService pour additionner deux nombres
        when(calcService.add(10.0,20.0)).thenReturn(30.00);
// tester la fonctionnalité d'ajout
        Assert.assertEquals(calculatorApplication.add(10.0, 20.0),30.0,0);
    }


}
