/**
 * File Name: AppBasics.java<br>
 * Cassetta, Mark<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.mc.helpers;

import java.util.*;

import com.sqa.mc.helpers.exceptions.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cassetta, Mark
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say Thank You and wish them well.
	 *
	 * @param name
	 *            Name of user
	 * @param appName
	 *            Name of the Application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println("Thank you " + name + ", for using the " + appName + " Application.\nHave a great day!");
	}

	/**
	 * Helper method which greets the user and welcomes them to the Application.
	 * This method then takes their name and returns it to the calling method.
	 *
	 * @param appName
	 *            The name of the Application
	 * @return name The assigned name of the user
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please? ");
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question) {
		String input;
		boolean isValid = false;
		boolean response = true;
		while (!isValid) {
			System.out.print(question + " (Yes/No)");
			input = scanner.nextLine();
			if (input.trim().equalsIgnoreCase("yes")) {
				isValid = true;
				response = false;
			} else if (input.trim().equalsIgnoreCase("no")) {
				isValid = true;
				response = false;
			} else {
				System.out.println("You did not respond to the question in the correct form: (Yes/No)");
			}
		}
		return response;
	}

	public static byte requestByte(String question) {
		byte num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Byte.parseByte(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			}
		}
		return num;
	}

	public static char requestChar(String question) {
		System.out.print(question + " ");
		return scanner.nextLine().charAt(0);
	}

	public static double requestDouble(String question) {
		double num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Double.parseDouble(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			}
		}
		return num;
	}

	public static float requestFloat(String question) {
		float num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Float.parseFloat(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			}
		}
		return num;
	}

	/**
	 * @param string
	 * @return
	 */
	public static int requestInt(String question) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			}
		}
		return num;
	}

	public static int requestInt(String question, int min, int max) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				if (num > max) {
					throw new RequestNumberOverMaxException();
				} else if (num < min) {
					throw new RequestNumberUnderMinException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			} catch (RequestNumberOverMaxException e) {
				System.out.println("You have exceeded the max value of " + max + " [" + input
						+ "]. Please provide a number within range.");
			} catch (RequestNumberUnderMinException e) {
				System.out.println("You have not reached the min value of " + min + " [" + input
						+ "].Please provide a number within range.");
			}
		}
		return num;
	}

	public static int requestInt(String question, int min, int max, String errorMessage) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				if (num > max) {
					throw new RequestNumberOverMaxException();
				}
				if (num < min) {
					throw new RequestNumberUnderMinException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			} catch (RequestNumberUnderMinException | RequestNumberOverMaxException e) {
				System.out.println(errorMessage);
			}
		}
		return num;
	}

	public static long requestLong(String question) {
		long num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Long.parseLong(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			}
		}
		return num;
	}

	public static short requestShort(String question) {
		short num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Short.parseShort(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. Please provide only digits.");
			}
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
