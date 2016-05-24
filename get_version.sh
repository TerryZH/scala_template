#!/bin/sh
SCALA=~/Downloads/scala-2.11.8/bin/scala
exec ${SCALA} "$0" "$@"
!#
object HelloWorld extends App {
  println(util.Properties.versionString)
  println(args)
}
HelloWorld.main(args)