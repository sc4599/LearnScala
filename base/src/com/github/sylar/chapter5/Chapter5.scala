package com.github.sylar.chapter5

/**
 * Created by SylarSong on 2015/9/14.
 */
object Chapter5 {

  val myCounter = new Counter //或者 new Counter()

  myCounter.increment()
  //或者 myCounter.increment    调用无参方法可以不加括号
  println(myCounter.current())
  //官方建议: 对改值器使用() ,  对取值器不使用()
  //鉴于以上建议:你可以通过
  //class Counter{
  //  def current=value //定义中不带()
  //} 这样一来  类 的使用者就必须使用 myCounter.current, 不带圆括号.

  def main(args: Array[String]) {

  }
}
