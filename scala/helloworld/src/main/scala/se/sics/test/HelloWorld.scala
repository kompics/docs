package se.sics.test

import se.sics.kompics.sl._
import se.sics.kompics.{ Start, Kompics, KompicsEvent }

object HelloWorld extends App {
    Kompics.createAndStart(classOf[HelloWorldC]);
}

class HelloWorldC extends ComponentDefinition {
    ctrl uponEvent {
        case _: Start => handle {
            println("Hello World!");
            Kompics.asyncShutdown();
        }
    }
}