package com.vz.tg;

import java.util.Locale;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import com.vz.tg.model.ChartBean;
import com.vz.tg.services.HomeService;
import com.vz.tg.services.Impl.HomeServiceImpl;
import junit.framework.*;

/**
 * The class <code>ChartControllerTest</code> contains tests for the class <code>{@link ChartController}</code>.
 *
 * @generatedBy CodePro at 8/3/15 9:25 AM, using the Spring generator
 * @author Pavan
 * @version $Revision: 1.0 $
 */
public class ChartControllerTest extends TestCase {
	/**
	 * Run the ChartController() constructor test.
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testChartController_1()
		throws Exception {
		ChartController result = new ChartController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_1()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_2()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_3()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_4()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_5()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_6()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_7()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_8()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_9()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_10()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_11()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_12()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_13()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_14()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_15()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView home(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testHome_16()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.home(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "charts");
		ModelAndViewAssert.assertAndReturnModelAttributeOfType(result, "model", ChartBean.class);
		assertEquals(0, model.size());
	}

	/**
	 * Run the ModelAndView search(Locale,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public void testSearch_1()
		throws Exception {
		ChartController fixture = new ChartController();
		fixture.homeservice = new HomeServiceImpl();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.search(locale, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "search");
		ModelAndViewAssert.assertModelAttributeValue(result, "model", "");
		assertEquals(0, model.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 8/3/15 9:25 AM
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
	 * @generatedBy CodePro at 8/3/15 9:25 AM
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
	 * @generatedBy CodePro at 8/3/15 9:25 AM
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(ChartControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new ChartControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}
