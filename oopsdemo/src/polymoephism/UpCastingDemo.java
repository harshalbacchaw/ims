package polymoephism;

class Game
{
	public void play(){
        System.out.println("Game is being played");
        }
        
        public void noOfPlayers(){
        System.out.println("No of players depend upon the game");
        }
        
        public void winner(String name){
        System.out.println("Winner is : " + name);
        }
}

class Cricket extends Game{
    
public void noOfPlayers(){
System.out.println("22");
}

public void teams(){
System.out.println("2");
}
}

 class Chess extends Game{
    
     public void noOfPlayers(){
     System.out.println("2");
     }
     }


public class UpCastingDemo {

	public static void main(String[] args) {
		Game g1 = new Cricket();
		Game g2 = new Chess();
		
		//g1.teams();		will throw error because teams is not overridden from the game class 
		
		Cricket c = new Cricket();
		c.teams();
		g1.play();
		g1.noOfPlayers();
		g1.winner("harsh");
		
		Chess ch = new Chess();
		g2.play();
		g2.noOfPlayers();
		g2.winner("rushi");
		
		System.out.println("****************************");
	       
        Game g100;
       
        g100=new Cricket();  // upcasting
       
        g100.play();
        g100.noOfPlayers();
        g100.winner("DC");
       
        g100=new Chess();
        g100.play();
        g100.noOfPlayers();
        g100.winner("Vishwanthan Anannd");
        System.out.println("****************************");
        
        Test t1=new Test(100,200,300);					//variable is declaired in some other class but still accessible in here because it is default variable 
        System.out.println("Defaut Variable :"+t1.a);
	}

}
