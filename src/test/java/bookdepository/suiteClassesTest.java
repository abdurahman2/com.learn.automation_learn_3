package bookdepository;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(SearchResultsPageTest.class)
@ExcludeTags("draft")
public class suiteClassesTest {

}
