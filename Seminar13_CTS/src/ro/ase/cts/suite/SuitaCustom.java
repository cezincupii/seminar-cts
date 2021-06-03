package ro.ase.cts.suite;


import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import ro.ase.cts.tests.GrupaTest;
import ro.ase.cts.tests.GrupaTestSetUp;
import ro.ase.cts.tests.StudentDummyTest;
import ro.ase.cts.tests.TestCaseGetPromovabilitate;

@RunWith(Categories.class)
@SuiteClasses({ GrupaTest.class, GrupaTestSetUp.class, GrupaWithFakeTest.class, StudentDummyTest.class,
        TestCaseGetPromovabilitate.class })
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {

}