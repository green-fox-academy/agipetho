/*Post-it
    Create a PostIt class that has
    a backgroundColor
    a text on it
    a textColor

    Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"

*/

package postit;

import java.awt.*;

public class PostIt {

  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt(Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;

    //setTheBackground(backgroundColor);
    //setTheText(text);
    //setTheTextColor(textColor);

  }
}
