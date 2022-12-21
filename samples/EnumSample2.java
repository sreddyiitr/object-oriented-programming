


public class Main {
    public enum Direction {
      EAST ("East"),
      WEST ("West"),
      NORTH ("North"),
      SOUTH ("South");
	
      private final String name;
      
      // enum Constructor
      Direction(String name) {
        this.name = name;
      }

      public String getName() {
	      return name;
      }
    }
  
  public static void main(String[] args) {
    // Example #1
    Direction myDirection = Direction.NORTH;

    switch(myDirection) {
      case NORTH:
        System.out.println(myDirection.getName());
        break;
      case SOUTH:
         System.out.println(myDirection.getName());
        break;
      case EAST:
        System.out.println(myDirection.getName());
        break;
      case WEST:
        System.out.println(myDirection.getName());
        break;
    }
    // Example #2
    for(Direction direction : Direction.values()) {
	    System.out.println(direction + " " + direction.getName());
    }
  }
}
