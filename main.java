import java.util.HashMap;
/*
@description:
Class for balls
*/

public class Ball 
{
  //data members
  static HashMap<String, Ball> colors = new HashMap<String, Ball>();
  String color;
  int bounces;
  int rolls;
  /*
  @description: constructor for balls
  @param string name of ball
  @return none
  */
  private Ball( String c )
  {
    color = c;
    bounces = 0;
    rolls = 0;
    
  }

  /*
  @description: checks if ball is already in hashmap
  @param string name of ball
  @return returns the ball
  */
  public static Ball getInstance( String c )
  {
    if ( colors.get(c) != null)
    {
      return colors.get(c);
      
    }
    Ball newBall = new Ball(c);
    colors.put(c, newBall);
    return newBall;
  }

  /*
  @description: bounces ball
  @param none
  @return none
  */
  public void bounce()
  {
    bounces += 1;
  }

  /*
  @description: rolls ball
  @param none
  @return none
  */
  public void roll()
  {
    rolls += 1;
  }

  /*
  @description: rolls ball
  @param none
  @return none
  */
  @Override
  public String toString()
  {
    return this.color + " Ball :\r\n" + "--------\r\n" + "Bounces: " + bounces + "\r\nRolls: " + rolls;
  }
}
