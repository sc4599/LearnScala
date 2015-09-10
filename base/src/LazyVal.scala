/**
 * Created by Administrator on 2015/9/10.
 */
object LazyVal {
  lazy val words = scala.io.Source.fromFile("e:/baa.txt").mkString

  def main(args: Array[String]) {
    println(words)
  }
}
