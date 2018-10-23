import java.util.Scanner;
public class Review {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(n != 1) {
			System.out.println("Enter a number from 1 to 7");
			int z = sc.nextInt();
			switch(z) {
				case 1:
					int y, r, even = 0;
					System.out.println("Enter a number");
					y = Integer.parseInt(sc.next());
					while (y != 0) {
						r = y % 10;
						System.out.println("r value " + r);
						System.out.println("y value " + y);
						y = y / 10;
						if (r % 2 == 0) {
							even ++;
						}
					}
						System.out.println("There are " + even + " even numbers in this number");
					System.out.println("Do you want to choose another number?");
					int anothernum = sc.nextInt();
					if (anothernum < 1);
						n = 1;	
					break;
				case 2:
					// It asks to enter a positive number
					System.out.println("Enter a positive number");
					// You have to enter a positive number.
					int num2 = sc.nextInt();
					// It asks you to enter a digit.
					System.out.println("Enter a digit");
					// You have to enter a digit to know if this digit is in the previous number.
					String k = sc.next();
					// It passes k from string to int.
					int k2 = Integer.parseInt(k);
					
					// It passes our digit into a int inside another string
					String z2 = Integer.toString(num2);
					// It transforms the String into a char array
					char z21[] = z2.toCharArray();
					// It defines the variable count2 to count how many times is the digit repeated
					int count2 = 0;
					// This for says that until z2 is not finished, z22 will be bigger than it.
					for (int z22 = 0; z2.length() > z22; z22++) {
						if (z21[z22] == k.charAt(0)) {
							count2++;
						}
					}
					
						

					System.out.println("Do you want to choose another number?");
					int anothernum2 = sc.nextInt();
					if (anothernum2 < 1);
						n = 1;
					break;
				case 3:
					System.out.println("Enter a number to know its inverted");
					int x, inverted = 0, r3;
					x = sc.nextInt();
					while (x > 0) {
						r3= x % 10;
						inverted = inverted * 10 + r3;
						x /= 10;
					}
					System.out.println("Inverted number " + inverted);
					
					System.out.println("Do you want to choose another number?");
					int anothernum3 = sc.nextInt();
					if (anothernum3 < 1);
						n = 1;
						
					break;
				case 4:					
					System.out.println("Do you want to choose another number?");
					int anothernum4 = sc.nextInt();
					if (anothernum4 < 1);
						n = 1;
					break;
				case 5:
					String sentence;
					System.out.println("Enter a sentence");
					sentence = sc.next();
					String letter;
					System.out.println("Enter a letter");
					letter = sc.next();
					int count = 0;
					if (sentence.startsWith(letter)) {
						count++;
					}
					System.out.println(count);
					System.out.println("Do you want to choose another number?");
					int anothernum5 = sc.nextInt();
					if (anothernum5 < 1);
						n = 1;
					break;
				case 6:
					System.out.println("Do you want to choose another number?");
					int anothernum6 = sc.nextInt();
					if (anothernum6 < 1);
						n = 1;
					break;
				case 7:
					System.out.println("Enter a word to know if it is palindrome or not");
					String word = sc.next();
					int inc = 0;
					int des = word.length()-1;
					boolean error = false;
					while ((inc<des) && (!error)){
						 
						if (word.charAt(inc)==word.charAt(des)){				
							inc++;
							des--;
						} else {
							error = true;
						}
					}
					if (!error)
						System.out.println(word + " is palindrome");
					else
						System.out.println(word + " is not palindrome");
					System.out.println("Do you want to choose another number?");
					int anothernum7 = sc.nextInt();
					if (anothernum7 < 1);
						n = 1;
					break;
				default:
					System.out.println("Enter a valid number");
					break;
			}
		}
			
		}
		}
	


