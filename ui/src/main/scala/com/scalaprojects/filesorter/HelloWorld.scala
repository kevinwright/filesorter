package com.scalaprojects.filesorter

/**
 * Created by IntelliJ IDEA.
 * User: Kevin
 * Date: 12/12/10
 * Time: 18:55
 * To change this template use File | Settings | File Templates.
 */
package com.scalaprojects.filesorter

import swing._

object HelloWorld extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Hello, World!"
    contents = new Button {
      text = "Click Me!"
    }
  }
}