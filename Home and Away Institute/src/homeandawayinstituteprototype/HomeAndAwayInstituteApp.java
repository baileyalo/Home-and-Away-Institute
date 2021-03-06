/*
 * HomeAndAwayInstituteApp.java
 */
package homeandawayinstituteprototype;

import homeandawayinstituteprototype.Login;

import javax.swing.UIManager;//Look and Feel Graphic User Interface library
import javax.swing.UnsupportedLookAndFeelException;//Importing Lookand Fell ExceptionHandling Library
import javax.swing.plaf.metal.MetalLookAndFeel;//Metallic look and Bold fonts for controls
import org.jdesktop.application.Application;//Base class for all swing applications
import org.jdesktop.application.SingleFrameApplication;//base class for main window

/**
 * The main class of the application.
 */
// Method for intiate singelframe use
public class HomeAndAwayInstituteApp extends SingleFrameApplication {

	/**
	 * At startup create and show the main frame of the application.
	 */
	@Override
	protected void startup() {
		try // intiation of exception handling for singleframe use

		{

			UIManager.setLookAndFeel(new MetalLookAndFeel());

		}

		catch (Exception ex)

		{
			try {
				// Set cross-platform Java L&F (also called "Metal")

				UIManager.setLookAndFeel(UIManager
						.getCrossPlatformLookAndFeelClassName());
			} catch (UnsupportedLookAndFeelException e) {
				// handle exception
			} catch (ClassNotFoundException e) {
				// handle exception
			} catch (InstantiationException e) {
				// handle exception
			} catch (IllegalAccessException e) {
				// handle exception
			}

		}

		this.show(new Login(this));

	}

	/**
	 * This method is to initialize the specified window by injecting resources.
	 * Windows shown in our application come fully initialized from the GUI
	 * builder, so this additional configuration is not needed.
	 * 
	 * @wbp.parser.entryPoint
	 */
	@Override
	// necessary code for GUI
	protected void configureWindow(java.awt.Window root) {
	}

	/**
	 * A convenient static getter for the application instance.
	 * 
	 * @return the instance of HomeAndAwayInstituteApp
	 * @wbp.parser.entryPoint
	 */

	// getapplication method returning the homeandaway app for use
	public static HomeAndAwayInstituteApp getApplication() {
		return Application.getInstance(HomeAndAwayInstituteApp.class);
	}

	/**
	 * Main method launching the application after configuring.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {

		launch(HomeAndAwayInstituteApp.class, args);

		// Login.main(args);

	}
}
