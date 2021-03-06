package com.mathandcs.kino.abacus.utils

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by dashwang on 10/11/16.
  */

object SparkUtil {

  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark-app-template")

  val sparkContext = new SparkContext(sparkConf)
}