//> using dep "com.wbillingsley::doctacular::0.3.0"
//> using platform scala-js

package livedemo

import com.wbillingsley.veautiful.html.{<, mount}

@main def main() = {
  println("About to mount")
  mount("#render-here", <.p("Hello world"))
  println("Mounted")
}

