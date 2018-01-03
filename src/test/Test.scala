package test
import test._

/**
  * Created by luokai on 2017/11/22.
  */
object Test11 {
  def main(args: Array[String]) {
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;
    println("a + b = " + (a + b) );
    println("a - b = " + (a - b) );
    println("a * b = " + (a * b) );
    println("b / a = " + (b / a) );
    println("b % a = " + (b % a) );
    println("c % a = " + (c % a) );

    var lk = new Lk_scala1();
    lk.sayHi();
    var aa = lk.aa()

    println(aa)
    println()
    println()

    val loc = new Location(10, 20, 15);

    // 移到一个新的位置
    loc.move(10, 10, 5);
  }
}