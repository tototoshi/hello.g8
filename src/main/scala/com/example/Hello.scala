package com.example

import org.slf4j.LoggerFactory

object Hello {

  private val logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Hello, world!")
  }

}
