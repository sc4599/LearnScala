package com.github.sylar.chapter5

/**
 * Created by SylarSong on 2015/9/14.
 */
class Person(val name:String) {
  val firstName:String=name.split(" ")(0)
  val lastName:String=name.split(" ")(1)
}
