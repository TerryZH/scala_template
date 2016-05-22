package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  // @JSExport
  def addClickedMessage(): Unit = {
    // appendPar(document.body, "You clicked the button!")
    jQuery("body").append("<p>You clicked the button!</p>")
  }
  def setupUI(): Unit = {
    // jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }
  // def appendPar(targetNode: dom.Node, text: String): Unit = {
  //   val parNode = document.createElement("p")
  //   val textNode = document.createTextNode(text)
  //   parNode.appendChild(textNode)
  //   targetNode.appendChild(parNode)
  // }
  def main(): Unit = {
    // println("Hello world!")
    // appendPar(document.body, "Hello World")
    // jQuery("body").append("<p>Hello World</p>")
    jQuery(setupUI _)
  }
}
