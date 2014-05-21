package de.beyondjava.jsf.ajax.differentialContextWriter.differenceEngine;

/**
 * Configuration of BabbageFaces. Contains flags needed to fine-tune
 * BabbageFaces.
 */
public class BabbageConfiguration {
	/**
	 * If true, BabbageFaces never generates a sequence of response statements
	 * that need more bytes than the original sequence. If optimizeSize is set
	 * to false, the response tends to be bigger, but the user experience usually
	 * is smoother (less cursor focus losses etc., less flicker on browsers
	 * lacking double buffering, possibly even more speed).
	 */
	private static boolean optimizeSize = true;

	/**
	 * If true, IDs are replaced by shorter IDs. Only applies to IDs generated
	 * by BabbageFaces (because other IDs might be used by external Javascript
	 * files which can't be modified by BabbageFaces).
	 */
	private static boolean optimizeSyntheticIDsAggressively = true;

	/**
	 * If true, IDs are replaced by shorter IDs. Only applies to IDs generated
	 * by BabbageFaces (because other IDs might be used by external Javascript
	 * files which can't be modified by BabbageFaces).
	 */
	public static boolean isOptimizeSyntheticIDsAggressively() {
		return optimizeSyntheticIDsAggressively;
	}

	/**
	 * If true, IDs are replaced by shorter IDs. Only applies to IDs generated
	 * by BabbageFaces (because other IDs might be used by external Javascript
	 * files which can't be modified by BabbageFaces).
	 */
	public static void setOptimizeSyntheticIDsAggressively(
			boolean optimizeSyntheticIDsAggressively) {
		BabbageConfiguration.optimizeSyntheticIDsAggressively = optimizeSyntheticIDsAggressively;
	}

	/**
	 * If true, BabbageFaces never generates a sequence of response statements
	 * that need more bytes than the original sequence. If optimizeSize is set
	 * to false, the response tends to be bigger, but the user experience usually
	 * is smoother (less cursor focus losses etc., less flicker on browsers
	 * lacking double buffering, possibly even more speed).
	 */
	public static boolean isOptimizeSize() {
		return optimizeSize;
	}

}
