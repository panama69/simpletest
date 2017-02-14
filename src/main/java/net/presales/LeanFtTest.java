package net.presales;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.reportbuilder.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import org.junit.*;
import unittesting.UnitTestClassBase;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException, ReportException, InterruptedException {
        Browser browser = BrowserFactory.launch(BrowserType.FIREFOX);
        browser.navigate("http://www.advantageonlineshopping.com/#/");
        Reporter.reportEvent ("Good","All is well", Status.Passed);
        Thread.sleep(2000);
        browser.sync();
        browser.close();
    }

}