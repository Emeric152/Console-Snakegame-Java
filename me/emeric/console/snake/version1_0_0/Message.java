package me.emeric.console.snake;

import java.util.Arrays;

public class Message {
	
	private static String whitespace = "|                                        |";

	private static boolean cheatMessageOutput;
	private static boolean cheatMessageOutputDefault = true;
	private static boolean doorEqualsTimeTwo;
	private static boolean snakeEqualsTimeTwoMove;
	private static boolean snakeEqualsTimeTwoStay;
	
	public static boolean coinMin;
	public static boolean coinMax;
	public static boolean stayDoor;
	
	/**
	 * Language MESSAGE
	 */
	public static void chooseLanguage() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "+" );
		
		System.out.print( "-" );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.print( whitespace );
		System.out.print( "x" );
		System.out.println( whitespace );
		System.out.print( "|   In welcher Sprache willst du das     |" );
		System.out.print( "x" );
		System.out.println( "|   In wich langugage do you want to     |" );
		System.out.print( "|   Spiel spielen ?                      |" );
		System.out.print( "x" );
		System.out.println( "|   play this game ?                     |" );
		System.out.print( whitespace );
		System.out.print( "x" );
		System.out.println( whitespace );
		System.out.print( "|   Type : DE or Deutsch                 |" );
		System.out.print( "x" );
		System.out.println( "|   Type : EN or English                 |" );
		System.out.print( "|   Zum setzen der Sprache auf Deutsch   |" );
		System.out.print( "x" );
		System.out.println( "|   To set the language on English       |" );
		System.out.print( whitespace );
		System.out.print( "x" );
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "+" );
		
		System.out.print( "-" );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
		System.out.print( "Sprache | Language : " );
	}
	
	public static void germanLanguageChooseCheats() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Herzlich Willkommen zu meinem        |" );
		System.out.println( "|   Snake - Game.                        |" );
		System.out.println( whitespace );
		System.out.println( "|   Willst du mit Cheats spielen ?       |" );
		System.out.println( whitespace );
		System.out.println( "|   Schreibe : j | ja  oder  n | nein    |" );
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
		System.out.print( "Tastatur : " );
		
	}
	
	public static void englishLanguageChooseCheats() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Welcome to my Snake - Game.          |" );
		System.out.println( whitespace );
		System.out.println( "|   Do you want to play with Cheats ?    |" );
		System.out.println( whitespace );
		System.out.println( "|   Type : y | yes  or  n | no           |" );
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
		System.out.print( "Keypad : " );
	}
	
	public static void unknowLanguage() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Verfuegbare Sprachen :               |" );
		System.out.println( "|   DE | EN | Deutsch | English          |" );
		System.out.println( whitespace );
		System.out.println( "|   Available languages :                |" );
		System.out.println( "|   DE | EN | Deutsch | English          |" );
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
		System.out.print( "Sprache | Language : " );
	}
	
	/**
	 * Choose Cheats Unknow MESSAGE
	 */
	public static void germanCheatsChooseUnknow() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Schreibe : j | ja  oder  n | nein    |" );
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
		System.out.print( "Tastatur : " );
		
	}

	public static void englishCheatsChooseUnknow() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Type : y | yes  oder  n | no         |" );
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
		System.out.print( "Keypad : " );
	}
	
	/**
	 * German MESSAGE
	 */
	public static void germanChooseCheatsNoMessage() {
		
		if ( Snake.rich == false ) {
			
			if ( Arrays.asList( Snake.snakePosition ).contains( Snake.playerPosition ) ) {
			
				germanFrameTop();
				System.out.println( "|   Die Schlange hat dich gebissen.      |" );
				frameBottom();
			}
			
			else if ( Snake.playerPosition.equals( Snake.doorPosition ) ) {
				
				stayDoor = true;
				
				germanFrameTop();
				System.out.println( "|   Sammle zuerst alle Muenzen.          |" );
				frameBottom();
			}
						
			else if ( Snake.goldMessage == true  ) {
				
				germanFrameTop();
				System.out.println( "|   Du hasst eine Muenze aufgesammelt.   |" );
				frameBottom();
				
				Snake.goldMessage = false;
				
			}
			
			else if ( Snake.helpMessage == true ) {
				
				frameTop();
				System.out.println( "|   -keypad   |  Tastenbelegung          |" );
				System.out.println( "|   -credits  |  Zeigt die Credits       |" );
				frameBottom();
				
				Snake.helpMessage = false;
			}
			
			else if ( Snake.keypadMessage == true ) {
				
				frameTop();
				System.out.println( "|   w   |   Bewege oben                  |" );
				System.out.println( "|   s   |   Bewege unten                 |" );
				System.out.println( "|   a   |   Bewege links                 |" );
				System.out.println( "|   d   |   Bewege rechts                |" );
				frameBottom();
				
				Snake.keypadMessage = false;
			}
			
			else if ( Snake.creditsMessage == true ) {
				
				frameTop();
				System.out.println( "|   Ersteller     :  Emeric              |" );
				System.out.println( "|   Version       :  1.17                |" );
				System.out.println( whitespace );
				System.out.println( "|   Start Projekt :  06.06.2020          |" );
				System.out.println( "|   End Projekt   :  12.06.2020          |" );
				System.out.println( whitespace);
				System.out.println( "|   Inspiration   :                      |" );
				System.out.println( "|   Ich habe das meiste aus dem Buch     |" );
				System.out.println( "|   Java ist auch nur eine Insel         |" );
				System.out.println( "|   gelernt.                             |" );
				frameBottom();
				
				Snake.creditsMessage = false;
			}
			
			else {
				
				germanFrameTop();
				System.out.println( "|   Sammle alle Muenzen ein.             |" );
				frameBottom();
			}
		}
		
		if ( Snake.rich == true ) {
			
			if ( Arrays.asList( Snake.snakePosition ).contains( Snake.playerPosition ) ) {
				
				germanFrameTop();
				System.out.println( "|   Die Schlange hat dich gebissen.      |" );
				frameBottom();
			}
			
			else if ( Snake.playerPosition.equals( Snake.doorPosition ) ) {
				
				germanFrameTop();
				System.out.println( "|   Gratulation du hasst gewonnen.       |" );
				frameBottom();
			}
			
			else if ( Snake.goldMessage == true ) {
				
				germanFrameTop();
				System.out.println( "|   Du hasst alle Muenzen gesammelt.     |" );
				frameBottom();
				
				Snake.goldMessage = false;
			}
			
			else if ( Snake.helpMessage == true ) {
				
				frameTop();
				System.out.println( "|   -keypad   |  Tastenbelegung          |" );
				System.out.println( "|   -credits  |  Zeigt die Credits       |" );
				frameBottom();
				
				Snake.helpMessage = false;
			}
			
			else if ( Snake.keypadMessage == true ) {
				
				frameTop();
				System.out.println( "|   w   |   Bewege oben                  |" );
				System.out.println( "|   s   |   Bewege unten                 |" );
				System.out.println( "|   a   |   Bewege links                 |" );
				System.out.println( "|   d   |   Bewege rechts                |" );
				frameBottom();
				
				Snake.keypadMessage = false;
			}
			
			else if ( Snake.creditsMessage == true ) {
				
				frameTop();
				System.out.println( "|   Ersteller     :  Emeric              |" );
				System.out.println( "|   Version       :  1.17                |" );
				System.out.println( whitespace );
				System.out.println( "|   Start Projekt :  01.06.2020          |" );
				System.out.println( "|   End Projekt   :                      |" );
				System.out.println( whitespace);
				System.out.println( "|   Inspiration   :                      |" );
				System.out.println( "|   Ich habe das meiste aus dem Buch     |" );
				System.out.println( "|   Java ist auch nur eine Insel         |" );
				System.out.println( "|   gelernt.                             |" );
				frameBottom();
				
				Snake.creditsMessage = false;
			}
			
			else {
			
				germanFrameTop();
				System.out.println( "|   Geh zu der Tuer.                     |" );
				frameBottom();
			}
		}
	}
	
	public static void germanChooseCheatsYesMessage() {
		
		if ( Snake.cheatsInUse == false ) {
				
			cheatMessageOutputDefault = true;		
			
			if ( cheatMessageOutputDefault == true ) {
				
				germanChooseCheatsNoMessage();	
			}
			
			if ( cheatMessageOutputDefault == false ) {
				
				germanChooseCheatsNoMessage();
			}
		}
		
		if ( Snake.cheatsInUse == true ) {
			
			if ( Snake.rich == false ) {
				
				if ( Snake.helpMessage == true ) {
					
					frameTop();
					System.out.println( "|   -keypad  |   Tastenbelegung          |" );
					System.out.println( "|   -credits |   Zeigt die Credits       |" );
					System.out.println( "|   -tp      |   Zeigt alle Befehle      |" );
					System.out.println( "|   -coin    |   Zeigt alle Befehle      |" );
					System.out.println( "|   -door    |   Zeigt alle Befehle      |" );
					System.out.println( "|   -snake   |   Zeigt alle Befehle      |" );
					frameBottom();
					
					Snake.helpMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.keypadMessage == true ) {
					
					frameTop();
					System.out.println( "|   w   |   Bewege oben                  |" );
					System.out.println( "|   s   |   Bewege unten                 |" );
					System.out.println( "|   a   |   Bewege links                 |" );
					System.out.println( "|   d   |   Bewege rechts                |" );
					frameBottom();
					
					Snake.keypadMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.creditsMessage == true ) {
					
					frameTop();
					System.out.println( "|   Ersteller     :  Emeric              |" );
					System.out.println( "|   Version       :  1.17                |" );
					System.out.println( whitespace );
					System.out.println( "|   Start Projekt :  06.06.2020          |" );
					System.out.println( "|   End Projekt   :  12.06.2020          |" );
					System.out.println( whitespace);
					System.out.println( "|   Inspiration   :                      |" );
					System.out.println( "|   Ich habe das meiste aus dem Buch     |" );
					System.out.println( "|   Java ist auch nur eine Insel         |" );
					System.out.println( "|   gelernt.                             |" );
					frameBottom();
					
					Snake.creditsMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.tpMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-tp" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Befehl : -tp < Wert >                |" );
						System.out.println( whitespace );
						System.out.println( "|   door   |  Teleportiert zur Tuer      |" );
						System.out.println( "|   coin   |  Teleportiert zur Muenze    |" );
						System.out.println( "|   snake  |  Teleportiert zur Schlange  |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -tp open                    |" );
						frameBottom();
						
						Snake.tpMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp door" ) ) {
						
						if ( stayDoor == false ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   Sammle zuerst alle Muenzen.          |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.tpMessage = false;
						}
						
						if ( stayDoor == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Du bist bereits auf der Tuere.       |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.tpMessage = false;
						}
						
						stayDoor = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp coin" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Du hasst eine Muenze aufgesammelt.   |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
						Snake.goldMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp snake" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Die Schlange hat dich gebissen.      |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
					}
				}
				
				else if ( Snake.coinMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-coin" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Befehl : -coin < Wert >              |" );
						System.out.println( whitespace );
						System.out.println( "|   max   |  Setzt die Coins auf 4       |" );
						System.out.println( "|   min   |  Setzt die Coins auf 0       |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -coin max                   |" );
						frameBottom();
						
						Snake.coinMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-coin max" ) ) {
						
						coinMax = false;
						
						if ( coinMax == false ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Du hasst dir Muenzen hinzugefuegt.   |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.coinMessage = false;
						
						}
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-coin min" ) ) {		// TODO : 
						
						coinMax = false;
						
						if ( coinMin == false ) {
						
							if ( Snake.coinMin == true ) {
								
								cheatMessageOutputDefault = false;
								cheatMessageOutput = true;
								
								germanFrameTop();
								System.out.println( "|   Du hasst dir die Muenze entfernt.    |" );
								frameBottom();
								
								cheatMessageOutputDefault = true;
								
								Snake.coinMessage = false;
							}
							
							else if ( Snake.coinMin == false ) {
							
								cheatMessageOutputDefault = false;
								cheatMessageOutput = true;
								
								germanFrameTop();
								System.out.println( "|   Du hasst dir die Muenzen entfernt.   |" );
								frameBottom();
								
								cheatMessageOutputDefault = true;
								
								Snake.coinMessage = false;
							}
						}
						
						else if ( coinMin == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Du hasst bereits keine Muenzen.      |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.coinMessage = false;
						}
					}
				}
				
				else if ( Snake.doorMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-door" ) ) {
						
						frameTop();
						System.out.println( "|   Befehl : -door < Wert >              |" );
						System.out.println( whitespace );
						System.out.println( "|   open   |  Oeffnet die Tuere          |" );
						System.out.println( "|   close  |  Schließt die Tuere         |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -door open                  |" );
						frameBottom();
						
						Snake.doorMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door open" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Du hasst die Tuere geoeffnet.        |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.doorMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door close" ) ) {
						
						coinMax = false;
						
						if ( doorEqualsTimeTwo == false ) {
						
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Die Tuere ist bereits geschlossen.   |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						if ( doorEqualsTimeTwo == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Du hasst die Tuere geschlossen.      |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						doorEqualsTimeTwo = false;
					}
				}
				
				else if ( Snake.snakeMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-snake" ) ) {
						
						frameTop();
						System.out.println( "|   Befehl : -snake < Wert >             |" );
						System.out.println( whitespace );
						System.out.println( "|   move   |  Schlange bewegt sich       |" );
						System.out.println( "|   stay   |  Schlange bleibt stehen     |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -snake move                 |" );
						frameBottom();
						
						Snake.snakeMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake move" ) ) {
						
						if ( snakeEqualsTimeTwoMove == true | Snake.snakeMove == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange bewegt sich bereits.    |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.snakeMessage = false;
						}
						
						else if ( snakeEqualsTimeTwoMove == false | Snake.snakeMove == false ) {
							
							Snake.snakeMove = true;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange kann sich nun bewegen.  |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoStay = false;
							
							Snake.snakeMessage = false;
						}
						
						snakeEqualsTimeTwoMove = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake stay" ) ) {
						
						if ( snakeEqualsTimeTwoStay == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange steht bereits.          |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
						
							Snake.snakeMessage = false;
						}
						
						if ( snakeEqualsTimeTwoStay == false ) {
						
							Snake.snakeMove = false;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange bleibt nun stehen.      |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoMove = false;
						
							Snake.snakeMessage = false;
							
						}
						
						snakeEqualsTimeTwoStay = true;
					}
				}
				
				else {
					
					germanChooseCheatsNoMessage();
				}
			}
			
			if ( Snake.rich == true ) {
				
				if ( Snake.helpMessage == true ) {
					
					frameTop();
					System.out.println( "|   -keypad  |   Tastenbelegung          |" );
					System.out.println( "|   -credits |   Zeigt die Credits       |" );
					System.out.println( "|   -tp      |   Zeigt alle Befehle      |" );
					System.out.println( "|   -coin    |   Zeigt alle Befehle      |" );
					System.out.println( "|   -door    |   Zeigt alle Befehle      |" );
					System.out.println( "|   -snake   |   Zeigt alle Befehle      |" );
					frameBottom();
					
					Snake.helpMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.keypadMessage == true ) {
					
					frameTop();
					System.out.println( "|   w   |   Bewegt oben                  |" );
					System.out.println( "|   s   |   Bewegt unten                 |" );
					System.out.println( "|   a   |   Bewegt links                 |" );
					System.out.println( "|   d   |   Bewegt rechts                |" );
					frameBottom();
					
					Snake.keypadMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.creditsMessage == true ) {
					
					frameTop();
					System.out.println( "|   Ersteller     :  Emeric              |" );
					System.out.println( "|   Version       :  1.17                |" );
					System.out.println( whitespace );
					System.out.println( "|   Start Projekt :  06.06.2020          |" );
					System.out.println( "|   End Projekt   :  12.06.2020          |" );
					System.out.println( whitespace );
					System.out.println( "|   Inspiration   :                      |" );
					System.out.println( "|   Ich habe das meiste aus dem Buch     |" );
					System.out.println( "|   Java ist auch nur eine Insel         |" );
					System.out.println( "|   gelernt.                             |" );
					frameBottom();
					
					Snake.creditsMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.tpMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-tp" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Befehl : -tp < Wert >                |" );
						System.out.println( whitespace );
						System.out.println( "|   door   |  Teleportiert zur Tuer      |" );
						System.out.println( "|   coin   |  Teleportiert zur Muenze    |" );
						System.out.println( "|   snake  |  Teleportiert zur Schlange  |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -tp open                    |" );
						frameBottom();
						
						Snake.tpMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp door" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Gratulation du hasst gewonnen.       |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp coin" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = false;
						
						germanFrameTop();
						System.out.println( "|   Es gibt keine Muenzen mehr.          |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
						Snake.goldMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp snake" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Die Schlange hat dich gebissen.      |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
					}	
				}
				
				else if ( Snake.coinMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-coin" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Befehl : -coin < Wert >              |" );
						System.out.println( whitespace );
						System.out.println( "|   max   |  Setzt die Coins auf 4       |" );
						System.out.println( "|   min   |  Setzt die Coins auf 0       |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -coin max                   |" );
						frameBottom();
						
						Snake.coinMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-coin max" ) ) {
						
						if ( coinMax == false ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
								
							germanFrameTop();
							System.out.println( "|   Du hasst dir Muenzen hinzugefuegt.   |" );
							frameBottom();
								
							cheatMessageOutputDefault = true;
							
							Snake.coinMessage = false;
						}
						
						if ( coinMax == true ) {
								
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
								
							germanFrameTop();
							System.out.println( "|   Du hasst schon alle Muenzen.         |" );
							frameBottom();
								
							cheatMessageOutputDefault = true;
							
							Snake.coinMessage = false;

						}
						
						coinMax = true;
					}
				}
				
				else if ( Snake.doorMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-door" ) ) {
						
						frameTop();
						System.out.println( "|   Befehl : -door < Wert >              |" );
						System.out.println( whitespace );
						System.out.println( "|   open   |  Oeffnet die Tuere          |" );
						System.out.println( "|   close  |  Schließt die Tuere         |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -door open                  |" );
						frameBottom();
						
						Snake.doorMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door open" ) ) {
						
						if ( doorEqualsTimeTwo == false ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   Du hasst die Tuere geoeffnet.        |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						else if ( doorEqualsTimeTwo == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Die Tuere ist bereits offen.         |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						doorEqualsTimeTwo = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door close" ) ) {
						
						doorEqualsTimeTwo = true;
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						germanFrameTop();
						System.out.println( "|   Du hasst die Tuere geschlossen.      |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.doorMessage = false;
					}
				}
				
				else if ( Snake.snakeMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-snake" ) ) {
						
						frameTop();
						System.out.println( "|   Befehl : -snake < Wert >             |" );
						System.out.println( whitespace );
						System.out.println( "|   move   |  Schlange bewegt sich       |" );
						System.out.println( "|   stay   |  Schlange bleibt stehen     |" );
						System.out.println( whitespace );
						System.out.println( "|   Beispiel :                           |" );
						System.out.println( "|   Keypad : -snake move                 |" );
						frameBottom();
						
						Snake.snakeMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake move" ) ) {
						
						if ( snakeEqualsTimeTwoMove == true | Snake.snakeMove == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange bewegt sich bereits.    |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.snakeMessage = false;
						}
						
						else if ( snakeEqualsTimeTwoMove == false | Snake.snakeMove == false ) {
							
							Snake.snakeMove = true;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange kann sich nun bewegen.  |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoStay = false;
							
							Snake.snakeMessage = false;
						}
						
						snakeEqualsTimeTwoMove = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake stay" ) ) {
						
						if ( snakeEqualsTimeTwoStay == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange steht bereits.          |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
						
							Snake.snakeMessage = false;
						}
						
						if ( snakeEqualsTimeTwoStay == false ) {
						
							Snake.snakeMove = false;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   Die Schlange bleibt nun stehen.      |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoMove = false;
						
							Snake.snakeMessage = false;
							
						}
						
						snakeEqualsTimeTwoStay = true;
					}
				}
				
				else {
					
					germanChooseCheatsNoMessage();
				}
			}
		}
	}
	
	public static void germanChooseCheatsMessageDefault() {
		
		if ( Snake.chooseCheats.matches( "(?i)j|ja" ) ) {
			
			germanFrameTop();
			System.out.println( "|   Diesen Befehl gibt es nicht.         |" );
			System.out.println( "|   Diese Taste hat keine Funktion.      |" );
			System.out.println( whitespace );
			System.out.println( "|   Schreibe : -help | Für mehr Infos.   |" );
			frameBottom();
		}
		
		if ( Snake.chooseCheats.matches( "(?i)n|nein" ) ) {
			
			germanFrameTop();
			System.out.println( "|   Diesen Befehl gibt es nicht.         |" );
			System.out.println( "|   Diese Taste hat keine Funktion.      |" );
			System.out.println( whitespace );
			System.out.println( "|   Schreibe : -help | Für mehr Infos.   |" );
			frameBottom();
		}
	}
	
	/**
	 * English MESSAGE
	 */
	public static void englishChooseCheatsNoMessage() {
		
		if ( Snake.rich == false ) {
			
			if ( Arrays.asList( Snake.snakePosition ).contains( Snake.playerPosition ) ) {
			
				englishFrameTop();
				System.out.println( "|   The snake bit you.                   |" );
				frameBottom();
			}
			
			else if ( Snake.playerPosition.equals( Snake.doorPosition ) ) {
				
				stayDoor = true;
				
				englishFrameTop();
				System.out.println( "|   Collect first all the coins.         |" );
				frameBottom();
			}
						
			else if ( Snake.goldMessage == true  ) {
				
				englishFrameTop();
				System.out.println( "|   You collected a coin.                |" );
				frameBottom();
				
				Snake.goldMessage = false;
				
			}
			
			else if ( Snake.helpMessage == true ) {
				
				frameTop();
				System.out.println( "|   -keypad   |  key assignment          |" );
				System.out.println( "|   -credits  |  Show the credits        |" );
				frameBottom();
				
				Snake.helpMessage = false;
			}
			
			else if ( Snake.keypadMessage == true ) {
				
				frameTop();
				System.out.println( "|   w   |   Move up                      |" );
				System.out.println( "|   s   |   Move down                    |" );
				System.out.println( "|   a   |   Move left                    |" );
				System.out.println( "|   d   |   Move right                   |" );
				frameBottom();
				
				Snake.keypadMessage = false;
			}
			
			else if ( Snake.creditsMessage == true ) {
				
				frameTop();
				System.out.println( "|   Creator       :  Emeric              |" );
				System.out.println( "|   Version       :  1.17                |" );
				System.out.println( whitespace );
				System.out.println( "|   Start Projekt :  06.06.2020          |" );
				System.out.println( "|   End Projekt   :  12.06.2020          |" );
				System.out.println( whitespace);
				System.out.println( "|   Inspiration   :                      |" );
				System.out.println( "|   I have learned the most of the book  |" );
				System.out.println( "|   Java ist auch nur eine Insel         |" );
				frameBottom();
				
				Snake.creditsMessage = false;
			}
			
			else {
				
				englishFrameTop();
				System.out.println( "|   Collect all the coins.               |" );
				frameBottom();
			}
		}
		
		if ( Snake.rich == true ) {
			
			if ( Arrays.asList( Snake.snakePosition ).contains( Snake.playerPosition ) ) {
				
				englishFrameTop();
				System.out.println( "|   The snake bit you.                   |" );
				frameBottom();
			}
			
			else if ( Snake.playerPosition.equals( Snake.doorPosition ) ) {
				
				englishFrameTop();
				System.out.println( "|   Congratulation you win.              |" );
				frameBottom();
			}
			
			else if ( Snake.goldMessage == true ) {
				
				englishFrameTop();
				System.out.println( "|   You collected all the coins.         |" );
				frameBottom();
				
				Snake.goldMessage = false;
			}
			
			else if ( Snake.helpMessage == true ) {
				
				frameTop();
				System.out.println( "|   -keypad   |  Key assignment          |" );
				System.out.println( "|   -credits  |  Show the credits        |" );
				frameBottom();
				
				Snake.helpMessage = false;
			}
			
			else if ( Snake.keypadMessage == true ) {
				
				frameTop();
				System.out.println( "|   w   |   Move up                      |" );
				System.out.println( "|   s   |   Move down                    |" );
				System.out.println( "|   a   |   Move left                    |" );
				System.out.println( "|   d   |   Move right                   |" );
				frameBottom();
				
				Snake.keypadMessage = false;
			}
			
			else if ( Snake.creditsMessage == true ) {
				
				frameTop();
				System.out.println( "|   Creator       :  Emeric              |" );
				System.out.println( "|   Version       :  1.17                |" );
				System.out.println( whitespace );
				System.out.println( "|   Start Projekt :  01.06.2020          |" );
				System.out.println( "|   End Projekt   :                      |" );
				System.out.println( whitespace);
				System.out.println( "|   Inspiration   :                      |" );
				System.out.println( "|   I have learned the most of the book  |" );
				System.out.println( "|   Java ist auch nur eine Insel         |" );
				frameBottom();
				
				Snake.creditsMessage = false;
			}
			
			else {
			
				englishFrameTop();
				System.out.println( "|   Go to the door.                      |" );
				frameBottom();
			}
		}
	}
	
	public static void englishChooseCheatsYesMessage() {
		
		if ( Snake.cheatsInUse == false ) {
				
			cheatMessageOutputDefault = true;		
			
			if ( cheatMessageOutputDefault == true ) {
				
				englishChooseCheatsNoMessage();	
			}
			
			if ( cheatMessageOutputDefault == false ) {
				
				englishChooseCheatsNoMessage();
			}
		}
		
		if ( Snake.cheatsInUse == true ) {
			
			if ( Snake.rich == false ) {
				
				if ( Snake.helpMessage == true ) {
					
					frameTop();
					System.out.println( "|   -keypad  |   Key assignment          |" );
					System.out.println( "|   -credits |   Show the credits        |" );
					System.out.println( "|   -tp      |   Show all the commands   |" );
					System.out.println( "|   -coin    |   Show all the commands   |" );
					System.out.println( "|   -door    |   Show all the commands   |" );
					System.out.println( "|   -snake   |   Show all the commands   |" );
					frameBottom();
					
					Snake.helpMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.keypadMessage == true ) {
					
					frameTop();
					System.out.println( "|   w   |   Move up                      |" );
					System.out.println( "|   s   |   Move down                    |" );
					System.out.println( "|   a   |   Move left                    |" );
					System.out.println( "|   d   |   Move right                   |" );
					frameBottom();
					
					Snake.keypadMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.creditsMessage == true ) {
					
					frameTop();
					System.out.println( "|   Creator       :  Emeric              |" );
					System.out.println( "|   Version       :  1.17                |" );
					System.out.println( whitespace );
					System.out.println( "|   Start Projekt :  06.06.2020          |" );
					System.out.println( "|   End Projekt   :  12.06.2020          |" );
					System.out.println( whitespace);
					System.out.println( "|   Inspiration   :                      |" );
					System.out.println( "|   I have learned the most of the book  |" );
					System.out.println( "|   Java ist auch nur eine Insel         |" );
					frameBottom();
					
					Snake.creditsMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.tpMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-tp" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Command : -tp < Value >              |" );
						System.out.println( whitespace );
						System.out.println( "|   door   |  Teleport to the door       |" );
						System.out.println( "|   coin   |  Teleport to the coin       |" );
						System.out.println( "|   snake  |  Teleport to the snake      |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -tp open                    |" );
						frameBottom();
						
						Snake.tpMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp door" ) ) {
						
						if ( stayDoor == false ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							englishFrameTop();
							System.out.println( "|   Collect the first all the coins.     |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.tpMessage = false;
						}
						
						if ( stayDoor == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   You are already on the door.         |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.tpMessage = false;
						}
						
						stayDoor = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp coin" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						englishFrameTop();
						System.out.println( "|   You collected a coin.                |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
						Snake.goldMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp snake" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						englishFrameTop();
						System.out.println( "|   The snake bit you.                   |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
					}
				}
				
				else if ( Snake.coinMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-coin" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Command : -coin < Value >            |" );
						System.out.println( whitespace );
						System.out.println( "|   max   |  Set the coins to 4          |" );
						System.out.println( "|   min   |  Set the coins to 0          |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -coin max                   |" );
						frameBottom();
						
						Snake.coinMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-coin min" ) ) {
						
						coinMax = false;
						
						if ( coinMin == false ) {
						
							if ( Snake.coinMin == true ) {
								
								cheatMessageOutputDefault = false;
								cheatMessageOutput = true;
								
								englishFrameTop();
								System.out.println( "|   You removed a coin.                  |" );
								frameBottom();
								
								cheatMessageOutputDefault = true;
								
								Snake.coinMessage = false;
							}
							
							else if ( Snake.coinMin == false ) {
							
								cheatMessageOutputDefault = false;
								cheatMessageOutput = true;
								
								englishFrameTop();
								System.out.println( "|   You removed some coins.              |" );
								frameBottom();
								
								cheatMessageOutputDefault = true;
								
								Snake.coinMessage = false;
							}
						}
						
						else if ( coinMin == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   You already don't have coins.        |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.coinMessage = false;
						}
					}
				}
				
				else if ( Snake.doorMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-door" ) ) {
						
						frameTop();
						System.out.println( "|   Command : -door < Value >            |" );
						System.out.println( whitespace );
						System.out.println( "|   open   |  Open the door              |" );
						System.out.println( "|   close  |  Close the door             |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -door open                  |" );
						frameBottom();
						
						Snake.doorMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door open" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						englishFrameTop();
						System.out.println( "|   You opened the door.                 |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.doorMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door close" ) ) {
						
						coinMax = false;
						
						if ( doorEqualsTimeTwo == false ) {
						
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   The door is already closed.          |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						if ( doorEqualsTimeTwo == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   You closed the door.                 |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						doorEqualsTimeTwo = false;
					}
				}
				
				else if ( Snake.snakeMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-snake" ) ) {
						
						frameTop();
						System.out.println( "|   Command : -snake < Value >           |" );
						System.out.println( whitespace );
						System.out.println( "|   move   |  Snake move                 |" );
						System.out.println( "|   stay   |  Snake stay                 |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -snake move                 |" );
						frameBottom();
						
						Snake.snakeMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake move" ) ) {
						
						if ( snakeEqualsTimeTwoMove == true | Snake.snakeMove == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   The snake already move.              |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.snakeMessage = false;
						}
						
						else if ( snakeEqualsTimeTwoMove == false | Snake.snakeMove == false ) {
							
							Snake.snakeMove = true;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							englishFrameTop();
							System.out.println( "|   The snake can now move.              |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoStay = false;
							
							Snake.snakeMessage = false;
						}
						
						snakeEqualsTimeTwoMove = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake stay" ) ) {
						
						if ( snakeEqualsTimeTwoStay == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   The snake already stay.              |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
						
							Snake.snakeMessage = false;
						}
						
						if ( snakeEqualsTimeTwoStay == false ) {
						
							Snake.snakeMove = false;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							englishFrameTop();
							System.out.println( "|   The snake stay now.                  |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoMove = false;
						
							Snake.snakeMessage = false;
							
						}
						
						snakeEqualsTimeTwoStay = true;
					}
				}
				
				else {
					
					englishChooseCheatsNoMessage();
				}
			}
			
			if ( Snake.rich == true ) {
				
				if ( Snake.helpMessage == true ) {
					
					frameTop();
					System.out.println( "|   -keypad  |   Tastenbelegung          |" );
					System.out.println( "|   -credits |   Show the credits.       |" );
					System.out.println( "|   -tp      |   Show all commands.      |" );
					System.out.println( "|   -coin    |   Show all commands.      |" );
					System.out.println( "|   -door    |   Show all commands.      |" );
					System.out.println( "|   -snake   |   Show all commands.      |" );
					frameBottom();
					
					Snake.helpMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.keypadMessage == true ) {
					
					frameTop();
					System.out.println( "|   w   |   Move up                      |" );
					System.out.println( "|   s   |   Move down                    |" );
					System.out.println( "|   a   |   Move left                    |" );
					System.out.println( "|   d   |   Move right                   |" );
					frameBottom();
					
					Snake.keypadMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.creditsMessage == true ) {
					
					frameTop();
					System.out.println( "|   Creator       :  Emeric              |" );
					System.out.println( "|   Version       :  1.17                |" );
					System.out.println( whitespace );
					System.out.println( "|   Start Projekt :  06.06.2020          |" );
					System.out.println( "|   End Projekt   :  12.06.2020          |" );
					System.out.println( whitespace );
					System.out.println( "|   Inspiration   :                      |" );
					System.out.println( "|   I have learned the most of the book  |" );
					System.out.println( "|   Java ist auch nur eine Insel         |" );
					frameBottom();
					
					Snake.creditsMessage = false;
					Snake.cheatsInUse = false;
				}
				
				else if ( Snake.tpMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-tp" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Command : -tp < Value >              |" );
						System.out.println( whitespace );
						System.out.println( "|   door   |  Teleport to the door       |" );
						System.out.println( "|   coin   |  Teleport to the coin       |" );
						System.out.println( "|   snake  |  Teleport to the snake      |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -tp open                    |" );
						frameBottom();
						
						Snake.tpMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp door" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						englishFrameTop();
						System.out.println( "|   Congratulation you win.              |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp coin" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = false;
						
						englishFrameTop();
						System.out.println( "|   There are no more coins.             |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
						Snake.goldMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-tp snake" ) ) {
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						englishFrameTop();
						System.out.println( "|   The snake bit you.                   |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.tpMessage = false;
					}	
				}
				
				else if ( Snake.coinMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-coin" ) ) {
						
						cheatMessageOutputDefault = true;
						
						frameTop();
						System.out.println( "|   Command : -coin < Value >            |" );
						System.out.println( whitespace );
						System.out.println( "|   max   |  Set the coins to 4          |" );
						System.out.println( "|   min   |  Set the coins to 0          |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -coin max                   |" );
						frameBottom();
						
						Snake.coinMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-coin max" ) ) {
						
						if ( coinMax == false ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
								
							englishFrameTop();
							System.out.println( "|   You added some coins.                |" );
							frameBottom();
								
							cheatMessageOutputDefault = true;
							
							Snake.coinMessage = false;
						}
						
						if ( coinMax == true ) {
								
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
								
							englishFrameTop();
							System.out.println( "|   You already have all the coins.      |" );
							frameBottom();
								
							cheatMessageOutputDefault = true;
							
							Snake.coinMessage = false;

						}
						
						coinMax = true;
					}
				}
				
				else if ( Snake.doorMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-door" ) ) {
						
						frameTop();
						System.out.println( "|   Command : -door < Value >            |" );
						System.out.println( whitespace );
						System.out.println( "|   open   |  Open the door              |" );
						System.out.println( "|   close  |  Close the door             |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -door open                  |" );
						frameBottom();
						
						Snake.doorMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door open" ) ) {
						
						if ( doorEqualsTimeTwo == false ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							englishFrameTop();
							System.out.println( "|   You opened the door.                 |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						else if ( doorEqualsTimeTwo == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   The door is already open.            |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.doorMessage = false;
						}
						
						doorEqualsTimeTwo = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-door close" ) ) {
						
						doorEqualsTimeTwo = true;
						
						cheatMessageOutputDefault = false;
						cheatMessageOutput = true;
						
						englishFrameTop();
						System.out.println( "|   You closed the door.                 |" );
						frameBottom();
						
						cheatMessageOutputDefault = true;
						
						Snake.doorMessage = false;
					}
				}
				
				else if ( Snake.snakeMessage == true ) {
					
					if ( Snake.cheats.equalsIgnoreCase( "-snake" ) ) {
						
						frameTop();
						System.out.println( "|   Command : -snake < Value >           |" );
						System.out.println( whitespace );
						System.out.println( "|   move   |  Snake move                 |" );
						System.out.println( "|   stay   |  Snake stay                 |" );
						System.out.println( whitespace );
						System.out.println( "|   Example :                            |" );
						System.out.println( "|   Keypad : -snake move                 |" );
						frameBottom();
						
						Snake.snakeMessage = false;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake move" ) ) {
						
						if ( snakeEqualsTimeTwoMove == true | Snake.snakeMove == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							englishFrameTop();
							System.out.println( "|   The snake already move.              |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							
							Snake.snakeMessage = false;
						}
						
						else if ( snakeEqualsTimeTwoMove == false | Snake.snakeMove == false ) {
							
							Snake.snakeMove = true;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							englishFrameTop();
							System.out.println( "|   The snake can now move.              |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoStay = false;
							
							Snake.snakeMessage = false;
						}
						
						snakeEqualsTimeTwoMove = true;
					}
					
					else if ( Snake.cheats.equalsIgnoreCase( "-snake stay" ) ) {
						
						if ( snakeEqualsTimeTwoStay == true ) {
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = false;
							
							germanFrameTop();
							System.out.println( "|   The snake already stay.              |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
						
							Snake.snakeMessage = false;
						}
						
						if ( snakeEqualsTimeTwoStay == false ) {
						
							Snake.snakeMove = false;
							
							cheatMessageOutputDefault = false;
							cheatMessageOutput = true;
							
							germanFrameTop();
							System.out.println( "|   The snake stay now.                  |" );
							frameBottom();
							
							cheatMessageOutputDefault = true;
							snakeEqualsTimeTwoMove = false;
						
							Snake.snakeMessage = false;
							
						}
						
						snakeEqualsTimeTwoStay = true;
					}
				}
				
				else {
					
					englishChooseCheatsNoMessage();
				}
			}
		}
	}

	public static void englishChooseCheatMessageDefault() {
		
		if ( Snake.chooseCheats.matches( "(?i)y|yes" ) ) {
			
			englishFrameTop();
			System.out.println( "|   This command does not exist.         |" );
			System.out.println( "|   This key has no function.            |" );
			System.out.println( whitespace );
			System.out.println( "|   Type : -help | For more information  |" );
			frameBottom();
		}
		
		if ( Snake.chooseCheats.matches( "(?i)n|no" ) ) {
			
			englishFrameTop();
			System.out.println( "|   This command does not exist.         |" );
			System.out.println( "|   This key has no function.            |" );
			System.out.println( whitespace );
			System.out.println( "|   Type : -help | For more information  |" );
			frameBottom();
		}
	}

	/**
	 * Shortened Codes MESSAGE
	 */
	public static void column() {
		
		for ( int column = 0; column < 25; column++ ) {
			System.out.println();
		}
	}

	private static void germanFrameTop() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Muenzen       : " + Snake.coinCount + " / 4                |" );
		
		if ( Snake.rich == true ) {
			
			System.out.println( "|   Tuere ist     : Offen                |" );
			
			if ( Snake.chooseCheats.matches( "(?i)n|nein" ) ) {
				
				if ( Snake.snakeMove == true ) {
					
					System.out.println( "|   Schlange      : Bewegt sich          |" );
					System.out.println( whitespace );
					System.out.println( "|   NACHRICHT     :                      |" );
				}
				
				else if ( Snake.snakeMove == false ) {
					
					System.out.println( "|   Schlange      : Steht                |" );
					System.out.println( whitespace );
					System.out.println( "|   NACHRICHT     :                      |" );
				}
			}
			
			if ( Snake.chooseCheats.matches( "(?i)j|ja" ) ) {
				
				if ( cheatMessageOutputDefault == true ) {
					
					if ( Snake.snakeMove == true ) {
						
						System.out.println( "|   Schlange      : Bewegt sich          |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   NACHRICHT     :                      |" );;
					}
					
					else if ( Snake.snakeMove == false ) {
						
						System.out.println( "|   Schlange      : Steht                |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   NACHRICHT     :                      |" );
					}
				}
				
				if ( cheatMessageOutputDefault == false ) {
					
					if ( cheatMessageOutput == false ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Schlange      : Bewegt sich          |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Fehlgeschlagen       |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Schlange      : Steht                |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Fehlgeschlagen       |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );
						}
					}
					
					if ( cheatMessageOutput == true ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Schlange      : Bewegt sich          |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Erfolgreich          |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Schlange      : Steht                |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Erfolgreich          |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );
						}
					}
				}
			}
		}
		
		else if ( Snake.rich == false ) {
			
			System.out.println( "|   Tuere ist     : Geschlossen          |" );
			
			if ( Snake.chooseCheats.matches( "(?i)n|nein" ) ) {
					
				if ( Snake.snakeMove == true ) {
					
					System.out.println( "|   Schlange      : Bewegt sich          |" );
					System.out.println( whitespace );
					System.out.println( "|   NACHRICHT     :                      |" );;
				}
					
				else if ( Snake.snakeMove == false ) {
						
					System.out.println( "|   Schlange      : Steht                |" );
					System.out.println( whitespace );
					System.out.println( "|   NACHRICHT     :                      |" );
					
				}
			}
			
			if ( Snake.chooseCheats.matches( "(?i)j|ja" ) ) {
				
				if ( cheatMessageOutputDefault == true ) {
					
					if ( Snake.snakeMove == true ) {
						
						System.out.println( "|   Schlange      : Bewegt sich          |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   NACHRICHT     :                      |" );;
					}
					
					else if ( Snake.snakeMove == false ) {
						
						System.out.println( "|   Schlange      : Steht                |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   NACHRICHT     :                      |" );
					}
				}
				
				if ( cheatMessageOutputDefault == false ) {
					
					if ( cheatMessageOutput == false ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Schlange      : Bewegt sich          |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Fehlgeschlagen       |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Schlange      : Steht                |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Fehlgeschlagen       |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );
						}
					}
					
					if ( cheatMessageOutput == true ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Schlange      : Bewegt sich          |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Erfolgreich          |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Schlange      : Steht                |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Erfolgreich          |" );
							System.out.println( whitespace );
							System.out.println( "|   NACHRICHT     :                      |" );
						}
					}
				}
			}
		}
	}
	
	private static void englishFrameTop() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
		System.out.println( "|   Coins         : " + Snake.coinCount + " / 4                |" );
		
		if ( Snake.rich == true ) {
			
			System.out.println( "|   Door is       : Open                 |" );
			
			if ( Snake.chooseCheats.matches( "(?i)n|no" ) ) {
				
				if ( Snake.snakeMove == true ) {
					
					System.out.println( "|   Snake         : Move                 |" );
					System.out.println( whitespace );
					System.out.println( "|   MESSAGE       :                      |" );
				}
				
				else if ( Snake.snakeMove == false ) {
					
					System.out.println( "|   Snake         : Stay                 |" );
					System.out.println( whitespace );
					System.out.println( "|   MESSAGE       :                      |" );
				}
			}
			
			if ( Snake.chooseCheats.matches( "(?i)y|yes" ) ) {
				
				if ( cheatMessageOutputDefault == true ) {
					
					if ( Snake.snakeMove == true ) {
						
						System.out.println( "|   Snake         : Move                 |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   MESSAGE       :                      |" );;
					}
					
					else if ( Snake.snakeMove == false ) {
						
						System.out.println( "|   Snake         : Stay                 |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   MESSAGE       :                      |" );
					}
				}
				
				if ( cheatMessageOutputDefault == false ) {
					
					if ( cheatMessageOutput == false ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Snake         : Move                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Unsuccessful         |" );		
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Snake         : Stay                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Unsuccessful         |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );
						}
					}
					
					if ( cheatMessageOutput == true ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Snake         : Move                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Successful           |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Snake         : Stay                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Successful           |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );
						}
					}
				}
			}
		}
		
		else if ( Snake.rich == false ) {
			
			System.out.println( "|   Door is       : Closed               |" );
			
			if ( Snake.chooseCheats.matches( "(?i)n|no" ) ) {
					
				if ( Snake.snakeMove == true ) {
					
					System.out.println( "|   Snake         : Move                 |" );
					System.out.println( whitespace );
					System.out.println( "|   MESSAGE       :                      |" );;
				}
					
				else if ( Snake.snakeMove == false ) {
						
					System.out.println( "|   Snake         : Stay                 |" );
					System.out.println( whitespace );
					System.out.println( "|   MESSAGE       :                      |" );
					
				}
			}
			
			if ( Snake.chooseCheats.matches( "(?i)y|yes" ) ) {
				
				if ( cheatMessageOutputDefault == true ) {
					
					if ( Snake.snakeMove == true ) {
						
						System.out.println( "|   Snake         : Move                 |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   MESSAGE       :                      |" );;
					}
					
					else if ( Snake.snakeMove == false ) {
						
						System.out.println( "|   Snake         : Stay                 |" );
						System.out.println( whitespace );
						System.out.println( "|   Cheat         :                      |" );
						System.out.println( whitespace );
						System.out.println( "|   MESSAGE       :                      |" );
					}
				}
				
				if ( cheatMessageOutputDefault == false ) {
					
					if ( cheatMessageOutput == false ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Snake         : Move                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Unsuccessful         |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Snake         : Stay                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Unsuccessful         |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );
						}
					}
					
					if ( cheatMessageOutput == true ) {
						
						if ( Snake.snakeMove == true ) {
							
							System.out.println( "|   Snake         : Move                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Successful           |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );;
						}
						
						else if ( Snake.snakeMove == false ) {
							
							System.out.println( "|   Snake         : Stay                 |" );
							System.out.println( whitespace );
							System.out.println( "|   Cheat         : Successful           |" );
							System.out.println( whitespace );
							System.out.println( "|   MESSAGE       :                      |" );
						}
					}
				}
			}
		}
	}
	
	private static void frameTop() {
		
		column();
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 14; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.print( "[ Console ]" );
		
		for ( int line = 0; line < 15; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println( whitespace );
	}
	
	private static void frameBottom() {
		
		System.out.println( whitespace );
		
		System.out.print( "+" );
		
		for ( int line = 0; line < 40; line++ ) {
			System.out.print( "-" );
		}
		
		System.out.println( "+" );
		
		System.out.println();
		
	}
}
