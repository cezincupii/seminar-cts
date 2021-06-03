package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import ro.ase.cts.tests.GrupaTest;
import ro.ase.cts.tests.GrupaTestSetUp;
import ro.ase.cts.tests.StudentDummyTest;
import ro.ase.cts.tests.TestCaseGetPromovabilitate;


@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, GrupaTestSetUp.class, GrupaWithFakeTest.class,
        TestCaseGetPromovabilitate.class, StudentDummyTest.class})
public class SuitaCompleta {

}