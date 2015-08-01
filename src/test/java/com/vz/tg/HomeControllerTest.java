package com.vz.tg;

import java.util.Locale;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import com.vz.tg.model.HomeBean;
import com.vz.tg.services.HomeService;
import com.vz.tg.services.Impl.HomeServiceImpl;
import junit.framework.*;

/**
 * The class <code>HomeControllerTest</code> contains tests for the class <code>{@link HomeController}</code>.
 *
 * @generatedBy CodePro at 8/1/15 2:18 PM, using the Spring generator
 * @author Pavan
 * @version $Revision: 1.0 $
 */
public class HomeControllerTest extends TestCase {
	/**
	 * Run the HomeController() constructor test.
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHomeController_1()
		throws Exception {
		HomeController result = new HomeController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_1()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:11 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_2()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:12 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_3()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:12 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_4()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:14 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_5()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:14 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_6()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:15 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_7()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:15 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_8()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:15 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_9()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:16 PM IST", model.get("serverTime"));
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public void testHome_10()
		throws Exception {
		HomeController fixture = new HomeController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "home");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", HomeBean.class);
		assertEquals(1, model.size());
		//assertEquals("August 1, 2015 2:18:16 PM IST", model.get("serverTime"));
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 8/1/15 2:18 PM
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(HomeControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new HomeControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}