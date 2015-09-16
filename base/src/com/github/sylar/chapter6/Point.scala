package com.github.sylar.chapter6

/**
 * Created by SylarSong on 2015/9/15.
 */
class Point(var x:Int,var y:Int) {
   println("新建了一个Point x="+x+" y="+y)
}
object Point {
  def apply(x:Int,y:Int)=new Point(x,y)


  def main(args: Array[String]) {
    val p = Point(4,3)
  }
}
