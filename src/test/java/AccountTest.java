import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[] checkNames() {
        return new Object[][]{
                {"Ольга Романович", true},
                {"Ольга РомановичЛеонидовна", false},
                {" ОльгаРоманович", false},
                {"ОльгаРоманович ", false},
                {"Ольга  Романович", false},
                {"", false},
        };
    }
    @Test
    public void checkNameLengthAndWhiteSpace() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
   // @Test
   // public void checkNullName() {
      //  String name = null;
       // Account account = new Account(name);
       // Assert.assertFalse(account.checkNameToEmboss());
