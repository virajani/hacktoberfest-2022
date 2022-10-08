
package practicalalgorithms;

/**
 *
 * @author Pasan Yasara
 */
import java.util.*; 
import java.io.*;

class Brackets {

  public static String BracketMatcher(String str) {
    // code goes here  
    Stack stk = new Stack();
    for(int i=0; i<str.length(); i++)
    {
      if(str.charAt(i)=='(')
      {
        stk.push('(');
          System.out.println(stk);
      }
      else if(str.charAt(i)==')')
      {
        if(stk.isEmpty())
        {
            return "0";
        }
        else
        {
            stk.pop();
            System.out.println(stk);
        }
      }
    }
    
    if(stk.isEmpty())
    {
        return "0";
    }
    else
    {
        return "1";
    }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s.nextLine())); 
  }

}
