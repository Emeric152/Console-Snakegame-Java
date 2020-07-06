package me.emeric.console.snake.version1_0_0;

import java.awt.Point;
import java.util.Arrays;

/**
 * 
 * @author Emeric
 *
 * This project was created on :
 * @date 06.06.2020 
 * @time 15:55:20 
 * 
 * This project finished on :
 * @date 12.06.2020
 * 
 * Check about more projects under : 
 * https://github.com/emeric152 
 *
 */
public class Snake {
	
	private static int snakeIndex = 0;
	
	private static boolean whileLanguage = false;
	private static boolean whileChooseCheats = false;
	
	private static Point point;
	
	public static int coinCount = 0;
	
	public static String language;
	public static String chooseCheats;
	public static String cheats;
	
	public static boolean rich = false;
	public static boolean snakeMove = true;
	public static boolean cheatsInUse;
	public static boolean defaultMessage;
	public static boolean goldMessage;
	public static boolean helpMessage;
	public static boolean keypadMessage;
	public static boolean creditsMessage;
	public static boolean tpMessage;
	public static boolean coinMessage;
	public static boolean doorMessage;
	public static boolean snakeMessage;
	public static boolean coinMin;
	public static boolean snakeMoveCheat = true;
	
	public static Point playerPosition = new Point();
	public static Point goldPoisition = new Point();
	public static Point doorPosition = new Point();
	public static Point snakeHead = new Point();
	public static Point[] snakePosition = new Point[ 5 ];
	
	/**
	 * Start Program
	 */
	@SuppressWarnings("resource")
	private static void welcome() {
		
		Message.chooseLanguage();
		
		language = new java.util.Scanner( System.in ).next();
		
		while ( ! whileLanguage ) {
			
			if ( language.matches( "(?i)de|deutsch" ) ) {
			
				Message.germanLanguageChooseCheats();
				
				chooseCheats = new java.util.Scanner( System.in ).next();
				
				while ( ! whileChooseCheats ) {
					
					if ( chooseCheats.matches( "(?i)j|ja" ) ) {
						
						runSnake();
						
						return;		// while END
					}
					
					if ( chooseCheats.matches( "(?i)n|nein" ) ) {
						
						runSnake();
						
						return;		// while END
					}
					
					if ( ! chooseCheats.equalsIgnoreCase( "" ) ) {
						
						Message.germanCheatsChooseUnknow();
						
						chooseCheats = new java.util.Scanner( System.in ).next();
					}
				}
			}
			
			if ( language.matches( "(?i)en|english" ) ) {
				
				Message.englishLanguageChooseCheats();
				
				chooseCheats = new java.util.Scanner( System.in ).next();
				
				while ( ! whileChooseCheats ) {
					
					if ( chooseCheats.matches( "(?i)y|yes" ) ) {
						
						runSnake();
						
						return;		// while END
					}
						
					if ( chooseCheats.matches( "(?i)n|no" ) ) {
						
						runSnake();
						
						return;		// while END
					}
					
					if ( ! chooseCheats.equalsIgnoreCase( "" ) ) {
						
						Message.englishCheatsChooseUnknow();
						
						chooseCheats = new java.util.Scanner( System.in ).next();
					}
				}
			}
			
			if ( ! language.equalsIgnoreCase( "" ) ) {
				
				Message.unknowLanguage();
				
				language = new java.util.Scanner( System.in ).next();
			}
		}
	}
	
	private static void runSnake() {
		
		pointPosition();
		
		while ( true ) {
			
			goldPosition();
			
			snakeHead();
			
			matchField();
			
			keyPad();
			
			snakeMove();
			
			if ( rich && playerPosition.equals( doorPosition ) ) {
				
				matchField();
				
				return;		// while END	
			}
			
			if ( Arrays.asList( snakePosition ).contains( playerPosition ) ) {
				
				matchField();
				
				return;		// while END
			}
		}
	}
	
	private static void pointPosition() {
		
		
		playerPosition.setLocation( 10, 9 );
		
		goldPoisition.setLocation( 6, 6 );
		
		doorPosition.setLocation( 0, 5 );
		
		snakePosition[ snakeIndex ] = new Point();
		snakePosition[ snakeIndex ].setLocation( 30, 2 );
	}

	private static void goldPosition() {
		
		if ( playerPosition.equals( goldPoisition ) ) {
			
			goldMessage = true;
			
			coinCount += 1;
			
			if ( coinCount <= 4 ) {
				
				goldPoisition.setLocation( ( int ) ( Math.random() * 5 ), 
										   ( int ) ( Math.random() * 5 ) );
				
				if ( goldPoisition.equals( doorPosition ) ) {
					
					goldPoisition.setLocation( ( int ) ( Math.random() * 5 ),
											   ( int ) ( Math.random() * 5 ) );
				}
				
				else if ( goldPoisition.equals( playerPosition ) ) {
					
					goldPoisition.setLocation( ( int ) ( Math.random() * 5 ), 
											   ( int ) ( Math.random() * 5 ) );
				}
				
				else if ( Arrays.asList( snakePosition ).contains( goldPoisition ) ) {
					
					goldPoisition.setLocation( ( int ) ( Math.random() * 5 ),
											   ( int ) ( Math.random() * 5 ) );
				}
			}
			
			if ( coinCount == 4 ) {
				
				rich = true;
				
				goldPoisition.setLocation( -1, -1 );
			}
		}
	}
	
	private static void snakeHead() {
		
		snakeHead = new Point( snakePosition[ snakeIndex ].x,
				               snakePosition[ snakeIndex ].y );
		
		snakeLength();
	}
	
	private static void snakeLength() {
		
		snakeIndex = ( snakeIndex + 1 ) % snakePosition.length;
		
		snakePosition[ snakeIndex ] = snakeHead;
	}
	
	public static void matchField() {
		
		if ( defaultMessage == true ) {
			
			Message.germanChooseCheatsMessageDefault();
			Message.englishChooseCheatMessageDefault();
		}
		
		if ( defaultMessage == false ) {
				
			printMessage();
		}
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		for ( int y = 0; y < 10; y++ ) {
			
			System.out.print( "|" );
			
			for ( int x = 0; x < 40; x++ ) {
				
				point = new Point( x, y );
				
				if ( playerPosition.equals( point ) ) {
					System.out.print( 'P' );
				}
				
				else if ( goldPoisition.equals( point ) ) {
					System.out.print( '$' );
				}
				
				else if ( doorPosition.equals( point ) ) {
					System.out.print( 'D' );
				}
				
				else if ( snakeHead.equals( point ) ) {
					System.out.print( 'S' );
				}
				
				else if ( Arrays.asList( snakePosition ).contains( point ) ) {
					System.out.print( 's' );
				}
				
				else System.out.print( ' ' );
			}
			
			System.out.println( "|" );
		}
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
	}
	
	@SuppressWarnings("resource")
	private static void keyPad() {										
		
		if ( chooseCheats.matches( "(?i)y|yes|j|ja" ) ) {
			
			if ( snakeMoveCheat == true ) {
				
				System.out.print( "Keypad : " );
				
				switch ( cheats =  new java.util.Scanner( System.in ).nextLine() ) {
				case "w" : case "W" :
					defaultMessage = false;
					snakeMove = true;
					Message.stayDoor = false;
					playerPosition.y = Math.max( 0, playerPosition.y - 1 );
					break;
				case "s" : case "S" :
					defaultMessage = false;
					snakeMove = true;
					Message.stayDoor = false;
					playerPosition.y = Math.min( 9, playerPosition.y + 1 );
					break;
				case "a" : case "A" :
					defaultMessage = false;
					snakeMove = true;
					Message.stayDoor = false;
					playerPosition.x = Math.max( 0, playerPosition.x - 1 );
					break;
				case "d" : case "D" :
					defaultMessage = false;
					snakeMove = true;
					Message.stayDoor = false;
					playerPosition.x = Math.min( 39, playerPosition.x + 1 );
					break;
				case "-help" :
					defaultMessage = false;
					cheatsInUse = true;
					helpMessage = true;
					break;
				case "-keypad" :
					defaultMessage = false;
					cheatsInUse = true;
					keypadMessage = true;
					break;
				case "-credits" :
					defaultMessage = false;
					cheatsInUse = true;
					creditsMessage = true;
					break;
				case "-tp" : case "-tp door" : case "-tp snake" : case "-tp coin" :  
					defaultMessage = false;
					cheatsInUse = true;
					tpMessage = true;
					break;
				case "-coin" : case "-coin max" : case "-coin min" :
					defaultMessage = false;
					cheatsInUse = true;
					coinMessage = true;
					break;
				case "-door" : case "-door open" : case "-door close" :
					defaultMessage = false;
					cheatsInUse = true;
					doorMessage = true;
					break;
				case "-snake" : case "-snake move" : case "-snake stay" :
					defaultMessage = false;
					cheatsInUse = true;
					snakeMessage = true;
					break;
				default : 
					defaultMessage = true;
					snakeMove = false;
					break;
				}
				
				cheatList();
			}
			
			else if ( snakeMoveCheat == false ) {
				
				System.out.print( "Keypad : " );
				
				switch ( cheats =  new java.util.Scanner( System.in ).nextLine() ) {
				case "w" : case "W" :
					defaultMessage = false;
					snakeMove = false;
					Message.stayDoor = false;
					playerPosition.y = Math.max( 0, playerPosition.y - 1 );
					break;
				case "s" : case "S" :
					defaultMessage = false;
					snakeMove = false;
					Message.stayDoor = false;
					playerPosition.y = Math.min( 9, playerPosition.y + 1 );
					break;
				case "a" : case "A" :
					defaultMessage = false;
					snakeMove = false;
					Message.stayDoor = false;
					playerPosition.x = Math.max( 0, playerPosition.x - 1 );
					break;
				case "d" : case "D" :
					defaultMessage = false;
					snakeMove = false;
					Message.stayDoor = false;
					playerPosition.x = Math.min( 39, playerPosition.x + 1 );
					break;
				case "-help" :
					defaultMessage = false;
					cheatsInUse = true;
					helpMessage = true;
					break;
				case "-keypad" :
					defaultMessage = false;
					cheatsInUse = true;
					keypadMessage = true;
					break;
				case "-credits" :
					defaultMessage = false;
					cheatsInUse = true;
					creditsMessage = true;
					break;
				case "-tp" : case "-tp door" : case "-tp snake" : case "-tp coin" :  
					defaultMessage = false;
					cheatsInUse = true;
					tpMessage = true;
					break;
				case "-coin" : case "-coin max" : case "-coin min" :
					defaultMessage = false;
					cheatsInUse = true;
					coinMessage = true;
					break;
				case "-door" : case "-door open" : case "-door close" :
					defaultMessage = false;
					cheatsInUse = true;
					doorMessage = true;
					break;
				case "-snake" : case "-snake move" : case "-snake stay" :
					defaultMessage = false;
					cheatsInUse = true;
					snakeMessage = true;
					break;
				default : 
					defaultMessage = true;
					snakeMove = false;
					break;
				}
				
				cheatList();
			}
		}
		
		if ( chooseCheats.matches( "(?i)n|no|nein" ) ) {
			
			System.out.print( "Keypad : " );
			
			switch ( cheats = new java.util.Scanner( System.in ).nextLine() ) {
			case "w" : case "W" :
				defaultMessage = false;
				snakeMove = true;
				playerPosition.y = Math.max( 0, playerPosition.y - 1 );
				break;
			case "s" : case "S" :
				defaultMessage = false;
				snakeMove = true;
				playerPosition.y = Math.min( 9, playerPosition.y + 1 );
				break;
			case "a" : case "A" :
				defaultMessage = false;
				snakeMove = true;
				playerPosition.x = Math.max( 0, playerPosition.x - 1 );
				break;
			case "d" : case "D" :
				defaultMessage = false;
				snakeMove = true;
				playerPosition.x = Math.min( 39, playerPosition.x + 1 );
				break;
			case "-help" :
				defaultMessage = false;
				helpMessage = true;
				break;
			case "-keypad" :
				defaultMessage = false;
				keypadMessage = true;
				break;
			case "-credits" :
				defaultMessage = false;
				creditsMessage = true;
				break;
			default : 
				defaultMessage = true;
				snakeMove = false;
				break;
			}
		}
	}
	
	private static void snakeMove() {
		
		if ( snakeMove && playerPosition.y < snakeHead.y ) {
			snakeHead.y--;
		}
		
		if ( snakeMove && playerPosition.y > snakeHead.y ) {
			snakeHead.y++;
		}
		
		if ( snakeMove && playerPosition.x < snakeHead.x ) {
			snakeHead.x--;
		}
		
		if ( snakeMove && playerPosition.x > snakeHead.x ) {
			snakeHead.x++;
		}
	}

	private static void cheatList() {
		
		cheatTeleport();
		cheatCoin();
		cheatSnakeMove();
		cheatDoor();
		
	}
	
	private static void cheatTeleport() {
		
		if ( cheats.equalsIgnoreCase( "-tp door" ) ) {
			
			playerPosition.setLocation( doorPosition );
		}
		
		if ( cheats.equalsIgnoreCase( "-tp coin" ) ) {
			
			if ( rich == false ) {
				
				playerPosition.setLocation( goldPoisition );
			}
			
			if ( rich == true ) {
				
			}
		}
		
		if ( cheats.equalsIgnoreCase( "-tp snake" ) ) {
			
			playerPosition.setLocation( snakeHead );
		}
	}
	
	public static void cheatCoin() {
		
		if ( cheats.equalsIgnoreCase( "-coin max" ) ) {
				
			if ( coinCount == 0 ) {
					
				coinCount += 4;
				rich = true;
					
				goldPoisition.setLocation( -1, -1 );
			}
				
			else if ( coinCount == 1 ) {
					
				coinCount += 3;
				rich = true;
					
				goldPoisition.setLocation( -1, -1 );
			}
				
			else if ( coinCount == 2 ) {
					
				coinCount += 2;
				rich = true;
					
				goldPoisition.setLocation( -1, -1 );
			}
			
			else if ( coinCount == 3 ) {
					
				coinCount += 1;
				rich = true;
					
				goldPoisition.setLocation( -1, -1 );
				
			}
			
			else if ( coinCount == 4 ) {
				
				Message.coinMax = true;
				goldPoisition.setLocation( -1, -1 );
			}
		}
		
		if ( cheats.equalsIgnoreCase( "-coin min" ) ) {
			
			if ( coinCount == 4 ) {
			
				coinCount -= 4;
				rich = false;	
				coinMin = false;
			}
			
			else if ( coinCount == 3 ) {
				
				coinCount -= 3;
				rich = false;
				coinMin = false;
			}
			
			else if ( coinCount == 2 ) {
				
				coinCount -= 2;
				rich = false;
				coinMin = false;
			}
			
			else if ( coinCount == 1 ) {
				
				coinCount -= 1;
				rich = false;
				coinMin = true;
			}
			
			else if ( coinCount == 0 ) {
				
				rich = false;
				Message.coinMin = true;
			}
		}
	}
	
	private static void cheatSnakeMove() {
		
		if ( cheats.equalsIgnoreCase( "-snake move" ) ) {
			
			snakeMoveCheat = true;
		}
		
		if ( cheats.equalsIgnoreCase( "-snake stay" ) ) {
			
			snakeMoveCheat = false;
		}
	}
	
	private static void cheatDoor() {
		
		if ( cheats.equalsIgnoreCase( "-door open" ) ) {
			
			rich = true;
			coinCount = 4;
		}
		
		if ( cheats.equalsIgnoreCase( "-door close" ) ) {
			
			rich = false;
			
			if ( coinCount == 4 ) {
				
				coinCount = 3;
				
				goldPoisition.setLocation( ( int ) ( Math.random() * 5 ),
									       ( int ) ( Math.random() * 5 ) );
				
				//goldPoisition.x = ( int ) ( Math.random() * 5 );
				//goldPoisition.y = ( int ) ( Math.random() * 5 );
			}
		}
	}
	
	private static void printMessage() {
		
		if ( language.matches( "(?i)de|deutsch" ) ) {	
			
			if ( chooseCheats.matches( "(?i)n|nein" ) ) {
				
				Message.germanChooseCheatsNoMessage();
			}
			
			if ( chooseCheats.matches( "(?i)j|ja" ) ) {
				
					Message.germanChooseCheatsYesMessage();
				}
			}
		
		if ( language.matches( "(?i)en|english" ) ) {
				
			if ( chooseCheats.matches( "(?i)n|no" ) ) {
				
				Message.englishChooseCheatsNoMessage();
			}
				
			if ( chooseCheats.matches( "(?i)y|yes" ) ) {

				Message.englishChooseCheatsYesMessage();
			}
		}
	}
	
	public static void main( String[] args ) {
		
		welcome();
	}
}
