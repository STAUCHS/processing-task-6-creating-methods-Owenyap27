import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(1200, 1200);
  }

  public void setup() {
    background(65, 105, 225); // Set the background color
  }

  public void draw() {
    // Check if a mouse button has been pressed
    if (TurnWhite(mousePressed)) {
      // Draw black houses and yellow stick figures when the mouse is pressed
      for (int intY = 100; intY < 750; intY += 300) {
        for (int intX = 50; intX < 1000; intX += 300) {
          drawHouse(intX, intY, 0, 0, 0); // Use black color for the house
          drawPerson(intX, intY, 20, 240, 230, 0); // Increase head size
        }
      }
    } else {
      // Draw houses and stick figures with dynamic colors when the mouse is not pressed
      for (int intY = 100; intY < 750; intY += 300) {
        for (int intX = 50; intX < 1000; intX += 300) {
          drawHouse(intX, intY, intX / 6 + intY / 8, intX / 2 + intY / 4, intX / 4 + intY / 2);
          drawPerson(intX, intY, 20, intX / 6 + intY / 8, intX / 2 + intY / 4, intX / 4 + intY / 2);
        }
      }
    }
  }

   /*
   * draws a house with width and height and colours with as well
   * @param intHouseX is the width of the house, roof, and door
   * @param intHouseY is the height for the house, roof, and door
   * @param intRed is the R value of the RGB code
   * @param intGreen is the G value of the RGB code
   * @param intBlue is the B value of the RGB code
   * Draws the house, roof, window, and door with the correct colour 
   * 
   */

  // Draw a house with specified color parameters
  public void drawHouse(int intHouseX, int intHouseY, int intRed, int intGreen, int intBlue) {
    // Body of the house
    stroke(0);
    fill(intRed, intGreen, intBlue);
    rect(intHouseX, intHouseY, 200, 190);

    // Roof of the house
    stroke(0);
    fill(255, 218, 185); // Change roof color
    triangle(intHouseX, intHouseY, intHouseX + 100, intHouseY - 100, intHouseX + 200, intHouseY);

    // Window
    fill(102, 204, 255); // Change window color
    ellipse(intHouseX + 100, intHouseY - 45, 50, 50);
    line(intHouseX + 125, intHouseY - 45, intHouseX + 75, intHouseY - 45);
    stroke(0);
    line(intHouseX + 100, intHouseY - 20, intHouseX + 100, intHouseY - 70);
    stroke(0);

    // Door and door handle
    fill(255, 102, 102); // Change door color
    rect(intHouseX + 55, intHouseY + 65, 90, 125);
    fill(0);
    ellipse(intHouseX + 130, intHouseY + 125, 10, 10);
  }

  /*
   * draws a person next to the house
   * @param intPresonX determines the x point of the person
   * @param intPersonY determines the y poitn of the person
   * @param intHead determines the location of the head and head size
   * intRed determiens the R in the RGB value
   * intGreen determines the G in the RGB value
   * intBlue determines the B in the RGB value
   * 
   */

  // Draw a stick figure with a specified head size and color parameters
  public void drawPerson(int intPersonX, int intPersonY, int intHead, int intRed, int intGreen, int intBlue) {
    // Head of the person
    noFill();
    stroke(intRed, intGreen, intBlue);
    ellipse(intPersonX + 225, intPersonY + 80, intHead, intHead); // Adjust head size

    // Draw the person's body, legs, and arms
    stroke(intRed, intGreen, intBlue);
    line(intPersonX + 225, intPersonY + 140, intPersonX + 225, intPersonY + 90);
    line(intPersonX + 225, intPersonY + 140, intPersonX + 240, intPersonY + 175);
    line(intPersonX + 225, intPersonY + 140, intPersonX + 210, intPersonY + 175);
    line(intPersonX + 225, intPersonY + 120, intPersonX + 240, intPersonY + 110);
    line(intPersonX + 225, intPersonY + 120, intPersonX + 210, intPersonY + 110);
  }

   /*
   * checks to see if a mouse input has been used
   * @param mousePressed sees if a mouse input has been used
   * @return true or false depending if the mouse was pressed down or not 
   */
  
  public boolean TurnWhite(boolean MousePressed) {

    // determines true or false
    if (mousePressed == true) {
      return true;
    }else {
      return false;
    }
  }


  // Calculate and return the x value for the center of the screen
  public float calculateCenterX(float objectWidth) {
    return (width - objectWidth) / 2;
  }
}