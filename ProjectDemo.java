//created by Tanish Tyagi 
import java.util.Scanner;
import java.util.Random;

class ProjectDemo {

	static int num = 10000;
	static double budget = 1e8;
	static Random rand = new Random();
	static int random = 0;
	static int citiesSaved = 0;
	static int investments = 0;
	static int level = 1;
	static int experiencePoints = 0;
	static double totalExperience = 0;
	static int w = 0;
	static int y = 0;
	static String congress;
	static int supporters = 0;
	static String signature = "";
	static int chief = 0;
	static String chiefName;
	static int chiefHints = 0;
	static String choices;

	// SUGGESTIONS
	// bonus when level - up

	public static void main(String[] args) {
		// space for declaring variables

		Scanner sc = new Scanner(System.in);

		boolean gameWon = false;
		String help = "";
		// budget[0] = 1e8;
		// introduction text
		// System.out.println("What is your name? ");
		// name = sc.nextLine();

		// corona virus talk
		// System.out.println("Here's an truth story from an excerpt from the New York
		// Times about the impact corona virus has hard on everyone's life: ");
		// System.out.println("\nIn December, a woman in Tulsa, Okla., used a Craigslist
		// post to plea for holiday companionship. “Anybody need a grandma for
		// Christmas?” she wrote. “I’ll even bring food and gifts for the kids! I have
		// nobody and it really hurts.” More than three in five working Americans report
		// feeling lonely. Now that the country is facing a disease outbreak that
		// demands measures like “social distancing,” working from home and quarantines,
		// that epidemic of loneliness could get even worse.A paradox of this moment is
		// that while social distancing is required to contain the spread of the
		// coronavirus, it may also contribute to poor health in the long run. So while
		// physical isolation will be required for many Americans who have Covid-19 or
		// have been exposed to it, it’s important that we don’t let such measures cause
		// social and emotional isolation, too. ");
		// System.out.println("\nThe Health Resources and Services Administration
		// cautions that loneliness can be as damaging to health as smoking 15
		// cigarettes a day. Feelings of isolation and loneliness can increase the
		// likelihood of depression, high blood pressure, and death from heart disease.
		// They can also affect the immune system’s ability to fight infection — a fact
		// that’s especially relevant during a pandemic. Studies have shown that
		// loneliness can activate our fight-or-flight function, causing chronic
		// inflammation and reducing the body’s ability to defend itself from viruses.
		// Across the country, people are being asked to work from home, universities
		// are switching to virtual classes and large gatherings are being canceled.
		// These are key strategies to prevent transmission, but they can come at a
		// social and mental-health cost: furthering our sense of isolation from one
		// another, and making us forget that we’re in this together. Already we’re
		// beginning to see suspicion and paranoia play out in public spaces. People
		// struggling with allergies report that every cough elicits glares. ");
		// System.out.println("\nIn Sydney, Australia, reports say that a man died after
		// he collapsed outside a Chinese restaurant and onlookers refused to perform
		// CPR. Asian-Americans have reported racist comments and harassment, based on
		// the wrongheaded belief that they’re more likely to be carrying the
		// coronavirus. There is evidence that the more isolated people feel, the less
		// likely they are to take measures to protect their fellow citizens. A study
		// conducted in Germany found that, among a cohort of people aged 60 and up,
		// increased loneliness was associated with lower rates of flu vaccination. In
		// Taiwan, a feeling of closeness with neighbors was associated with the
		// intention to get a vaccine, or to wash hands more frequently. Similarly, an
		// analysis of H1N1 vaccination rates after the 2009 swine flu pandemic found
		// that states with higher rates of vaccination also had high rates of “social
		// capital,” a measure of the extent to which people in a community have social
		// networks and are willing to help one another. ");
		// System.out.println("\nA study conducted in Hong Kong in the aftermath of the
		// SARS epidemic of 2003 found that among the elderly, measures of subjective
		// well-being did not fall below normal levels. Researchers concluded that this
		// was in part because of a sense of community connectedness. Loneliness and
		// isolation are especially problematic among older people. Twenty-seven percent
		// of older Americans live alone. According to the H.R.S.A., among older people
		// who report feeling lonely, there is a 45 percent increased chance of
		// mortality. In a quarantine situation, this could become even more dire. Those
		// who need lifesaving medication, require specific medical assistance, or have
		// meals delivered to them may be unable to get those services. For those of us
		// who know people, especially elderly people, who may be isolated, get
		// connected. Check in daily and look for ways to spend time together, either
		// through a FaceTime or WhatsApp call, through collaborative gaming or just by
		// using the telephone.");
		// System.out.println("\n You have just been sworn in as the president of the
		// United States. Your only responsibility as of right now is to try to contain
		// the spread of COVID-19, a dangerous virus that has put millions around the
		// world at risk. Read the Readme.md file to see what your powers are\n");
		// System.out.println("\n------------------------------------------");//40
		// dashes
		// System.out.println("Here are a few eye-opening facts about corona virus: ");
		// System.out.println("\nEvery day, New York City announces that 11 people have
		// tested positive for corona virus. The only reason they are able to announce
		// 11 people if that the machines they have that test for the corona virus can
		// only do 11 people per day, showing how fast corona virus spreads.");
		// System.out.println(" \nAt a hospital in Teaneck, New Jersey, an extremely
		// healthy and fit man in his early 30's tested positive for corona virus.
		// Within 2 hours of being rushed to the hospital, his entire body decomposed
		// and he died, showing the power that corona virus can have on anyone.");
		// System.out.println(" \nAt a NBA press conference, Rudy Gobert touched all the
		// mics as a joke. Within 1 day, he tested positive for corona virus and
		// infected serveral of his teammates.");
		// System.out.println("\n------------------------------------------");//40
		// dashes
		// System.out.println("Here are a few things you can do to prevent the spread of
		// corona virus: ");
		// System.out.println("\nWash your hands often with soap and water for at least
		// 20 seconds, especially after blowing your nose, coughing, or sneezing; going
		// to the bathroom; and before eating or preparing food.");
		// System.out.println("\nAvoid touching your eyes, nose, and mouth with unwashed
		// hands");
		// System.out.println("\nStay home when you are sick.");
		// System.out.println("\nCover your cough or sneeze with a tissue, then throw
		// the tissue in the trash.");

		System.out.println("\n------------------------------------------");// 40 dashes
		for (int i = 0; i < 5; i++) {
			System.out.print(".");
		}
		System.out.println("\nType help to get a list of commands that you can do: ");
		help = sc.nextLine();
		if (help.equals("help") || help.equals("Help")) {
			help();
		} else {
			for (int i = 0; i < 5; i++) {
				System.out.print(".");
			}
		}
		System.out.println(
				"\nI now trust that you have read the Readme.md file and are fully understanding of how to play the game. \n\nWrite your name on the next line to show that you are ready to move on.");
		System.out.print("X: ");
		signature = sc.nextLine();
		/*
		 * while(signature != name){ System.out.
		 * println("\nYour signatures did not match up. Don't finesse me bro, try again"
		 * ); System.out.print("X: "); signature = sc.nextLine(); if(signature == name){
		 * System.out.println("Good"); }else{
		 * 
		 * } }
		 */
		// Board b = new Board(); * save after basic changes, 2nd stage adjustment
		president();

		// starting the game
		// System.out.println("\nAbove are your briefings with basic statistics for the
		// cities you are supposed to save. ");
		while (gameWon == false) {
			for (int i = 0;; i++) {
				System.out.println(
						"\nAs president of the United States, what is your move in order to contain the spread of corona virus? ");
				choices = sc.nextLine();
				if (choices.toLowerCase().equals("lab")) {
					lab(choices); // when you print method, only prints returns

				} else if (choices.toLowerCase().equals("school")) {
					schools(choices);
				} else if (choices.toLowerCase().equals("airport")) {
					airport(choices);
				} else if (choices.toLowerCase().equals("shop")) {
					shop(choices);
				} else if (choices.toLowerCase().equals("tv")) {
					tv(choices);

				} else if (choices.toLowerCase().equals("quit")) {
					System.out.println("Thank you for playing Corona Conquerer! I hope you enjoyed!!");
					System.out.println(
							"For more information, you can visit the cdc @ (https://www.cdc.gov/coronavirus/2019-ncov/index.html) and FEMA @ (https://www.fema.gov/coronavirus) in order to learn more about preventing the spread of coronavirus");
					return;
				} else if (choices.toLowerCase().equals("chief")) {
					chief(choices);
				} else if (choices.toLowerCase().equals("chief hint")) {
					chiefHints(choices);
				} else if (choices.toLowerCase().equals("chief hint - lab")
						|| choices.toLowerCase().equals("chief hint-lab")) {
					checkChief(choices);
					chiefHints(choices);
				} else if (choices.toLowerCase().equals("chief hint - tv")
						|| choices.toLowerCase().equals("chief hint-tv")) {
					checkChief(choices);
					chiefHints(choices);
				} else if (choices.toLowerCase().equals("chief hint - airport")
						|| choices.toLowerCase().equals("chief hint-airport")) {
					checkChief(choices);
					chiefHints(choices);
				} else if (choices.toLowerCase().equals("chief hint - shop")
						|| choices.toLowerCase().equals("chief hint-shop")) {
					checkChief(choices);
					chiefHints(choices);
				} else if (choices.toLowerCase().equals("chief hint - school")
						|| choices.toLowerCase().equals("chief hint-school")) {
					checkChief(choices);
					chiefHints(choices);
				}

				if (budget <= 3e6) {
					System.out.println(
							"I see that you are running pretty low on money right now, would you like to send an email (remember, don't go in person, social distancing) to petition Congress and see if they will vote to give you more money?");
					congress = sc.nextLine();
					if (congress.equals("YES") || congress.equals("yes") || congress.equals("Yes")) {
						congress();
					} else {
						System.out.println("Ok, continuing the game ... ");
					}
				}
				if (budget > 1e9 || experiencePoints > 10000000 || citiesSaved >= 35) {
					gameWon = true;
					System.out.println("Congrats! You have defeated the coronavirus! ");
					System.out.println(
							"For more information, you can visit the cdc @ (https://www.cdc.gov/coronavirus/2019-ncov/index.html) and fema @ (https://www.fema.gov/coronavirus) in order to learn more about preventing the spread of coronavirus");
					break;
				}
			}
		}
	}

	// outcome methods
	public static void lab(String choices) {
		for (int i = 0; i < 1; i++) {
			if (budget > 5e6) {
				budget -= 5e6;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget == 5e6) {
				budget = 0;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else {
				System.out.println("\nYour order has not gone through! You do not have enough money!!");
				break;
			}
			for (int x = 0; x < 1; x++) {
				random = rand.nextInt(100);
				for (int y = 0; y < 15; y++) {
					int a = 0;
					if (random == y) {
						citiesSaved++;
						investments++;
						experiencePoints += 1000;
						supporters += 1000;

						if (level == 1) {
							budget += 5e6;
						} else if (level == 2) {
							budget += 5.5e6;
						} else if (level == 3) {
							budget += 6e6;
						} else if (level == 4) {
							budget += 6.5e6;
						} else if (level == 5) {
							budget += 7e6;
						} else {
							break;
						}
						System.out.println("Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					a += 2;
				}
				for (int z = 16; z < 40; z++) {
					int y = 0;
					if (random == z) {
						investments++;
						experiencePoints += 250;
						supporters += 250;
						if (level == 1) {
							budget += 1.25e6;
						} else if (level == 2) {
							budget += 1.375e6;
						} else if (level == 3) {
							budget += 1.5e6;
						} else if (level == 4) {
							budget += 1.625e6;
						} else if (level == 5) {
							budget += 1.75e6;
						} else {
							break;
						}
						System.out.println("Partial Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					y += 2;
				}
				for (int a = 41; a < 100; a++) {
					int z = 0;
					if (random == a) {
						investments++;
						experiencePoints += 100;
						supporters -= 100;

						System.out.println(
								"Unfortunately, your investment of a lab was a complete failure! Your total budget left now is: "
										+ budget);
						supporters(supporters);
						president();

					}
					z += 2;
				}
			}
		}
	}

	public static void schools(String choices) {
		for (int b = 0; b < 1; b++) {
			if (budget > 5e7) {
				budget = budget - 5e7;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget == 5e7) {
				budget = 0;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget < 5e7) {
				System.out.println("\nYour order has not gone through! You do not have enough money!!");
				break;
			} else {
				System.out.println("Something's wrong!!");
				break;
			}
			for (int i = 0; i < 1; i++) {
				random = rand.nextInt(100);
				for (int y = 0; y < 5; y++) {
					int a = 0;
					if (random == y) {
						citiesSaved++;
						investments++;
						experiencePoints += 5000;
						supporters += 5000;
						if (level == 1) {
							budget += 5e7;
						} else if (level == 2) {
							budget += 5.5e7;
						} else if (level == 3) {
							budget += 6e7;
						} else if (level == 4) {
							budget += 6.5e7;
						} else if (level == 5) {
							budget += 7e7;
						} else {
							break;
						}
						System.out.println("Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					a += 2;
				}

				for (int z = 6; z < 40; z++) {
					int y = 0;
					if (random == z) {
						investments++;
						experiencePoints += 1250;
						supporters += 1250;
						if (level == 1) {
							budget += 1.25e7;
						} else if (level == 2) {
							budget += 1.375e7;
						} else if (level == 3) {
							budget += 1.5e7;
						} else if (level == 4) {
							budget += 1.625e7;
						} else if (level == 5) {
							budget += 1.75e7;
						} else {
							break;
						}
						System.out.println("Partial Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					y += 2;
				}
				for (int a = 41; a < 100; a++) {
					int z = 0;
					if (random == a) {
						investments++;
						experiencePoints += 500;
						supporters -= 500;

						System.out.println(
								"Unfortunately, your investment of a school was a complete failure! Your total budget left now is: "
										+ budget);
						supporters(supporters);
						president();

					}
					z += 2;
				}
			}
		}
	}

	public static void airport(String choices) {
		for (int i = 0; i < 1; i++) {
			if (budget > 2.5e7) {
				budget = budget - 2.5e7;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget == 2.5e7) {
				budget = 0;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget < 2.5e7) {
				System.out.println("\nYour order has not gone through! You do not have enough money!!");
				break;
			} else {
				System.out.println("Something's wrong!!");
				break;
			}
			for (int x = 0; x < 1; x++) {
				random = rand.nextInt(100);
				for (int y = 0; y < 10; y++) {
					int a = 0;
					if (random == y) {
						citiesSaved++;
						investments++;
						experiencePoints += 2500;
						supporters += 2500;
						if (level == 1) {
							budget += 2.5e7;
						} else if (level == 2) {
							budget += 2.75e7;
						} else if (level == 3) {
							budget += 3e7;
						} else if (level == 4) {
							budget += 3.25e7;
						} else if (level == 5) {
							budget += 3.5e7;
						} else {
							break;
						}
						System.out.println("Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					a += 2;
				}
				for (int z = 10; z < 45; z++) {
					int y = 0;
					if (random == z) {
						investments++;
						experiencePoints += 625;
						supporters += 625;
						if (level == 1) {
							budget += .625e7;
						} else if (level == 2) {
							budget += .6875e7;
						} else if (level == 3) {
							budget += .75e7;
						} else if (level == 4) {
							budget += .8125e7;
						} else if (level == 5) {
							budget += .875e7;
						} else {
							break;
						}
						System.out.println("Partial Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					y += 2;
				}
				for (int a = 46; a < 100; a++) {
					int z = 0;
					if (random == a) {
						investments++;
						experiencePoints += 250;
						supporters -= 250;

						System.out.println(
								"Unfortunately, your investment of a airport was a complete failure! Your total budget left now is: "
										+ budget);
						supporters(supporters);
						president();

					}
					z += 2;
				}
			}
		}
	}

	public static void shop(String choices) {
		for (int i = 0; i < 1; i++) {
			if (budget > 1e7) {
				budget -= 1e7;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget == 1e7) {
				budget = 0;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget < 1e7) {
				System.out.println("\nYour order has not gone through! You do not have enough money!!");
				break;
			}
			for (int x = 0; x < 1; x++) {
				random = rand.nextInt(100);
				for (int y = 0; y < 30; y++) {
					int a = 0;
					if (random == y) {
						citiesSaved++;
						investments++;
						experiencePoints += 2000;
						supporters += 2000;
						if (level == 1) {
							budget += 1e7;
						} else if (level == 2) {
							budget += 1.1e7;
						} else if (level == 3) {
							budget += 1.2e7;
						} else if (level == 4) {
							budget += 1.3e7;
						} else if (level == 5) {
							budget += 1.4e7;
						} else {
							break;
						}
						System.out.println("Success! Your total budget now: " + budget);
						supporters(supporters);
						president();

					}
					a += 2;
				}
				for (int z = 31; z < 60; z++) {
					int y = 0;
					if (random == z) {
						investments++;
						experiencePoints += 500;
						supporters += 500;
						if (level == 1) {
							budget += .25e7;
						} else if (level == 2) {
							budget += .275e7;
						} else if (level == 3) {
							budget += .3e7;
						} else if (level == 4) {
							budget += .325e7;
						} else if (level == 5) {
							budget += .35e7;
						} else {
							break;
						}
						System.out.println("Partial Success! Your total budget now: " + budget);
						supporters(supporters);
						president();
					}
					y += 2;
				}
				for (int a = 60; a < 100; a++) {
					int z = 0;
					if (random == a) {
						investments++;
						experiencePoints += 125;
						supporters -= 125;

						System.out.println(
								"Unfortunately, your investment of a shop was a complete failure! Your total budget left now is: "
										+ budget);
						supporters(supporters);
						president();
					}
					z += 2;
				}
			}
		}
	}

	public static void tv(String choices) {
		for (int i = 0; i < 1; i++) {
			if (budget > 1e6) {
				budget = budget - 1e6;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget == 1e6) {
				budget = 0;
				System.out.println("\nYour order has gone through! Your budget left is: " + budget);
			} else if (budget < 1e6) {
				System.out.println("\nYour order has not gone through! You do not have enough money!!");
			} else {
				System.out.println("Something's wrong!!");
				break;
			}
			for (int x = 0; x < 1; x++) {
				random = rand.nextInt(100);
				for (int y = 0; y < 60; y++) {
					int a = 0;
					if (random == y) {
						citiesSaved++;
						investments++;
						experiencePoints += 500;
						supporters += 500;
						if (level == 1) {
							budget += 1e6;
						} else if (level == 2) {
							budget += 1.1e6;
						} else if (level == 3) {
							budget += 1.2e6;
						} else if (level == 4) {
							budget += 1.3e6;
						} else if (level == 5) {
							budget += 1.4e6;
						} else {
							break;
						}
						System.out.println("Success! Your total budget now: " + budget);
						supporters(supporters);
						president();
					}
					a += 2;
				}
				for (int z = 61; z < 94; z++) {
					int y = 0;
					if (random == z) {
						investments++;
						experiencePoints += 125;
						supporters += 125;
						if (level == 1) {
							budget += .25e6;
						} else if (level == 2) {
							budget += .275e6;
						} else if (level == 3) {
							budget += .3e6;
						} else if (level == 4) {
							budget += .325e6;
						} else if (level == 5) {
							budget += .35e6;
						} else {
							break;
						}
						System.out.println("Partial Success! Your total budget now: " + budget);
						supporters(supporters);
						president();
					}
					y += 2;
				}
				for (int a = 95; a < 100; a++) {
					int z = 0;
					if (random == a) {
						investments++;
						experiencePoints += 31;
						supporters -= 31;
						System.out.println(
								"Unfortunately, your investment of shutting down tv channels was a complete failure! Your total budget left now is: "
										+ budget);
						supporters(supporters);
						president();
					}
					z += 2;
				}
			}
		}
	}

	// president card
	public static void president() {
		if (experiencePoints >= 0 && experiencePoints <= 999) {
			level = 1;
			totalExperience = 1000;
		} else if (experiencePoints >= 1000 && experiencePoints <= 9999) {
			level = 2;
			totalExperience = 10000;
		} else if (experiencePoints >= 1e4 && experiencePoints <= 99999) {
			level = 3;
			totalExperience = 1e5;
		} else if (experiencePoints >= 1e5 && experiencePoints <= 999999) {
			level = 4;
			totalExperience = 1e6;
		} else if (experiencePoints >= 1e6 && experiencePoints <= 999999) {
			level = 5;
			totalExperience = 1e7;
		} else {
			System.out.println("Something's wrong!!");
		}

		if (citiesSaved == 10) {
			budget += 5e7;
			System.out.println(
					"Congrats on having 10 cities saved! You earned a bonus, and your new budget is: " + budget);
		} else if (citiesSaved == 15) {
			budget += 7.5e7;
			System.out.println(
					"Congrats on having 15 cities saved! You earned a bonus, and your new budget is: " + budget);
		} else if (citiesSaved == 20) {
			budget += 10e7;
			System.out.println(
					"Congrats on having 20 cities saved! You earned a bonus, and your new budget is: " + budget);
		} else if (citiesSaved == 25) {
			budget += 12.5e7;
			System.out.println(
					"Congrats on having 25 cities saved! You earned a bonus, and your new budget is: " + budget);
		}

		/*
		 * int count = 0; int originalLevel = 1; if(level - originalLevel == 1){
		 * for(count = 0; ; count++){ if(count == 2){ budget += 0.5e7;
		 * System.out.println("\nCongrats "
		 * +signature+", on the level up. Here is a bonus for your efforts. Your new budget is: "
		 * +budget); }else if(count == 3){ budget += 1e7;
		 * System.out.println("\nCongrats "
		 * +signature+", on the level up. Here is a bonus for your efforts. Your new budget is: "
		 * +budget); }else if(count == 3){ budget += 1.5e7;
		 * System.out.println("\nCongrats "
		 * +signature+", on the level up. Here is a bonus for your efforts. Your new budget is: "
		 * +budget); }else if(count == 4){ budget += 2e7;
		 * System.out.println("\nCongrats "
		 * +signature+", on the level up. Here is a bonus for your efforts. Your new budget is: "
		 * +budget); }else if(count == 5){ budget += 2.5e7;
		 * System.out.println("\nCongrats "
		 * +signature+", on the level up. Here is a bonus for your efforts. Your new budget is: "
		 * +budget); } } }
		 */

		System.out.println("\n------------------------------------------");// 40 dashes
		System.out.println("| President Stats: ");
		System.out.println("| Total Budget: " + budget);
		System.out.println("| Cities saved: " + citiesSaved);
		System.out.println("| Investments made: " + investments);
		System.out.println("| Level: " + level);
		System.out.println("| Supporters: " + supporters);
		System.out.println("| XP Status: " + (experiencePoints) + "/" + (totalExperience));
		System.out.println("------------------------------------------");
	}

	public static void help() {
		System.out.println("\n------------------------------------------");// 40 dashes
		System.out.println("Commands for Corona Conquerer: ");
		System.out.println(
				"As US president, below are a list of commands you can type to prevent the spread of corona virus: ");
		System.out.println("     Shutdown Schools, enable by typing school");
		System.out.println("     Open a lab to try to create an antidote, enable by typing lab");
		System.out.println("     Install online shopping, enable by typing shop");
		System.out.println("     Shutdown airports, enable by typing airport");
		System.out.println("     Block TV channels to play ads for corona, enable by typing tv");
		System.out.println(
				"\nIf you run out of money, (which you might), there is always a chance that Congress might give you a loan to continue your efforts in preventing the spread of the virus.");
		System.out.println("\n------------------------------------------");// 40 dashes
		System.out.println(
				"As your xp increases, you can also level up. Every time you level up, the amount of money you make from investments increases. Below are the amounts of money you will make from successful investments. There are also Partial sucesses, which result in 1/4 of the money back.");
		System.out.println("\n------------------------------------------");// 40 dashes
		System.out.println("\nCOSTS for Investments: ");
		System.out.println("Lab:");
		double lab = 5e6;
		for (int i = 0; i < 5; i++) {
			System.out.println("     Level " + (i + 1) + " : " + (lab) + " dollars if sucessful");
			lab = lab + 0.5e6;
		}
		System.out.println("School:");
		double school = 5e7;
		for (int i = 0; i < 5; i++) {
			System.out.println("     Level " + (i + 1) + " : " + (school) + " mil if sucessful");
			school += 0.5e7;
		}
		System.out.println("Shop: ");
		double shop = 1e7;
		for (int i = 0; i < 5; i++) {
			System.out.println("     Level " + (i + 1) + " : " + (shop) + " mil if sucessful");
			shop += 0.1e7;
		}
		System.out.println("Airport: ");
		double airport = 2.5e7;
		for (int i = 0; i < 5; i++) {
			System.out.println("     Level " + (i + 1) + " : " + (airport) + " mil if sucessful");
			airport += 0.25e7;
		}
		System.out.println("TV: ");
		double tv = 1e6;
		for (int i = 0; i < 5; i++) {
			System.out.println("     Level " + (i + 1) + " : " + (tv) + " dollars if sucessful");
			tv += .1e6;
		}
		System.out.println("\n------------------------------------------");// 40 dashes
		System.out.println(
				"\nWith each sucessful investment, you can supporters, which act as an xp multiplier to help you level up faster.");
		System.out.println(
				"\nIf you are having trouble making a decision on what investment to make as president, you can always hire a chief strategy officer, which will cost 50 million dollars. They can increase your chance of a successful investment and for all investments you make with a chief, there is no cost. You can buy one by typing chief and ask the chief for hints by typing chief hints - investment you want to make (e.g chief hints - lab). A chief can give 8 hints and then you will have to buy him/her again.");
		System.out.println(
				"\nIn order to defeat the coronavirus and beat the game, your money has to be greater than 1 billion or you have to have completed xp level 5.");
		System.out.println("\n Feel Free to read the ReadMe.md if you want to learn more.");
		System.out.println("\n------------------------------------------");// 40 dashes
	}

	public static void congress() {
		random = rand.nextInt(100);
		for (int i = 0; i < 15; i++) {
			if (random == i) {
				budget += 1e7;
				System.out.println(
						"Congress has voted to give you more money to continue your efforts, your new budget is: "
								+ budget);
			}
		}
		for (int x = 16; x < 45; x++) {
			if (random == x) {
				budget += .5e7;
				System.out.println(
						"Congress has voted to give you more money to continue your efforts, your new budget is: "
								+ budget);
			}
		}
		for (int y = 46; y < 100; y++) {
			if (random == y) {

				System.out.println(
						"Unfortunately, Congress has voted to not give you more money to continue your efforts, so your budget stays the same at : "
								+ budget);
			}
		}
	}

	public static void supporters(int supporters) {
		for (int i = 0; i < 1; i++) {
			if (supporters >= 1000 && supporters <= 2499) {
				experiencePoints *= 1.05;
			} else if (supporters >= 2500 && supporters <= 4999) {
				experiencePoints *= 1.1;
			} else if (supporters >= 5000 && supporters <= 7499) {
				experiencePoints *= 1.15;
			} else if (supporters >= 7500 && supporters <= 9999) {
				experiencePoints *= 1.2;
			} else if (supporters >= 10000 && supporters <= 19999) {
				experiencePoints *= 1.25;
			} else if (supporters >= 20000 && supporters <= 49999) {
				experiencePoints *= 2;
			} else if (supporters >= 50000) {
				experiencePoints *= 10;
			} else if (supporters <= 0 || supporters <= 999) {
				experiencePoints *= 1;
			} else {
				System.out.println("Something's wrong!!!!!!");
				break;
			}
		}
	}

	public static void chief(String choices) {
		random = rand.nextInt(4);
		if (random == 0) {
			chiefName = "Bob";
		} else if (random == 1) {
			chiefName = "Ur mom";
		} else if (random == 2) {
			chiefName = "Joe";
		} else if (random == 3) {
			chiefName = "Elizabeth";
		} else if (random == 4) {
			chiefName = "Jeremy";
		}

		for (int i = 0; i < 1; i++) {
			if (budget > 5e7) {
				budget -= 5e7;
				System.out.println("Your chief's name is: " + chiefName + "! Your budget is now: " + budget);
				chief++;
			} else if (budget == 5e7) {
				budget = 0;
				chief++;
				System.out.println("Your chief's name is: " + chiefName + "! Your budget is now: " + budget);
			} else if (budget < 5e7) {
				System.out.println("\nYour order has not gone through! You do not have enough money!!");
			} else {
				System.out.println("Something's wrong!!!");
				break;
			}
		}
	}

	public static void chiefHints(String choices) {
		for (int i = 0; i < 1; i++) {
			if (chief <= 0) {
				System.out.println("Scammer! You don't have a chief!");
				break;
			}
		}

		if (choices.toLowerCase().equals("chief hint - lab")) {
			chiefHints += 1;
			random = rand.nextInt(100);
			for (int y = 0; y < 35; y++) {
				int a = 0;
				if (random == y) {
					citiesSaved++;
					investments++;
					experiencePoints += 1000;
					supporters += 1000;

					if (level == 1) {
						budget += 5e6;
					} else if (level == 2) {
						budget += 5.5e6;
					} else if (level == 3) {
						budget += 6e6;
					} else if (level == 4) {
						budget += 6.5e6;
					} else if (level == 5) {
						budget += 7e6;
					} else {
						break;
					}
					System.out.println("Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				a += 2;
			}
			for (int z = 36; z < 60; z++) {
				int y = 0;
				if (random == z) {
					investments++;
					experiencePoints += 250;
					supporters += 250;
					if (level == 1) {
						budget += 1.25e6;
					} else if (level == 2) {
						budget += 1.375e6;
					} else if (level == 3) {
						budget += 1.5e6;
					} else if (level == 4) {
						budget += 1.625e6;
					} else if (level == 5) {
						budget += 1.75e6;
					} else {
						break;
					}
					System.out.println("Partial Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				y += 2;
			}
			for (int a = 61; a < 100; a++) {
				int z = 0;
				if (random == a) {
					investments++;
					experiencePoints += 100;
					supporters -= 100;

					System.out.println(
							"Unfortunately, your investment of a lab was a complete failure! Your total budget left now is: "
									+ budget);
					supporters(supporters);
					president();
				}
				z += 2;
			}
		} else if (choices.toLowerCase().equals("chief hint - tv") || choices.toLowerCase().equals("chief hint-tv")) {
			chiefHints += 1;
			for (int y = 0; y < 70; y++) {

				int a = 0;
				if (random == y) {
					citiesSaved++;
					investments++;
					experiencePoints += 500;
					supporters += 500;
					if (level == 1) {
						budget += 1e6;
					} else if (level == 2) {
						budget += 1.1e6;
					} else if (level == 3) {
						budget += 1.2e6;
					} else if (level == 4) {
						budget += 1.3e6;
					} else if (level == 5) {
						budget += 1.4e6;
					} else {
						break;
					}
					System.out.println("Success! Your total budget now: " + budget);
					supporters(supporters);
					president();
				}
				a += 2;
			}
			for (int z = 71; z < 97; z++) {
				int y = 0;
				if (random == z) {
					investments++;
					experiencePoints += 125;
					supporters += 125;

					System.out.println("Partial Success! Your total budget now: " + budget);
					supporters(supporters);
					president();
				}
				y += 2;
			}
			for (int a = 98; a < 100; a++) {
				int z = 0;
				if (random == a) {
					investments++;
					experiencePoints += 31;
					supporters -= 31;
					System.out.println(
							"Unfortunately, your investment of shutting down tv channels was a complete failure! Your total budget left now is: "
									+ budget);
					supporters(supporters);
					president();
				}
				z += 2;
			}
		} else if (choices.toLowerCase().equals("chief hint - airport")
				|| choices.toLowerCase().equals("chief hint-airport")) {
			chiefHints += 1;
			random = rand.nextInt(100);
			for (int y = 0; y < 30; y++) {
				int a = 0;
				if (random == y) {
					citiesSaved++;
					investments++;
					experiencePoints += 2500;
					supporters += 2500;
					if (level == 1) {
						budget += 2.5e7;
					} else if (level == 2) {
						budget += 2.75e7;
					} else if (level == 3) {
						budget += 3e7;
					} else if (level == 4) {
						budget += 3.25e7;
					} else if (level == 5) {
						budget += 3.5e7;
					} else {
						break;
					}
					System.out.println("Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				a += 2;
			}
			for (int z = 31; z < 70; z++) {
				int y = 0;
				if (random == z) {
					investments++;
					experiencePoints += 625;
					supporters += 625;
					if (level == 1) {
						budget += .625e7;
					} else if (level == 2) {
						budget += .6875e7;
					} else if (level == 3) {
						budget += .75e7;
					} else if (level == 4) {
						budget += .8125e7;
					} else if (level == 5) {
						budget += .875e7;
					} else {
						break;
					}
					System.out.println("Partial Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				y += 2;
			}
			for (int a = 71; a < 100; a++) {
				int z = 0;
				if (random == a) {
					investments++;
					experiencePoints += 250;
					supporters -= 250;

					System.out.println(
							"Unfortunately, your investment of a airport was a complete failure! Your total budget left now is: "
									+ budget);
					supporters(supporters);
					president();

				}
				z += 2;
			}
		} else if (choices.toLowerCase().equals("chief hint - shop")
				|| choices.toLowerCase().equals("chief hint-shop")) {
			chiefHints += 1;
			for (int y = 0; y < 50; y++) {
				int a = 0;
				if (random == y) {
					citiesSaved++;
					investments++;
					experiencePoints += 2000;
					supporters += 2000;
					if (level == 1) {
						budget += 1e7;
					} else if (level == 2) {
						budget += 1.1e7;
					} else if (level == 3) {
						budget += 1.2e7;
					} else if (level == 4) {
						budget += 1.3e7;
					} else if (level == 5) {
						budget += 1.4e7;
					} else {
						break;
					}
					System.out.println("Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				a += 2;
			}
			for (int z = 51; z < 80; z++) {
				int y = 0;
				if (random == z) {
					investments++;
					experiencePoints += 500;
					supporters += 500;
					if (level == 1) {
						budget += .25e7;
					} else if (level == 2) {
						budget += .275e7;
					} else if (level == 3) {
						budget += .3e7;
					} else if (level == 4) {
						budget += .325e7;
					} else if (level == 5) {
						budget += .35e7;
					} else {
						break;
					}
					System.out.println("Partial Success! Your total budget now: " + budget);
					supporters(supporters);
					president();
				}
				y += 2;
			}
			for (int a = 81; a < 100; a++) {
				int z = 0;
				if (random == a) {
					investments++;
					experiencePoints += 125;
					supporters -= 125;

					System.out.println(
							"Unfortunately, your investment of a shop was a complete failure! Your total budget left now is: "
									+ budget);
					supporters(supporters);
					president();
				}
				z += 2;
			}

		} else if (choices.toLowerCase().equals("chief hint - school")
				|| choices.toLowerCase().equals("chief hint-school")) {
			chiefHints += 1;
			random = rand.nextInt(100);
			for (int y = 0; y < 15; y++) {
				int a = 0;
				if (random == y) {
					citiesSaved++;
					investments++;
					experiencePoints += 5000;
					supporters += 5000;
					if (level == 1) {
						budget += 5e7;
					} else if (level == 2) {
						budget += 5.5e7;
					} else if (level == 3) {
						budget += 6e7;
					} else if (level == 4) {
						budget += 6.5e7;
					} else if (level == 5) {
						budget += 7e7;
					} else {
						break;
					}
					System.out.println("Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				a += 2;
			}

			for (int z = 16; z < 60; z++) {
				int y = 0;
				if (random == z) {
					investments++;
					experiencePoints += 1250;
					supporters += 1250;
					if (level == 1) {
						budget += 1.25e7;
					} else if (level == 2) {
						budget += 1.375e7;
					} else if (level == 3) {
						budget += 1.5e7;
					} else if (level == 4) {
						budget += 1.625e7;
					} else if (level == 5) {
						budget += 1.75e7;
					} else {
						break;
					}
					System.out.println("Partial Success! Your total budget now: " + budget);
					supporters(supporters);
					president();

				}
				y += 2;
			}
			for (int a = 61; a < 100; a++) {
				int z = 0;
				if (random == a) {
					investments++;
					experiencePoints += 500;
					supporters -= 500;

					System.out.println(
							"Unfortunately, your investment of a school was a complete failure! Your total budget left now is: "
									+ budget);
					supporters(supporters);
					president();

				}
				z += 2;
			}
		}

	}

	public static void checkChief(String choices) {
		if (chiefHints >= 7) {
			System.out.println("\nYou have reached the limit for hints you can use with your current chief.");
			chief -= 1;
		}
	}
}
