package com.github.sylar.chapter5

import java.time.Year

/**
 * Created by SylarSong on 2015/9/15.
 */
//6.8 创建一个Car类，以只读属性对应制造商，型号名称，型号年份以及一个可读写的属性用于车牌。提供四组构造器。每个构造器fc都要求制造商和型号为必填。型号年份和车牌可选，如果未填，则型号年份为-1，车牌为空串。你会选
//择哪一个作为你的主构造器？为什么？
class Car(var maker:String,var model:String) {
  private var years:Int= -1
  private var plateNum:String=""


  def this(maker:String,model:String,years:Int){
    this(maker,model)
    this.years=years
  }
  def this(maker:String,model:String,plateNum:String){
    this(maker,model)
    this.plateNum=plateNum
  }
  def this(maker:String,model:String,year:Int,plateNum:String){
    this(maker,model)
    this.years=years
    this.plateNum=plateNum
  }

  override def toString = s"Car($years, $plateNum, $maker, $model)"
}
