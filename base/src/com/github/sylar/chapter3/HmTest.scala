package com.github.sylar.chapter3

/**
 * Created by SylarSong on 2015/9/13.
 */

import scala.collection.mutable.ArrayBuffer
object App {
  def main(args: Array[String])  = {
    val a = Array(1, -2, 0, -3, 0, 4, 5);
    revertArray(a);
    println(a.mkString(","))
    // ArrayBuffer 反转
    val b = ArrayBuffer(1, -2, 0, -3, 0, 4, 5);
    val c = ArrayBuffer[Int]()
    c ++= b.reverse
    println(c.toString())
  }
  def revertArray(arr : Array[Int]) = {
    for (i <- 0 until (arr.length % 2)) {
      val t = arr(i);
      arr(i) = arr(arr.length - 1 - i);
      arr(arr.length - 1 - i) = t;
    }
  }
}
