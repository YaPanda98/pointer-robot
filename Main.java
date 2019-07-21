
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot myRobot = new Robot ("Vasya","toWork","red");
System.out.println("I am robot" + myRobot.name+"and mycolor is " +myRobot.color);
Robot myCoffeeRobot = new CoffeeRobot("Bob","MakeCoffee","gray");
Robot myRobotDancer = new RobotDancer("Ron","toDance", "blue",12);
Robot myRobotCook = new RobotCook("Simon", "toCook","violet");

myRobot.work();
myCoffeeRobot.work();
myRobotDancer.work();
myRobotCook.work();
}
}
