//Index Number: 19000987

object CaseClass{

    case class Point(a:Int, b:Int){
        def x:Int = a;
        def y:Int = b;

        // (1) Method to add two points
        def add() = this.x+this.y;

        // (2) Method to move points
        def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy);

        // (3) Method to get distence between two points
        def distance(c:Int, d:Int) = Point(this.x-c, this.y-d);

        // (4) Method to Switch x and y cordinates
        def invert() = Point(this.y,this.x);


        override def toString = "("+x+","+y+")"
    }

    def main (args: Array[String]){
        val p1 = new Point(1,4);
        val p2 = new Point(3,5);
        println("Point is : "+p1);
        
        val h = p1.add();
        println("Sum of Two points: "+h);

        val f = p2.move(2,1);
        println("New Point is: "+f);

        val g = p2.distance(2,4);
        println("Distance is: "+g);

        val i = p1.invert();
        println("Inverted x and y points: "+i);
    }
}