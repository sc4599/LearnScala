package com.github.sylar.chapter4

import java.util
import java.util.Scanner
import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable
import scala.collection.JavaConversions.propertiesAsScalaMap
/**
 * Created by SylarSong on 2015/9/13.
 */
object HomeWork48 {

  //1设置一个映射,其中包含你想要的一些装备，以及它们的价格。然后构建另一个映射，采用同一组键，但是价格上打7折
  val shop = Map("sword"->100,"kinfe"->50,"stick"->40)
  val shop07=for((k,v)<-shop)yield (k,v*0.7)
  println(shop07.mkString(","))

  //2编写一段程序，从文件中读取单词。用一个可变映射来清点每个单词出现的频率。读取这些单词的操作可以使用java.util.Scanner:
    val in = new Scanner(new java.io.File("d:/test.txt"))
//    var map= new scala.collection.mutable.HashMap[String,Int]
//    while (in.hasNext){
//      var now = in.next()
//      map(now)=map.getOrElse(now,0)+1 //如果当前 键不存在 ,则将1付给他, 如果存在 则去除键对应的值+1 后再赋给他.
//    }
//  println(map.mkString(" \n"))

  //3重复前一个练习，这次用不可变的映射
//  var mapVal = Map[String,Int]()
//  while (in.hasNext()){
//    var now=in.next()
//    mapVal+=(now->(mapVal.getOrElse(now,0)+1))
//  }
//  println(mapVal.mkString("\n"))

  //4重复前一个练习，这次使用已排序的映射，以便单词可以按顺序打印出来
//  var mapOrder =  scala.collection.immutable.SortedMap[String,Int]()
//  while (in.hasNext()){
//    var now = in.next().toLowerCase
//    mapOrder += (now->(mapOrder.getOrElse(now,0)+1))
//  }
//  println(mapOrder.mkString("\n"))

  //5重复前一个练习，这次使用java.util.TreeMap并使之适用于Scala API
  val mapTree:collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]
  while (in.hasNext()){
    var now = in.next().toLowerCase()
    mapTree(now)=mapTree.getOrElse(now,0)+1
  }
  println(mapTree.mkString("\n"))

  //6定义一个链式哈希映射,将"Monday"映射到 java.util.Calendar.MONDAY,依次类推加入其他日期。展示元素是以插入的顺序被访问的
  val date=new mutable.LinkedHashMap[String,Int]()
  date("MONDAY")=java.util.Calendar.MONDAY
  date("TUESDAY")=java.util.Calendar.TUESDAY
  date("WEDNESDAY")=java.util.Calendar.WEDNESDAY
  date("THURSDAY")=java.util.Calendar.THURSDAY
  date("FEBRUARY")=java.util.Calendar.FEBRUARY
  date("SATURDAY")=java.util.Calendar.SATURDAY
  date("SUNDAY")=java.util.Calendar.SUNDAY
  println(date.mkString(","))

  //7
  val prop : scala.collection.Map[String,String] =System.getProperties();
  val theLongStringLength = prop.keySet.max.length
  for((k,v)<-prop){
    if(k.length<theLongStringLength){
      println(k+" "*(theLongStringLength-k.length)+"|",v)
    }
  }
//  println(prop.mkString(",\n"))
  //8
  def minmax(values:Array[Int]) ={
      val t=(values.min,values.max)
      t
  }

  //9
  def lteqgt(values:Array[Int],v:Int)={
    ((for(i<-values if i<v)yield i).length,(for(i<-values if i==v)yield i).length,(for(i<-values if i>v)yield i).length)
  }

  def main(args: Array[String]) {
//    println("hello")
    val arrTest=Array(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5)
   println(minmax(arrTest))
    println(lteqgt(arrTest,5))
  }
}
