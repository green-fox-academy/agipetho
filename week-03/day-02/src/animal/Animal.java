/*Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one
 */

package animal;

public class Animal {
  int hungerValue;
  int thirstValue;

  public Animal() {
    this.hungerValue = 50;
    this.thirstValue = 50;
  }

  /*
    public Animal(int hungerValue, int thirstValue){
      this.hungerValue = hungerValue;
      this.thirstValue = thirstValue;
    }
  */
  public void eat() {
    hungerValue -= 1;
  }

  public void drink() {
    thirstValue -= 1;
  }

  public void play() {
    hungerValue += 1;
    thirstValue += 1;
  }

}
