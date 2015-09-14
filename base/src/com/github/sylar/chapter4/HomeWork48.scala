package com.github.sylar.chapter4

import java.util
import java.util.Scanner
import scala.collection.JavaConversions.mapAsScalaMap
/**
 * Created by SylarSong on 2015/9/13.
 */
object HomeWork48 {

  //1
  val shop = Map("sword"->100,"kinfe"->50,"stick"->40)
  val shop07=for((k,v)<-shop)yield (k,v*0.7)
  println(shop07.mkString(","))

  //2
    val in = new Scanner(new java.io.File("d:/test.txt"))
//    var map= new scala.collection.mutable.HashMap[String,Int]
//    while (in.hasNext){
//      var now = in.next()
//      map(now)=map.getOrElse(now,0)+1 //如果当前 键不存在 ,则将1付给他, 如果存在 则去除键对应的值+1 后再赋给他.
//    }
//  println(map.mkString(" \n"))

  //3
//  var mapVal = Map[String,Int]()
//  while (in.hasNext()){
//    var now=in.next()
//    mapVal+=(now->(mapVal.getOrElse(now,0)+1))
//  }
//  println(mapVal.mkString("\n"))

  //4
//  var mapOrder =  scala.collection.immutable.SortedMap[String,Int]()
//  while (in.hasNext()){
//    var now = in.next().toLowerCase
//    mapOrder += (now->(mapOrder.getOrElse(now,0)+1))
//  }
//  println(mapOrder.mkString("\n"))

  //5
  val mapTree:collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]
  while (in.hasNext()){
    var now = in.next().toLowerCase()
    mapTree(now)=mapTree.getOrElse(now,0)+1
  }
  println(mapTree.mkString("\n"))

  def main(args: Array[String]) {
//    println("hello")
  }
}
