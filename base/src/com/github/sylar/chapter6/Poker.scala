package com.github.sylar.chapter6

/**
 * Created by SylarSong on 2015/9/15.
 */
class Poker(huaSe:String) {
//  val heiTao:String="♠"
//  val hongTao:String="♥"
//  val meiHua:String="♣"
//  val fangPian:String="◆"
//  override def toString(): String ={
//    if(huaSe.equals("heiTao"))heiTao
//    else if(huaSe.equals("hongTao"))hongTao
//    else if(huaSe.equals("meiHua"))meiHua
//    else fangPian
//  }
}

object Poker extends Enumeration with App{
  val T =Value("♠")
  val H =Value("♥")
  val M =Value("♣")
  val F =Value("◆")

  def color(color:Poker.Value): Unit ={
    if(color==T||color==M)println("black")
    else println("red")
  }
  color(Poker.T)
}
