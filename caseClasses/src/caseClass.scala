object caseClass extends App{

  val p1 = Point(2,3)
  val p2 = Point(3,2)
  val p3 = p1+p2
  val p4 = p1.move(1,1)
  val p5 = p1.invert()

  println("Value of p1 = "+p1)
  println("Value of p2 = "+p2)
  println("----------------------------------")
  println("p1 + p2 = "+p3)
  println("\nValue of p1 when moved by (1,1) = "+p4)
  p1.distance(p2)
  println("\nValue of p1 when inverted = "+p5)

}

case class Point(x:Int, y:Int){

  def +(n:Point)=Point(this.x+n.x, this.y+n.y)
  def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)
  def distance(n:Point) = {
    val xDistance = this.x - n.x
    val yDistance = this.y - n.y
    println("\nDistances between the given points are:\n  "+xDistance+" in X coordinates and "+yDistance+" in Y coordinates")
  }
  def invert()= Point(this.y, this.x)

}
