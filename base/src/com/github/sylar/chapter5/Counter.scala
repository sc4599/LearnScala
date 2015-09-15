package com.github.sylar.chapter5

/**
 * Created by SylarSong on 2015/9/14.
 */
class Counter {

  private var value = 0 // 定义变量必须初始化

  def increment() {
    value += Int.MaxValue;
    if(value<0)value=value-1
  } //方法默认都是公有的

  def current = value //定义中不带括号 则调用时候也不带括号
}
