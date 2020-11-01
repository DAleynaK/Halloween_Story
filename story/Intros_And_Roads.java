package story;

import java.util.Scanner;


public class Intros_And_Roads {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		boolean res;
		
		do
		{

			restarting();
			System.out.println("Would you like to restart (Y/N)?");
			String choice = input.nextLine();
			if(choice.equalsIgnoreCase("Y"))
				res = true;
			else
				res = false;
	      
		} 
		while (res); 
		
	}
	
	public static void restarting() {
		System.out.println("It's a chilly night in October, October 31st to be exact.");
		System.out.println("You were travelling on a business trip when your phone’s battery died, there goes your GPS.");
		System.out.println("You decide that you’re street-wise enough to go without a map, which seems to work fine until your car breaks down in the middle of the road.");
		System.out.println("This wouldn’t worry you normally, but you’re surrounded by trees and you haven’t seen another car ever since you entered the road.");
		System.out.println("You decide to step outside of your car Outside you see that there’s a path that leads into the forest, if there’s  a path, people must have gone there before right?");
		System.out.println("You grab the flashlight you keep in your car and head down to the forest.");
		System.out.println("A few moments pass and you see that the road splits into two, one path on your left, and the continuation of the path that you were on.");
		System.out.println("Which path do you pick?");
		
		System.out.print("To pick the left path, write L. To pick the right path, write R. To carry on on the path you came, write C: ");
		Scanner input = new Scanner (System.in);
		String choice = input.next();
      
		char choiceS = choice.toUpperCase().charAt(0);
      
		if (choiceS == 'R') {
    	   pathRight();
		} else  if (choiceS == 'L') {
    	  pathLeft();
		} else if (choiceS == 'C') {
    	  mainPath();
		}
	}
	
		
		
		public static void mainPath () {
			Scanner input = new Scanner (System.in);
			
			boolean res = false;
			
			System.out.println("You decide to carry on in the same path, better to not stray too far from what you know. ");
			System.out.println("As you walk through the eerily quiet forest, your eyes drift to your flashlight.");
		    System.out.println("It's been some time since you changed its batteries so there is a possibility it could run out. ");
		    System.out.println("There's a full moon tonight, but clear skies so you can see a few feet ahead. Do you keep the flashlight on? Enter Y for Yes, N for No.");
		    String flashlight = input.next();
		    char flash = flashlight.toUpperCase().charAt(0);
		    
		    if (flash == 'Y') {
		    	
		    	 System.out.println("You haven't used the flashlight much before, its battery is probably full.");
		    	 System.out.println("As you carry on walking through the fog of the forest, you feel even better about keeping the flashlight on.");
		    	 System.out.println("At this point, it's been at least fifteen minutes since you started walking. You definitely have no idea where you are now.");
		    	 System.out.println("Suddenly, you see a figure rush past your line of sight.");
		    	 System.out.println("Maybe it was just an owl flying past. You look around, wishing you had an even better flashlight.");
		    	 System.out.println("You can't see anything. It was probably nothing. You decide to carry on.");
		    	 System.out.println("All of the horror stories you heard about the beasts of the forests come to your mind.");
		    	 System.out.println("Yeah, stories. You remind yourself. It doesn't feel fictional however when you feel something land on your shoulder.");
		    	 System.out.println("You quickly look to see what it was. Three and a half fingers rest on your shoulder.");
		    	 System.out.println("\"Are you lost?\" the man asks. You quickly glance at his finger that seems to have been cut off a few days ago, judging from the puss around it.");
		    	 System.out.println("You smile politely and shake your head. Which seems to anger him.");
		    	 System.out.println("\"Then what are you doing here?\" he shouts, a few birds taking off when they hear his voice.");
		    	 System.out.println("You get ready to run, but his other hand grabs you and you're stuck in your place.");
		    	 System.out.println("You try to get out of his grip, but he seems to be strong for someone who doesn't have all fingers on his hands.");
		    	 System.out.println("\"I tried to help you, you know.\" he says before you feel a strong pain in your abdomen.");
		    	 System.out.println("The last thing you see is his fingers approaching your eyes.");
		    	 System.out.println("GAME OVER. HAPPY HALLOWEEN!"); 
		         }
		    
	
		    
		    if (flash == 'N') {
		    	System.out.println("Better to save the battery for when the clouds cover up the moon, you think to yourself.");
		    	System.out.println("While you carry on walking in the forest, barely seeing a few feet ahead, you hear something snap behind you. Doesn't sound too good.");
		    	System.out.println("Do you run? Enter Y for Yes, N for No.");
		    		 String runn = input.next(); 
		    	   char run = runn.toUpperCase().charAt(0);
		    	   
		    	   if (run == 'Y') {
		    		   System.out.println("You don't trust the sounds in a dark forest, so you run with all your might.");
		    		   System.out.println("It would appear the thing that snapped wasn't caused by you. As you run, you hear leaves crunching near the same pace that you're running. ");
		    		   System.out.println("The thing chasing you is getting close. It doesn't seem to be making any sounds apart from the sound of its running.");
		    		   System.out.println("Up ahead you see a tree you can climb, maybe it's just a rat, it might be safe to climb the tree to see.");
		    		   System.out.println("Do you climb the tree?  Enter Y for Yes, N for No.");
		    		    String climbb = input.next(); 
		    		    char climb = climbb.toUpperCase().charAt(0);
		    		    
		    		    if (climb == 'Y') {
		    		    	 System.out.println("You quicken your pace and sprint to make it to the tree.");
		    		    	 System.out.println("You quickly climb the tree, adrenaline pulsing through your veins as you remind yourself to not look behind you.");
		    		    	 System.out.println("You stop to catch your breath as you reach the top of the tree. It seems quiet now.");
		    		    	 System.out.println("Your mind drifts to the stories your friends told each other about creepy forests when you were younger, on halloweens just like this.");
		    		    	 System.out.println("There was always one about a man who hung himself in a forest and would try to snap the necks of the people who wander in the forest.");
		    		    	 System.out.println("You thought they seemed far fetched then. Doesn't seem impossible now that you're in such an eerie forest.");
		    		    	 System.out.println("You break yourself out of your train of throught when the forest breeze reminds you of where you are.");
		    		    	 System.out.println("You wonder what the thing you were chasing was, it seems to be gone now. Maybe it was just a rat after all.");
		    		    	 System.out.println("Don't worry. You find out what it was soon enough when you feel the breath of something, a human, on your neck.");
		    		    	 System.out.println("\"Wanna join me?\" a male's voice says. Before you have the opportunity to see what's happening, you feel two hands grab your face.");
		    		    	 System.out.println("GAME OVER. HAPPY HALLOWEEN!");
		    		    }
		    		    
		    		    if (climb == 'N') {
		    		    	 System.out.println("Running would probably take you even longer.");
		    		    	 System.out.println("You run as much as you can, but you can barely breathe after a few minutes.");
		    		    	 System.out.println("You couldn't run more if you wanted to, maybe it was only a mouse.");
		    		    	 System.out.println("You stop, leaning on a tree to catch your breath, looking around in the dark in the meantime.");
		    		    	 System.out.println("Using your flashlight would've drawn too much attention anyway. You did the right thing, you think.");
		    		    	 System.out.println("Your breath catches in your throat when you see a long slender figure staring at you from a few feet away.");
		    		    	 System.out.println("You try to move your feet, desperate to avoid whatever it is that you see for as long as you can.");
		    		    	 System.out.println("Something's wrong. Your feet are stuck in their place. Meanwhile, the figure is approaching you.");
		    		    	 System.out.println("A loud laughter is the last thing you hear before it all goes silent, darkness is all you can see.");
		    		    	 System.out.println("GAME OVER. HAPPY HALLOWEEN!");
		    		    }
		    		    
		    		    if (run == 'N') {
		    		    	System.out.println("It was probably a fox walking around, they're nocturnal after all. You need to concentrate on finding a town, you remind yourself.");
		    		    	 System.out.println("You carry on walking, pleased with how calmly you're handling the situation.");
		    		    	 System.out.println("You're suddenly faced with an overwhelming odour, the odour of animal carcass, it's not an easy smell to forget.");
		    		    	 System.out.println("You decide to turn your flashlight on just to avoid on stepping on any dead animals. Best to avoid two tragedies in one night.");
		    		    	 System.out.println("As soon as you turn your flashlight on, you feel a twinge of regret.");
		    		    	 System.out.println("All around you are dead animals, baby animals to be exact. What kind of a predator only eats baby animals?");
		    		    	 System.out.println("You find out soon enough when your flashlight reaches a figure with a white dress. You guess it's a woman, though it's hard to tell.");
		    		    	 System.out.println("\"Hello? Who are you?\" you ask, trying to keep your voice calm.");
		    		    	 System.out.println("Her head, which was tilted to the right at an uncomfortable angle, lifts itself to look at you directly.");
		    		    	 System.out.println("\"Have you seen my baby?\" she asks in a voice so gentle that you feel at ease.");
		    		    	 System.out.println("\"No, not really. I just got here. How old is your baby?\" you ask her, hoping to help.");
		    		    	 System.out.println("An ear piercing scream fills the forest air, it would appear a scream in a forest is still a scream, very audiable.");
		    		    	 System.out.println("\"My baby. You took my baby.\" she says, as she slowly approaches you, quicker than you can back away.");
		    		    	 System.out.println("Hollow eye sockets and pale skin is the last thing you see.");
		    		    	 System.out.println("GAME OVER. HAPPY HALLOWEEN!");
		    		    }
		    		    
		    		   
		    	   }
		     
	    	   
	    	}
		
	}
	
	public static void pathLeft () {
		Scanner in = new Scanner (System.in);
		System.out.println("You start walking in the left path, hoping to find a place or a person to help fix your car. You walk for an hour, but you don't find anything. What do you do?");
		System.out.println("Type \"C\" to continue walking or \"S\" to stop");
		
		char ans0 = in.next().charAt(0);
		//changing lower case to upper case
		if (ans0 == 'c') {
			ans0 = 'C';
		}
		if (ans0 == 's') {
			ans0 = 'S';
		}
		
		//Option1
		if (ans0 == 'C' ) {
			System.out.println("You won't give up so easily! After walking for one more hour, you start to feel weak, cold and hungry. What do you do?");
			System.out.println("Type \"C\" to continue walking or type \"S\" to stop walking and start looking for food.");
			char ans1 = in.next().charAt(0);
			//changing lower case to upper case
			if (ans1 == 'c') {
				ans1 = 'C';
			}
			if (ans1 == 's') {
				ans1 = 'S';
			}
			
			//Option 2
			if (ans1 == 'C') {
				System.out.println("You continue walking and, after one more hour, you finally find a light in the middle of the darkness. You start walking in the direction of the light. After more 30min walking, you arrived in a little house. You knock on the door, look through the window, but, even though the light is on, you can't find anyone. What do you do?");
				System.out.println("Type \"B\" to break the door and go inside the house or type \"W\" to wait until someone opens the door");
				char ans2 = in.next().charAt(0);
				//changing lower case to upper case
				if (ans2 == 'b') {
					ans2 = 'B';
				}
				if (ans2 == 'w') {
					ans2 = 'W';
				}
				
				//Option 3
				if (ans2 == 'B') {
					System.out.println("You were sure there was no one inside, so you broke the door and now you are inside the house. You run to the kitchen, open the refrigerator and you start to eat everything you see. You are so focused on the food that you don’t see a man walking in you direction with a gun. POW! You invaded the house of a murderer, who thought you were a police officer and now you are dead.\nThank you for playing.");
				}
				
				//Option 3
				if (ans2 == 'W') {
					System.out.println("Because there was no one inside, you decided to wait. You are very hungry, tired and dehydrated, so you sit in front of the door and start looking at the sky. The sun was rising and it was beautiful. While looking at the sunrise, your eyes slowly closed. Unfortunately, they never opened again.\nThank you for playing!");
				}
				
				
			}
			//Option2
			if (ans1 == 'S') {
				System.out.println("You decided to stop and find some food to eat in the forest. You walk around for 30min and you find some mushrooms. Will you eat it?");
				System.out.println("Type \"Y\" to eat it or type \"N\" to ignore it and try to find another thing to eat");
				char ans3 = in.next().charAt(0);
				//changing lower case to upper case
				if (ans3 == 'y') {
					ans3 = 'Y';
				}
				if (ans3 == 'n') {
					ans3 = 'N';
				}
				
				//Option 4
				if (ans3 == 'Y') {
					System.out.println("You ate the mushrooms and now you are not hungry anymore. What do you do next?");
					System.out.println("Type \"C\" to continue looking for a place or a person to help fix your car or \"B\" to go back to your car and see if someone passes by");
					char ans4 = in.next().charAt(0);
					//changing lower case to upper case
					if (ans4 == 'c') {
						ans4 = 'C';
					}
					if (ans4 == 'b') {
						ans4 = 'B';
					}
					
					//Option 5
					if (ans4 == 'C') {
						System.out.println("You gained energy from the mushrooms and now you decided to continue looking for someone or a place to help you. You start walking again, but after some minutes, you start to feel sick. The mushrooms you ate were poisounus, and, because you are them, you died within a hour.\nThank you for playing!");
					} 
					if (ans4 == 'B') {
						System.out.println("You gained energy from the mushrooms and now you decided to go back to your car and see if someone passes by to help you. After some time walking, you arrive in your car. You sit down and you immediately start feeling sick. The mushrooms you ate were poisounus and, because you are them, you died within a hour.\nThank you for playing!");
					}
				}
				
				//Option 4
				if (ans3 == 'N') {
					System.out.println("Because you know that some mushrooms are poisonous, you decided to ignore the mushrooms and find something else to eat. After 45min looking for something, you found a pumpkin! Will you eat it?");
					System.out.println("Type \"Y\" to eat it or type \"N\" to ignore it and try to find another thing to eat");
					char ans5 = in.next().charAt(0);
					//changing lower case to upper case
					if (ans5 == 'y') {
						ans5 = 'Y';
					}
					if (ans5 == 'n') {
						ans5 = 'N';
					}
					//Option 6
					if (ans5 == 'Y') {
						System.out.println("You were so hungry that you did not think twice. You ate the whole pumpkin! Now you are full of energy! After finishing the pumpkin, you started to walk again. After an hour, you finally found a gas station! You talked to the people there and they decided to help you.\nCongratulations, you achieved your goal!\nThank you for playing!");
					}
					if (ans5 == 'N') {
						System.out.println("Even though you were really hungry, you decided not to eat the pumpkin. As a result, you died of hunger.\nThank you for playing!");
					}
				}
			}
			
		} 
		
		//Option1
		if (ans0 == 'S') {
			System.out.println("You decide to stop walking, go back to your car, sleep and wait until the morning of the next day, hoping someone would pass by and help you. Unfortunately, that never happen and you died waiting.\nThank you for playing!");
		}
		
	}

public static void pathRight() {
	Scanner in = new Scanner (System.in);
	
	System.out.println("You walk down the path and walk upon the scariest thing you can fine. High schoolers. A Haloween party rages on at");
			System.out.println( "a large house. You walk up to the front lawn and see two groups of teenagers: superheroes and vampires.");
		    System.out.println( "You think one of them should have a phone you can borrow. Do you approach the (V)Vampries, or (S)Superheores?");
	
	String choice = in.next();
	
	if (choice.equalsIgnoreCase("V")) {
		System.out.println("Turns out vampires or high schoolers are not that mean, a nice looking count shares his phone with you. You're able to call a tow truck and ");
	    System.out.println( "get home safely. Now the only scary thing out there is the bill.");
	    System.out.println("GAME OVER. HAPPY HALLOWEEN!");
	    
	}
	
	
	else if (choice.equalsIgnoreCase("S"))
	{
		System.out.println("Guess we now know that superheroes are bullies, before you can even ask them for help they mock you for dressing up as a nerd");
		System.out.println("(you did not have a costume on). Before the tears can fall from your eyes you hurry inside to see if anyone else can help.");
		System.out.println("As you step through the door a tipsy looking teen offers you a drink of blood. Do you (A)drink it or (B)ignore her?");
		String Choice2 = in.next();
		
		if(Choice2.equalsIgnoreCase("A"))
		{
			System.out.println("You drink the blood, turns out it was just punch and you're actually feeling quite refreshed. You ask if she has a phone you can borrow");
			System.out.println("She says no, but her older sister is a mechanic and can help you out.");
			System.out.println("Her sober sister comes to your car with you and helps you out! To thank the girl, do you (C) pay her for her service, or (Y) offer her halloween"
					+ "candy?");
			String choice3 = in.next();
			
			if (choice3.equalsIgnoreCase("C"))
			{
				System.out.println("Turns out not everyone wants cash, her sister must have some past experience because she goes psychotic!");
				System.out.println("Unfortuneatly this includes hitting you in the head with her wrench causing you to die from internal bleeding and brain damage.");
				System.out.println("GAME OVER. HAPPY HALLOWEEN!");
				
				
			}
			else if (choice3.equalsIgnoreCase("Y"))
			{
				System.out.println("Ooooh, everyone loves candy!");
				System.out.println("The sister greatly appreciates it and goes back. You're car is fixed and you're on your way!");
				System.out.println("GAME OVER. HAPPY HALLOWEEN!");
				
				
			}
			
		}
		else if (Choice2.equalsIgnoreCase("B"))
		{
			System.out.println("By denying her, the angel takes serious offense and punches you in the face.");
			System.out.println("Looks like drink-angel-teenagers had a strong uppercut, because you're knocked out cold in the middle of nowhere");
			System.out.println("GAME OVER! HAPPY HALLOWEEN!");
			
			
		}
	}
}

		
	
 
	
}