import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void checkCorrectNameLength() {
        String name = "Ольга Романович";
        Account account = new Account(name);
        Assert.assertTrue(account.checkNameToEmboss());
    }
    @Test
    public void checkLongNameLength() {
        String name= "Ольга РомановичЛеонидовна";
        Account account=new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkShortNameLength() {
        String name= "Ол";
        Account account=new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkOneWhiteSpaceInTheMiddle() {
        String name = "Иван Петров";
        Account account = new Account(name);
        Assert.assertTrue(account.checkNameToEmboss());
    }
    @Test
    public void checkTwoWhiteSpaceInTheMiddle() {
        String name = "Иван  Петров";
        Account account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkNameStartsWithWhiteSpace() {
        String name = " ИванПетров";
        Account account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkNameEndsWhiteSpace() {
        String name = "ИванПетров ";
        Account account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
}

