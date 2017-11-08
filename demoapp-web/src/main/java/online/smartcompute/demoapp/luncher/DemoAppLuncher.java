package online.smartcompute.demoapp.luncher;

import java.io.File;
import java.util.logging.Logger;

import org.apache.catalina.startup.Tomcat;

/**
 * 
 * @author masud
 *
 */
public class DemoAppLuncher {

	public static final String DEFAULT_PORT = "8086";
	public static final String CONTEXT_ROOT = "demoapp";
	public static final Logger LOGGER = Logger.getLogger("DemoAppLuncher");

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();
		// The port that we should run on can be set into an environment variable
		// Look for that variable and default to 8086 if it isn't there.
		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = DEFAULT_PORT;
		}
		tomcat.setPort(Integer.valueOf(webPort));
		// This is to compensate for the different paths that the appassembler-program
		// and jsw daemon use
		String basedir = System.getProperty("basedir");
		String deamonWebapp = System.getProperty("deamon-webapp");
		if (null != basedir) {
			basedir += "/webapp";
		} else if (null != deamonWebapp) {
			basedir = deamonWebapp;
		} else {
			basedir = "src/main/webapp";
		}
		LOGGER.info("Basedir: " + basedir);
		String webappLocation = new File(basedir).getAbsolutePath();
		LOGGER.info("configuring app with basedir: " + webappLocation);
		tomcat.addWebapp("/" + CONTEXT_ROOT, webappLocation);
		tomcat.start();
		tomcat.getServer().await();
	}

}