
public class Main {
    
    public enum Direction {
    	EAST,
    	WEST,
    	NORTH,
    	SOUTH;
    }

  public static void main(String[] args) {
    // Example #1
    Direction myDirection = Direction.NORTH;

    switch(myDirection) {
      case NORTH:
        System.out.println("North");
        break;
      case SOUTH:
         System.out.println("South");
        break;
      case EAST:
        System.out.println("East");
        break;
      case WEST:
        System.out.println("West");
        break;
    }
    // Example #2
    for(Direction direction : Direction.values()) {
	    System.out.println(direction);
    }
  }
}
